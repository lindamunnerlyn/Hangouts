// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhg extends dfa
{

    private final String a;
    private final long d;

    public dhg(ani ani, String s, long l)
    {
        super(ani);
        a = s;
        d = l;
    }

    public void a()
    {
        any.a(c, a, d);
    }
}
