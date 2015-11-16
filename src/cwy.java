// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwy extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cwy(String s)
    {
        a = s;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "SendOffnetworkInvitationRequest build protobuf ");
        }
        jcc jcc1 = new jcc();
        if (a != null)
        {
            jcc1.a = Integer.valueOf(1);
            jcc1.c = a;
        }
        jdu jdu1 = new jdu();
        jdu1.requestHeader = cvu.a(s, i, j, h);
        jdu1.a = jcc1;
        return jdu1;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "devices/sendoffnetworkinvitation";
    }
}
