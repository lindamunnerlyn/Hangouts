// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class diu extends dfy
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final Random e = new Random();
    private long f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private long k;
    private String l;
    private int m;

    private diu(int i1, long l1, long l2)
    {
        super(dcn.e(i1), l1, l2);
        f = -1L;
        g = 0;
        h = false;
        i = false;
        j = false;
        k = -1L;
        l = null;
        if (super.b.b.l())
        {
            k = 0x7fffffffffffffffL;
            return;
        }
        l1 = SystemClock.elapsedRealtime();
        if (((gqz)hlp.a(g.nU, gqz)).a(i1).a("warm_sync_deferral_limit", -1L) != -1L)
        {
            k = (long)(g.a(g.nU, "babel_maxsynctickledelay", 60000) * 2) + l1;
            return;
        } else
        {
            k = (long)(g.a(g.nU, "babel_synctickledelay", 10000) * 2) + l1;
            return;
        }
    }

    private boolean a(String s, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l == null || !l.equals(s))
        {
            break MISSING_BLOCK_LABEL_48;
        }
        gdv.a("Expected condition to be true", g());
        a(i1);
        l = null;
        g = 0;
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static diu b(int i1)
    {
        diu diu2 = (diu)a.get(Integer.valueOf(i1));
        diu diu1 = diu2;
        if (diu2 == null)
        {
            diu1 = new diu(i1, g.a(g.nU, "babel_warm_sync_lowmark_seconds", 7200) * 1000, g.a(g.nU, "babel_warm_sync_highmark_seconds", 0x93a80) * 1000);
            a.putIfAbsent(Integer.valueOf(i1), diu1);
            diu1 = (diu)a.get(Integer.valueOf(i1));
        }
        return diu1;
    }

    public static void l()
    {
        Iterator iterator = a.values().iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (diu)iterator.next();
                dcw dcw = dcn.g(((dgj) (obj)).b.b);
                if (dcw == null)
                {
                    obj = String.valueOf(eev.b(((dgj) (obj)).b.b.a()));
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Account is not valid. Skipping parasite warm sync operation: ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Account is not valid. Skipping parasite warm sync operation: ");
                    }
                    eev.f("Babel", ((String) (obj)));
                } else
                if (((diu) (obj)).m())
                {
                    long l1 = SystemClock.elapsedRealtime();
                    boolean flag;
                    if (l1 < ((diu) (obj)).k)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag && ((diu) (obj)).e())
                    {
                        if (edc.b())
                        {
                            (new ede()).a("rtcs_warm_sync_queued").a(((dgj) (obj)).b.b).b();
                        }
                        obj.k = l1 + (long)(g.a(g.nU, "babel_maxsynctickledelay", 60000) * 2);
                        ((diu) (obj)).a(true);
                        ((diu) (obj)).b(false);
                        ((diu) (obj)).a(2);
                        ((diu) (obj)).a();
                        ((diu) (obj)).a(dcw, 0);
                    }
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public void a()
    {
        String s;
        long l1;
        l1 = System.currentTimeMillis();
        s = "";
        m;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 125
    //                   2 132;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_132;
_L4:
        s = String.valueOf(s);
        String s1 = String.valueOf(Long.toString(1000L * l1 + (long)e.nextInt(1000)));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        this;
        JVM INSTR monitorenter ;
        l = s;
        k();
        g = 0;
        this;
        JVM INSTR monitorexit ;
        aoq.a(new aow(g.nU, super.b.a), super.c, h, i, s);
        return;
_L2:
        s = "from_background_polling:";
          goto _L4
        s = "from_hash_sync:";
          goto _L4
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(long l1)
    {
        f = l1;
        aoc.b(g.nU, super.b.a, "last_warm_sync_localtime", f);
    }

    public void a(boolean flag)
    {
        h = flag;
    }

    public boolean a(String s)
    {
        int i1 = g;
        String s1;
        if (l == null)
        {
            s1 = "[IDLE]";
        } else
        {
            s1 = l;
        }
        eev.a("Babel", (new StringBuilder(String.valueOf(s).length() + 83 + String.valueOf(s1).length())).append("Increment pending requests for ").append(s).append(". Current number of pending request ").append(i1).append(" for ").append(s1).toString());
        this;
        JVM INSTR monitorenter ;
        if (l == null || !l.equals(s))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        g = g + 1;
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void b(boolean flag)
    {
        i = flag;
    }

    public boolean b(String s)
    {
        boolean flag;
        boolean flag1 = true;
        int i1 = g;
        String s1;
        if (l == null)
        {
            s1 = "[IDLE]";
        } else
        {
            s1 = l;
        }
        eev.a("Babel", (new StringBuilder(String.valueOf(s).length() + 83 + String.valueOf(s1).length())).append("Decrement pending requests for ").append(s).append(". Current number of pending request ").append(i1).append(" for ").append(s1).toString());
        this;
        JVM INSTR monitorenter ;
        if (l == null || !l.equals(s)) goto _L2; else goto _L1
_L1:
        g = g - 1;
        if (g >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (g != 0) goto _L2; else goto _L3
_L3:
        gdv.a("Expected condition to be true", g());
        a(3);
        l = null;
        g = 0;
        flag = flag1;
_L5:
        this;
        JVM INSTR monitorexit ;
        if (flag && aoq.a)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "RequestWarmSyncOperation completed: ".concat(s);
            } else
            {
                s = new String("RequestWarmSyncOperation completed: ");
            }
            eev.b("Babel", s);
        }
        return flag;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public long c(int i1)
    {
        long l1 = 0x7fffffffffffffffL;
        if (m())
        {
            long l3 = SystemClock.elapsedRealtime();
            long l6 = g.a(g.nU, "babel_maxsynctickledelay", 60000);
            grd grd1;
            long l2;
            long l4;
            long l5;
            if (i1 <= 0)
            {
                l2 = l3;
                l1 = 0L;
            } else
            if (i1 == 1)
            {
                l1 = g.a(g.nU, "babel_synctickledelay", 10000);
                l2 = l3 + l6;
            } else
            if (i1 == 3)
            {
                l1 = g.a(g.nU, "babel_hashsyncdelay", 5000);
                l2 = l3 + l6;
            } else
            {
                l2 = l6 << 1;
                l1 = l2;
                l2 = l3 + l2;
            }
            l5 = l3 + l1;
            grd1 = ((gqz)hlp.a(g.nU, gqz)).b(super.b.a);
            l4 = grd1.a("warm_sync_deferral_limit", -1L);
            if (l4 < 0L || l4 > l2)
            {
                grd1.c("warm_sync_deferral_limit", l2).d();
            }
            if (l4 >= 0L && l5 > l4)
            {
                l1 = Math.max(0L, l4 - l3);
                l2 = l4;
            } else
            {
                l2 = l5;
            }
            if (edc.b())
            {
                (new ede()).a("rtcs_set_sane_alarm").a(super.b.b).b(System.currentTimeMillis() + l1).b((new StringBuilder(42)).append("delay=").append(l1).append("from ").append(i1).toString()).b();
            }
            l1 = l2;
            if (k < l2 + l6)
            {
                k = l2 + l6;
                l1 = l2;
            }
        }
        return l1;
    }

    public boolean c(String s)
    {
        boolean flag;
label0:
        {
            flag = a(s, 3);
            if (!flag)
            {
                String s1;
                String s2;
                if (s == null)
                {
                    s1 = "null";
                } else
                {
                    s1 = s;
                }
                if (l == null)
                {
                    s2 = "null";
                } else
                {
                    s2 = l;
                }
                eev.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 57 + String.valueOf(s2).length())).append("RequestWarmSync: Mismatched key upon SANE completion ").append(s1).append(" != ").append(s2).toString());
                a(System.currentTimeMillis());
            }
            if (aoq.a)
            {
                if (!flag)
                {
                    break label0;
                }
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "RequestWarmSyncOperation complete: ".concat(s);
                } else
                {
                    s = new String("RequestWarmSyncOperation complete: ");
                }
                eev.b("Babel", s);
            }
            return flag;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "RequestWarmSyncOperation complete after restart ".concat(s);
        } else
        {
            s = new String("RequestWarmSyncOperation complete after restart ");
        }
        eev.b("Babel", s);
        return flag;
    }

    public void d(int i1)
    {
        m = i1;
    }

    public boolean d(String s)
    {
        boolean flag;
label0:
        {
            flag = a(s, 0);
            if (aoq.a)
            {
                if (!flag)
                {
                    break label0;
                }
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "RequestWarmSyncOperation failed: ".concat(s);
                } else
                {
                    s = new String("RequestWarmSyncOperation failed: ");
                }
                eev.b("Babel", s);
            }
            return flag;
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "RequestWarmSyncOperation failed after restart ".concat(s);
        } else
        {
            s = new String("RequestWarmSyncOperation failed after restart ");
        }
        eev.b("Babel", s);
        return flag;
    }

    protected long i()
    {
        if (f == -1L)
        {
            f = aoc.a(g.nU, super.b.a, "last_warm_sync_localtime", 0L);
        }
        return f;
    }

    public boolean m()
    {
        return k < 0x7fffffffffffffffL && !dcn.f(super.b.b);
    }

    public boolean n()
    {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = ((gqz)hlp.a(g.nU, gqz)).a(super.b.a).a("warm_sync_deferral_limit", -1L);
        return l2 >= 0L && l1 < l2;
    }

    public void o()
    {
        ((gqz)hlp.a(g.nU, gqz)).b(super.b.a).h("warm_sync_deferral_limit").d();
    }

}
