// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dcr extends dfa
{

    private final String a;

    public dcr(ani ani, String s)
    {
        super(ani);
        a = s;
    }

    public void a()
    {
        cty cty1 = new cty(a);
        c.a(cty1);
    }
}
