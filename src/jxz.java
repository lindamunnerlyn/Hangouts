// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.List;

public abstract class jxz extends Enum
{

    public static final jxz a;
    public static final jxz b;
    public static final jxz c;
    public static final jxz d;
    public static final jxz e;
    private static final jxz f[];

    jxz(String s, int i)
    {
        super(s, i);
    }

    public static jxz valueOf(String s)
    {
        return (jxz)Enum.valueOf(jxz, s);
    }

    public static jxz[] values()
    {
        return (jxz[])f.clone();
    }

    public abstract int a(Comparator comparator, Object obj, List list, int i);

    static 
    {
        a = new jya("ANY_PRESENT");
        b = new jyb("LAST_PRESENT");
        c = new jyc("FIRST_PRESENT");
        d = new jyd("FIRST_AFTER");
        e = new jye("LAST_BEFORE");
        f = (new jxz[] {
            a, b, c, d, e
        });
    }
}
