// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class jmo extends jmj
{

    private final Comparator c;

    public jmo(Comparator comparator)
    {
        c = (Comparator)n.b(comparator);
    }

    public jlf a(Object obj)
    {
        super.c(obj);
        return this;
    }

    public jlg a(Object aobj[])
    {
        return c(aobj);
    }

    public jmi a()
    {
        return b();
    }

    public jlg b(Object obj)
    {
        super.c(obj);
        return this;
    }

    public jmj b(Object aobj[])
    {
        return c(aobj);
    }

    public jmn b()
    {
        Object aobj[] = (Object[])a;
        jmn jmn1 = jmn.a(c, b, aobj);
        b = jmn1.size();
        return jmn1;
    }

    public jmj c(Object obj)
    {
        super.c(obj);
        return this;
    }

    public transient jmo c(Object aobj[])
    {
        super.b(aobj);
        return this;
    }
}
