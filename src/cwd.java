// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cwd extends cvy
{

    private static final long serialVersionUID = 1L;
    public final String a;

    public cwd(String s, String s1)
    {
        super(s);
        a = s1;
    }

    public String a()
    {
        return "event_queue";
    }

    public kws a(String s, int i, int j)
    {
        iyu iyu1 = new iyu();
        iyu1.requestHeader = cvu.a(s, i, j, h);
        iyu1.a = cvu.a(c);
        iyu1.b = new iys();
        iyu1.b.a = a;
        return iyu1;
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "conversations/easteregg";
    }
}
