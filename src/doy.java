// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class doy
    implements dpl
{

    private static final boolean a = false;
    private static doy b;
    private static final Object t = new Object();
    private static Runnable u = new dpb();
    private int c;
    private boolean d;
    private boolean e;
    private final ConditionVariable f = new ConditionVariable();
    private final emy g;
    private final List h = new ArrayList();
    private dpg i;
    private fti j;
    private ftp k;
    private gz l;
    private gz m;
    private final Handler n = new Handler(Looper.getMainLooper());
    private final Object o = new Object();
    private boolean p;
    private long q;
    private boolean r;
    private String s;
    private final Runnable v = new dpc(this);
    private fpg w;

    private doy()
    {
        emz emz1 = new emz(g.nU);
        emz1.a(fph.c, (new fpk()).a(117).a());
        emz1.a(new doz(this));
        emz1.a(new dpa(this));
        g = emz1.a();
        l = new gz();
        m = new gz();
        p = false;
        q = 0L;
        r = false;
        s = "N/A";
        w = new dpf(this);
    }

    public static doy a()
    {
        Object obj = t;
        obj;
        JVM INSTR monitorenter ;
        if (b != null && Thread.holdsLock(b.o))
        {
            throw new IllegalStateException("Invalid lock ordering");
        }
        break MISSING_BLOCK_LABEL_39;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        doy doy1;
        if (b == null)
        {
            b = new doy();
        }
        b.l();
        doy1 = b;
        obj;
        JVM INSTR monitorexit ;
        return doy1;
    }

    static Object a(doy doy1)
    {
        return doy1.o;
    }

    static void a(doy doy1, fti fti1, ftp ftp1)
    {
        Object obj;
        Object obj1;
        MessageDigest messagedigest;
        gz gz1;
        gz gz2;
        fth fth1;
        Object obj2;
        int i1;
        long l1;
        gz1 = new gz();
        gz2 = new gz();
        l1 = System.currentTimeMillis();
        eev.a("Babel", "GmsPeopleCache: Start building cache");
        String s1;
        try
        {
            messagedigest = MessageDigest.getInstance("md5");
        }
        // Misplaced declaration of an exception variable
        catch (doy doy1)
        {
            throw new IllegalStateException("md5 not available");
        }
        if (fti1 == null)
        {
            break MISSING_BLOCK_LABEL_680;
        }
        i1 = 0;
_L9:
        if (i1 >= fti1.a()) goto _L2; else goto _L1
_L1:
        fth1 = (fth)fti1.a(i1);
        obj2 = fth1.e();
        if (TextUtils.isEmpty(((CharSequence) (obj2)))) goto _L4; else goto _L3
_L3:
        if (a)
        {
            obj = String.valueOf(fth1.a());
            eev.b("Babel", (new StringBuilder(String.valueOf(obj2).length() + 50 + String.valueOf(obj).length())).append("GmsPeopleCache: adding entry from gaia:").append(((String) (obj2))).append(" to person:").append(((String) (obj))).toString());
        }
        obj1 = (ArrayList)gz1.get(obj2);
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        obj = new ArrayList();
        gz1.put(obj2, obj);
_L8:
        ((ArrayList) (obj)).add(Integer.valueOf(i1));
_L4:
        obj2 = fth1.d().iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            obj = (ftq)((Iterator) (obj2)).next();
            s1 = eey.n(((ftq) (obj)).b());
            if (a)
            {
                obj = String.valueOf(((ftq) (obj)).b());
                obj1 = String.valueOf(fth1.a());
                eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 57 + String.valueOf(obj1).length() + String.valueOf(s1).length())).append("GmsPeopleCache: adding entry from phone:").append(((String) (obj))).append(" to person:").append(((String) (obj1))).append(" key: ").append(s1).toString());
            }
            obj1 = (ArrayList)gz2.get(s1);
            obj = obj1;
            if (obj1 == null)
            {
                obj = new ArrayList();
                gz2.put(s1, obj);
            }
            if (!((ArrayList) (obj)).contains(Integer.valueOf(i1)))
            {
                ((ArrayList) (obj)).add(Integer.valueOf(i1));
            }
        } while (true);
        break; /* Loop/switch isn't completed */
