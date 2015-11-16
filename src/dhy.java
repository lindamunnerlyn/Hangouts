// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhy extends dfa
{

    private final String a;
    private final boolean d;
    private final int e;

    public dhy(ani ani, String s, boolean flag, int i)
    {
        super(ani);
        a = s;
        d = flag;
        e = i;
    }

    public void a()
    {
        any.a(a, d, e, c);
    }
}
