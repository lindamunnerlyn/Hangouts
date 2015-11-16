// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvi extends cvf
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public cvi(String s, String s1)
    {
        a = s1;
        b = s;
    }

    public kws a(String s, int i, int j)
    {
        jgq jgq1 = new jgq();
        jgq1.requestHeader = cvu.a(s, i, j, h);
        jgq1.b = b;
        jgq1.a = a;
        return jgq1;
    }

    public long b()
    {
        return bpm.F();
    }

    public String f()
    {
        return "broadcasts/query";
    }
}
