// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.SurfaceTexture;

final class gln
    implements gmz
{

    final glj a;

    gln(glj glj1)
    {
        a = glj1;
        super();
    }

    public void a(SurfaceTexture surfacetexture)
    {
        g.v();
        synchronized (a.p)
        {
            a.t = surfacetexture;
        }
        a.a(a.o);
        return;
        surfacetexture;
        obj;
        JVM INSTR monitorexit ;
        throw surfacetexture;
    }

    public void a(gna gna)
    {
        g.v();
        synchronized (a.p)
        {
            a.q = gna;
        }
        glj.a(a);
        return;
        gna;
        obj;
        JVM INSTR monitorexit ;
        throw gna;
    }
}
