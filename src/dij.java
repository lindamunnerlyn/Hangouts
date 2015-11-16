// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dij extends dfa
{

    private final String a;
    private final String d;
    private final String e;
    private final csv f;

    public dij(ani ani, csv csv, String s, String s1, String s2)
    {
        super(ani);
        f = csv;
        a = s;
        d = s1;
        e = s2;
    }

    public void a()
    {
        int i = aqm.a(e);
        c.a(new csu(f, a, d, i));
    }
}
