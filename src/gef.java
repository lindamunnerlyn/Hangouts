// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gef extends gex
{

    final geb a;

    gef(geb geb1)
    {
        a = geb1;
        super();
    }

    public void a(geu geu1)
    {
        a.e = true;
        a.k();
    }

    public void a(gkq gkq1, gap gap)
    {
        if ((gap instanceof gks) && gkq1.k())
        {
            if (a.g == null)
            {
                gne.a(5, "vclib", "The call has started but HangoutId was not resolved.");
            }
            a.f = 2;
            a.i = (new gms(a.g)).a(gkq1.a());
            a.d.a(2690);
            a.b.a(a.i);
        }
    }

    public void a(gmu gmu1)
    {
        String s = String.valueOf(gmu1.a());
        gne.a(2, "vclib", (new StringBuilder(String.valueOf(s).length() + 28)).append("Call.onQualityNotification: ").append(s).toString());
        a.b.a(gmu1);
    }

    public void a(String s)
    {
        a.g = s;
    }

    public void b(geu geu1)
    {
        int i;
        if (geu1 == null)
        {
            i = 30;
        } else
        {
            i = geu1.p();
        }
        if (geu1 != null && a.i == null)
        {
            a.d.a(2691);
        }
        gne.a(4, "vclib", (new StringBuilder(29)).append("Call.onCallEnded: ").append(i).toString());
        geb.a(a, geu1);
        geb.a(a);
        a.b.a(i);
        a.f = 4;
        gic.a().a(null);
    }
}
