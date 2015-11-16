// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public final class dhl extends dep
{

    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final Random d = new Random();
    private long e;
    private int f;
    private boolean g;
    private boolean h;
    private boolean i;
    private long j;
    private String k;
    private int l;

    private dhl(int i1, long l1, long l2)
    {
        super(dbf.e(i1), l1, l2);
        e = -1L;
        f = 0;
        g = false;
        h = false;
        i = false;
        j = -1L;
        k = null;
        if (b.n())
        {
            j = 0x7fffffffffffffffL;
            return;
        }
        l1 = SystemClock.elapsedRealtime();
        if (((gms)hgx.a(g.nS, gms)).a(i1).a("warm_sync_deferral_limit", -1L) != -1L)
        {
            j = (long)(g.a(g.nS, "babel_maxsynctickledelay", 60000) * 2) + l1;
            return;
        } else
        {
            j = (long)(g.a(g.nS, "babel_synctickledelay", 10000) * 2) + l1;
            return;
        }
    }

    private boolean a(String s, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (k == null || !k.equals(s))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        gbh.a(g());
        a(i1);
        k = null;
        f = 0;
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public static dhl b(int i1)
    {
        dhl dhl2 = (dhl)a.get(Integer.valueOf(i1));
        dhl dhl1 = dhl2;
        if (dhl2 == null)
        {
            dhl1 = new dhl(i1, g.a(g.nS, "babel_warm_sync_lowmark_seconds", 7200) * 1000, g.a(g.nS, "babel_warm_sync_highmark_seconds", 0x93a80) * 1000);
            a.putIfAbsent(Integer.valueOf(i1), dhl1);
            dhl1 = (dhl)a.get(Integer.valueOf(i1));
        }
        return dhl1;
    }

    public static void k()
    {
        Iterator iterator = a.values().iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj = (dhl)iterator.next();
                dbn dbn = dbf.h(((dhl) (obj)).b);
                if (dbn == null)
                {
                    obj = String.valueOf(ebw.b(((dhl) (obj)).b.a()));
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "Account is not valid. Skipping parasite warm sync operation: ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("Account is not valid. Skipping parasite warm sync operation: ");
                    }
                    ebw.f("Babel", ((String) (obj)));
                } else
                if (((dhl) (obj)).l())
                {
                    long l1 = SystemClock.elapsedRealtime();
                    boolean flag;
                    if (l1 < ((dhl) (obj)).j)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag && ((dhl) (obj)).e())
                    {
                        if (dzy.b())
                        {
                            (new eaa()).a("rtcs_warm_sync_queued").a(((dhl) (obj)).b).b();
                        }
                        obj.j = l1 + (long)(g.a(g.nS, "babel_maxsynctickledelay", 60000) * 2);
                        ((dhl) (obj)).a(true);
                        ((dhl) (obj)).b(false);
                        ((dhl) (obj)).a(2);
                        ((dhl) (obj)).a();
                        ((dhl) (obj)).a(dbn);
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
        l;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 133
    //                   2 140;
           goto _L1 _L2 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_140;
_L4:
        s = String.valueOf(s);
        String s1 = String.valueOf(Long.toString(1000L * l1 + (long)d.nextInt(1000)));
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        this;
        JVM INSTR monitorenter ;
        k = s;
        c.c().clear();
        f = 0;
        this;
        JVM INSTR monitorexit ;
        any.a(new aoe(g.nS, b.h()), c, g, h, s);
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
        aoe aoe1;
        e = l1;
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        aoe1.g("last_warm_sync_localtime", e);
        aoe1.b();
        aoe1.c();
        return;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public void b(boolean flag)
    {
        h = flag;
    }

    public boolean b(String s)
    {
        int i1 = f;
        String s1;
        if (k == null)
        {
            s1 = "[IDLE]";
        } else
        {
            s1 = k;
        }
        ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 83 + String.valueOf(s1).length())).append("Increment pending requests for ").append(s).append(". Current number of pending request ").append(i1).append(" for ").append(s1).toString());
        this;
        JVM INSTR monitorenter ;
        if (k == null || !k.equals(s))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        f = f + 1;
        return true;
        this;
        JVM INSTR monitorexit ;
        return false;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public long c(int i1)
    {
        long l1 = 0x7fffffffffffffffL;
        if (l())
        {
            long l3 = SystemClock.elapsedRealtime();
            long l6 = g.a(g.nS, "babel_maxsynctickledelay", 60000);
            gmw gmw1;
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
                l1 = g.a(g.nS, "babel_synctickledelay", 10000);
                l2 = l3 + l6;
            } else
            if (i1 == 3)
            {
                l1 = g.a(g.nS, "babel_hashsyncdelay", 5000);
                l2 = l3 + l6;
            } else
            {
                l2 = l6 << 1;
                l1 = l2;
                l2 = l3 + l2;
            }
            l5 = l3 + l1;
            gmw1 = ((gms)hgx.a(g.nS, gms)).b(b.h());
            l4 = gmw1.a("warm_sync_deferral_limit", -1L);
            if (l4 < 0L || l4 > l2)
            {
                gmw1.c("warm_sync_deferral_limit", l2).d();
            }
            if (l4 >= 0L && l5 > l4)
            {
                l1 = Math.max(0L, l4 - l3);
                l2 = l4;
            } else
            {
                l2 = l5;
            }
            if (dzy.b())
            {
                (new eaa()).a("rtcs_set_sane_alarm").a(b).b(System.currentTimeMillis() + l1).b((new StringBuilder(42)).append("delay=").append(l1).append("from ").append(i1).toString()).b();
            }
            l1 = l2;
            if (j < l2 + l6)
            {
                j = l2 + l6;
                l1 = l2;
            }
        }
        return l1;
    }

    public boolean c(String s)
    {
        boolean flag;
        boolean flag1 = true;
        int i1 = f;
        String s1;
        if (k == null)
        {
            s1 = "[IDLE]";
        } else
        {
            s1 = k;
        }
        ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 83 + String.valueOf(s1).length())).append("Decrement pending requests for ").append(s).append(". Current number of pending request ").append(i1).append(" for ").append(s1).toString());
        this;
        JVM INSTR monitorenter ;
        if (k == null || !k.equals(s)) goto _L2; else goto _L1
