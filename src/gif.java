// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class gif
    implements Runnable
{

    final gie a;

    gif(gie gie1)
    {
        a = gie1;
        super();
    }

    public void run()
    {
        gie gie1 = a;
        Object obj = gie1.a;
        obj;
        JVM INSTR monitorenter ;
        gie1.d = g.p();
        gie1.g = new SurfaceTexture(gie1.d);
        gie1.g.setOnFrameAvailableListener(new gih(gie1));
        if (gie1.o != null)
        {
            g.a(new gii(gie1));
        }
        gie1.c = new gft(gie1.g, gie1.d);
        gie1.c.a(gie1.l);
        gie1.c.a(gie1.n);
        gie1.o();
        gie1.e = gie1.c.c();
        gie1.f = gie1.e;
        Exception exception;
        boolean flag;
        if (gie1.f == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.b("Expected condition to be false", flag);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
