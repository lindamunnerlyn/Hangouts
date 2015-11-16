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

final class azj
    implements asb
{

    private List a;
    private asa b;
    private List c;
    private List d;
    private cgd e;
    private final Map f = new gz();

    azj()
    {
        c = new ArrayList();
    }

    private void h()
    {
        for (Iterator iterator = (new ArrayList(c)).iterator(); iterator.hasNext(); ((asc)iterator.next()).a(a, b)) { }
    }

    public int a()
    {
        return f().size();
    }

    public azj a(hlp hlp1)
    {
        hlp1.a(asb, this);
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

    public void a(asa asa1)
    {
        gdv.a("Expected condition to be true", a.contains(asa1));
        if (b != asa1)
        {
            b = asa1;
            asa1 = (new ArrayList(c)).iterator();
            while (asa1.hasNext()) 
            {
                ((asc)asa1.next()).a(b);
            }
        }
    }

    public void a(asc asc1)
    {
        c.add(asc1);
        if (a != null)
        {
            asc1.a(a, b);
        }
    }

    public void a(asd asd1)
    {
        if (a != null)
        {
            asd1.a(b);
            return;
        }
        if (d == null)
        {
            d = new ArrayList();
        }
        d.add(asd1);
    }

    void a(cgd cgd1)
    {
        e = cgd1;
    }

    public void a(String s, String s1)
    {
        int i;
        i = 0;
        g.e(a);
        asa asa1;
        boolean flag;
        if (b != null && TextUtils.equals(b.a, s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L3:
        if (i >= a.size())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        asa1 = (asa)a.get(i);
        if (!TextUtils.equals(asa1.a, s)) goto _L2; else goto _L1
_L1:
        s = asa1;
_L4:
        if (s != null)
        {
            s = new asa(s1, ((asa) (s)).b, ((asa) (s)).h, ((asa) (s)).c, ((asa) (s)).d, ((asa) (s)).e, ((asa) (s)).f, ((asa) (s)).i, ((asa) (s)).j, ((asa) (s)).g);
            a.set(i, s);
            if (flag)
            {
                a(((asa) (s)));
            }
            h();
        }
        return;
_L2:
        i++;
          goto _L3
        s = null;
        i = -1;
          goto _L4
    }

    void a(List list, asa asa1)
    {
        boolean flag;
        if (a == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        a = list;
        b = asa1;
        h();
        if (d != null)
        {
            for (list = d.iterator(); list.hasNext(); ((asd)list.next()).a(asa1)) { }
        }
        d = null;
    }

    public String b()
    {
        Collection collection = f();
        if (a() == 1)
        {
            return ((cfz)collection.iterator().next()).c;
        } else
        {
            return null;
        }
    }

    public void b(asc asc1)
    {
        c.remove(asc1);
    }

    public void c()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((asc)iterator.next()).a()) { }
    }

    List d()
    {
        return a;
    }

    void e()
    {
        f.clear();
    }

    Collection f()
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
            cfz cfz1 = (cfz)((Iterator) (obj1)).next();
            if (!e.a(cfz1.b))
            {
                ((Collection) (obj)).add(cfz1);
            }
        } while (true);
        return ((Collection) (obj));
    }

    boolean g()
    {
        if (a == null)
        {
            return false;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (adf.d(((asa)iterator.next()).e))
            {
                return true;
            }
        }

        return false;
    }
}
