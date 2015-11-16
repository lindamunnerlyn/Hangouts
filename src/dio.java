// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dio extends dfa
{

    private final int a;
    private final boolean d;

    public dio(ani ani, int i, boolean flag)
    {
        super(ani);
        a = i;
        d = flag;
    }

    public void a()
    {
        c.a(new cux(a, d));
    }
}
