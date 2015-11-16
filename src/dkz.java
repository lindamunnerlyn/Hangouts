// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class dkz
{

    private static final boolean a = false;
    private static volatile boolean b = false;
    private static volatile dkz c;
    private int d;
    private final Handler e = new Handler(Looper.getMainLooper());
    private volatile long f;
    private volatile long g;
    private volatile long h;
    private volatile long i;
    private volatile long j;
    private volatile int k;
    private volatile int l;
    private volatile int m;
    private volatile long n;
    private volatile int o;
    private volatile int p;
    private volatile long q;
    private volatile boolean r;
    private volatile boolean s;
    private volatile long t;

    private dkz()
    {
        d = -1;
        f = 0x493e0L;
        g = 0x36ee80L;
        h = 0x5265c00L;
        i = 0x240c8400L;
        j = 0xa4cb800L;
        k = 50;
        l = 100;
        m = 500;
        n = 0x240c8400L;
        o = 50;
        p = 2000;
        q = 0x240c8400L;
        s = true;
    }

    public static dkz a(ani ani1)
    {
        dkz dkz1 = new dkz();
        dkz1.f = 0L;
        dkz1.g = 0x36ee80L;
        dkz1.h = 0x1ee62800L;
        dkz1.j = 0xa4cb800L;
        dkz1.k = 2;
        dkz1.m = 5;
        dkz1.n = 0x14997000L;
        dkz1.o = 2;
        dkz1.p = 5;
        dkz1.q = 0x14997000L;
        dkz1.l = 2;
        dkz1.d = ani1.h();
        return dkz1;
    }

    public static void a()
    {
        b(false);
    }

    static void a(dkz dkz1)
    {
        dkz1.g();
    }

    private boolean a(aoe aoe1)
    {
        if (!h())
        {
            return false;
        }
        for (Iterator iterator = aoe1.i().iterator(); iterator.hasNext();)
        {
            if (!a(aoe1, (String)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

    private boolean a(aoe aoe1, int i1, int j1)
    {
        if (!h())
        {
            return false;
        }
        aoe1.a();
        List list;
        list = aoe1.a(m, i1);
        if (list.size() > j1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        aoe1.b();
        aoe1.c();
        return true;
        long l1;
        long l2;
        l1 = g.a((Long)list.get(j1 - 1), 0L);
        l2 = aoe1.s();
        if (l2 != 0L && l1 > l2)
        {
            l1 = l2;
        }
        l2 = (System.currentTimeMillis() - n) * 1000L;
        if (l1 > l2)
        {
            l1 = l2;
        }
        if (list.size() < m)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        l2 = g.a((Long)list.get(m - 1), 0L);
        if (l1 < l2)
        {
            l1 = l2;
        }
        if (l1 >= g.a((Long)list.get(list.size() - 1), 0L))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        aoe1.b();
        aoe1.c();
        return true;
        if (h())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        aoe1.b();
        aoe1.c();
        return false;
        aoe1.b(l1, i1);
        aoe1.b();
        aoe1.c();
        return true;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
    }

    private boolean a(aoe aoe1, String s1)
    {
        if (!h())
        {
            return false;
        }
        aoe1.a();
        List list;
        list = aoe1.d(s1, p);
        if (list.size() > o)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        aoe1.b();
        aoe1.c();
        return true;
        long l1;
        long l2;
        l1 = g.a((Long)list.get(o - 1), 0L);
        l2 = aoe1.S(s1);
        if (l2 != 0L && l1 > l2)
        {
            l1 = l2;
        }
        l2 = (System.currentTimeMillis() - q) * 1000L;
        if (l1 > l2)
        {
            l1 = l2;
        }
        if (list.size() < p)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        l2 = g.a((Long)list.get(p - 1), 0L);
        if (l1 < l2)
        {
            l1 = l2;
        }
        if (l1 >= g.a((Long)list.get(list.size() - 1), 0L))
        {
            break MISSING_BLOCK_LABEL_202;
        }
        aoe1.b();
        aoe1.c();
        return true;
        if (h())
        {
            break MISSING_BLOCK_LABEL_219;
        }
        aoe1.b();
        aoe1.c();
        return false;
        int i1 = aoe1.k(s1, l1);
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 49)).append("Deleted ").append(i1).append(" old messages. conversationId=").append(s1).toString());
        }
        aoe1.b();
        aoe1.c();
        return true;
        s1;
        aoe1.c();
        throw s1;
    }

    public static void b()
    {
        b = false;
        RealTimeChatService.d();
    }

    private static void b(boolean flag)
    {
        if (!b || flag)
        {
            if (ebw.a("Babel", 3))
            {
                ebw.c("Babel", (new StringBuilder(50)).append("Scheduling database cleanup. forceReschedule=").append(flag).toString());
            }
            long l1 = g.a(g.nS, "babel_gc_next_start", 60);
            long l2 = g.a(g.nS, "babel_gc_interval", 1440);
            RealTimeChatService.a(l1 * 60000L + SystemClock.elapsedRealtime(), l2 * 60000L);
            b = true;
        }
    }

    public static dkz c()
    {
        if (c == null)
        {
            dkz dkz1 = new dkz();
            c = dkz1;
            dkz1.g();
            g.a(g.nS).a(new dla());
        }
        return c;
    }

    static dkz f()
    {
        return c;
    }

    private void g()
    {
        f = (long)g.a(g.nS, "babel_gc_minimum_idle", 5) * 60000L;
        g = (long)g.a(g.nS, "babel_gc_message_expiration_slop", 60) * 60000L;
        h = (long)g.a(g.nS, "babel_gc_empty_conversation_slop", 1440) * 60000L;
        i = (long)g.a(g.nS, "babel_gc_expired_invitation_slop", 10080) * 60000L;
        j = (long)g.a(g.nS, "babel_gc_recent_scroll_slot", 2880) * 60000L;
        k = g.a(g.nS, "babel_gc_min_conversations_to_keep", 50);
        m = g.a(g.nS, "babel_gc_max_conversations_to_keep", 500);
        n = (long)g.a(g.nS, "babel_gc_recent_conversation_slop", 10080) * 60000L;
        l = g.a(g.nS, "babel_gc_min_invites_to_keep", 100);
        o = g.a(g.nS, "babel_gc_min_messages_to_keep", 50);
        p = g.a(g.nS, "babel_gc_max_messages_to_keep", 2000);
        q = (long)g.a(g.nS, "babel_gc_recent_message_slop", 10080) * 60000L;
        b(true);
    }

    private boolean h()
    {
        boolean flag = true;
        if (!s || System.currentTimeMillis() < t + f)
        {
            if (ebw.a("Babel", 3))
            {
                flag = s;
                long l1 = t;
                ebw.c("Babel", (new StringBuilder(107)).append("Database clean up service okToRun check failed. mOkToRun=").append(flag).append(" mLastBabelIdleTimestamp=").append(l1).toString());
            }
            b(true);
            flag = false;
        }
        return flag;
    }

    public void a(boolean flag)
    {
        s = flag;
        if (flag)
        {
            t = System.currentTimeMillis();
        }
    }

    public long d()
    {
        return j;
    }

    public void e()
    {
        if (r || !h())
        {
            return;
        }
        r = true;
        int ai[];
        ani ani1;
        int i1;
        int k1;
        int l1;
        if (d == -1)
        {
            ai = dbf.e();
        } else
        {
            ai = new int[1];
            ai[0] = d;
        }
        k1 = ai.length;
        i1 = 0;
_L6:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        l1 = ai[i1];
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(51)).append("Starting database clean up for account: ").append(l1).toString());
        }
        ani1 = dbf.e(l1);
        if (ani1 == null) goto _L2; else goto _L1
