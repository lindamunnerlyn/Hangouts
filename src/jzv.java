// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jzv extends Enum
{

    public static final jzv a;
    private static final jzv b[];

    jzv(String s, int i)
    {
        super(s, i);
    }

    public static jzv valueOf(String s)
    {
        return (jzv)Enum.valueOf(jzv, s);
    }

    public static jzv[] values()
    {
        return (jzv[])b.clone();
    }

    abstract jzn a();

    static 
    {
        a = new jzw("DONT_EVEN_TRY_TO_CREATE");
        b = (new jzv[] {
            a
        });
    }
}
