// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhb extends dfa
{

    private final String a;
    private final String d;

    public dhb(ani ani, String s, String s1)
    {
        super(ani);
        a = s;
        d = s1;
    }

    public void a()
    {
        c.a(new ctl(a, d));
    }
}
