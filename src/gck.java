// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.Stats;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

public final class gck
{

    long a;
    long b;
    final gcm c;
    long d;
    long e;
    final gkb f = new gkb(1200);
    boolean g;
    int h;
    ioh i;
    int j;
    int k;

    public gck(gcm gcm)
    {
        b = 0L;
        h = 0;
        j = 0;
        k = 0;
        c = gcm;
    }

    static int d(int l)
    {
        switch (l)
        {
        default:
            gbh.a((new StringBuilder(35)).append("endCauseMap unexpected: ").append(l).toString());
            return 6;

        case 0: // '\0'
            gbh.a("endCause is not set");
            return 6;

        case 1: // '\001'
        case 1017: 
            return 29;

        case 3: // '\003'
        case 5: // '\005'
        case 10: // '\n'
        case 15: // '\017'
        case 1008: 
            return 47;

        case 1000: 
            return 46;

        case 21: // '\025'
        case 23: // '\027'
            return 10;

        case 24: // '\030'
            return 65;

        case 22: // '\026'
            return 22;

        case 25: // '\031'
            return 37;

        case 30: // '\036'
            return 0;

        case 1004: 
            return 0;

        case 1009: 
            return 18;

        case 1005: 
            return 61;

        case 1006: 
            return 62;

        case 1007: 
            return 15;

        case 1003: 
            return 31;

        case 1010: 
            return 2;

        case 1011: 
            return 2;

        case 1014: 
            return 2;

        case 1012: 
            return 60;

        case 1015: 
            return 65;

        case 29: // '\035'
            return 26;

        case 1018: 
            return 68;
        }
    }

    private void g()
    {
        if (b == 0L)
        {
            a = System.currentTimeMillis();
            b = SystemClock.elapsedRealtime();
        }
    }

    public com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats a(gho gho1)
    {
        int l = f.a() - 1;
        gho1 = gho1.n();
        if (!gho1.isEmpty())
        {
            int i1 = ((Integer)gho1.get(0)).intValue();
            for (; l >= 0; l--)
            {
                gho1 = ((gcn)f.a(l)).c;
                if (!(gho1 instanceof com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats))
                {
                    continue;
                }
                gho1 = (com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)gho1;
                if (((com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats) (gho1)).a == i1)
                {
                    return gho1;
                }
            }

        }
        return null;
    }

    public gcl a(Context context, String s, int l, int i1, long l1, String s1)
    {
        if (l1 <= 0L)
        {
            l1 = System.currentTimeMillis();
        }
        return new gcl(this, context, s, l, i1, l1, s1);
    }

    public void a()
    {
        g();
    }

    public void a(int l)
    {
        h = l;
    }

    public void a(int l, String s)
    {
        ioh ioh1 = new ioh();
        ioh1.a = Integer.valueOf(l);
        ioh1.c = s;
        i = ioh1;
    }

    public void a(Stats stats)
    {
        g();
        long l = (SystemClock.elapsedRealtime() - b) / 1000L;
        gcn gcn1 = new gcn(System.currentTimeMillis(), l, stats);
        synchronized (f)
        {
            f.a(gcn1);
        }
        return;
        exception;
        stats;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void a(PrintWriter printwriter)
    {
        com.google.android.libraries.hangouts.video.Stats.AggregatePrintStats aggregateprintstats;
        aggregateprintstats = new com.google.android.libraries.hangouts.video.Stats.AggregatePrintStats();
        printwriter.println("Stats history");
        gkb gkb1 = f;
        gkb1;
        JVM INSTR monitorenter ;
        int i1 = f.a();
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        printwriter.println("Legend:");
        com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.VideoSenderStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats.printLegend(printwriter);
        com.google.android.libraries.hangouts.video.Stats.GlobalStats.a(printwriter);
          goto _L2
_L4:
        int l;
        if (l >= i1)
        {
            break MISSING_BLOCK_LABEL_131;
        }
        gcn gcn1 = (gcn)f.a(l);
        printwriter.print((new Date(gcn1.a)).toString());
        gcn1.c.print(printwriter, aggregateprintstats);
        l++;
        continue; /* Loop/switch isn't completed */
        gkb1;
        JVM INSTR monitorexit ;
        aggregateprintstats.a(printwriter);
        return;
        printwriter;
        gkb1;
        JVM INSTR monitorexit ;
        throw printwriter;
_L2:
        l = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    void b()
    {
        g = true;
    }

    public void b(int l)
    {
        j = l;
    }

    public void c()
    {
        d = SystemClock.elapsedRealtime();
    }

    public void c(int l)
    {
        k = l;
    }

    public void d()
    {
        e = SystemClock.elapsedRealtime();
    }

    public com.google.android.libraries.hangouts.video.Stats.VideoSenderStats e()
    {
        for (int l = f.a() - 1; l >= 0; l--)
        {
            Stats stats = ((gcn)f.a(l)).c;
            if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)
            {
                return (com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)stats;
            }
        }

        return null;
    }

    public com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats f()
    {
        for (int l = f.a() - 1; l >= 0; l--)
        {
            Stats stats = ((gcn)f.a(l)).c;
            if (stats instanceof com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)
            {
                return (com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)stats;
            }
        }

        return null;
    }
}
