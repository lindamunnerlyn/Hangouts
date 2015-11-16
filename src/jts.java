// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

public final class jts
{

    static final jyi a = new jtt();
    private static final Iterator b = new jtw();

    public static Object a(Iterator iterator)
    {
        Object obj = iterator.next();
        if (!iterator.hasNext())
        {
            return obj;
        }
        StringBuilder stringbuilder = new StringBuilder();
        obj = String.valueOf(obj);
        stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 31)).append("expected one element but was: <").append(((String) (obj))).toString());
        for (int i = 0; i < 4 && iterator.hasNext(); i++)
        {
            String s = String.valueOf(iterator.next());
            stringbuilder.append((new StringBuilder(String.valueOf(s).length() + 2)).append(", ").append(s).toString());
        }

        if (iterator.hasNext())
        {
            stringbuilder.append(", ...");
        }
        stringbuilder.append('>');
        throw new IllegalArgumentException(stringbuilder.toString());
    }

    public static Iterator a(Iterator iterator, jnn jnn)
    {
        n.b(jnn);
        return new jtx(iterator, jnn);
    }

    public static jyh a()
    {
        return a;
    }

    public static jyh a(Object obj)
    {
        return new jtv(obj);
    }

    public static transient jyh a(Object aobj[])
    {
        return a(aobj, 0, aobj.length, 0);
    }

    static jyi a(Object aobj[], int i, int j, int k)
    {
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.a(flag);
        n.a(i, i + j, aobj.length);
        n.b(k, j);
        if (j == 0)
        {
            return a;
        } else
        {
            return new jtu(j, k, aobj, i);
        }
    }

    public static boolean a(Collection collection, Iterator iterator)
    {
        n.b(collection);
        n.b(iterator);
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= collection.add(iterator.next())) { }
        return flag;
    }

    public static boolean a(Iterator iterator, Object obj)
    {
        int i;
        boolean flag;
        flag = false;
        obj = jny.a(obj);
        n.b(obj, "predicate");
        i = 0;
_L3:
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (!((jnx) (obj)).a(iterator.next())) goto _L2; else goto _L1
_L1:
        if (i != -1)
        {
            flag = true;
        }
        return flag;
_L2:
        i++;
          goto _L3
        i = -1;
          goto _L1
    }

    public static boolean a(Iterator iterator, Collection collection)
    {
        collection = jny.a(collection);
        n.b(collection);
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (collection.a(iterator.next()))
            {
                iterator.remove();
                flag = true;
            }
        } while (true);
        return flag;
    }

    public static boolean a(Iterator iterator, Iterator iterator1)
    {
        do
        {
            if (iterator.hasNext())
            {
                if (iterator1.hasNext())
                {
                    continue;
                }
            } else
            if (!iterator1.hasNext())
            {
                return true;
            }
            return false;
        } while (n.a(iterator.next(), iterator1.next()));
        return false;
    }

    public static Object b(Iterator iterator, Object obj)
    {
        if (iterator.hasNext())
        {
            return iterator.next();
        } else
        {
            return null;
        }
    }

    static void b(Iterator iterator)
    {
        n.b(iterator);
        for (; iterator.hasNext(); iterator.remove())
        {
            iterator.next();
        }

    }

    public static jxc c(Iterator iterator)
    {
        if (iterator instanceof jty)
        {
            return (jty)iterator;
        } else
        {
            return new jty(iterator);
        }
    }

}
