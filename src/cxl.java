// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

public class cxl extends cwm
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final long b;
    public final int c[];
    public final boolean d;
    private final String j;

    public cxl(int i, String s1)
    {
        this(-1L, i, false, s1);
    }

    public cxl(long l, int i)
    {
        this(l, i, true, null);
    }

    private cxl(long l, int i, boolean flag, String s1)
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

    public kws a(String s1, int i, int k)
    {
        jfk jfk1 = new jfk();
        if (b >= 0L)
        {
            jfk1.a = Long.valueOf(b);
        }
        int l;
        if (a == 6)
        {
            l = 100;
        } else
        {
            l = g.a(g.nU, "babel_smaxconv", 30);
        }
        jfk1.b = Integer.valueOf(l);
        jfk1.requestHeader = cvu.a(s1, i, k, h);
        jfk1.c = Integer.valueOf(g.a(g.nU, "babel_smaxevperconv", 20));
        if (c != null)
        {
            jfk1.d = c;
        }
        jfk1.e = Integer.valueOf(1);
        return jfk1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        dcx = aoa1.a();
        if (cvv.e)
        {
            dcx = String.valueOf(dcx);
            int i;
            if (dcx.length() != 0)
            {
                dcx = "SyncRecentConversations.onFailed ".concat(dcx);
            } else
            {
                dcx = new String("SyncRecentConversations.onFailed ");
            }
            eev.b("Babel_RequestWriter", dcx);
        }
        if (edc.b())
        {
            dcx = (new ede()).a("src_expired").a(aoa1);
            i = a;
            dcx.b((new StringBuilder(22)).append("filterMode=").append(i).toString()).b();
        }
        if (!TextUtils.isEmpty(j))
        {
            diu.b(aoa1.h()).d(j);
        }
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        cdl = (cxl)cdl;
        return b == ((cxl) (cdl)).b && a == ((cxl) (cdl)).a && d == ((cxl) (cdl)).d;
    }

    public long b()
    {
        if (r())
        {
            return TimeUnit.SECONDS.toMillis(60L);
        } else
        {
            return g.a(g.nU, "babel_src_timeout", dlb.e);
        }
    }

    public String f()
    {
        return "conversations/syncrecentconversations";
    }

    public int q()
    {
        return a;
    }

    public boolean r()
    {
        return b >= 0L;
    }

    public String s()
    {
        return j;
    }
}
