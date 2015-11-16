// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class cfm
{

    static final int a[];
    static final int b[];

    static 
    {
        b = new int[cfn.a().length];
        try
        {
            b[cfn.a - 1] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            b[cfn.b - 1] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            b[cfn.c - 1] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            b[cfn.d - 1] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        a = new int[atd.values().length];
        try
        {
            a[atd.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            a[atd.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[atd.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[atd.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
