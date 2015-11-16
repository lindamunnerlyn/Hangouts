// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.HandlerThread;

// Referenced classes of package org.chromium.base:
//            JavaHandlerThread

class c
    implements Runnable
{

    final long a;
    final long b;
    final boolean c;
    final JavaHandlerThread d;

    public void run()
    {
        JavaHandlerThread.b(d, a, b);
        if (!c)
        {
            d.a.quit();
        }
    }

    (JavaHandlerThread javahandlerthread, long l, long l1, boolean flag)
    {
        d = javahandlerthread;
        a = l;
        b = l1;
        c = flag;
        super();
    }
}
