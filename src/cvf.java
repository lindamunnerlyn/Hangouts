// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvf extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cvf(String s)
    {
        a = s;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "StartPhoneVerificationRequest build protobuf ");
        }
        s = new jtj();
        s.a = a;
        iyp iyp1 = new iyp();
        iyp1.b = Integer.valueOf(2);
        iyp1.a = s;
        return iyp1;
    }

    public void a(ani ani, dbo dbo)
    {
        g.a(ani, 2049);
        ani = (cpt)hgx.b(g.nS, cpt);
        if (ani != null)
        {
            ani.a(105, false);
        }
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "devices/startphonenumberverification";
    }
}
