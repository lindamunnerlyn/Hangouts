// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gbr extends gcj
{

    final gbn a;

    gbr(gbn gbn1)
    {
        a = gbn1;
        super();
    }

    public void a(gcg gcg1)
    {
        a.g = true;
        a.h();
    }

    public void a(gho gho1, fyb fyb)
    {
        if ((fyb instanceof ghq) && gho1.l())
        {
            if (a.i == null)
            {
                gkc.d("vclib", "The call has started but HangoutId was not resolved.");
            }
            a.h = 2;
            a.k = (new gjq(a.i)).a(gho1.a());
            a.e.a(2690);
            a.c.a(a.k);
        }
    }

    public void a(gjs gjs1)
    {
        String s = String.valueOf(gjs1.a());
        gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 28)).append("Call.onQualityNotification: ").append(s).toString());
        a.c.a(gjs1);
    }

    public void a(String s)
    {
        a.i = s;
    }

    public void b(gcg gcg1)
    {
        gbn gbn1;
        int i;
        if (gcg1 == null)
        {
            i = 30;
        } else
        {
            i = gcg1.q();
        }
        if (gcg1 != null && a.k == null)
        {
            a.e.a(2691);
        }
        gkc.c("vclib", (new StringBuilder(29)).append("Call.onCallEnded: ").append(i).toString());
        gbn1 = a;
        if (gbn1.h != 0 && gcg1 != null && gbn1.f != null) goto _L2; else goto _L1
_L1:
        a.f();
        a.c.a(i);
        a.h = 4;
        gfd.a().a(null);
        return;
_L2:
        jdh jdh = gcg1.a(gbn1.a, Long.toString(ges.a().b), gbn1.f.c(), gbn1.f.e(), gbn1.b.b(), gbn1.f.r());
        gbn1.c.a(jdh);
        if (gbn1.f.z())
        {
            (new gdz(gbn1.a)).a(gbn1.f.n(), gcg1.h(), jdh);
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
