// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class ctf extends ctc
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private final String b;

    public ctf(String s, String s1)
    {
        a = s1;
        b = s;
    }

    public kop a(String s, int i, int j)
    {
        jal jal1 = new jal();
        jal1.requestHeader = ctq.a(s, i, j, h);
        jal1.b = b;
        jal1.a = a;
        return jal1;
    }

    public long b()
    {
        return bpd.G();
    }

    public String g()
    {
        return "broadcasts/query";
    }
}
