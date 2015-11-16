// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cgf extends Enum
{

    public static final cgf a;
    public static final cgf b;
    public static final cgf c;
    public static final cgf d;
    private static final cgf e[];

    private cgf(String s, int i)
    {
        super(s, i);
    }

    public static cgf valueOf(String s)
    {
        return (cgf)Enum.valueOf(cgf, s);
    }

    public static cgf[] values()
    {
        return (cgf[])e.clone();
    }

    static 
    {
        a = new cgf("UNKNOWN", 0);
        b = new cgf("PERSON", 1);
        c = new cgf("CIRCLE", 2);
        d = new cgf("PHONE", 3);
        e = (new cgf[] {
            a, b, c, d
        });
    }
}
