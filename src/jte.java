// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class jte extends jrg
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final transient jso b;
    final transient int c;

    jte(jso jso1, int l)
    {
        b = jso1;
        c = l;
    }

    public jth a()
    {
        return b.f();
    }

    public boolean a(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public Collection b(Object obj)
    {
        return d(obj);
    }

    public Map b()
    {
        return c();
    }

    public jso c()
    {
        return b;
    }

    public boolean c(Object obj)
    {
        return b.containsKey(obj);
    }

    public abstract jsd d(Object obj);

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public int f()
    {
        return c;
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    Map i()
    {
        throw new AssertionError("should never be called");
    }

    public volatile boolean j()
    {
        return super.j();
    }

    public Set k()
    {
        return a();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
