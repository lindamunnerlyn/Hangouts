// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AuthenticatorException;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class hdd
{

    final hda a;
    private final grh b;
    private final String c;
    private final hbo d;
    private final boolean e;
    private final grd f;
    private hio g;
    private boolean h;
    private List i;
    private int j;
    private Map k;
    private List l;
    private boolean m;
    private boolean n;
    private boolean o;

    hdd(hda hda1, grh grh1, String s, hbo hbo1, boolean flag)
    {
        a = hda1;
        super();
        l = new ArrayList();
        b = grh1;
        c = s;
        d = hbo1;
        e = flag;
        j = hda.a(hda1).b(grh1.a(), s);
        if (j == -1)
        {
            hda1 = hda.a(hda1).a(grh1.a(), s);
        } else
        {
            hda1 = hda.a(hda1).b(j);
        }
        f = hda1;
        f.c("device_index", grh1.b());
    }

    public void a(hcf hcf1)
    {
        boolean flag1 = hcf1.a;
        boolean flag;
        if (!m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hcf1.a = flag & flag1;
        hcf1.b = hcf1.b | n;
        hcf1.c = hcf1.c | o;
        hcf1.f.add(Integer.valueOf(j));
        hcf1.e.addAll(l);
        hcf1.d = j;
    }

    void a(Exception exception)
    {
        boolean flag1 = false;
        Log.e("LoginManager", "Account update failed", exception);
        l.add(exception);
        m = true;
        boolean flag = true;
        while (exception != null) 
        {
            if (exception instanceof fzw)
            {
                fzw fzw1 = (fzw)exception;
                hda.f(a).put(j, fzw1.a());
            } else
            if (exception instanceof AuthenticatorException)
            {
                flag = false;
            }
            exception = exception.getCause();
        }
        n = n | flag;
        boolean flag2 = o;
        if (!flag)
        {
            flag1 = true;
        }
        o = flag2 | flag1;
    }

    void a(List list)
    {
        boolean flag1 = true;
        if (m)
        {
            return;
        }
        if (b.c())
        {
            g = null;
            h = true;
            i = new ArrayList();
            return;
        }
        g = new hio(b.a(), c, e);
        boolean flag = flag1;
        if (!hda.a(a, j))
        {
            if (!e)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        h = flag;
        i = new ArrayList(list);
    }

    boolean a()
    {
        if (m)
        {
            return true;
        }
        Iterator iterator = k.keySet().iterator();
_L3:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        hbx hbx1;
        hby hby1;
        hbx1 = (hbx)iterator.next();
        hby1 = (hby)k.get(hbx1);
        if (hby1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        boolean flag;
        if (hby1.a(f) == hbz.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        if (!flag)
        {
            try
            {
                i.remove(hbx1);
            }
            catch (IOException ioexception)
            {
                a(((Exception) (ioexception)));
                return true;
            }
        }
          goto _L3
_L2:
        boolean flag1 = i.isEmpty();
        return flag1;
        flag = false;
          goto _L4
    }

    void b()
    {
        boolean flag = true;
        if (m)
        {
            if (o)
            {
                f.c("has_irrecoverable_error", true);
            } else
            {
                f.h("has_irrecoverable_error");
            }
            j = f.d();
            if (o && j != -1)
            {
                hda.b(a, j);
            }
            return;
        }
        f.c("LoginManager.last_updated", hda.c(a).a());
        f.c("LoginManager.build_version", hda.d(a).a());
        Object obj = new ArrayList();
        if (hda.e(a) != null)
        {
            hda.e(a).a(((List) (obj)));
        }
        if (hda.e(a) != null && hda.e(a).a(b.a()))
        {
            hda.e(a);
        } else
        if (d != null && d.d)
        {
            ((List) (obj)).addAll(d.u);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = a.a(((List) (obj)));
            hda.a(f, ((List) (obj)));
        }
        if (!o)
        {
            f.h("has_irrecoverable_error");
        }
        j = f.d();
        hda.c(a, j);
    }

    void b(List list)
    {
        if (!m)
        {
            k = new IdentityHashMap();
            Object obj = new ArrayList();
            hbx hbx1;
            hby hby2;
            for (Iterator iterator = i.iterator(); iterator.hasNext(); k.put(hbx1, hby2))
            {
                hbx1 = (hbx)iterator.next();
                hby2 = hbx1.a(f, h);
            }

            Iterator iterator1 = k.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                hby hby1 = (hby)iterator1.next();
                if (hby1 != null)
                {
                    hby1.a(g, ((List) (obj)));
                }
            } while (true);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                list.add(new hde(this, (hig)((Iterator) (obj)).next()));
            }
        }
    }
}
