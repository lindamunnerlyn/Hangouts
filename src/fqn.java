// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public final class fqn
{

    private final HashMap a = new HashMap();

    public fqn()
    {
    }

    public int a(String s)
    {
        h.a(s);
        s = ((String) (a.get(s)));
        if (s == null)
        {
            return 0;
        }
        if (s instanceof ArrayList)
        {
            return ((ArrayList)s).size();
        } else
        {
            return 1;
        }
    }

    public Object a(String s, int i)
    {
        h.a(s);
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag);
        s = ((String) (a.get(s)));
        if (s == null)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Size=0, requested=")).append(i).toString());
        }
        if (s instanceof ArrayList)
        {
            s = (ArrayList)s;
            if (i > s.size())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Size=")).append(s.size()).append(", requested=").append(i).toString());
            }
            s = ((String) (s.get(i)));
        } else
        if (i > 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder("Size=1, requested=")).append(i).toString());
        }
        return s;
    }

    public void a(String s, Object obj)
    {
        h.a(s);
        Object obj1 = a.get(s);
        if (obj1 == null)
        {
            a.put(s, obj);
            return;
        }
        if (obj1 instanceof ArrayList)
        {
            ((ArrayList)obj1).add(obj);
            return;
        } else
        {
            ArrayList arraylist = new ArrayList(4);
            arraylist.add(obj1);
            arraylist.add(obj);
            a.put(s, arraylist);
            return;
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = fqa.a();
        String as[] = (String[])(new ArrayList(a.keySet())).toArray(fqa.d);
        Arrays.sort(as);
        int k = as.length;
        for (int i = 0; i < k; i++)
        {
            String s = as[i];
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append(s);
            stringbuilder.append("=");
            int l = a(s);
            for (int j = 0; j < l; j++)
            {
                if (j > 0)
                {
                    stringbuilder.append(".");
                }
                stringbuilder.append(a(s, j));
            }

        }

        return stringbuilder.toString();
    }
}
