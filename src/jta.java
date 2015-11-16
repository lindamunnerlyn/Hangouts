// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jta extends jsd
{

    final jso a;

    jta(jso jso1)
    {
        a = jso1;
    }

    public jyh a()
    {
        return new jtb(this);
    }

    public boolean contains(Object obj)
    {
        return obj != null && jts.a(a(), obj);
    }

    boolean e()
    {
        return true;
    }

    jsh g()
    {
        return new jtc(this, a.d().f());
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
        return new jtd(a);
    }
}
