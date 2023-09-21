/*
 * Copyright (c) 2001, 2021, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package jdk.internal.reflect;

import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.*;
import jdk.internal.misc.Unsafe;

/** Used only for the first few invocations of a Constructor;
    afterward, switches to bytecode-based implementation */

class NativeConstructorAccessorImpl extends ConstructorAccessorImpl {
    private static final Unsafe U = Unsafe.getUnsafe();
    private static final long GENERATED_OFFSET
        = U.objectFieldOffset(NativeConstructorAccessorImpl.class, "generated");

    private final Constructor<?> c;
    private DelegatingConstructorAccessorImpl parent;
    private int numInvocations;
    private volatile int generated;

    NativeConstructorAccessorImpl(Constructor<?> c) {
        this.c = c;
    }

    public Object newInstance(Object[] args)
        throws InstantiationException,
               IllegalArgumentException,
               InvocationTargetException
    {
        // We can't inflate a constructor belonging to a vm-anonymous class
        // because that kind of class can't be referred to by name, hence can't
        // be found from the generated bytecode.
        if (++numInvocations > ReflectionFactory.inflationThreshold()
                && !c.getDeclaringClass().isHidden()
                && generated == 0
                && U.compareAndSetInt(this, GENERATED_OFFSET, 0, 1)) {
            try {
                ConstructorAccessorImpl acc = (ConstructorAccessorImpl)
                    new MethodAccessorGenerator().
                        generateConstructor(c.getDeclaringClass(),
                                            c.getParameterTypes(),
                                            c.getExceptionTypes(),
                                            c.getModifiers());
                parent.setDelegate(acc);
            } catch (Throwable t) {
                // Throwable happens in generateConstructor, restore generated to 0
                generated = 0;
                throw t;
            }
        }

        return newInstance0(c, args);
    }

    void setParent(DelegatingConstructorAccessorImpl parent) {
        this.parent = parent;
    }

    private static native Object newInstance0(Constructor<?> c, Object[] args)
        throws InstantiationException,
               IllegalArgumentException,
               InvocationTargetException;
}
