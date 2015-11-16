// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvl extends cvf
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cvl(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kws a(String s, int i, int j)
    {
        jhq jhq1 = new jhq();
        jhq1.requestHeader = cvu.a(s, i, j, h);
        jhq1.a = a;
        return jhq1;
    }

    public String f()
    {
        return "hangout_participants/search";
    }
}
