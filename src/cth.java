// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cth extends ctc
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cth(String s)
    {
        a = s;
    }

    public kop a(String s, int i, int j)
    {
        jbl jbl1 = new jbl();
        jbl1.requestHeader = ctq.a(s, i, j, h);
        jbl1.a = a;
        return jbl1;
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "hangouts/query";
    }
}
