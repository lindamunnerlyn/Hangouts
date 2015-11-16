// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class jpc
{

    static final jgw a;

    public static int a(int i)
    {
        if (i < 3)
        {
            g.c(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static Object a(Map map, Object obj)
    {
        n.b(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = jkm.a(map.size()).append('{');
        a.a(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    static Iterator a(Iterator iterator)
    {
        return jmr.a(iterator, jpe.a);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new jlh(obj, obj1);
    }

    static jgt a()
    {
        return jpe.a;
    }

    static jqy a(jqy jqy)
    {
        return new jpd(jqy);
    }

    static Iterator b(Iterator iterator)
    {
        return jmr.a(iterator, jpe.b);
    }

    static boolean b(Map map, Object obj)
    {
        n.b(map);
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object c(Map map, Object obj)
    {
        n.b(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static boolean d(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    static 
    {
        a = jkm.a.c("=");
    }
}
