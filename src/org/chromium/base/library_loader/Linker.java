// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;


public class Linker
{

    private static Linker d = null;
    private static Object e = new Object();
    public int a;
    public final Object b = new Object();
    private String c;

    protected Linker()
    {
        a = 0;
        c = null;
    }

    private static native long nativeGetRandomBaseLoadAddress();

}
