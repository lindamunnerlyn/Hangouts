// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class hof
{

    private static final Bundle d = new Bundle();
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    private HashSet c;
    private hok e;
    private hok f;
    private hok g;
    private hok h;

    public hof()
    {
        c = new HashSet();
    }

    static String b(hoy hoy1)
    {
        return c(hoy1);
    }

    private static String c(hoy hoy1)
    {
label0:
        {
            String s1 = null;
            if (hoy1 instanceof hov)
            {
                if (!(hoy1 instanceof hoz))
                {
                    break label0;
                }
                s1 = ((hoz)hoy1).a();
            }
            return s1;
        }
        return hoy1.getClass().getName();
    }

    public Bundle a(hoy hoy1, Bundle bundle)
    {
label0:
        {
            Bundle bundle1 = null;
            if (bundle != null)
            {
                hoy1 = c(hoy1);
                if (hoy1 == null)
                {
                    break label0;
                }
                bundle1 = bundle.getBundle(hoy1);
            }
            return bundle1;
        }
        return d;
    }

    public hok a(hok hok1)
    {
        for (int i = 0; i < a.size(); i++)
        {
            hok1.a((hoy)a.get(i));
        }

        b.add(hok1);
        return hok1;
    }

    public hoy a(hoy hoy1)
    {
        String s1 = c(hoy1);
        if (s1 != null)
        {
            if (c.contains(s1))
            {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[] {
                    s1
                }));
            }
            c.add(s1);
        }
        a.add(hoy1);
        for (int i = 0; i < b.size(); i++)
        {
            ((hok)b.get(i)).a(hoy1);
        }

        return hoy1;
    }

    public void a(int i, int j, Intent intent)
    {
        for (int k = 0; k < a.size(); k++)
        {
            hoy hoy1 = (hoy)a.get(k);
            if (hoy1 instanceof hol)
            {
                ((hol)hoy1).a(i, j, intent);
            }
        }

    }

    public void a(int i, String as[], int ai[])
    {
        for (int j = 0; j < a.size(); j++)
        {
            hoy hoy1 = (hoy)a.get(j);
            if (hoy1 instanceof hot)
            {
                ((hot)hoy1).a(i, as, ai);
            }
        }

    }

    public boolean a(Menu menu)
    {
        Iterator iterator = a.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hoy hoy1 = (hoy)iterator.next();
            if (hoy1 instanceof hoo)
            {
                flag = ((hoo)hoy1).a(menu) | flag;
            }
        } while (true);
        return flag;
    }

    public boolean a(MenuItem menuitem)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hoy hoy1 = (hoy)iterator.next();
            if ((hoy1 instanceof hoq) && ((hoq)hoy1).a(menuitem))
            {
                return true;
            }
        }

        return false;
    }

    public void b()
    {
        b(g);
        for (int i = 0; i < a.size(); i++)
        {
            hoy hoy1 = (hoy)a.get(i);
            if (hoy1 instanceof hor)
            {
                ((hor)hoy1).a();
            }
        }

    }

    public void b(hok hok1)
    {
        b.remove(hok1);
    }

    public boolean b(Menu menu)
    {
        Iterator iterator = a.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hoy hoy1 = (hoy)iterator.next();
            if (hoy1 instanceof hos)
            {
                flag = ((hos)hoy1).b(menu) | flag;
            }
        } while (true);
        return flag;
    }

    public void c()
    {
        b(h);
        b(e);
        for (int i = 0; i < a.size(); i++)
        {
            hoy hoy1 = (hoy)a.get(i);
            if (hoy1 instanceof hop)
            {
                ((hop)hoy1).f_();
            }
        }

    }

    public void c(Bundle bundle)
    {
        e = a(new hog(this, bundle));
    }

    public void d(Bundle bundle)
    {
        h = a(new hoj(this, bundle));
    }

    public void o()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

    public boolean p()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            hoy hoy1 = (hoy)iterator.next();
            if ((hoy1 instanceof hom) && ((hom)hoy1).a())
            {
                return true;
            }
        }

        return false;
    }

    public void q()
    {
        f = a(new hoh(this));
    }

    public void r()
    {
        g = a(new hoi(this));
    }

    public void s()
    {
        b(f);
        for (int i = 0; i < a.size(); i++)
        {
            hoy hoy1 = (hoy)a.get(i);
            if (hoy1 instanceof hox)
            {
                ((hox)hoy1).l_();
            }
        }

    }

    public void t()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

}
