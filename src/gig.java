// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class gig
    implements Runnable
{

    final gie a;

    gig(gie gie1)
    {
        a = gie1;
        super();
    }

    public void run()
    {
        if (a.h != null)
        {
            a.h.c();
        }
        if (a.g != null)
        {
            a.g.release();
        }
        if (a.d != 0)
        {
            g.o(a.d);
            a.d = 0;
            a.f = 0;
        }
        if (a.c != null)
        {
            a.c.a();
            a.e = 0;
        }
    }
}
