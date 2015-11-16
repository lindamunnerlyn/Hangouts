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

public final class gyf
    implements gmr, gxa
{

    private final Context b;
    private final List c;
    private final SparseArray d;
    private final Object e;
    private final gsi f;
    private final gok g;
    private final gms h;
    private final hdn i;
    private final gxx j;
    private final ExecutorService k;
    private gnd l;
    private List m;
    private gxl n;

    public gyf(Context context)
    {
        this(context, Executors.newCachedThreadPool(new gyg()));
    }

    private gyf(Context context, ExecutorService executorservice)
    {
        c = new ArrayList();
        d = new SparseArray();
        e = new Object();
        b = context;
        k = executorservice;
        f = (gsi)hgx.a(context, gsi);
        l = (gnd)hgx.a(context, gnd);
        g = (gok)hgx.a(context, gok);
        h = (gms)hgx.a(context, gms);
        i = (hdn)hgx.a(context, hdn);
        m = hgx.c(context, gxm);
        n = (gxl)hgx.b(context, gxl);
        j = (gxx)hgx.a(context, gxx);
    }

    static gms a(gyf gyf1)
    {
        return gyf1.h;
    }

    static IOException a(hdp hdp1)
    {
        Exception exception = hdp1.m;
        if (exception != null)
        {
            return new IOException("Rpc failed", exception);
        }
        if (hdp1.m())
        {
            int i1 = hdp1.k;
            return new IOException((new StringBuilder(32)).append("RPC failed with code ").append(i1).toString());
        } else
        {
            return null;
        }
    }

    private boolean a(int i1, gxc gxc1)
    {
        gmu gmu1;
        long l1;
        if (i1 != -1)
        {
            gmu1 = h.a(i1);
            l1 = gmu1.a("LoginManager.last_updated", 0L);
            break MISSING_BLOCK_LABEL_27;
        }
        do
        {
            return true;
        } while (!gmu1.d("logged_out") && (e(i1) || !gxc1.a() && f.a() - l1 >= gxc1.b()));
        return false;
    }

    static boolean a(gmw gmw1, List list)
    {
        boolean flag2 = gmw1.d("logged_in");
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
                gxg gxg1 = (gxg)list.next();
                if (flag && gxg1.b(gmw1))
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
            if (gmw1.d("logged_out") && !gmw1.d("has_irrecoverable_error"))
            {
                gmw1.c();
            }
            gmw1.c("logged_in", true).c("logged_out", false);
        }
        return true;
    }

    static boolean a(gyf gyf1, int i1)
    {
        return gyf1.e(i1);
    }

    private gxu b(gxc gxc1)
    {
        g.a();
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        gna agna[];
        int j1;
        g.x();
        agna = l.a();
        obj1 = new ArrayList(agna.length);
        j1 = agna.length;
        int i1 = 0;
_L2:
        gna gna1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        gna1 = agna[i1];
        String s = gna1.a();
        if (a(h.b(s), gxc1))
        {
            ((List) (obj1)).add(new gyi(this, gna1, null, null, gxc1.c()));
        }
        break MISSING_BLOCK_LABEL_174;
        gxc1 = new gxu();
        b(((List) (obj1)));
        gxc1.a = true;
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((gyi)((Iterator) (obj1)).next()).a(gxc1)) { }
        break MISSING_BLOCK_LABEL_170;
        gxc1;
        obj;
        JVM INSTR monitorexit ;
        throw gxc1;
        obj;
        JVM INSTR monitorexit ;
        return gxc1;
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static hdn b(gyf gyf1)
    {
        return gyf1.i;
    }

    private void b(gxe gxe1, String s, int i1)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((gxb)iterator.next()).a(gxe1, s, i1)) { }
    }

    static void b(gyf gyf1, int i1)
    {
        gyf1.g(i1);
    }


