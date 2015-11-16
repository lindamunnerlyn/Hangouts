// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class jwd
{

    static final jnq a;

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
        StringBuilder stringbuilder = jrk.a(map.size()).append('{');
        a.a(stringbuilder, map);
        return stringbuilder.append('}').toString();
    }

    public static HashMap a(int i)
    {
        return new HashMap(b(i));
    }

    static Iterator a(Iterator iterator)
    {
        return jts.a(iterator, jwe.a);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new jsg(obj, obj1);
    }

    static jnn a()
    {
        return jwe.a;
    }

    public static int b(int i)
    {
        if (i < 3)
        {
            g.c(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return (int)((float)i / 0.75F + 1.0F);
        } else
        {
            return 0x7fffffff;
        }
    }

    static Iterator b(Iterator iterator)
    {
        return jts.a(iterator, jwe.b);
    }

    static jnn b()
    {
        return jwe.b;
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

    public static HashMap c()
    {
        return new HashMap();
    }

    public static LinkedHashMap c(int i)
    {
        return new LinkedHashMap(b(i));
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
        a = jrk.a.c("=");
    }
}
