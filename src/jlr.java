// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class jlr
    implements Serializable, Map
{

    private static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient jmi b;
    private transient jmi c;
    private transient jle d;

    jlr()
    {
    }

    public static jlr a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return new jqa(new jlv[] {
            c(obj, obj1), c(obj2, obj3), c(obj4, obj5), c(obj6, obj7)
        });
    }

    static void a(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder("Multiple entries with same ")).append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    public static jlr b(Object obj, Object obj1)
    {
        return jlb.a(obj, obj1);
    }

    static jlv c(Object obj, Object obj1)
    {
        g.d(obj, obj1);
        return new jlv(obj, obj1);
    }

    public static jlr h()
    {
        return jlb.e();
    }

    public static jls i()
    {
        return new jls();
    }

    public jmi b()
    {
        jmi jmi2 = b;
        jmi jmi1 = jmi2;
        if (jmi2 == null)
        {
            jmi1 = c();
            b = jmi1;
        }
        return jmi1;
    }

    abstract jmi c();

    public final void clear()
    {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        return g().contains(obj);
    }

    public jmi d()
    {
        jmi jmi2 = c;
        jmi jmi1 = jmi2;
        if (jmi2 == null)
        {
            jmi1 = j();
            c = jmi1;
        }
        return jmi1;
    }

    public Set entrySet()
    {
        return b();
    }

    public boolean equals(Object obj)
    {
        return jpc.d(this, obj);
    }

    public jle g()
    {
        jle jle1 = d;
        Object obj = jle1;
        if (jle1 == null)
        {
            obj = new jmb(this);
            d = ((jle) (obj));
        }
        return ((jle) (obj));
    }

    public abstract Object get(Object obj);

    public int hashCode()
    {
        return b().hashCode();
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    jmi j()
    {
        return new jly(this);
    }

    public Set keySet()
    {
        return d();
    }

    public final Object put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map)
    {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        return jpc.a(this);
    }

    public Collection values()
    {
        return g();
    }

    Object writeReplace()
    {
        return new jlt(this);
    }

}
