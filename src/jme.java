// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class jme extends jkj
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final transient jlr b;
    final transient int c;

    jme(jlr jlr1, int j)
    {
        b = jlr1;
        c = j;
    }

    public static jme a(jpl jpl1)
    {
        if (jpl1 instanceof jme)
        {
            return (jme)jpl1;
        }
        if (jpl1.g())
        {
            return jkq.a;
        }
        if (jpl1 instanceof jlq)
        {
            return (jlq)jpl1;
        }
        jls jls1 = jlr.i();
        jpl1 = jpl1.i().entrySet().iterator();
        int j = 0;
        do
        {
            if (!jpl1.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)jpl1.next();
            jlk jlk1 = jlk.a((Collection)entry.getValue());
            if (!jlk1.isEmpty())
            {
                jls1.a(entry.getKey(), jlk1);
                j = jlk1.size() + j;
            }
        } while (true);
        return new jlq(jls1.a(), j);
    }

    public static jmf a()
    {
        return new jmf();
    }

    public Collection a(Object obj)
    {
        return c(obj);
    }

    public boolean a(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean a(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public jmi b()
    {
        return b.d();
    }

    public int c()
    {
        return c;
    }

    public abstract jle c(Object obj);

    public jlr d()
    {
        return b;
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    Map f()
    {
        throw new AssertionError("should never be called");
    }

    public volatile boolean g()
    {
        return super.g();
    }

    public Set h()
    {
        return b();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public Map i()
    {
        return d();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
