// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


abstract class jhh extends Enum
    implements jhd
{

    public static final jhh a;
    public static final jhh b;
    public static final jhh c;
    public static final jhh d;
    private static final jhh e[];

    jhh(String s, int i)
    {
        super(s, i);
    }

    public static jhh valueOf(String s)
    {
        return (jhh)Enum.valueOf(jhh, s);
    }

    public static jhh[] values()
    {
        return (jhh[])e.clone();
    }

    jhd a()
    {
        return this;
    }

    static 
    {
        a = new jhi("ALWAYS_TRUE");
        b = new jhj("ALWAYS_FALSE");
        c = new jhk("IS_NULL");
        d = new jhl("NOT_NULL");
        e = (new jhh[] {
            a, b, c, d
        });
    }
}
