// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
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

public final class dnw
{

    private static final boolean a = false;
    private static volatile boolean b = false;
    private static volatile dnw c;
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

    private dnw()
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

    public static dnw a(aoa aoa1)
    {
        dnw dnw1 = new dnw();
        dnw1.f = 0L;
        dnw1.g = 0x36ee80L;
        dnw1.h = 0x1ee62800L;
        dnw1.j = 0xa4cb800L;
        dnw1.k = 2;
        dnw1.m = 5;
        dnw1.n = 0x14997000L;
        dnw1.o = 2;
        dnw1.p = 5;
        dnw1.q = 0x14997000L;
        dnw1.l = 2;
        dnw1.d = aoa1.h();
        return dnw1;
    }

    public static void a()
    {
        b(false);
    }

    static void a(dnw dnw1)
    {
        dnw1.f();
    }

    private static boolean a(int i1)
    {
        return i1 == 1 || i1 == 2;
    }

    private boolean a(Context context, aow aow1)
    {
        if (!b(context))
        {
            return false;
        }
        for (Iterator iterator = aow1.i().iterator(); iterator.hasNext();)
        {
            if (!a(context, aow1, (String)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

    private boolean a(Context context, aow aow1, int i1, int j1)
    {
        if (!b(context))
        {
            return false;
        }
        aow1.a();
        List list;
        list = aow1.a(m, i1);
        if (list.size() > j1)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        aow1.b();
        aow1.c();
        return true;
        long l1;
        long l2;
        l1 = g.a((Long)list.get(j1 - 1), 0L);
        l2 = aow1.s();
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
            break MISSING_BLOCK_LABEL_166;
        }
        l2 = g.a((Long)list.get(m - 1), 0L);
        if (l1 < l2)
        {
            l1 = l2;
        }
        if (l1 >= g.a((Long)list.get(list.size() - 1), 0L))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        aow1.b();
        aow1.c();
        return true;
        if (b(context))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        aow1.b();
        aow1.c();
        return false;
        aow1.b(l1, i1);
        aow1.b();
        aow1.c();
        return true;
        context;
        aow1.c();
        throw context;
    }

    private boolean a(Context context, aow aow1, String s1)
    {
        if (!b(context))
        {
            return false;
        }
        aow1.a();
        List list;
        list = aow1.d(s1, p);
        if (list.size() > o)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        aow1.b();
        aow1.c();
        return true;
        long l1;
        long l2;
        l1 = g.a((Long)list.get(o - 1), 0L);
        l2 = aow1.R(s1);
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
            break MISSING_BLOCK_LABEL_171;
        }
        l2 = g.a((Long)list.get(p - 1), 0L);
        if (l1 < l2)
        {
            l1 = l2;
        }
        if (l1 >= g.a((Long)list.get(list.size() - 1), 0L))
        {
            break MISSING_BLOCK_LABEL_210;
        }
        aow1.b();
        aow1.c();
        return true;
        if (b(context))
        {
            break MISSING_BLOCK_LABEL_228;
        }
        aow1.b();
        aow1.c();
        return false;
        int i1 = aow1.j(s1, l1);
        if (a)
        {
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 49)).append("Deleted ").append(i1).append(" old messages. conversationId=").append(s1).toString());
        }
        aow1.b();
        aow1.c();
        return true;
        context;
        aow1.c();
        throw context;
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
            if (eev.a("Babel", 3))
            {
                eev.c("Babel", (new StringBuilder(50)).append("Scheduling database cleanup. forceReschedule=").append(flag).toString());
            }
            long l1 = g.a(g.nU, "babel_gc_next_start", 60);
            long l2 = g.a(g.nU, "babel_gc_interval", 1440);
            RealTimeChatService.a(l1 * 60000L + SystemClock.elapsedRealtime(), l2 * 60000L);
            b = true;
        }
    }

    private boolean b(Context context)
    {
        boolean flag1 = true;
        context = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean flag;
        if (context == null)
        {
            flag = false;
        } else
        {
            int i1 = context.getIntExtra("plugged", -1);
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                if (a(i1) || i1 == 4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = a(i1);
            }
        }
        if (!s || System.currentTimeMillis() < t + f || !flag)
        {
            if (eev.a("Babel", 3))
            {
                flag1 = s;
                long l1 = t;
                eev.c("Babel", (new StringBuilder(131)).append("Database clean up service okToRun check failed. mOkToRun=").append(flag1).append(" mLastBabelIdleTimestamp=").append(l1).append(" charger connected=").append(flag).toString());
            }
            b(true);
            flag1 = false;
        }
        return flag1;
    }

    public static dnw c()
    {
        if (c == null)
        {
            dnw dnw1 = new dnw();
            c = dnw1;
            dnw1.f();
            g.a(g.nU).a(new dnx());
        }
        return c;
    }

    static dnw e()
    {
        return c;
    }

    private void f()
    {
        f = (long)g.a(g.nU, "babel_gc_minimum_idle", 5) * 60000L;
        g = (long)g.a(g.nU, "babel_gc_message_expiration_slop", 60) * 60000L;
        h = (long)g.a(g.nU, "babel_gc_empty_conversation_slop", 1440) * 60000L;
        i = (long)g.a(g.nU, "babel_gc_expired_invitation_slop", 10080) * 60000L;
        j = (long)g.a(g.nU, "babel_gc_recent_scroll_slot", 2880) * 60000L;
        k = g.a(g.nU, "babel_gc_min_conversations_to_keep", 50);
        m = g.a(g.nU, "babel_gc_max_conversations_to_keep", 500);
        n = (long)g.a(g.nU, "babel_gc_recent_conversation_slop", 10080) * 60000L;
        l = g.a(g.nU, "babel_gc_min_invites_to_keep", 100);
        o = g.a(g.nU, "babel_gc_min_messages_to_keep", 50);
        p = g.a(g.nU, "babel_gc_max_messages_to_keep", 2000);
        q = (long)g.a(g.nU, "babel_gc_recent_message_slop", 10080) * 60000L;
        b(true);
    }

    public void a(Context context)
    {
        if (r || !b(context))
        {
            return;
        }
        r = true;
        int ai[];
        aoa aoa1;
        int i1;
        int k1;
        int l1;
        if (d == -1)
        {
            ai = dcn.e();
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
            break MISSING_BLOCK_LABEL_620;
        }
        l1 = ai[i1];
        if (a)
        {
            eev.b("Babel", (new StringBuilder(51)).append("Starting database clean up for account: ").append(l1).toString());
        }
        aoa1 = dcn.e(l1);
        if (aoa1 == null) goto _L2; else goto _L1
_L1:
        aow aow1 = new aow(context, aoa1.h());
        int j1;
        if (!b(context))
        {
            j1 = 0;
        } else
        {
            j1 = aow1.i(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
            if (a)
            {
                eev.b("Babel", (new StringBuilder(46)).append("Deleted ").append(j1).append(" expired event suggestions.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_620;
        }
        if (!b(context))
        {
            j1 = 0;
        } else
        {
            j1 = aow1.h((System.currentTimeMillis() - g) * 1000L);
            if (a)
            {
                eev.b("Babel", (new StringBuilder(37)).append("Deleted ").append(j1).append(" expired messages.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_620;
        }
        if (!b(context))
        {
            j1 = 0;
        } else
        {
            j1 = aow1.j((System.currentTimeMillis() - h) * 1000L);
            if (a)
            {
                eev.b("Babel", (new StringBuilder(40)).append("Deleted ").append(j1).append(" empty conversations.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0)
        {
            break MISSING_BLOCK_LABEL_620;
        }
        if (!b(context))
        {
            j1 = 0;
        } else
        {
            j1 = aow1.k((System.currentTimeMillis() - i) * 1000L);
            if (a)
            {
                eev.b("Babel", (new StringBuilder(40)).append("Deleted ").append(j1).append(" expired invitations.").toString());
            }
            j1 = 1;
        }
        if (j1 == 0 || !a(context, aow1, 2, k) || !a(context, aow1, 1, l) || !a(context, aow1)) goto _L4; else goto _L3
_L3:
        if (a)
        {
            eev.b("Babel", (new StringBuilder(51)).append("Finished database clean up for account: ").append(l1).toString());
        }
        j1 = (int)((new File(aps.a(context, aoa1.h()).getReadableDatabase().getPath())).length() / 1024L);
        eev.c("Babel", (new StringBuilder(44)).append(l1).append(" database size is: ").append(j1).append(" KB").toString());
        h.a(l1, System.currentTimeMillis(), 16, (new cab()).a(j1).b());
_L2:
        i1++;
        continue; /* Loop/switch isn't completed */
_L4:
        r = false;
        return;
        if (true) goto _L6; else goto _L5
_L5:
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

    static 
    {
        hnc hnc = eev.p;
    }
}