_L1:
        aoe aoe1 = new aoe(g.nS, ani1.h());
        int j1;
        if (!h())
        {
            j1 = 0;
        } else
        {
            j1 = aoe1.i(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(46)).append("Deleted ").append(j1).append(" expired event suggestions.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        if (!h())
        {
            j1 = 0;
        } else
        {
            j1 = aoe1.h((System.currentTimeMillis() - g) * 1000L);
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(37)).append("Deleted ").append(j1).append(" expired messages.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        if (!h())
        {
            j1 = 0;
        } else
        {
            j1 = aoe1.j((System.currentTimeMillis() - h) * 1000L);
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(40)).append("Deleted ").append(j1).append(" empty conversations.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_608;
        }
        if (!h())
        {
            j1 = 0;
        } else
        {
            j1 = aoe1.k((System.currentTimeMillis() - i) * 1000L);
            if (a)
            {
                ebw.b("Babel", (new StringBuilder(40)).append("Deleted ").append(j1).append(" expired invitations.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0 || !a(aoe1, 2, k) || !a(aoe1, 1, l) || !a(aoe1)) goto _L4; else goto _L3
_L3:
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(51)).append("Finished database clean up for account: ").append(l1).toString());
        }
        j1 = (int)((new File(apa.a(g.nS, ani1.h()).getReadableDatabase().getPath())).length() / 1024L);
        ebw.c("Babel", (new StringBuilder(44)).append(l1).append(" database size is: ").append(j1).append(" KB").toString());
        h.a(l1, System.currentTimeMillis(), 16, (new byy()).a(j1).b());
_L2:
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        r = false;
        return;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        hik hik = ebw.p;
    }
}
