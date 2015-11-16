// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

final class jsy extends jtj
{

    private final jso a;

    jsy(jso jso1)
    {
        a = jso1;
    }

    Object a(int i)
    {
        return ((java.util.Map.Entry)a.d().f().get(i)).getKey();
    }

    public jyh a()
    {
        return a.h();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    boolean e()
    {
        return true;
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
        return new jsz(a);
    }
}
