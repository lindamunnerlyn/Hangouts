// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bmw extends bnb
{

    private int h;
    private final String i;

    bmw(ani ani, String s, String s1, String s2)
    {
        super(ani, s, s1);
        h = 0;
        i = s2;
    }

    private void b(int j)
    {
        h = j;
        n();
    }

    private void n()
    {
        if (d != null)
        {
            int j = h;
            ebw.e("Babel", (new StringBuilder(51)).append("Resolving abuse report for disposition: ").append(j).toString());
            if (h == 2)
            {
                if (e)
                {
                    i();
                }
                o();
                return;
            }
            if (h == 1)
            {
                q();
                return;
            }
        }
    }

    private void o()
    {
        l();
        h();
    }

    private void p()
    {
        if (h == 1)
        {
            m();
        }
        o();
    }

    private void q()
    {
        gbh.a(Integer.valueOf(g), Integer.valueOf(-1));
        gbh.b(d);
        gbh.b(b);
        gbh.b(e);
        gbh.b(f);
        g = RealTimeChatService.a(a, d, b);
        int j = g;
        ebw.e("Babel", (new StringBuilder(46)).append("Starting confirmation. Request ID: ").append(j).toString());
    }

    public void a(int j, ani ani, dko dko, dbo dbo)
    {
        super.a(j, ani, dko, dbo);
        p();
    }

    protected void a(int j, cvo cvo)
    {
        super.a(j, cvo);
        if (d != null)
        {
            n();
            return;
        } else
        {
            ebw.g("Babel", "initialize abuse report response missing broadcast_id");
            p();
            return;
        }
    }

    protected void a(int j, cwd cwd1)
    {
        super.a(j, cwd1);
        izx izx1 = cwd1.l();
        jac jac1 = izx1.i;
        if (jac1 == null || jac1.f == null)
        {
            if (jac1 == null)
            {
                cwd1 = "recordingDetails";
            } else
            {
                cwd1 = "abuseRecording";
            }
            cwd1 = String.valueOf(cwd1);
            if (cwd1.length() != 0)
            {
                cwd1 = "Unexpectedly null ".concat(cwd1);
            } else
            {
                cwd1 = new String("Unexpectedly null ");
            }
            ebw.g("Babel", cwd1);
            p();
            return;
        } else
        {
            jac1.f.a = Integer.valueOf(2);
            g = RealTimeChatService.a(a, izx1, cwd1.m());
            return;
        }
    }

    protected void a(int j, cxb cxb1)
    {
        super.a(j, cxb1);
        if (cxb1.k())
        {
            q();
            return;
        } else
        {
            k();
            o();
            return;
        }
    }

    void d()
    {
        gbh.a(Integer.valueOf(g), Integer.valueOf(-1));
        gbh.a(d);
        gbh.b(e);
        gbh.b(f);
        g = RealTimeChatService.a(a, b, c, i);
    }

    void e()
    {
        b(1);
    }

    void f()
    {
        b(2);
    }

    String g()
    {
        return i;
    }
}
