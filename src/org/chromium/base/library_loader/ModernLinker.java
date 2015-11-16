// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.os.Bundle;
import java.util.HashMap;

// Referenced classes of package org.chromium.base.library_loader:
//            Linker

class ModernLinker extends Linker
{

    private boolean c;
    private boolean d;
    private HashMap e;
    private Bundle f;
    private boolean g;
    private long h;
    private long i;
    private boolean j;
    private HashMap k;
    private String l;

    private ModernLinker()
    {
        c = false;
        d = false;
        e = null;
        f = null;
        g = true;
        h = -1L;
        i = -1L;
        j = false;
        k = null;
        l = null;
    }

    private static native boolean nativeCreateSharedRelro(String s, long l1, String s1, Linker.LibInfo libinfo);

    private static native String nativeGetCpuAbi();

    private static native boolean nativeLoadLibrary(String s, long l1, Linker.LibInfo libinfo);
}
