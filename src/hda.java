// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class hda
    implements gqx, hbk
{

    private final Context b;
    private final List c;
    private final SparseArray d;
    private final Object e;
    private final gwu f;
    private final gss g;
    private final gqz h;
    private final hie i;
    private final hci j;
    private final ExecutorService k;
    private grk l;
    private List m;
    private hbw n;

    public hda(Context context)
    {
        this(context, Executors.newCachedThreadPool(new hdb()));
    }

    private hda(Context context, ExecutorService executorservice)
    {
        c = new ArrayList();
        d = new SparseArray();
        e = new Object();
        b = context;
        k = executorservice;
        f = (gwu)hlp.a(context, gwu);
        l = (grk)hlp.a(context, grk);
        g = (gss)hlp.a(context, gss);
        h = (gqz)hlp.a(context, gqz);
        i = (hie)hlp.a(context, hie);
        m = hlp.c(context, hbx);
        n = (hbw)hlp.b(context, hbw);
        j = (hci)hlp.a(context, hci);
    }

    static gqz a(hda hda1)
    {
        return hda1.h;
    }

    static IOException a(hig hig1)
    {
        Exception exception = hig1.m;
        if (exception != null)
        {
            return new IOException("Rpc failed", exception);
        }
        if (hig1.m())
        {
            int i1 = hig1.k;
            return new IOException((new StringBuilder(32)).append("RPC failed with code ").append(i1).toString());
        } else
        {
            return null;
        }
    }

    private boolean a(int i1, hbm hbm1)
    {
        grb grb1;
        long l1;
        if (i1 != -1)
        {
            grb1 = h.a(i1);
            l1 = grb1.a("LoginManager.last_updated", 0L);
            break MISSING_BLOCK_LABEL_27;
        }
        do
        {
            return true;
        } while (!grb1.d("logged_out") && (e(i1) || !hbm1.a() && f.a() - l1 >= hbm1.b()));
        return false;
    }

    static boolean a(grd grd1, List list)
    {
        boolean flag2 = grd1.d("logged_in");
        boolean flag1;
        if (list != null)
        {
            list = list.iterator();
            boolean flag = true;
            do
            {
                flag1 = flag;
                if (!list.hasNext())
                {
                    break;
                }
                hbq hbq1 = (hbq)list.next();
                if (flag && hbq1.e(grd1))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } while (true);
        } else
        {
            flag1 = true;
        }
        if (!flag1)
        {
            return false;
        }
        if (!flag2)
        {
            if (grd1.d("logged_out") && !grd1.d("has_irrecoverable_error"))
            {
                grd1.c();
            }
            grd1.c("logged_in", true).c("logged_out", false);
        }
        return true;
    }

    static boolean a(hda hda1, int i1)
    {
        return hda1.e(i1);
    }

    private hcf b(hbm hbm1)
    {
        g.a();
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        grh agrh[];
        int j1;
        g.w();
        agrh = l.a();
        obj1 = new ArrayList(agrh.length);
        j1 = agrh.length;
        int i1 = 0;
_L2:
        grh grh1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        grh1 = agrh[i1];
        String s = grh1.a();
        if (a(h.b(s), hbm1))
        {
            ((List) (obj1)).add(new hdd(this, grh1, null, null, hbm1.c()));
        }
        break MISSING_BLOCK_LABEL_174;
        hbm1 = new hcf();
        b(((List) (obj1)));
        hbm1.a = true;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((hdd)((Iterator) (obj1)).next()).a(hbm1)) { }
        break MISSING_BLOCK_LABEL_170;
        hbm1;
        obj;
        JVM INSTR monitorexit ;
        throw hbm1;
        obj;
        JVM INSTR monitorexit ;
        return hbm1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static hie b(hda hda1)
    {
        return hda1.i;
    }

    private void b(hbo hbo1, String s, int i1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((hbl)iterator.next()).a(hbo1, s, i1)) { }
    }

    static void b(hda hda1, int i1)
    {
        hda1.g(i1);
    }


// JavaClassFileOutputException: Prev chain is broken

    static gwu c(hda hda1)
    {
        return hda1.f;
    }

    private static hbm c()
    {
        return (new hbn()).a(true).a().b().c();
    }

    static void c(hda hda1, int i1)
    {
        hda1.f(i1);
    }

    private void c(List list)
    {
        boolean flag;
        boolean flag1;
        int i1;
        i1 = 0;
        flag1 = false;
        flag = false;
_L6:
        if (i1 >= 3) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList(list.size());
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(new hdc(this, (hdd)iterator.next()))) { }
        k.invokeAll(arraylist);
        flag = flag1;
        flag1 = true;
_L5:
        if (!flag1) goto _L4; else goto _L3
_L3:
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        boolean flag2 = true;
        flag1 = flag;
        flag = flag2;
          goto _L5
_L4:
        int j1 = i1 + 1;
        i1 = ((flag1) ? 1 : 0);
        flag1 = flag;
        flag = i1;
        i1 = j1;
          goto _L6
