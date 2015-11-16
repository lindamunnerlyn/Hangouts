// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ListIterator;

final class jpz extends jlk
{

    private final transient int b;
    private final transient int c;
    private final transient Object d[];

    jpz(Object aobj[])
    {
        this(aobj, 0, aobj.length);
    }

    private jpz(Object aobj[], int i, int j)
    {
        b = i;
        c = j;
        d = aobj;
    }

    int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (d)), b, ((Object) (aobj)), i, c);
        return c + i;
    }

    public jqz a(int i)
    {
        return jmr.a(d, b, c, i);
    }

    jlk b(int i, int j)
    {
        return new jpz(d, b + i, j - i);
    }

    boolean e()
    {
        return c != d.length;
    }

    public Object get(int i)
    {
        n.a(i, c);
        return d[b + i];
    }

    public int indexOf(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int i = 0;
label0:
        do
        {
label1:
            {
                if (i >= c)
                {
                    break label1;
                }
                j = i;
                if (d[b + i].equals(obj))
                {
                    break label0;
                }
                i++;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public int lastIndexOf(Object obj)
    {
        if (obj != null)
        {
            int i = c - 1;
            while (i >= 0) 
            {
                if (d[b + i].equals(obj))
                {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }

    public int size()
    {
        return c;
    }
}
