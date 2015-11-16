// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class jso
    implements Serializable, Map
{

    static final java.util.Map.Entry a[] = new java.util.Map.Entry[0];
    private transient jth b;
    private transient jth c;
    private transient jsd d;

    jso()
    {
    }

    public static jso a(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7)
    {
        return jxk.a(4, new java.util.Map.Entry[] {
            b(obj, obj1), b(obj2, obj3), b(obj4, obj5), b(obj6, obj7)
        });
    }

    static void a(boolean flag, String s, java.util.Map.Entry entry, java.util.Map.Entry entry1)
    {
        if (!flag)
        {
            entry = String.valueOf(entry);
            entry1 = String.valueOf(entry1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(entry).length() + String.valueOf(entry1).length())).append("Multiple entries with same ").append(s).append(": ").append(entry).append(" and ").append(entry1).toString());
        } else
        {
            return;
        }
    }

    static jss b(Object obj, Object obj1)
    {
        return new jss(obj, obj1);
    }

    public jsd c()
    {
        jsd jsd1 = d;
        Object obj = jsd1;
        if (jsd1 == null)
        {
            obj = new jta(this);
            d = ((jsd) (obj));
        }
        return ((jsd) (obj));
    }

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
        return c().contains(obj);
    }

    public jth d()
    {
        jth jth2 = b;
        jth jth1 = jth2;
        if (jth2 == null)
        {
            jth1 = e();
            b = jth1;
        }
        return jth1;
    }

    abstract jth e();

    public Set entrySet()
    {
        return d();
    }

    public boolean equals(Object obj)
    {
        return jwd.d(this, obj);
    }

    public jth f()
    {
        jth jth2 = c;
        jth jth1 = jth2;
        if (jth2 == null)
        {
            jth1 = g();
            c = jth1;
        }
        return jth1;
    }

    jth g()
    {
        if (isEmpty())
        {
            return jxl.a;
        } else
        {
            return new jsy(this);
        }
    }

    public abstract Object get(Object obj);

    jyh h()
    {
        return new jsp(this, d().a());
    }

    public int hashCode()
    {
        return h.a(d());
    }

    boolean i()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Set keySet()
    {
        return f();
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
        return jwd.a(this);
    }

    public Collection values()
    {
        return c();
    }

    Object writeReplace()
    {
        return new jsr(this);
    }

}
