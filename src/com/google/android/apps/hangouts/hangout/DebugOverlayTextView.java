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
import bnd;
import bnv;
import bnw;
import bpd;
import fsn;
import g;
import gcg;
import gck;
import gho;
import hjx;
import hka;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class DebugOverlayTextView extends TextView
    implements fsn, hjx, hka
{

    private static final long a;
    private static final long b;
    private final bnd c = bnd.a();
    private final StringBuilder d = new StringBuilder();
    private final Runnable e = new bnv(this);
    private final Runnable f = new bnw(this);

    public DebugOverlayTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public static Runnable a(DebugOverlayTextView debugoverlaytextview)
    {
        return debugoverlaytextview.e;
    }

    public static String b(DebugOverlayTextView debugoverlaytextview)
    {
        debugoverlaytextview.d.setLength(0);
        bpd bpd1 = debugoverlaytextview.c.t();
        if (bpd1 == null)
        {
            debugoverlaytextview.d.append("hangoutState is null, waiting...\n");
        } else
        {
            gcg gcg1 = bpd1.r();
            if (gcg1 == null)
            {
                debugoverlaytextview.d.append("callState is null, waiting...\n");
            } else
            {
                gck gck1 = gcg1.l();
                StringBuilder stringbuilder = debugoverlaytextview.d;
                Object obj;
                if (gcg1.u())
                {
                    obj = "P2P";
                } else
                {
                    obj = "Cloud";
                }
                stringbuilder.append(String.format("%s ", new Object[] {
                    obj
                }));
                obj = gck1.f();
                if (obj != null)
                {
                    debugoverlaytextview.d.append(String.format("\nBW: asbw (%d), arbw (%d), txbr (%d), rtxbr (%d)", new Object[] {
                        Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).a), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).b), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).c), Integer.valueOf(((com.google.android.libraries.hangouts.video.Stats.BandwidthEstimationStats) (obj)).d)
                    }));
                }
                obj = gcg1.n();
                if (obj != null)
                {
                    com.google.android.libraries.hangouts.video.Stats.VideoSenderStats videosenderstats = gck1.e();
                    if (videosenderstats != null)
                    {
                        debugoverlaytextview.d.append(String.format("\nLocal (%s): %s\n%dx%d %dfps IN / %dfps OUT", new Object[] {
                            videosenderstats.c, ((gho) (obj)).c(), Integer.valueOf(videosenderstats.k), Integer.valueOf(videosenderstats.l), Integer.valueOf(videosenderstats.m), Integer.valueOf(videosenderstats.n)
                        }));
                    }
                }
                obj = gcg1.m().iterator();
                while (((Iterator) (obj)).hasNext()) 
                {
                    gho gho1 = (gho)((Iterator) (obj)).next();
                    com.google.android.libraries.hangouts.video.Stats.VideoReceiverStats videoreceiverstats = gck1.a(gho1);
                    if (videoreceiverstats != null)
                    {
                        debugoverlaytextview.d.append("\n");
                        debugoverlaytextview.d.append(String.format("Remote: %s\n%dx%d %dfps IN / %dfps OUT", new Object[] {
                            gho1.c(), Integer.valueOf(videoreceiverstats.h), Integer.valueOf(videoreceiverstats.i), Integer.valueOf(videoreceiverstats.j), Integer.valueOf(videoreceiverstats.k)
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

    public static long c()
    {
        return a;
    }

    public static Runnable c(DebugOverlayTextView debugoverlaytextview)
    {
        return debugoverlaytextview.f;
    }

    public static long d()
    {
        return b;
    }

    public void E_()
    {
        g.y().post(e);
        g.y().post(f);
        setMovementMethod(new ScrollingMovementMethod());
    }

    public void a()
    {
        g.y().removeCallbacks(e);
        g.y().removeCallbacks(f);
        d.setLength(0);
    }

    static 
    {
        a = TimeUnit.SECONDS.toMillis(1L);
        b = TimeUnit.SECONDS.toMillis(15L);
    }
}
