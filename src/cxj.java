// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cxj extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cxj(String s)
    {
        a = s;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "StartPhoneVerificationRequest build protobuf ");
        }
        s = new kbm();
        s.a = a;
        jeu jeu1 = new jeu();
        jeu1.b = Integer.valueOf(2);
        jeu1.a = s;
        return jeu1;
    }

    public void a(aoa aoa, dcx dcx)
    {
        g.a(aoa, 2049);
        aoa = (crk)hlp.b(g.nU, crk);
        if (aoa != null)
        {
            aoa.a(105, false);
        }
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "devices/startphonenumberverification";
    }
}
