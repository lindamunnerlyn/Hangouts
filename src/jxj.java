// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

public final class jxj extends jsh
{

    public static final jsh a;
    private final transient int b;
    private final transient int c;
    private final transient Object d[];

    jxj(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private jxj(Object aobj[], int i, int j)
    {
        b = i;
        c = j;
        d = aobj;
    }

    int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (d)), b, ((Object) (aobj)), i, c);
        return c + i;
    }

    public jyi a(int i)
    {
        return jts.a(d, b, c, i);
    }

    jsh b(int i, int j)
    {
        return new jxj(d, b + i, j - i);
    }

    boolean e()
    {
        return c != d.length;
    }

    public Object get(int i)
    {
        n.a(i, c);
        return d[b + i];
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return c;
    }

    static 
    {
        a = new jxj(jxa.a);
    }
}