_L2:
        if (!flag1) goto _L3; else goto _L7
_L7:
        Thread.currentThread().interrupt();
        return;
          goto _L5
    }

    static hci d(hda hda1)
    {
        return hda1.j;
    }

    static hbw e(hda hda1)
    {
        return hda1.n;
    }

    private boolean e(int i1)
    {
        grb grb1;
        if (i1 != -1)
        {
            if (TextUtils.equals(j.a(), (grb1 = h.a(i1)).b("LoginManager.build_version")))
            {
                return false;
            }
        }
        return true;
    }

    static SparseArray f(hda hda1)
    {
        return hda1.d;
    }

    private void f(int i1)
    {
        List list = hlp.c(b, hcb);
        int k1 = list.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ((hcb)list.get(j1)).a(i1);
        }

    }

    private void g(int i1)
    {
        if (!h.d(i1) && h.e(i1))
        {
            return;
        }
        Object obj = h.a(i1);
        if (!((grb) (obj)).d("is_managed_account"))
        {
            obj = ((grb) (obj)).b("account_name");
            List list = h.a();
            int k1 = list.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                Integer integer = (Integer)list.get(j1);
                grb grb1 = h.a(integer.intValue());
                if (grb1.a() && grb1.d("is_managed_account") && grb1.b("account_name").equals(obj))
                {
                    g(integer.intValue());
                }
            }

        }
        h.b(i1).c("logged_out", true).c("logged_in", false).d();
        f(i1);
    }

    hcf a(String s, String s1, hbo hbo1, boolean flag)
    {
        hcf hcf1 = new hcf();
        try
        {
            s = l.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            hcf1.e = Collections.singletonList(s);
            return hcf1;
        }
        if (s != null)
        {
            s = new hdd(this, s, s1, hbo1, flag);
            b(Collections.singletonList(s));
            hcf1.a = true;
            s.a(hcf1);
        }
        return hcf1;
    }

    List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Class class1;
        for (list = list.iterator(); list.hasNext(); arraylist.add((hbq)hlp.a(b, class1)))
        {
            class1 = (Class)list.next();
        }

        return arraylist;
    }

    public void a(int i1)
    {
        if (!h.d(i1))
        {
            return;
        }
        synchronized (e)
        {
            g(i1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ap ap, hbo hbo1, String s)
    {
        hct.a(ap).a(hbo1, s);
    }

    public void a(hbl hbl1)
    {
        c.add(hbl1);
    }

    public void a(hbm hbm1)
    {
        b(hbm1);
    }

    void a(hbo hbo1, String s)
    {
        b(hbo1, s, -1);
    }

    void a(hbo hbo1, String s, int i1)
    {
        b(hbo1, s, i1);
    }

    public void a(String s, hbm hbm1)
    {
        int i1 = h.b(s);
        if (i1 != -1 && h.a(i1).d("logged_out"))
        {
            throw new haw("refreshAccount called for a logged out account");
        }
        if (a(i1, hbm1))
        {
            a(s, null, null, hbm1.c());
        }
    }

    boolean a()
    {
        hbm hbm1 = c();
        Object obj = new HashSet();
        grh agrh[];
        int k1;
        try
        {
            agrh = l.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Log.isLoggable("LoginManager", 6))
            {
                Log.e("LoginManager", "Failed to obtain device accounts when checking if accounts are ready for login", ((Throwable) (obj)));
            }
            return false;
        }
        k1 = agrh.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s = agrh[i1].a();
            ((Set) (obj)).add(s);
            if (a(h.b(s), hbm1))
            {
                return false;
            }
        }

        for (Iterator iterator = h.a().iterator(); iterator.hasNext();)
        {
            int j1 = ((Integer)iterator.next()).intValue();
            if (!((Set) (obj)).contains(h.a(j1).b("account_name")))
            {
                return false;
            }
        }

        return true;
    }

    public boolean a(hbo hbo1, int i1)
    {
        for (boolean flag = hbo1.d; !h.c(i1) || b(hbo1, i1) != null || flag && !h.a(i1).d("logged_in");)
        {
            return false;
        }

        return true;
    }

    hbq b(hbo hbo1, int i1)
    {
        ArrayList arraylist = new ArrayList();
        grb grb1 = h.a(i1);
        if (n != null)
        {
            hbw hbw1 = n;
            grb1.b("account_name");
            hbw1.a(arraylist);
        }
        arraylist.addAll(hbo1.u);
        for (hbo1 = a(arraylist).iterator(); hbo1.hasNext();)
        {
            hbq hbq1 = (hbq)hbo1.next();
            if (!hbq1.e(grb1))
            {
                return hbq1;
            }
        }

        return null;
    }

    hcf b()
    {
        return b(c());
    }

    public void b(int i1)
    {
    }

    public void b(hbl hbl1)
    {
        c.remove(hbl1);
    }

    public void c(int i1)
    {
        a(i1);
    }

    public Intent d(int i1)
    {
        return (Intent)d.get(i1);
    }
}
