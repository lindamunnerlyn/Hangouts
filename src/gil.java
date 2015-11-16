// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class gil
    implements gjx
{

    final gih a;

    gil(gih gih1)
    {
        a = gih1;
        super();
    }

    public void a(SurfaceTexture surfacetexture)
    {
        g.w();
        synchronized (a.n)
        {
            a.r = surfacetexture;
        }
        a.a(a.m);
        return;
        surfacetexture;
        obj;
        JVM INSTR monitorexit ;
        throw surfacetexture;
    }

    public void a(gjy gjy)
    {
        g.w();
        synchronized (a.n)
        {
            a.o = gjy;
        }
        gih.a(a);
        return;
        gjy;
        obj;
        JVM INSTR monitorexit ;
        throw gjy;
    }
}
