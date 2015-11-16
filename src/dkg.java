// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class dkg extends dfy
{

    private static final boolean a = false;
    private static final ConcurrentHashMap e = new ConcurrentHashMap();
    private static AtomicInteger f = new AtomicInteger(0);
    private long g;
    private final gdd h;

    private dkg(aoa aoa1, long l, long l1)
    {
        super(aoa1, l, l1);
        h = (gdd)hlp.a(g.nU, gdd);
    }

    public static dkg a(aoa aoa1)
    {
        dkg dkg1;
        if (aoa1.o())
        {
            dkg1 = null;
        } else
        {
            String s = aoa1.a();
            dkg dkg2 = (dkg)e.get(s);
            dkg1 = dkg2;
            if (dkg2 == null)
            {
                aoa1 = new dkg(aoa1, g.a(g.nU, "babel_tickle_gcm_lowmark_seconds", 270) * 1000, g.a(g.nU, "babel_tickle_gcm_highmark_seconds", 600) * 1000);
                e.putIfAbsent(s, aoa1);
                return (dkg)e.get(s);
            }
        }
        return dkg1;
    }

    public void a()
    {
        if (!super.b.b.o())
        {
            fdn fdn1 = fdn.a(g.nU);
            try
            {
                if (dcz.Q(super.b.b.h()))
                {
                    h.a(super.b.b.h()).a(2801).d();
                }
                fdn1.a("hangouts@google.com", Integer.toString(f.incrementAndGet()), new Bundle());
                a(3);
                if (a)
                {
                    eev.b("Babel", "gcm tickle sent");
                    return;
                }
            }
            catch (IOException ioexception)
            {
                eev.d("Babel", "Unable to tickle gcm", ioexception);
                return;
            }
        }
    }

    protected void a(long l)
    {
        g = l;
    }

    protected long i()
    {
        return g;
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
