// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

public final class djt extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private long e;
    private volatile boolean f;

    private djt(aoa aoa1, long l, long l1)
    {
        super(aoa1, l, l1);
        f = false;
        e = -1L;
    }

    public static djt a(aoa aoa1)
    {
        int j = aoa1.h();
        djt djt2 = (djt)a.get(Integer.valueOf(j));
        djt djt1 = djt2;
        if (djt2 == null)
        {
            djt1 = djt2;
            if (!aoa1.o())
            {
                aoa1 = new djt(aoa1, g.a(g.nU, "babel_ac_renew_lowmark_seconds", 120) * 1000, g.a(g.nU, "babel_ac_renew_highmark_seconds", 270) * 1000);
                a.putIfAbsent(Integer.valueOf(j), aoa1);
                djt1 = (djt)a.get(Integer.valueOf(j));
            }
        }
        return djt1;
    }

    public static void a(aoa aoa1, boolean flag)
    {
        aoa1 = (djt)a.get(Integer.valueOf(aoa1.h()));
        if (aoa1 != null)
        {
            aoa1.f = flag;
        }
    }

    public static djt b(int j)
    {
        return (djt)a.remove(Integer.valueOf(j));
    }

    public static boolean b(aoa aoa1)
    {
        aoa1 = (djt)a.get(Integer.valueOf(aoa1.h()));
        if (aoa1 != null)
        {
            return ((djt) (aoa1)).f;
        } else
        {
            return false;
        }
    }

    public void a()
    {
        if (super.b.b.o())
        {
            return;
        }
        String s = dcn.d(super.b.b);
        if (TextUtils.isEmpty(s))
        {
            s = String.valueOf(super.b.b.R());
            if (s.length() != 0)
            {
                s = "Full jid not valid during setting active client account: ".concat(s);
            } else
            {
                s = new String("Full jid not valid during setting active client account: ");
            }
            eev.g("Babel", s);
            return;
        } else
        {
            k();
            a(((dmf) (new cwz(s, g.a(g.nU, "babel_ac_renew_cycle_seconds", 300)))));
            return;
        }
    }

    protected void a(long l)
    {
        e = l;
    }

    protected long i()
    {
        return e;
    }

}
