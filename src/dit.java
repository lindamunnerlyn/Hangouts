// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class dit extends dep
{

    private static final boolean a = false;
    private static final ConcurrentHashMap d = new ConcurrentHashMap();
    private static AtomicInteger e = new AtomicInteger(0);
    private long f;

    private dit(ani ani1, long l, long l1)
    {
        super(ani1, l, l1);
    }

    public static dit a(ani ani1)
    {
        dit dit1;
        if (ani1.q())
        {
            dit1 = null;
        } else
        {
            String s = ani1.a();
            dit dit2 = (dit)d.get(s);
            dit1 = dit2;
            if (dit2 == null)
            {
                ani1 = new dit(ani1, g.a(g.nS, "babel_tickle_gcm_lowmark_seconds", 270) * 1000, g.a(g.nS, "babel_tickle_gcm_highmark_seconds", 600) * 1000);
                d.putIfAbsent(s, ani1);
                return (dit)d.get(s);
            }
        }
        return dit1;
    }

    public void a()
    {
        if (!b.q())
        {
            fap fap1 = fap.a(g.nS);
            try
            {
                fap1.a("hangouts@google.com", Integer.toString(e.incrementAndGet()), new Bundle());
                a(3);
                if (a)
                {
                    ebw.b("Babel", "gcm tickle sent");
                    return;
                }
            }
            catch (IOException ioexception)
            {
                ebw.d("Babel", "Unable to tickle gcm", ioexception);
                return;
            }
        }
    }

    protected void a(long l)
    {
        f = l;
    }

    protected long i()
    {
        return f;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
