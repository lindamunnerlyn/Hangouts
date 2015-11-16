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

final class gyi
{

    final gyf a;
    private final gna b;
    private final String c;
    private final gxe d;
    private final boolean e;
    private final gmw f;
    private hdx g;
    private boolean h;
    private List i;
    private int j;
    private Map k;
    private List l;
    private boolean m;
    private boolean n;
    private boolean o;

    gyi(gyf gyf1, gna gna1, String s, gxe gxe1, boolean flag)
    {
        a = gyf1;
        super();
        l = new ArrayList();
        b = gna1;
        c = s;
        d = gxe1;
        e = flag;
        j = gyf.a(gyf1).b(gna1.a(), s);
        if (j == -1)
        {
            gyf1 = gyf.a(gyf1).a(gna1.a(), s);
        } else
        {
            gyf1 = gyf.a(gyf1).b(j);
        }
        f = gyf1;
        f.c("device_index", gna1.b());
    }

    public void a(gxu gxu1)
    {
        boolean flag1 = gxu1.a;
        boolean flag;
        if (!m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gxu1.a = flag & flag1;
        gxu1.b = gxu1.b | n;
        gxu1.c = gxu1.c | o;
        gxu1.f.add(Integer.valueOf(j));
        gxu1.e.addAll(l);
        gxu1.d = j;
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
            if (exception instanceof fxr)
            {
                fxr fxr1 = (fxr)exception;
                gyf.f(a).put(j, fxr1.a());
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
        g = new hdx(b.a(), c, e);
        boolean flag = flag1;
        if (!gyf.a(a, j))
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
        gxm gxm1;
        gxn gxn1;
        gxm1 = (gxm)iterator.next();
        gxn1 = (gxn)k.get(gxm1);
        if (gxn1 == null)
        {
            break MISSING_BLOCK_LABEL_125;
        }
        boolean flag;
        if (gxn1.a(f) == gxo.b)
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
                i.remove(gxm1);
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
                gyf.b(a, j);
            }
            return;
        }
        f.c("LoginManager.last_updated", gyf.c(a).a());
        f.c("LoginManager.build_version", gyf.d(a).a());
        Object obj = new ArrayList();
        if (gyf.e(a) != null)
        {
            gyf.e(a).a(((List) (obj)));
        }
        if (gyf.e(a) != null && gyf.e(a).a(b.a()))
        {
            gyf.e(a);
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
            gyf.a(f, ((List) (obj)));
        }
        if (!o)
        {
            f.h("has_irrecoverable_error");
        }
        j = f.d();
        gyf.c(a, j);
    }

    void b(List list)
    {
        if (!m)
        {
            k = new IdentityHashMap();
            Object obj = new ArrayList();
            gxm gxm1;
            gxn gxn2;
            for (Iterator iterator = i.iterator(); iterator.hasNext(); k.put(gxm1, gxn2))
            {
                gxm1 = (gxm)iterator.next();
                gxn2 = gxm1.a(f, h);
            }

            Iterator iterator1 = k.values().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                gxn gxn1 = (gxn)iterator1.next();
                if (gxn1 != null)
                {
                    gxn1.a(g, ((List) (obj)));
                }
            } while (true);
            obj = ((List) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                list.add(new gyj(this, (hdp)((Iterator) (obj)).next()));
            }
        }
    }
}
