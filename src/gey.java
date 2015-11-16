// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.Stats;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class gey
{

    long a;
    long b;
    final gfa c;
    long d;
    long e;
    final Map f = new HashMap();
    final gnd g = new gnd(1200);
    final gfc h = new gfc(this);
    boolean i;
    int j;
    ium k;
    int l;
    int m;

    public gey(gfa gfa1)
    {
        b = 0L;
        j = 0;
        l = 0;
        m = 0;
        c = gfa1;
    }

    private static void a(gff gff1, PrintWriter printwriter, com.google.android.libraries.hangouts.video.Stats.AggregatePrintStats aggregateprintstats)
    {
        printwriter.print((new Date(gff1.a)).toString());
        gff1.c.print(printwriter, aggregateprintstats);
    }

    private gnd b(String s)
    {
        gfb gfb1 = (gfb)f.get(s);
        if (gfb1 == null)
        {
            gne.a(3, "vclib", "No stat updates (yet) for session = %s", new Object[] {
                s
            });
        }
        if (gfb1 != null)
        {
            return gfb1.c;
        } else
        {
            return new gnd(1);
        }
    }

    static int d(int i1)
    {
        switch (i1)
        {
        default:
            gne.a(6, "vclib", (new StringBuilder(35)).append("endCauseMap unexpected: ").append(i1).toString());
            return 6;

        case 0: // '\0'
            gdv.a("endCause is not set");
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

        case 1001: 
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

        case 51: // '3'
            return 51;
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

    private void h()
    {
        gdv.a();
        if (h.g != null)
        {
            g.a(h.g);
        }
        if (!h.b())
        {
            String s = c.d();
            gdv.b("Expected non-null", s);
            gne.a(3, "vclib", "logRemainingStats for activeSessionId = %s", new Object[] {
                s
            });
            gfb gfb1 = (gfb)f.get(s);
            if (gfb1 == null)
            {
                gfb1 = new gfb();
            }
            gff gff1;
            for (Iterator iterator = h.d().iterator(); iterator.hasNext(); gfb1.c.a(gff1))
            {
                gff1 = (gff)iterator.next();
            }

            f.put(s, gfb1);
        }
        h.a();
    }

    public com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats a(gkq gkq1)
    {
        gnd gnd1;
        int i1;
        int j1;
        gdv.a();
        gnd1 = b(c.d());
        i1 = gnd1.a() - 1;
        gkq1 = gkq1.m();
        if (gkq1.isEmpty())
        {
            break MISSING_BLOCK_LABEL_143;
        }
        j1 = ((Integer)gkq1.get(0)).intValue();
        if (h.d.containsKey(Integer.valueOf(j1)))
        {
            return (com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)((gff)h.d.get(Integer.valueOf(j1))).c;
        }
_L2:
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_143;
        }
        if ((gkq1 = ((gff)gnd1.a(i1)).c) instanceof com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        i1--;
        if (true) goto _L2; else goto _L1
_L1:
        gkq1 = (com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)gkq1;
        if (((com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats) (gkq1)).a != j1) goto _L4; else goto _L3
_L3:
        return gkq1;
        return null;
    }

    public gez a(Context context, int i1, int j1, long l1, String s)
    {
        if (l1 <= 0L)
        {
            l1 = System.currentTimeMillis();
        }
        return new gez(this, context, i1, j1, l1, s);
    }

    public void a()
    {
        g();
    }

    public void a(int i1)
    {
        j = i1;
    }

    public void a(int i1, String s)
    {
        ium ium1 = new ium();
        ium1.a = Integer.valueOf(i1);
        ium1.c = s;
        k = ium1;
    }

    public void a(Stats stats)
    {
        gdv.a();
        g();
        long l1 = (SystemClock.elapsedRealtime() - b) / 1000L;
        gff gff1 = new gff(System.currentTimeMillis(), l1, stats);
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats)
        {
            h.a = gff1;
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)
        {
            stats = (com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)stats;
            h.b.put(Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats) (stats)).a), gff1);
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)
        {
            h.c = gff1;
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)
        {
            stats = (com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)stats;
            h.d.put(Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats) (stats)).a), gff1);
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)
        {
            h.e = gff1;
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)
        {
            h.f = gff1;
            return;
        }
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.GlobalStats)
        {
            h.g = gff1;
            return;
        } else
        {
            stats = String.valueOf(stats);
            gne.a(5, "vclib", (new StringBuilder(String.valueOf(stats).length() + 36)).append("Received unrecognized stats update, ").append(stats).toString());
            return;
        }
    }

    void a(PrintWriter printwriter)
    {
        gdv.a();
        com.google.android.libraries.hangouts.video.Stats.AggregatePrintStats aggregateprintstats = new com.google.android.libraries.hangouts.video.Stats.AggregatePrintStats();
        printwriter.println("Stats history");
        if (g.a() > 0)
        {
            printwriter.println("Global stats legend:");
            printwriter.println("  GlobalStats -- pcpu, tcpu, online cores, util per cpu, cpu freq, on battery, battery level");
        }
        for (int i1 = 0; i1 < g.a(); i1++)
        {
            a((gff)g.a(i1), printwriter, aggregateprintstats);
        }

        if (h.g != null)
        {
            a(h.g, printwriter, aggregateprintstats);
        }
        Object obj = String.valueOf(c.d());
        if (((String) (obj)).length() != 0)
        {
            obj = "Active media session: ".concat(((String) (obj)));
        } else
        {
            obj = new String("Active media session: ");
        }
        printwriter.println(((String) (obj)));
        for (Iterator iterator1 = f.entrySet().iterator(); iterator1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            String s = (String)entry.getKey();
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "Stats history for session: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Stats history for session: ");
            }
            printwriter.println(((String) (obj)));
            obj = ((gfb)entry.getValue()).c;
            if (((gnd) (obj)).a() > 0)
            {
                printwriter.println("Legend:");
                com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats.printLegend(printwriter);
                com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats.printLegend(printwriter);
                com.google.android.libraries.hangouts.video.Stats.VideoSenderStats.printLegend(printwriter);
                com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats.printLegend(printwriter);
                com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats.printLegend(printwriter);
                com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats.printLegend(printwriter);
            }
            for (int j1 = 0; j1 < ((gnd) (obj)).a(); j1++)
            {
                a((gff)((gnd) (obj)).a(j1), printwriter, aggregateprintstats);
            }

            if (s.equals(c.d()))
            {
                Iterator iterator = h.c().iterator();
                while (iterator.hasNext()) 
                {
                    gff gff1 = (gff)iterator.next();
                    if (!(gff1.c instanceof com.google.android.libraries.hangouts.video.Stats.GlobalStats))
                    {
                        a(gff1, printwriter, aggregateprintstats);
                    }
                }
            }
        }

        aggregateprintstats.a(printwriter);
    }

    public void a(String s)
    {
        gdv.a();
        h();
        if (f.get(s) == null)
        {
            f.put(s, new gfb());
        }
    }

    public void a(String s, String s1, int i1)
    {
        gdv.a();
        h();
        gfb gfb2 = (gfb)f.get(s1);
        gfb gfb1 = gfb2;
        if (gfb2 == null)
        {
            gfb1 = new gfb();
        }
        gdv.b("Expected condition to be false", gfb1.a);
        gfb1.a = true;
        gfb1.b = i1;
        f.put(s1, gfb1);
        a(s);
    }

    void b()
    {
        i = true;
    }

    public void b(int i1)
    {
        l = i1;
    }

    public void b(Stats stats)
    {
        gdv.a();
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.GlobalStats)
        {
            gdv.b("Expected non-null", h.g);
            g.a(h.g);
            h.g = null;
            return;
        }
        String s = c.d();
        gdv.b("Expected non-null", s);
        gff gff1;
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceSenderStats)
        {
            gff1 = h.a;
            h.a = null;
        } else
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)
        {
            com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats voicereceiverstats = (com.google.android.libraries.hangouts.video.Stats.VoiceReceiverStats)stats;
            gff1 = (gff)h.b.get(Integer.valueOf(voicereceiverstats.a));
            h.b.remove(Integer.valueOf(voicereceiverstats.a));
        } else
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)
        {
            gff1 = h.c;
            h.c = null;
        } else
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)
        {
            com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats videoreceiverstats = (com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats)stats;
            gff1 = (gff)h.d.get(Integer.valueOf(videoreceiverstats.a));
            h.d.remove(Integer.valueOf(videoreceiverstats.a));
        } else
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)
        {
            gff1 = h.e;
            h.e = null;
        } else
        if (stats instanceof com.google.android.libraries.hangouts.video.Stats.ConnectionInfoStats)
        {
            gff1 = h.f;
            h.f = null;
        } else
        {
            gne.b("vclib", "Received unrecognized stats log, %s", new Object[] {
                stats
            });
            gff1 = null;
        }
        if (gff1 != null)
        {
            gfb gfb1 = (gfb)f.get(s);
            stats = gfb1;
            if (gfb1 == null)
            {
                stats = new gfb();
            }
            ((gfb) (stats)).c.a(gff1);
            f.put(s, stats);
            return;
        } else
        {
            gne.c("vclib", "Received stats object, %s that wasn't already in currentStatsUpdate", new Object[] {
                stats
            });
            return;
        }
    }

    public void c()
    {
        d = SystemClock.elapsedRealtime();
    }

    public void c(int i1)
    {
        m = i1;
    }

    public void d()
    {
        e = SystemClock.elapsedRealtime();
    }

    public com.google.android.libraries.hangouts.video.Stats.VideoSenderStats e()
    {
        gdv.a();
        if (h.c != null)
        {
            return (com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)h.c.c;
        }
        gnd gnd1 = b(c.d());
        for (int i1 = gnd1.a() - 1; i1 >= 0; i1--)
        {
            Stats stats = ((gff)gnd1.a(i1)).c;
            if (stats instanceof com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)
            {
                return (com.google.android.libraries.hangouts.video.Stats.VideoSenderStats)stats;
            }
        }

        return null;
    }

    public com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats f()
    {
        gdv.a();
        if (h.e != null)
        {
            return (com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)h.e.c;
        }
        gnd gnd1 = b(c.d());
        for (int i1 = gnd1.a() - 1; i1 >= 0; i1--)
        {
            Stats stats = ((gff)gnd1.a(i1)).c;
            if (stats instanceof com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)
            {
                return (com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats)stats;
            }
        }

        return null;
    }
}
