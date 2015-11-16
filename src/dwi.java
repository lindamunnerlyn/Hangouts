// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dwi extends bnk
{

    final dwh a;

    dwi(dwh dwh1)
    {
        a = dwh1;
        super();
    }

    public void a(gjq gjq)
    {
        if (a.g == null && a.d != null && a.d.r() != null)
        {
            a.g = a.d.r().h();
            a.d.r().l().a(a.c.h().c());
            if (a.b != null)
            {
                a.d.r().l().a(2, a.b);
            }
        }
    }

    public void a(gjr gjr1)
    {
        boolean flag = gjr1.g();
        ebw.e("Babel_telephony", (new StringBuilder(51)).append("TeleWifiCall.onParticipantAdded, isLocalUser: ").append(flag).toString());
        if (!gjr1.g() && a.c != null)
        {
            a.c.w();
        }
    }

    public void a(jdh jdh1)
    {
        if (a.h != null)
        {
            jdh1.n = (new String[] {
                a.h.a()
            });
        }
    }
}
