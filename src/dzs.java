// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dzs extends bns
{

    final dzr a;

    dzs(dzr dzr1)
    {
        a = dzr1;
        super();
    }

    public void a(gms gms)
    {
        if (a.g == null && a.d != null && a.d.q() != null)
        {
            a.g = a.d.q().h();
            a.d.q().l().a(a.c.h().c());
            if (a.b != null)
            {
                a.d.q().l().a(2, a.b);
            }
        }
    }

    public void a(gmt gmt1)
    {
        boolean flag = gmt1.g();
        eev.e("Babel_telephony", (new StringBuilder(51)).append("TeleWifiCall.onParticipantAdded, isLocalUser: ").append(flag).toString());
        if (!gmt1.g() && a.c != null)
        {
            a.c.w();
        }
    }

    public void a(gmu gmu1)
    {
        if (gmu1.b() != null)
        {
            gmu1 = String.valueOf(gmu1.b().a);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(gmu1).length() + 55)).append("TeleWifiCall.onConnectionQualityUpdate, quality_event: ").append(gmu1).toString());
        }
    }

    public void a(itz itz1)
    {
        if (itz1.b.length != 0)
        {
            itz1 = itz1.b[0];
            if (Integer.valueOf(1).equals(((iuc) (itz1)).k) && Integer.valueOf(1).equals(((iuc) (itz1)).a))
            {
                String s = String.valueOf(itz1);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 49)).append("TeleWifiCall.onMediaStats, Voice receiver stats: ").append(s).toString());
            }
            if (Integer.valueOf(0).equals(((iuc) (itz1)).k) && Integer.valueOf(1).equals(((iuc) (itz1)).a))
            {
                String s1 = String.valueOf(itz1);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s1).length() + 47)).append("TeleWifiCall.onMediaStats, Voice sender stats: ").append(s1).toString());
            }
            if (Integer.valueOf(2).equals(((iuc) (itz1)).k) && Integer.valueOf(2).equals(((iuc) (itz1)).a))
            {
                itz1 = String.valueOf(itz1);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(itz1).length() + 54)).append("TeleWifiCall.onMediaStats, BandwidthEstimation stats: ").append(itz1).toString());
                return;
            }
        }
    }

    public void a(jjt jjt1)
    {
        if (a.h != null)
        {
            jjt1.n = (new String[] {
                a.h.a()
            });
        }
    }
}
