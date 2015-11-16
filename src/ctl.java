// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctl extends ctc
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public ctl(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kop a(String s, int i, int j)
    {
        jan jan1 = new jan();
        jan1.requestHeader = ctq.a(s, i, j, h);
        jan1.b = a;
        jan1.a = b;
        return jan1;
    }

    public long b()
    {
        return bpd.G();
    }

    public String g()
    {
        return "broadcasts/remove";
    }
}
