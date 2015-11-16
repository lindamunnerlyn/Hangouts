// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class glr extends Enum
{

    public static final glr a;
    public static final glr b;
    public static final glr c;
    public static final glr d;
    private static final glr e[];

    private glr(String s, int i)
    {
        super(s, i);
    }

    public static glr valueOf(String s)
    {
        return (glr)Enum.valueOf(glr, s);
    }

    public static glr[] values()
    {
        return (glr[])e.clone();
    }

    static 
    {
        a = new glr("FROM_NUMBER_WITH_PLUS_SIGN", 0);
        b = new glr("FROM_NUMBER_WITH_IDD", 1);
        c = new glr("FROM_NUMBER_WITHOUT_PLUS_SIGN", 2);
        d = new glr("FROM_DEFAULT_COUNTRY", 3);
        e = (new glr[] {
            a, b, c, d
        });
    }
}
