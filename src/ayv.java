// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class ayv
    implements arl
{

    private List a;
    private ark b;
    private List c;
    private List d;
    private cey e;
    private final Map f = new gz();

    ayv()
    {
        c = new ArrayList();
    }

    private void i()
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((arm)iterator.next()).a(a, b)) { }
    }

    public int a()
    {
        return g().size();
    }

    public ayv a(hgx hgx1)
    {
        hgx1.a(arl, this);
        return this;
    }

    List a(String s)
    {
        List list = (List)f.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            f.put(s, obj);
        }
        return ((List) (obj));
    }

    public void a(ark ark1)
    {
        gbh.a(a.contains(ark1));
        if (b != ark1)
        {
            b = ark1;
            ark1 = (new ArrayList(c)).iterator();
            while (ark1.hasNext()) 
            {
                ((arm)ark1.next()).a(b);
            }
        }
    }

    public void a(arm arm1)
    {
        c.add(arm1);
        if (a != null)
        {
            arm1.a(a, b);
        }
    }

    public void a(arn arn1)
    {
        if (a != null)
        {
            arn1.a(b);
            return;
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(arn1);
    }

    void a(cey cey1)
    {
        e = cey1;
    }

    public void a(String s, String s1)
    {
        int j;
        j = 0;
        g.d(a);
        ark ark1;
        boolean flag;
        if (b != null && TextUtils.equals(b.a, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L3:
        if (j >= a.size())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        ark1 = (ark)a.get(j);
        if (!TextUtils.equals(ark1.a, s)) goto _L2; else goto _L1
_L1:
        s = ark1;
_L4:
        if (s != null)
        {
            s = new ark(s1, ((ark) (s)).b, ((ark) (s)).h, ((ark) (s)).c, ((ark) (s)).d, ((ark) (s)).e, ((ark) (s)).f, ((ark) (s)).i, ((ark) (s)).j, ((ark) (s)).g);
            a.set(j, s);
            if (flag)
            {
                a(((ark) (s)));
            }
            i();
        }
        return;
_L2:
        j++;
          goto _L3
        s = null;
        j = -1;
          goto _L4
    }

    void a(List list, ark ark1)
    {
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        a = list;
        b = ark1;
        i();
        if (d != null)
        {
            for (list = d.iterator(); list.hasNext(); ((arn)list.next()).a(ark1)) { }
        }
        d = null;
    }

    public String b()
    {
        Collection collection = g();
        if (a() == 1)
        {
            return ((ceu)collection.iterator().next()).c;
        } else
        {
            return null;
        }
    }

    public void b(arm arm1)
    {
        c.remove(arm1);
    }

    public void c()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((arm)iterator.next()).a()) { }
    }

    public ark d()
    {
        return b;
    }

    List e()
    {
        return a;
    }

    void f()
    {
        f.clear();
    }

    Collection g()
    {
        Object obj = b.a;
        Object obj1 = (List)f.get(obj);
        if (obj1 == null)
        {
            return Collections.emptyList();
        }
        obj = new ArrayList();
        obj1 = ((List) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ceu ceu1 = (ceu)((Iterator) (obj1)).next();
            if (!e.a(ceu1.b))
            {
                ((Collection) (obj)).add(ceu1);
            }
        } while (true);
        return ((Collection) (obj));
    }

    boolean h()
    {
        if (a == null)
        {
            return false;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (add.d(((ark)iterator.next()).e))
            {
                return true;
            }
        }

        return false;
    }
}
