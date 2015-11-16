// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cug extends cui
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cug(ani ani1, String s)
    {
        if (ani1.s())
        {
            a = ani1.O();
        } else
        if (ani1.A())
        {
            a = ani1.C();
        } else
        {
            a = "";
        }
        b = s;
    }

    public kop a(String s, int i, int j)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "GetOffnetworkInviteUrlRequest");
        }
        itx itx1 = new itx();
        itx1.requestHeader = ctq.a(s, i, j, h);
        itx1.a = new jtj();
        itx1.a.a = a;
        itx1.b = new jtj();
        itx1.a.a = b;
        return itx1;
    }

    public String g()
    {
        return "conversations/getoffnetworkinviteurl";
    }
}
