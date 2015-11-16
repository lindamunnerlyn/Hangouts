// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cvo extends cvf
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public cvo(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kws a(String s, int i, int j)
    {
        jgs jgs1 = new jgs();
        jgs1.requestHeader = cvu.a(s, i, j, h);
        jgs1.b = a;
        jgs1.a = b;
        return jgs1;
    }

    public long b()
    {
        return bpm.F();
    }

    public String f()
    {
        return "broadcasts/remove";
    }
}
