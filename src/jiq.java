// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jiq extends Enum
{

    public static final jiq a;
    public static final jiq b;
    public static final jiq c;
    private static final jiq d[];

    jiq(String s, int i)
    {
        super(s, i);
    }

    public static jiq valueOf(String s)
    {
        return (jiq)Enum.valueOf(jiq, s);
    }

    public static jiq[] values()
    {
        return (jiq[])d.clone();
    }

    abstract jja a(jin jin, com.google.common.cache.LocalCache.ReferenceEntry referenceentry, Object obj, int i);

    static 
    {
        a = new jir("STRONG");
        b = new jis("SOFT");
        c = new jit("WEAK");
        d = (new jiq[] {
            a, b, c
        });
    }
}
