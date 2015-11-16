// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class crz extends ctp
{

    static final int a[] = {
        7
    };
    static final jlk b = jlk.a(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(4), Integer.valueOf(6), Integer.valueOf(8), Integer.valueOf(11), Integer.valueOf(12), Integer.valueOf(13), Integer.valueOf(15), Integer.valueOf(18), Integer.valueOf(20), new Integer[0]);
    private final int r[];
    private final int s;
    private final ani t;

    public crz(ani ani1, int i, ddl ddl)
    {
        this(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a(new hdq()).a().b(), i, ani1, ddl);
    }

    private crz(hdx hdx1, int i, ani ani1, ddl ddl)
    {
        boolean flag = false;
        super(hdx1, ddl, "contacts/getselfinfo", "hangouts", new itz(), new iua());
        boolean flag1 = g.a(g.nS, "babel_enable_call_me_maybe", true);
        int l = b.size();
        int j = l;
        if (flag1)
        {
            j = l + 1;
        }
        ddl = new int[j];
        for (int k = 0; k < b.size(); k++)
        {
            ddl[k] = g.a((Integer)b.get(k), 0);
        }

        if (flag1)
        {
            ddl[ddl.length - 1] = 17;
        }
        r = ddl;
        s = i;
        t = ani1;
        if (!"SMS".equals(hdx1.b()))
        {
            flag = true;
        }
        g.a(flag);
    }

    public crz(hdx hdx1, ddl ddl)
    {
        this(hdx1, 0, null, ddl);
    }

    protected cvn a(kop kop)
    {
        return cws.parseFrom((iua)kop);
    }

    public void a(int i, Exception exception)
    {
        if (m() || exception != null)
        {
            ebw.d("Babel_GetSelfInfo", (new StringBuilder(47)).append("Failed to get self info. ErrorCode: ").append(i).toString(), exception);
        } else
        if (e() != null && t != null)
        {
            i = t.h();
            exception = (gms)hgx.a(g, gms);
            gmw gmw1 = exception.b(i);
            a(gmw1);
            gmw1.d();
            long l = ((doq)hgx.a(g, doq)).d(i);
            RealTimeChatService.b(t, l);
            RealTimeChatService.f(t);
            dbf.a(exception, i);
            return;
        }
    }

    public void a(gmw gmw1)
    {
        cws cws1 = (cws)e();
        ceu ceu1 = cws1.k();
        if (ebw.a("Babel_GetSelfInfo", 3))
        {
            String s1 = String.valueOf(ceu1.b);
            ebw.c("Babel_GetSelfInfo", (new StringBuilder(String.valueOf(s1).length() + 47)).append("processResponse for GetSelfInfo, participantId=").append(s1).toString());
        }
        for (Iterator iterator1 = cws1.s().iterator(); iterator1.hasNext();)
        {
            Object obj = (crl)iterator1.next();
            crl crl1 = dbq.a(((crl) (obj)).b());
            if (crl1 != null)
            {
                crl1.a(gmw1, ((crl) (obj)));
                crl1.a(((crl) (obj)).c());
            } else
            {
                obj = String.valueOf(((crl) (obj)).b());
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unknown experiment ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unknown experiment ");
                }
                ebw.c("Babel_GetSelfInfo", ((String) (obj)));
            }
        }

        ank.a(gmw1, ceu1.b, ceu1.e, ceu1.m, ceu1.x, ceu1.h, cws1.l(), cws1.n(), cws1.r(), ceu1.p);
        for (Iterator iterator = hgx.c(g, ddm).iterator(); iterator.hasNext(); ((ddm)iterator.next()).a(gmw1, cws1)) { }
        if (cws1.o())
        {
            gmw1.b("dnd_expiration", cws1.p());
        } else
        {
            gmw1.b("dnd_expiration", 0L);
        }
        if (cws1.q() != null)
        {
            RealTimeChatService.a(gmw1, cws1.q());
        }
        gmw1.b("setting_time", System.currentTimeMillis());
    }

    protected void b(kop kop)
    {
        kop = (itz)kop;
        super.b(kop);
        cru cru1 = (new cru()).b(s).a();
        if (t != null)
        {
            cru1.a(t.h());
            cru1.a(dbf.g(t.h()));
        }
        kop.requestHeader = a(cru1.b());
        kop.a = a;
        kop.b = r;
    }

}
