// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwk extends cwm
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cwk(aoa aoa1, String s)
    {
        if (aoa1.q())
        {
            a = aoa1.L();
        } else
        if (aoa1.y())
        {
            a = aoa1.A();
        } else
        {
            a = "";
        }
        b = s;
    }

    public kws a(String s, int i, int j)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "GetOffnetworkInviteUrlRequest");
        }
        jac jac1 = new jac();
        jac1.requestHeader = cvu.a(s, i, j, h);
        jac1.a = new kbm();
        jac1.a.a = a;
        jac1.b = new kbm();
        jac1.a.a = b;
        return jac1;
    }

    public String f()
    {
        return "conversations/getoffnetworkinviteurl";
    }
}