_L1:
        f = f - 1;
        if (f >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (f != 0) goto _L2; else goto _L3
_L3:
        gbh.a(g());
        a(3);
        k = null;
        f = 0;
        flag = flag1;
_L5:
        this;
        JVM INSTR monitorexit ;
        if (flag && any.a)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "RequestWarmSyncOperation completed: ".concat(s);
            } else
            {
                s = new String("RequestWarmSyncOperation completed: ");
            }
            ebw.b("Babel", s);
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

    public void d(int i1)
    {
        l = i1;
    }

    public boolean d(String s)
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
                if (k == null)
                {
                    s2 = "null";
                } else
                {
                    s2 = k;
                }
                ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 57 + String.valueOf(s2).length())).append("RequestWarmSync: Mismatched key upon SANE completion ").append(s1).append(" != ").append(s2).toString());
                a(System.currentTimeMillis());
            }
            if (any.a)
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
                ebw.b("Babel", s);
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
        ebw.b("Babel", s);
        return flag;
    }

    public boolean e(String s)
    {
        boolean flag;
label0:
        {
            flag = a(s, 0);
            if (any.a)
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
                ebw.b("Babel", s);
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
        ebw.b("Babel", s);
        return flag;
    }

    protected long i()
    {
        aoe aoe1;
        if (e != -1L)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        aoe1 = new aoe(g.nS, b.h());
        aoe1.a();
        e = aoe1.O("last_warm_sync_localtime");
        aoe1.b();
        aoe1.c();
        return e;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    public boolean l()
    {
        return j < 0x7fffffffffffffffL && !dbf.g(b);
    }

    public boolean m()
    {
        long l1 = SystemClock.elapsedRealtime();
        long l2 = ((gms)hgx.a(g.nS, gms)).a(b.h()).a("warm_sync_deferral_limit", -1L);
        return l2 >= 0L && l1 < l2;
    }

    public void n()
    {
        ((gms)hgx.a(g.nS, gms)).b(b.h()).h("warm_sync_deferral_limit").d();
    }

}
