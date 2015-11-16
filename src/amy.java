// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class amy extends dlt
{

    public final dac a;
    public final dle b;

    public amy(dac dac1, dle dle)
    {
        if (dac1 == null)
        {
            ebw.g("Babel", "lookupSpec should not be empty");
        }
        if (dle == null)
        {
            ebw.g("Babel", "consumer should not be null");
        }
        a = dac1;
        b = dle;
    }

    public amy(String s, dle dle)
    {
        this(dac.a(s), dle);
    }

    public dle a()
    {
        return b;
    }

    public String c()
    {
        return a.c();
    }

    public dac d()
    {
        return a;
    }
}
