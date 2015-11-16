// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class cvh extends cui
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final long b;
    public final int c[];
    public final boolean d;
    private final String j;

    public cvh(int i, String s1)
    {
        this(-1L, i, false, s1);
    }

    public cvh(long l, int i)
    {
        this(l, i, true, null);
    }

    private cvh(long l, int i, boolean flag, String s1)
    {
        b = l;
        j = s1;
        a = i;
        d = flag;
        c = new int[2];
        switch (i)
        {
        default:
            throw new IllegalStateException((new StringBuilder(32)).append("illegal filter mode: ").append(i).toString());

        case 1: // '\001'
            c[0] = 1;
            c[1] = 3;
            return;

        case 2: // '\002'
            c[0] = 2;
            c[1] = 3;
            return;

        case 3: // '\003'
            c[0] = 1;
            c[1] = 4;
            return;

        case 4: // '\004'
            c[0] = 1;
            c[1] = 5;
            return;

        case 5: // '\005'
            c[0] = 1;
            c[1] = 3;
            return;

        case 6: // '\006'
            c[0] = 1;
            break;
        }
        c[1] = 4;
    }

    public kop a(String s1, int i, int k)
    {
        izf izf1 = new izf();
        if (b >= 0L)
        {
            izf1.a = Long.valueOf(b);
        }
        int l;
        if (a == 6)
        {
            l = 100;
        } else
        {
            l = g.a(g.nS, "babel_smaxconv", 30);
        }
        izf1.b = Integer.valueOf(l);
        izf1.requestHeader = ctq.a(s1, i, k, h);
        izf1.c = Integer.valueOf(g.a(g.nS, "babel_smaxevperconv", 20));
        if (c != null)
        {
            izf1.d = c;
        }
        izf1.e = Integer.valueOf(1);
        return izf1;
    }

    public void a(ani ani1, dbo dbo)
    {
        dbo = ani1.a();
        if (ctr.e)
        {
            dbo = String.valueOf(dbo);
            int i;
            if (dbo.length() != 0)
            {
                dbo = "SyncRecentConversations.onFailed ".concat(dbo);
            } else
            {
                dbo = new String("SyncRecentConversations.onFailed ");
            }
            ebw.b("Babel_RequestWriter", dbo);
        }
        if (dzy.b())
        {
            dbo = (new eaa()).a("src_expired").a(ani1);
            i = a;
            dbo.b((new StringBuilder(22)).append("filterMode=").append(i).toString()).b();
        }
        if (!TextUtils.isEmpty(j))
        {
            dhl.b(ani1.h()).e(j);
        }
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        ccg = (cvh)ccg;
        return b == ((cvh) (ccg)).b && a == ((cvh) (ccg)).a && d == ((cvh) (ccg)).d;
    }

    public long b()
    {
        if (s())
        {
            return TimeUnit.SECONDS.toMillis(60L);
        } else
        {
            return g.a(g.nS, "babel_src_timeout", djk.e);
        }
    }

    public String g()
    {
        return "conversations/syncrecentconversations";
    }

    public int r()
    {
        return a;
    }

    public boolean s()
    {
        return b >= 0L;
    }

    public String t()
    {
        return j;
    }
}
