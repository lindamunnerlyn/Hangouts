// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public final class fpk
{

    private final ArrayList a = new ArrayList();

    public fpk()
    {
    }

    private static IndexOutOfBoundsException b(int i, int j)
    {
        return new IndexOutOfBoundsException(String.format("Size=%d, requested=%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
    }

    public int a()
    {
        return a.size();
    }

    public int a(int i, int j)
    {
        Object obj = a.get(i);
        if (obj == null)
        {
            throw b(0, j);
        }
        if (obj instanceof Integer)
        {
            if (j > 0)
            {
                throw b(1, j);
            } else
            {
                return ((Integer)obj).intValue();
            }
        }
        obj = (ArrayList)obj;
        if (j > ((ArrayList) (obj)).size())
        {
            throw b(((ArrayList) (obj)).size(), j);
        } else
        {
            return ((Integer)((ArrayList) (obj)).get(j)).intValue();
        }
    }

    public void a(int i)
    {
        a.add(Integer.valueOf(i));
    }

    public void a(fqm fqm1, String s)
    {
        int i = 0;
        int j = fqm1.a(s);
        if (j == 0)
        {
            return;
        }
        if (j == 1)
        {
            a.add(Integer.valueOf(fqm1.b(s, 0)));
            return;
        }
        ArrayList arraylist = new ArrayList(j);
        for (; i < j; i++)
        {
            arraylist.add(Integer.valueOf(fqm1.b(s, i)));
        }

        a.add(arraylist);
    }

    public int b(int i)
    {
        Object obj = a.get(i);
        if (obj == null)
        {
            return 0;
        }
        if (obj instanceof Integer)
        {
            return 1;
        } else
        {
            return ((ArrayList)obj).size();
        }
    }

    public void b()
    {
        a.add(null);
    }

    public String toString()
    {
        StringBuilder stringbuilder = fqa.a();
        for (int i = 0; i < a(); i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            stringbuilder.append("[");
            int k = b(i);
            for (int j = 0; j < k; j++)
            {
                if (j > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append(a(i, j));
            }

            stringbuilder.append("]");
        }

        return stringbuilder.toString();
    }
}
