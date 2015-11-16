// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;
import java.util.List;

public abstract class jqr extends Enum
{

    public static final jqr a;
    public static final jqr b;
    public static final jqr c;
    public static final jqr d;
    public static final jqr e;
    private static final jqr f[];

    jqr(String s, int i)
    {
        super(s, i);
    }

    public static jqr valueOf(String s)
    {
        return (jqr)Enum.valueOf(jqr, s);
    }

    public static jqr[] values()
    {
        return (jqr[])f.clone();
    }

    public abstract int a(Comparator comparator, Object obj, List list, int i);

    static 
    {
        a = new jqs("ANY_PRESENT");
        b = new jqt("LAST_PRESENT");
        c = new jqu("FIRST_PRESENT");
        d = new jqv("FIRST_AFTER");
        e = new jqw("LAST_BEFORE");
        f = (new jqr[] {
            a, b, c, d, e
        });
    }
}
