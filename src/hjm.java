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

public class hjm
{

    private static final Bundle d = new Bundle();
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    private HashSet c;
    private hjr e;
    private hjr f;
    private hjr g;
    private hjr h;

    public hjm()
    {
        c = new HashSet();
    }

    static String b(fsn fsn1)
    {
        return c(fsn1);
    }

    private static String c(fsn fsn1)
    {
label0:
        {
            String s = null;
            if (fsn1 instanceof hkb)
            {
                if (!(fsn1 instanceof hke))
                {
                    break label0;
                }
                s = ((hke)fsn1).a();
            }
            return s;
        }
        return fsn1.getClass().getName();
    }

    public Bundle a(fsn fsn1, Bundle bundle)
    {
label0:
        {
            Bundle bundle1 = null;
            if (bundle != null)
            {
                fsn1 = c(fsn1);
                if (fsn1 == null)
                {
                    break label0;
                }
                bundle1 = bundle.getBundle(fsn1);
            }
            return bundle1;
        }
        return d;
    }

    public fsn a(fsn fsn1)
    {
        String s = c(fsn1);
        if (s != null)
        {
            if (c.contains(s))
            {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[] {
                    s
                }));
            }
            c.add(s);
        }
        a.add(fsn1);
        for (int i = 0; i < b.size(); i++)
        {
            ((hjr)b.get(i)).a(fsn1);
        }

        return fsn1;
    }

    public hjr a(hjr hjr1)
    {
        for (int i = 0; i < a.size(); i++)
        {
            hjr1.a((fsn)a.get(i));
        }

        b.add(hjr1);
        return hjr1;
    }

    public void a(int i, int j, Intent intent)
    {
        for (int k = 0; k < a.size(); k++)
        {
            fsn fsn1 = (fsn)a.get(k);
            if (fsn1 instanceof hjs)
            {
                ((hjs)fsn1).a(i, j, intent);
            }
        }

    }

    public void a(int i, String as[], int ai[])
    {
        for (int j = 0; j < a.size(); j++)
        {
            fsn fsn1 = (fsn)a.get(j);
            if (fsn1 instanceof hjz)
            {
                ((hjz)fsn1).a(i, as, ai);
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
            fsn fsn1 = (fsn)iterator.next();
            if (fsn1 instanceof hju)
            {
                flag = ((hju)fsn1).a(menu) | flag;
            }
        } while (true);
        return flag;
    }

    public boolean a(MenuItem menuitem)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            fsn fsn1 = (fsn)iterator.next();
            if ((fsn1 instanceof hjw) && ((hjw)fsn1).a(menuitem))
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
            fsn fsn1 = (fsn)a.get(i);
            if (fsn1 instanceof hjx)
            {
                ((hjx)fsn1).a();
            }
        }

    }

    public void b(hjr hjr1)
    {
        b.remove(hjr1);
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
            fsn fsn1 = (fsn)iterator.next();
            if (fsn1 instanceof hjy)
            {
                flag = ((hjy)fsn1).b(menu) | flag;
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
            fsn fsn1 = (fsn)a.get(i);
            if (fsn1 instanceof hjv)
            {
                ((hjv)fsn1).e_();
            }
        }

    }

    public void c(Bundle bundle)
    {
        e = a(new hjn(this, bundle));
    }

    public void d(Bundle bundle)
    {
        h = a(new hjq(this, bundle));
    }

    public void o()
    {
        f = a(new hjo(this));
    }

    public void p()
    {
        g = a(new hjp(this));
    }

    public void q()
    {
        b(f);
        for (int i = 0; i < a.size(); i++)
        {
            fsn fsn1 = (fsn)a.get(i);
            if (fsn1 instanceof hkd)
            {
                ((hkd)fsn1).k_();
            }
        }

    }

    public void r()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

}
