// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class anq extends dor
{

    public final dbi a;
    public final dob b;

    public anq(dbi dbi1, dob dob)
    {
        if (dbi1 == null)
        {
            eev.g("Babel", "lookupSpec should not be empty");
        }
        if (dob == null)
        {
            eev.g("Babel", "consumer should not be null");
        }
        a = dbi1;
        b = dob;
    }

    public anq(String s, dob dob)
    {
        this(dbi.a(s), dob);
    }

    public dob a()
    {
        return b;
    }

    public String c()
    {
        return a.c();
    }

    public dbi d()
    {
        return a;
    }
}
