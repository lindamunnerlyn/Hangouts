// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dhe extends dfa
{

    public int a;
    public String d;

    public dhe(ani ani, String s, int i)
    {
        super(ani);
        a = i;
        d = s;
    }

    public void a()
    {
        cur cur1 = new cur(d, a);
        c.a(cur1);
    }
}
