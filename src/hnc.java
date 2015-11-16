// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.WeakHashMap;

public final class hnc
{

    private static final Map c = new WeakHashMap();
    private static final Map d = new WeakHashMap();
    public final boolean a;
    final List b;
    private final Class e;
    private final IdentityHashMap f = new IdentityHashMap();

    private hnc(Class class1, boolean flag)
    {
        e = class1;
        a = flag;
        String s;
        TreeSet treeset;
        Field afield[];
        int i;
        int j;
        boolean flag1;
        if (!flag || !class1.isEnum())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s = String.valueOf(class1);
        l.a(flag1, (new StringBuilder(String.valueOf(s).length() + 31)).append("cannot ignore case on an enum: ").append(s).toString());
        treeset = new TreeSet(new hnd(this));
        afield = class1.getDeclaredFields();
        j = afield.length;
        i = 0;
        while (i < j) 
        {
            Field field = afield[i];
            hno hno1 = hno.a(field);
            if (hno1 != null)
            {
                String s1 = hno1.b();
                if (flag)
                {
                    s1 = s1.toLowerCase().intern();
                }
                Object obj = (hno)f.get(s1);
                String s2;
                if (obj == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag)
                {
                    s2 = "case-insensitive ";
                } else
                {
                    s2 = "";
                }
                if (obj == null)
                {
                    obj = null;
                } else
                {
                    obj = ((hno) (obj)).a();
                }
                l.a(flag1, "two fields have the same %sname <%s>: %s and %s", new Object[] {
                    s2, s1, field, obj
                });
                f.put(s1, hno1);
                treeset.add(s1);
            }
            i++;
        }
        class1 = class1.getSuperclass();
        if (class1 != null)
        {
            class1 = a(class1, flag);
            treeset.addAll(((hnc) (class1)).b);
            class1 = ((hnc) (class1)).f.entrySet().iterator();
            do
            {
                if (!class1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)class1.next();
                String s3 = (String)entry.getKey();
                if (!f.containsKey(s3))
                {
                    f.put(s3, entry.getValue());
                }
            } while (true);
        }
        if (treeset.isEmpty())
        {
            class1 = Collections.emptyList();
        } else
        {
            class1 = Collections.unmodifiableList(new ArrayList(treeset));
        }
        b = class1;
    }

    public static hnc a(Class class1)
    {
        return a(class1, false);
    }

    public static hnc a(Class class1, boolean flag)
    {
        if (class1 == null)
        {
            return null;
        }
        Map map;
        hnc hnc1;
        hnc hnc2;
        if (flag)
        {
            map = d;
        } else
        {
            map = c;
        }
        map;
        JVM INSTR monitorenter ;
        hnc2 = (hnc)map.get(class1);
        hnc1 = hnc2;
        if (hnc2 != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        hnc1 = new hnc(class1, flag);
        map.put(class1, hnc1);
        map;
        JVM INSTR monitorexit ;
        return hnc1;
        class1;
        map;
        JVM INSTR monitorexit ;
        throw class1;
    }

    public hno a(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (a)
            {
                s1 = s.toLowerCase();
            }
            s1 = s1.intern();
        }
        return (hno)f.get(s1);
    }

    public boolean a()
    {
        return e.isEnum();
    }

    public Field b(String s)
    {
        s = a(s);
        if (s == null)
        {
            return null;
        } else
        {
            return s.a();
        }
    }

    public Collection b()
    {
        return Collections.unmodifiableCollection(f.values());
    }

}
