// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class gfg
    implements Runnable
{

    final gff a;

    gfg(gff gff1)
    {
        a = gff1;
        super();
    }

    public void run()
    {
        gff gff1 = a;
        Object obj = gff1.a;
        obj;
        JVM INSTR monitorenter ;
        gff1.d = g.q();
        gff1.g = new SurfaceTexture(gff1.d);
        gff1.g.setOnFrameAvailableListener(new gfi(gff1));
        if (gff1.m != null)
        {
            g.a(new gfj(gff1));
        }
        gff1.c = new gdf(gff1.g, gff1.d);
        gff1.c.a(gff1.j);
        gff1.c.a(gff1.l);
        gff1.c();
        gff1.e = gff1.c.c();
        gff1.f = gff1.e;
        Exception exception;
        boolean flag;
        if (gff1.f == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.b(flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
