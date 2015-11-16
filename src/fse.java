// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class fse
{

    private static final Integer b[] = new Integer[0];
    private final HashMap a = new HashMap();

    public fse()
    {
    }

    public int a(int i)
    {
        g.d(Integer.valueOf(i));
        Object obj = a.get(Integer.valueOf(i));
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof String)
        {
            return 1;
        } else
        {
            return ((ArrayList)obj).size();
        }
    }

    public String a(int i, int j)
    {
        g.d(Integer.valueOf(i));
        Object obj;
        boolean flag;
        if (j >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        obj = a.get(Integer.valueOf(i));
        if (obj == null)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Size=0, requested=")).append(j).toString());
        }
        if (obj instanceof String)
        {
            if (j > 0)
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Size=1, requested=")).append(j).toString());
            } else
            {
                return (String)obj;
            }
        }
        obj = (ArrayList)obj;
        if (j > ((ArrayList) (obj)).size())
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Size=")).append(((ArrayList) (obj)).size()).append(", requested=").append(j).toString());
        } else
        {
            return (String)((ArrayList) (obj)).get(j);
        }
    }

    public void a(Integer integer, String s)
    {
        g.d(integer);
        Object obj = a.get(integer);
        if (obj == null)
        {
            a.put(integer, s);
            return;
        }
        if (obj instanceof String)
        {
            ArrayList arraylist = new ArrayList(4);
            arraylist.add((String)obj);
            arraylist.add(s);
            a.put(integer, arraylist);
            return;
        } else
        {
            ((ArrayList)obj).add(s);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = fst.a();
        Integer ainteger[] = (Integer[])(new ArrayList(a.keySet())).toArray(b);
        Arrays.sort(ainteger);
        int k = ainteger.length;
        for (int i = 0; i < k; i++)
        {
            Integer integer = ainteger[i];
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(integer);
            stringbuilder.append("=");
            int l = a(integer.intValue());
            for (int j = 0; j < l; j++)
            {
                if (j > 0)
                {
                    stringbuilder.append(".");
                }
                stringbuilder.append(a(integer.intValue(), j));
            }

        }

        return stringbuilder.toString();
    }

}
