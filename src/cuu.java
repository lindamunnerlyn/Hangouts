// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuu extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cuu(String s)
    {
        a = s;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "SendOffnetworkInvitationRequest build protobuf ");
        }
        ivx ivx1 = new ivx();
        if (a != null)
        {
            ivx1.a = Integer.valueOf(1);
            ivx1.c = a;
        }
        ixp ixp1 = new ixp();
        ixp1.requestHeader = ctq.a(s, i, j, h);
        ixp1.a = ivx1;
        return ixp1;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "devices/sendoffnetworkinvitation";
    }
}
