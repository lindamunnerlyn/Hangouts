// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jmb extends jle
{

    private final jlr a;

    jmb(jlr jlr1)
    {
        a = jlr1;
    }

    public jqy a()
    {
        return jpc.a(a.b().a());
    }

    public boolean contains(Object obj)
    {
        return obj != null && jmr.a(a(), obj);
    }

    boolean e()
    {
        return true;
    }

    jlk f()
    {
        return new jmc(this, a.b().b());
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return a.size();
    }

    Object writeReplace()
    {
        return new jmd(a);
    }
}
