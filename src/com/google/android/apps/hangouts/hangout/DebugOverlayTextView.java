// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import bnk;
import bns;
import bod;
import boe;
import bof;
import bpm;
import g;
import geu;
import gey;
import gkq;
import gmt;
import hor;
import hou;
import hoy;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class DebugOverlayTextView extends TextView
    implements hor, hou, hoy
{

    private static final long a;
    private static final long b;
    private final bnk c = bnk.a();
    private final StringBuilder d = new StringBuilder();
    private gmt e;
    private final bns f = new bod(this);
    private final Runnable g = new boe(this);
    private final Runnable h = new bof(this);

    public DebugOverlayTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static gmt a(DebugOverlayTextView debugoverlaytextview)
    {
        return debugoverlaytextview.e;
    }

    public static gmt a(DebugOverlayTextView debugoverlaytextview, gmt gmt1)
    {
        debugoverlaytextview.e = gmt1;
        return gmt1;
    }

    public static Runnable b(DebugOverlayTextView debugoverlaytextview)
    {
        return debugoverlaytextview.g;
    }

    public static long c()
    {
        return a;
    }

    public static String c(DebugOverlayTextView debugoverlaytextview)
    {
        debugoverlaytextview.d.setLength(0);
        Object obj1 = debugoverlaytextview.c.s();
        if (debugoverlaytextview.e == null)
        {
            debugoverlaytextview.d.append("Focus is null, waiting...\n");
        } else
        {
            StringBuilder stringbuilder = debugoverlaytextview.d;
            String s;
            String s1;
            if (debugoverlaytextview.e.e())
            {
                s = "muted";
            } else
            {
                s = "on";
            }
            if (debugoverlaytextview.e.d())
            {
                s1 = "muted";
            } else
            {
                s1 = "on";
            }
            stringbuilder.append(String.format("Focus is video %s/audio %s\n", new Object[] {
                s, s1
            }));
        }
        if (obj1 == null)
        {
            debugoverlaytextview.d.append("hangoutState is null, waiting...\n");
        } else
        {
            obj1 = ((bpm) (obj1)).q();
            if (obj1 == null)
            {
                debugoverlaytextview.d.append("callState is null, waiting...\n");
            } else
            {
                gey gey1 = ((geu) (obj1)).l();
                StringBuilder stringbuilder1 = debugoverlaytextview.d;
                Object obj;
                if (((geu) (obj1)).t())
                {
                    obj = "P2P";
                } else
                {
                    obj = "Cloud";
                }
                stringbuilder1.append(String.format("%s ", new Object[] {
                    obj
                }));
                obj = gey1.f();
                if (obj != null)
                {
                    debugoverlaytextview.d.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[] {
                        Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).a), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).b), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).c), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).d)
                    }));
                }
                obj = ((geu) (obj1)).n();
                if (obj != null)
                {
                    com.google.android.libraries.hangouts.video.Stats.VideoSenderStats videosenderstats = gey1.e();
                    if (videosenderstats != null)
                    {
                        debugoverlaytextview.d.append(String.format("\nLocal (%s): %s\n%dx%d %dfps IN / %dfps OUT", new Object[] {
                            videosenderstats.c, ((gkq) (obj)).b(), Integer.valueOf(videosenderstats.k), Integer.valueOf(videosenderstats.l), Integer.valueOf(videosenderstats.m), Integer.valueOf(videosenderstats.n)
                        }));
                    }
                }
                obj = ((geu) (obj1)).m().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    gkq gkq1 = (gkq)((Iterator) (obj)).next();
                    com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats videoreceiverstats = gey1.a(gkq1);
                    if (videoreceiverstats != null)
                    {
                        debugoverlaytextview.d.append("\n");
                        debugoverlaytextview.d.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[] {
                            gkq1.b(), Integer.valueOf(videoreceiverstats.h), Integer.valueOf(videoreceiverstats.i), Integer.valueOf(videoreceiverstats.j), Integer.valueOf(videoreceiverstats.k)
                        }));
                        debugoverlaytextview.d.append(String.format(" | Renderer: %.2f IN / %.2f OUT", new Object[] {
                            Float.valueOf(videoreceiverstats.l), Float.valueOf(videoreceiverstats.m)
                        }));
                    }
                }
            }
        }
        if (TextUtils.isEmpty(debugoverlaytextview.d))
        {
            return "Getting debug stats ...";
        } else
        {
            return debugoverlaytextview.d.toString();
        }
    }

    public static long d()
    {
        return b;
    }

    public static Runnable d(DebugOverlayTextView debugoverlaytextview)
    {
        return debugoverlaytextview.h;
    }

    public void G_()
    {
        g.x().post(g);
        g.x().post(h);
        setMovementMethod(new ScrollingMovementMethod());
        c.a(f);
    }

    public void a()
    {
        g.x().removeCallbacks(g);
        g.x().removeCallbacks(h);
        d.setLength(0);
        c.b(f);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
        b = TimeUnit.SECONDS.toMillis(15L);
    }
}
