// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class jxl extends jth
{

    public static final jxl a;
    final transient Object b[];
    private final transient Object c[];
    private final transient int d;
    private final transient int e;

    jxl(Object aobj[], int i, Object aobj1[], int j)
    {
        c = aobj;
        b = aobj1;
        d = j;
        e = i;
    }

    boolean I_()
    {
        return true;
    }

    int a(Object aobj[], int i)
    {
        System.arraycopy(((Object) (c)), 0, ((Object) (aobj)), i, c.length);
        return c.length + i;
    }

    public jyh a()
    {
        return jts.a(c);
    }

    public boolean contains(Object obj)
    {
        Object aobj[] = b;
        if (obj != null && aobj != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i;
        Object obj1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        i = jrx.a(i);
        i &= d;
        obj1 = aobj[i];
        if (obj1 != null)
        {
            if (obj1.equals(obj))
            {
                return true;
            }
            i++;
            break MISSING_BLOCK_LABEL_29;
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
    }

    boolean e()
    {
        return false;
    }

    jsh g()
    {
        if (b == null)
        {
            return jxj.a;
        } else
        {
            return new jxd(this, c);
        }
    }

    public int hashCode()
    {
        return e;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        return c.length;
    }

    static 
    {
        a = new jxl(jxa.a, 0, null, 0);
    }
}