_L6:
        obj = obj1;
        if (eev.a("Babel", 3))
        {
            obj = String.valueOf(fth1.a());
            eev.d("Babel", (new StringBuilder(String.valueOf(obj2).length() + 53 + String.valueOf(obj).length())).append("GmsPeopleCache_Error: duplicate entry for gaia:").append(((String) (obj2))).append(" name:").append(((String) (obj))).toString());
            obj2 = ((ArrayList) (obj1)).iterator();
            do
            {
                obj = obj1;
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                obj = String.valueOf(((fth)fti1.a(g.a((Integer)((Iterator) (obj2)).next(), 0))).a());
                if (((String) (obj)).length() != 0)
                {
                    obj = "GmsPeopleCache_Error: dup person name:".concat(((String) (obj)));
                } else
                {
                    obj = new String("GmsPeopleCache_Error: dup person name:");
                }
                eev.d("Babel", ((String) (obj)));
            } while (true);
        }
        if (true) goto _L8; else goto _L7
_L7:
        ((dqc)fth1).a(messagedigest);
        i1++;
          goto _L9
_L2:
        long l3 = System.currentTimeMillis();
        if (a)
        {
            obj = String.valueOf("GmsPeopleCache: End building cache. Total: ");
            int j1 = fti1.a();
            eev.b("Babel", (new StringBuilder(String.valueOf(obj).length() + 45)).append(((String) (obj))).append(l3 - l1).append("ms; ").append(j1).append(" contacts.").toString());
        }
        obj = doy1.o;
        obj;
        JVM INSTR monitorenter ;
        fti fti2 = doy1.j;
        ftp ftp2 = doy1.k;
        doy1.i = new dpg(doy1.h, fti1, ftp1, fti2, ftp2);
        doy1.j = fti1;
        doy1.k = ftp1;
        doy1.m = gz2;
        doy1.l = gz1;
        fti1 = String.valueOf(aow.c(g.nU));
        ftp1 = String.valueOf(g.a(messagedigest.digest()));
        doy1.s = (new StringBuilder(String.valueOf(fti1).length() + 1 + String.valueOf(ftp1).length())).append(fti1).append("|").append(ftp1).toString();
        doy1.p = false;
        doy1.d = true;
        doy1.f.open();
        gdy.a(new dpe(doy1));
        if (doy1.r)
        {
            eev.c("Babel", "GmsPeopleCache: Triggering queued refresh.");
            doy1.r = false;
            doy1.n();
        }
        synchronized (doy1.o)
        {
            long l2 = System.currentTimeMillis();
            if (doy1.j != null && doy1.j.a() > 0)
            {
                doy1.j.a(0);
            }
            if (a)
            {
                long l4 = System.currentTimeMillis();
                eev.b("Babel", (new StringBuilder(59)).append("GmsPeopleCache: prefetchFirstPerson ").append(l4 - l2).append(" ms").toString());
            }
        }
        obj;
        JVM INSTR monitorexit ;
        doy1.n.post(doy1.i);
        return;
        doy1;
        fti1;
        JVM INSTR monitorexit ;
        throw doy1;
        doy1;
        obj;
        JVM INSTR monitorexit ;
        throw doy1;
    }

    public static void a(boolean flag)
    {
        doy doy1 = a();
        doy1.b(flag);
        doy1.b();
        return;
        Exception exception;
        exception;
        doy1.b();
        throw exception;
    }

    private void b(boolean flag)
    {
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        if (!p)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        eev.c("Babel", "GmsPeopleCache: Load in progress. Queueing up refresh");
        r = true;
_L3:
        obj;
        JVM INSTR monitorexit ;
        return;
_L2:
        eev.c("Babel", "GmsPeopleCache: Load in progress. Piggyback refresh");
          goto _L3
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        eev.c("Babel", "GmsPeopleCache: Refresh requested. Performing now");
        n();
          goto _L3
    }

    static boolean b(doy doy1)
    {
        return doy1.e;
    }

    static emy c(doy doy1)
    {
        return doy1.g;
    }

    static fpg d(doy doy1)
    {
        return doy1.w;
    }

    private ArrayList d(String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        String s2 = eey.n(s1);
        Object obj = (ArrayList)m.get(s2);
        if (obj != null)
        {
            ArrayList arraylist = new ArrayList();
            obj = ((ArrayList) (obj)).iterator();
label0:
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj1 = (Integer)((Iterator) (obj)).next();
                obj1 = (fth)j.a(g.a(((Integer) (obj1)), 0));
                Iterator iterator = ((fth) (obj1)).d().iterator();
                ftq ftq1;
                do
                {
                    if (!iterator.hasNext())
                    {
                        continue label0;
                    }
                    ftq1 = (ftq)iterator.next();
                } while (!s2.equals(eey.n(ftq1.b())) || !eey.e(s1, ftq1.b()));
                arraylist.add(obj1);
            } while (true);
            if (arraylist.size() > 0)
            {
                return arraylist;
            }
        }
        return null;
    }

    public static void d()
    {
        doy doy1 = a();
        gdv.a("Expected condition to be true", doy1.c());
        doy1.b();
        return;
        Exception exception;
        exception;
        doy1.b();
        throw exception;
    }

    public static void e()
    {
        boolean flag;
        long l1;
        long l2;
        long l4;
        if (p() != 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            l1 = 0x5265c00L;
        } else
        {
            l1 = 0x36ee80L;
        }
        l1 = g.a(g.nU, "refresh_contacts_cache_period", l1);
        l2 = System.currentTimeMillis();
        if (g.oS == 0L)
        {
            g.oS = g.nU.getSharedPreferences("GmsPeopleCache", 0).getLong("last_refresh_timestamp", 0L);
            if (a)
            {
                long l3 = g.oS;
                eev.b("Babel", (new StringBuilder(60)).append("GmsPeopleCache: Last refresh timestamp: ").append(l3).toString());
            }
        }
        l4 = g.oS;
        if (l1 != 0L && l2 > l4 + l1)
        {
            eev.a("Babel", "GmsPeopleCache: Triggering contacts cache refresh.");
            g.oS = l2;
            a(false);
        } else
        if (a)
        {
            if (l1 != 0L)
            {
                l1 = (l1 - (l2 - l4)) / 1000L;
                eev.b("Babel", (new StringBuilder(61)).append("GmsPeopleCache: next refresh in at least ").append(l1).toString());
                return;
            } else
            {
                eev.b("Babel", "GmsPeopleCache: Periodic refresh is off");
                return;
            }
        }
    }

    static void e(doy doy1)
    {
        doy1.n();
    }

    public static void f()
    {
        doy doy1 = a();
        Object obj;
        String s1;
        String s2;
        eev.a("Babel", "GmsPeopleCache: refreshContactsDerivedData");
        doy1.b();
        s2 = g.nU.getSharedPreferences("GmsPeopleCache", 0).getString("last_refresh_thumbprint", "N/A");
        s1 = doy1.s;
        obj = String.valueOf(s2);
        if (((String) (obj)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = "GmsPeopleCache: old Thumbprint: ".concat(((String) (obj)));
_L5:
        eev.a("Babel", ((String) (obj)));
        obj = String.valueOf(s1);
        if (((String) (obj)).length() == 0) goto _L4; else goto _L3
_L3:
        obj = "GmsPeopleCache: current Thumbprint: ".concat(((String) (obj)));
_L6:
        eev.a("Babel", ((String) (obj)));
        if (!g.a(g.nU, "refresh_contacts_derived_data_use_thumbprint", true) || !s1.equals(s2))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        eev.a("Babel", "GmsPeopleCache: Thumbprint same as last time. Do nothing");
_L7:
        long l1 = System.currentTimeMillis();
        g.oS = l1;
        obj = g.nU.getSharedPreferences("GmsPeopleCache", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putLong("last_refresh_timestamp", l1);
        ((android.content.SharedPreferences.Editor) (obj)).putString("last_refresh_thumbprint", s1);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        doy1.b();
        return;
_L2:
        obj = new String("GmsPeopleCache: old Thumbprint: ");
          goto _L5
        obj;
        doy1.b();
        throw obj;
_L4:
        obj = new String("GmsPeopleCache: current Thumbprint: ");
          goto _L6
        aow.d(g.nU);
        eev.a("Babel", "GmsPeopleCache: derived data computed");
          goto _L7
    }

    static boolean f(doy doy1)
    {
        return doy1.m();
    }

    static Object g()
    {
        return t;
    }

    static void g(doy doy1)
    {
        doy1.b(true);
    }

    static doy h()
    {
        return b;
    }

    static Runnable h(doy doy1)
    {
        return doy1.v;
    }

    static Handler i(doy doy1)
    {
        return doy1.n;
    }

    static doy i()
    {
        b = null;
        return null;
    }

    public static boolean j()
    {
        return a;
    }

    static long k()
    {
        return p();
    }

    private void l()
    {
        synchronized (o)
        {
            c = c + 1;
            if (a)
            {
                String s1 = String.valueOf("GmsPeopleCache: addRef  ref:");
                int i1 = c;
                eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString());
            }
            if (c == 1)
            {
                n.removeCallbacks(u);
            }
            if (!g.e() && !g.f())
            {
                g.b();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean m()
    {
label0:
        {
            synchronized (o)
            {
                if (c == 0)
                {
                    break label0;
                }
            }
            return false;
        }
        gdv.a("Expected condition to be true", h.isEmpty());
        eev.a("Babel", "GmsPeopleCache: close");
        if (g.e() || g.f())
        {
            if (g.e())
            {
                fph.m.a(g, w);
            }
            g.d();
        }
        if (j != null)
        {
            j.b();
            j = null;
        }
        if (k != null)
        {
            k.b();
            k = null;
        }
        n.removeCallbacks(v);
        m.clear();
        l.clear();
        e = true;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void n()
    {
label0:
        {
            synchronized (o)
            {
                l();
                if (g.e() || g.f())
                {
                    break label0;
                }
                eev.c("Babel", "GmsPeopleCache: disconnected in load(). Reconnecting");
                g.b();
            }
            return;
        }
        eev.c("Babel", "GmsPeopleCache: PeopleLoader load() begins");
        p = true;
        q = System.currentTimeMillis();
        (new dph(g, this)).a();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void o()
    {
        if (Thread.holdsLock(o))
        {
            throw new IllegalStateException("Invalid lock ordering");
        } else
        {
            f.block();
            return;
        }
    }

    private static long p()
    {
        return g.a(g.nU, "gms_people_cache_notification_lag", 25000L);
    }

    public bhv a(String s1)
    {
        o();
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        if (l.containsKey(s1))
        {
            arraylist = new ArrayList();
            Integer integer;
            for (s1 = ((ArrayList)l.get(s1)).iterator(); s1.hasNext(); arraylist.add(j.a(g.a(integer, 0))))
            {
                integer = (Integer)s1.next();
            }

            break MISSING_BLOCK_LABEL_91;
        }
        s1 = null;
          goto _L1
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
        s1 = arraylist;
_L3:
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        s1 = bhv.a(s1);
        obj;
        JVM INSTR monitorexit ;
        return s1;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void a(dph dph1, fti fti1, ftp ftp1)
    {
        synchronized (o)
        {
            if (a)
            {
                long l1 = System.currentTimeMillis();
                long l2 = q;
                eev.b("Babel", (new StringBuilder(53)).append("GmsPeopleCache: onPeopleReady ").append(l1 - l2).append(" ms").toString());
            }
            gdy.a(new dpd(this, fti1, ftp1));
        }
        return;
        fti1;
        dph1;
        JVM INSTR monitorexit ;
        throw fti1;
    }

    public ArrayList b(String s1)
    {
        o();
        synchronized (o)
        {
            s1 = d(s1);
        }
        return s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void b()
    {
        Object obj = o;
        obj;
        JVM INSTR monitorenter ;
        if (c <= 0)
        {
            throw new IllegalStateException("number of clients should be bigger than 0");
        }
        break MISSING_BLOCK_LABEL_30;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        c = c - 1;
        if (a)
        {
            String s1 = String.valueOf("GmsPeopleCache: releaseRef  ref:");
            int i1 = c;
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(i1).toString());
        }
        if (c == 0)
        {
            eev.a("Babel", "GmsPeopleCache: scheduling reset ");
            n.postDelayed(u, 60000L);
        }
        obj;
        JVM INSTR monitorexit ;
    }

    public fth c(String s1)
    {
        o();
        Object obj1 = o;
        obj1;
        JVM INSTR monitorenter ;
        s1 = d(s1);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.size() != 1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        s1 = (fth)s1.get(0);
        obj1;
        JVM INSTR monitorexit ;
        return s1;
        Iterator iterator = s1.iterator();
        s1 = null;
_L10:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Object obj = (fth)iterator.next();
        if (TextUtils.isEmpty(((fth) (obj)).e())) goto _L6; else goto _L5
_L5:
        if (s1 == null) goto _L8; else goto _L7
_L7:
        obj1;
        JVM INSTR monitorexit ;
        return null;
_L4:
        obj1;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return null;
        s1;
        obj1;
        JVM INSTR monitorexit ;
        throw s1;
_L6:
        obj = s1;
_L8:
        s1 = ((String) (obj));
        if (true) goto _L10; else goto _L9
_L9:
    }

    public boolean c()
    {
        boolean flag;
        synchronized (o)
        {
            flag = d;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        hnc hnc = eev.p;
    }
}
