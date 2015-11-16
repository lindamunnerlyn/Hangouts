// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import java.util.concurrent.atomic.AtomicReference;

public abstract class CommandLine
{

    private static final AtomicReference a = new AtomicReference();

    CommandLine()
    {
    }

    public static CommandLine a()
    {
        return (CommandLine)a.get();
    }

    static boolean c(String s)
    {
        return nativeHasSwitch(s);
    }

    static String d(String s)
    {
        return nativeGetSwitchValue(s);
    }

    private static native void nativeAppendSwitch(String s);

    private static native void nativeAppendSwitchWithValue(String s, String s1);

    private static native void nativeAppendSwitchesAndArguments(String as[]);

    private static native String nativeGetSwitchValue(String s);

    private static native boolean nativeHasSwitch(String s);

    private static native void nativeReset();

    public abstract boolean a(String s);

    public abstract String b(String s);

}
