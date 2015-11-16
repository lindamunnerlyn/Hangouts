// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctz extends ctu
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public ctz(String s, String s1)
    {
        super(s);
        a = s1;
    }

    public String a()
    {
        return "event_queue";
    }

    public kop a(String s, int i, int j)
    {
        isp isp1 = new isp();
        isp1.requestHeader = ctq.a(s, i, j, h);
        isp1.a = ctq.a(c);
        isp1.b = new isn();
        isp1.b.a = a;
        return isp1;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "conversations/easteregg";
    }
}
