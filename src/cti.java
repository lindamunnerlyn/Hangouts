// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cti extends ctc
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;

    public cti(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public kop a(String s, int i, int j)
    {
        jbj jbj1 = new jbj();
        jbj1.requestHeader = ctq.a(s, i, j, h);
        jbj1.a = a;
        return jbj1;
    }

    public String g()
    {
        return "hangout_participants/search";
    }
}
