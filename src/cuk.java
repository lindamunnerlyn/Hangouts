// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cuk extends cua
{

    private static final long serialVersionUID = 1L;
    public final int a;
    public final int b;
    public final String k;

    public cuk(String s, String s1, int i, int j)
    {
        super(s1, s);
        a = i;
        b = j;
        k = s1;
    }

    public kop a(String s, int i, int j)
    {
        s = new ivp();
        itb itb1 = new itb();
        itb1.b = aoe.c(this.j);
        itb1.a = ctq.a(k);
        itb1.e = Integer.valueOf(9);
        s.b = Integer.valueOf(a);
        s.a = itb1;
        s.requestHeader = new ixf();
        ((ivp) (s)).requestHeader.a = h.e();
        return s;
    }

    public String g()
    {
        return "conversations/modifyotrstatus";
    }

    public ccg n()
    {
        return new dej(this);
    }
}
