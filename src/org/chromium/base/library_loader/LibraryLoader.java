// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;


public class LibraryLoader
{

    private static final Object a = new Object();
    private static volatile LibraryLoader b;
    private final int c;

    public static int getLibraryProcessType()
    {
        if (b == null)
        {
            return 0;
        } else
        {
            return b.c;
        }
    }

    private static native boolean nativeForkAndPrefetchNativeLibrary();

    private native String nativeGetVersionNumber();

    private native void nativeInitCommandLine(String as[]);

    private native boolean nativeLibraryLoaded();

    private native void nativeRecordChromiumAndroidLinkerBrowserHistogram(boolean flag, boolean flag1, int i, long l);

    private native void nativeRegisterChromiumAndroidLinkerRendererHistogram(boolean flag, boolean flag1, long l);

}
