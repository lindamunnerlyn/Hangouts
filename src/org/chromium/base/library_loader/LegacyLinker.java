// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.os.Bundle;
import java.util.HashMap;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.base.library_loader:
//            Linker

class LegacyLinker extends Linker
{

    public HashMap a;
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Bundle j;
    private long k;
    private long l;
    private boolean m;

    LegacyLinker()
    {
        e = false;
        f = false;
        g = true;
        h = false;
        i = false;
        j = null;
        k = 0L;
        l = 0L;
        m = false;
        a = null;
    }

    static void a(long l1)
    {
        nativeRunCallbackOnUiThread(l1);
    }

    private static native boolean nativeCanUseSharedRelro();

    private static native boolean nativeCreateSharedRelro(String s, long l1, Linker.LibInfo libinfo);

    private static native long nativeGetRandomBaseLoadAddress(long l1);

    private static native boolean nativeLoadLibrary(String s, long l1, Linker.LibInfo libinfo);

    private static native boolean nativeLoadLibraryInZipFile(String s, String s1, long l1, Linker.LibInfo libinfo);

    private static native void nativeRunCallbackOnUiThread(long l1);

    private static native boolean nativeUseSharedRelro(String s, Linker.LibInfo libinfo);

    public static void postCallbackOnMainThread(long l1)
    {
        ThreadUtils.b(new _cls1(l1));
    }

    private class _cls1
        implements Runnable
    {

        final long a;

        public void run()
        {
            LegacyLinker.a(a);
        }

        _cls1(long l1)
        {
            a = l1;
            super();
        }
    }

}
