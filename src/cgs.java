// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cgs
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[cgt.a().length];
        try
        {
            b[cgt.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[cgt.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[cgt.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[cgt.d - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[atu.values().length];
        try
        {
            a[atu.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[atu.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[atu.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[atu.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
