// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public final class dii extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long d;
    private volatile boolean e;

    private dii(ani ani1, long l, long l1)
    {
        super(ani1, l, l1);
        e = false;
        d = -1L;
    }

    public static dii a(ani ani1)
    {
        int j = ani1.h();
        dii dii2 = (dii)a.get(Integer.valueOf(j));
        dii dii1 = dii2;
        if (dii2 == null)
        {
            dii1 = dii2;
            if (!ani1.q())
            {
                ani1 = new dii(ani1, g.a(g.nS, "babel_ac_renew_lowmark_seconds", 120) * 1000, g.a(g.nS, "babel_ac_renew_highmark_seconds", 270) * 1000);
                a.putIfAbsent(Integer.valueOf(j), ani1);
                dii1 = (dii)a.get(Integer.valueOf(j));
            }
        }
        return dii1;
    }

    public static void a(ani ani1, boolean flag)
    {
        ani1 = (dii)a.get(Integer.valueOf(ani1.h()));
        if (ani1 != null)
        {
            ani1.e = flag;
        }
    }

    public static dii b(int j)
    {
        return (dii)a.remove(Integer.valueOf(j));
    }

    public static boolean b(ani ani1)
    {
        ani1 = (dii)a.get(Integer.valueOf(ani1.h()));
        if (ani1 != null)
        {
            return ((dii) (ani1)).e;
        } else
        {
            return false;
        }
    }

    public void a()
    {
        if (b.q())
        {
            return;
        }
        String s = dbf.e(b);
        if (TextUtils.isEmpty(s))
        {
            s = String.valueOf(b.U());
            if (s.length() != 0)
            {
                s = "Full jid not valid during setting active client account: ".concat(s);
            } else
            {
                s = new String("Full jid not valid during setting active client account: ");
            }
            ebw.g("Babel", s);
            return;
        } else
        {
            c.c().clear();
            int j = g.a(g.nS, "babel_ac_renew_cycle_seconds", 300);
            c.a(new cuv(s, j));
            return;
        }
    }

    protected void a(long l)
    {
        d = l;
    }

    protected long i()
    {
        return d;
    }

}
