// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class fhe
{

    fhg b;
    fhh c;
    fhj d;

    fhe()
    {
    }

    public static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    protected abstract int a();

    protected abstract int a(Object obj);

    protected abstract Object a(int i, int j);

    protected abstract Object a(int i, Object obj);

    protected abstract void a(int i);

    protected abstract void a(Object obj, Object obj1);

    public Object[] a(Object aobj[], int i)
    {
        int k = a();
        if (aobj.length < k)
        {
            aobj = (Object[])Array.newInstance(((Object) (aobj)).getClass().getComponentType(), k);
        }
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        if (aobj.length > k)
        {
            aobj[k] = null;
        }
        return aobj;
    }

    protected abstract int b(Object obj);

    protected abstract Map b();

    public Object[] b(int i)
    {
        int k = a();
        Object aobj[] = new Object[k];
        for (int j = 0; j < k; j++)
        {
            aobj[j] = a(j, i);
        }

        return aobj;
    }

    protected abstract void c();

    public Set d()
    {
        if (b == null)
        {
            b = new fhg(this);
        }
        return b;
    }

    public Set e()
    {
        if (c == null)
        {
            c = new fhh(this);
        }
        return c;
    }

    public Collection f()
    {
        if (d == null)
        {
            d = new fhj(this);
        }
        return d;
    }
}
