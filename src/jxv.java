// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class jxv extends Enum
{

    public static final jxv a;
    public static final jxv b;
    public static final jxv c;
    private static final jxv d[];

    jxv(String s, int i)
    {
        super(s, i);
    }

    public static jxv valueOf(String s)
    {
        return (jxv)Enum.valueOf(jxv, s);
    }

    public static jxv[] values()
    {
        return (jxv[])d.clone();
    }

    public abstract int a(int i);

    static 
    {
        a = new jxw("NEXT_LOWER");
        b = new jxx("NEXT_HIGHER");
        c = new jxy("INVERTED_INSERTION_INDEX");
        d = (new jxv[] {
            a, b, c
        });
    }
}