// JavaClassFileOutputException: Prev chain is broken

    static gsi c(gyf gyf1)
    {
        return gyf1.f;
    }

    private static gxc c()
    {
        return (new gxd()).a(true).a().b().c();
    }

    static void c(gyf gyf1, int i1)
    {
        gyf1.f(i1);
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
        for (Iterator iterator = list.iterator(); iterator.hasNext(); arraylist.add(new gyh(this, (gyi)iterator.next()))) { }
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

    static gxx d(gyf gyf1)
    {
        return gyf1.j;
    }

    static gxl e(gyf gyf1)
    {
        return gyf1.n;
    }

    private boolean e(int i1)
    {
        gmu gmu1;
        if (i1 != -1)
        {
            if (TextUtils.equals(j.a(), (gmu1 = h.a(i1)).b("LoginManager.build_version")))
            {
                return false;
            }
        }
        return true;
    }

    static SparseArray f(gyf gyf1)
    {
        return gyf1.d;
    }

    private void f(int i1)
    {
        List list = hgx.c(b, gxq);
        int k1 = list.size();
        for (int j1 = 0; j1 < k1; j1++)
        {
            ((gxq)list.get(j1)).a(i1);
        }

    }

    private void g(int i1)
    {
        if (!h.d(i1) && h.e(i1))
        {
            return;
        }
        Object obj = h.a(i1);
        if (!((gmu) (obj)).d("is_managed_account"))
        {
            obj = ((gmu) (obj)).b("account_name");
            List list = h.a();
            int k1 = list.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                Integer integer = (Integer)list.get(j1);
                gmu gmu1 = h.a(integer.intValue());
                if (gmu1.a() && gmu1.d("is_managed_account") && gmu1.b("account_name").equals(obj))
                {
                    g(integer.intValue());
                }
            }

        }
        h.b(i1).c("logged_out", true).c("logged_in", false).d();
        f(i1);
    }

    gxu a(String s, String s1, gxe gxe1, boolean flag)
    {
        gxu gxu1 = new gxu();
        try
        {
            s = l.a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gxu1.e = Collections.singletonList(s);
            return gxu1;
        }
        if (s != null)
        {
            s = new gyi(this, s, s1, gxe1, flag);
            b(Collections.singletonList(s));
            gxu1.a = true;
            s.a(gxu1);
        }
        return gxu1;
    }

    List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        Class class1;
        for (list = list.iterator(); list.hasNext(); arraylist.add((gxg)hgx.a(b, class1)))
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

    public void a(ap ap, gxe gxe1, String s)
    {
        gxy.a(ap).a(gxe1, s);
    }

    public void a(gxb gxb1)
    {
        c.add(gxb1);
    }

    public void a(gxc gxc1)
    {
        b(gxc1);
    }

    void a(gxe gxe1, String s)
    {
        b(gxe1, s, -1);
    }

    void a(gxe gxe1, String s, int i1)
    {
        b(gxe1, s, i1);
    }

    public void a(String s, gxc gxc1)
    {
        int i1 = h.b(s);
        if (i1 != -1 && h.a(i1).d("logged_out"))
        {
            throw new gwm("refreshAccount called for a logged out account");
        }
        if (a(i1, gxc1))
        {
            a(s, null, null, gxc1.c());
        }
    }

    boolean a()
    {
        gxc gxc1 = c();
        Object obj = new HashSet();
        gna agna[];
        int k1;
        try
        {
            agna = l.a();
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
        k1 = agna.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            String s = agna[i1].a();
            ((Set) (obj)).add(s);
            if (a(h.b(s), gxc1))
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

    public boolean a(gxe gxe1, int i1)
    {
        for (boolean flag = gxe1.d; !h.c(i1) || b(gxe1, i1) != null || flag && !h.a(i1).d("logged_in");)
        {
            return false;
        }

        return true;
    }

    gxg b(gxe gxe1, int i1)
    {
        ArrayList arraylist = new ArrayList();
        gmu gmu1 = h.a(i1);
        if (n != null)
        {
            gxl gxl1 = n;
            gmu1.b("account_name");
            gxl1.a(arraylist);
        }
        arraylist.addAll(gxe1.u);
        for (gxe1 = a(arraylist).iterator(); gxe1.hasNext();)
        {
            gxg gxg1 = (gxg)gxe1.next();
            if (!gxg1.b(gmu1))
            {
                return gxg1;
            }
        }

        return null;
    }

    gxu b()
    {
        return b(c());
    }

    public void b(int i1)
    {
    }

    public void b(gxb gxb1)
    {
        c.remove(gxb1);
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
