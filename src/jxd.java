// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

class jxd extends jry
{

    private final jsd a;
    private final jsh b;

    jxd(jsd jsd, jsh jsh1)
    {
        a = jsd;
        b = jsh1;
    }

    jxd(jsd jsd, Object aobj[])
    {
        this(jsd, jsh.b(aobj, aobj.length));
    }

    int a(Object aobj[], int i)
    {
        return b.a(aobj, i);
    }

    public jyi a(int i)
    {
        return b.a(i);
    }

    jsd b()
    {
        return a;
    }

    public Object get(int i)
    {
        return b.get(i);
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }
}
