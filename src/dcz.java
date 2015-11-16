// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcz extends dfa
{

    private final String a;
    private final String d;

    public dcz(ani ani, String s, String s1)
    {
        super(ani);
        a = s1;
        d = s;
    }

    public void a()
    {
        c.a(new ctf(d, a));
    }
}
