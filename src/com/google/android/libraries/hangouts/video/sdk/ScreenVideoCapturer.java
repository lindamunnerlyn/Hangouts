// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import eq;
import fzd;
import glo;
import gme;
import gmm;
import gmx;
import gmy;
import gna;
import gne;
import gnk;

public final class ScreenVideoCapturer
    implements gmx
{

    private static final gnk a = new gnk(1920, 1080);
    private final Context b;
    private final WindowManager c;
    private final DisplayManager d;
    private final MediaProjectionManager e;
    private final android.media.projection.MediaProjection.Callback f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final android.hardware.display.DisplayManager.DisplayListener i;
    private final int j;
    private glo k;
    private gmy l;
    private Surface m;
    private SurfaceTexture n;
    private MediaProjection o;
    private VirtualDisplay p;
    private int q;
    private final Point r;
    private boolean s;
    private boolean t;
    private boolean u;

    public static SurfaceTexture a(ScreenVideoCapturer screenvideocapturer, SurfaceTexture surfacetexture)
    {
        screenvideocapturer.n = surfacetexture;
        return surfacetexture;
    }

    public static VirtualDisplay a(ScreenVideoCapturer screenvideocapturer)
    {
        return screenvideocapturer.p;
    }

    private gnk a()
    {
        c.getDefaultDisplay().getRealSize(r);
        int i1 = r.x;
        int j1 = r.y;
        float f1;
        if (l.n().a >= 1280)
        {
            f1 = fzd.a(b.getContentResolver(), "babel_hangout_screen_capture_scale_hw", 1.0F);
        } else
        {
            f1 = fzd.a(b.getContentResolver(), "babel_hangout_screen_capture_scale_sw", 0.75F);
        }
        return gnk.b(gnk.a(new gnk(i1, j1), f1), a);
    }

    private void a(boolean flag)
    {
        float f2 = 1.0F;
        if (k == null)
        {
            return;
        }
        k.a(flag);
        glo glo1 = k;
        float f1;
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        if (!flag)
        {
            f2 = 0.0F;
        }
        glo1.a(f1, f2);
        k.a();
    }

    private void b()
    {
        s = false;
        a(false);
    }

    public static void b(ScreenVideoCapturer screenvideocapturer)
    {
        if (screenvideocapturer.n != null)
        {
            gnk gnk1 = screenvideocapturer.a();
            int i1;
            if (screenvideocapturer.l.n().a >= 1280)
            {
                i1 = fzd.a(screenvideocapturer.b.getContentResolver(), "babel_hangout_screen_capture_framerate_hw", 10);
            } else
            {
                i1 = fzd.a(screenvideocapturer.b.getContentResolver(), "babel_hangout_screen_capture_framerate_sw", 5);
            }
            screenvideocapturer.q = i1;
            screenvideocapturer.n.setDefaultBufferSize(gnk1.a, gnk1.b);
            screenvideocapturer.l.a(gnk1.a, gnk1.b, gnk1.a, gnk1.b, true);
            screenvideocapturer.l.a(screenvideocapturer.q);
        }
    }

    private void c()
    {
        if (p != null)
        {
            gne.a(3, "vclib", "Releasing virtual display for screen capture");
            p.release();
            p = null;
        }
        if (m != null)
        {
            m.release();
            m = null;
        }
    }

    public static void c(ScreenVideoCapturer screenvideocapturer)
    {
        screenvideocapturer.d();
    }

    private void d()
    {
        if (o == null || n == null)
        {
            gne.a(3, "vclib", "Waiting to create virtual display.");
        } else
        {
            c();
            gnk gnk1 = a();
            String s1 = String.valueOf(gnk1);
            gne.a(3, "vclib", (new StringBuilder(String.valueOf(s1).length() + 21)).append("Capturing screen at: ").append(s1).toString());
            int i1 = r.x;
            int j1 = r.y;
            int k1 = gnk1.a;
            int l1 = gnk1.b;
            float f1 = j;
            i1 = Math.round(((float)(k1 * l1) / (float)(i1 * j1)) * f1);
            m = new Surface(n);
            p = o.createVirtualDisplay("HangoutsScreenCapture", gnk1.a, gnk1.b, i1, 3, m, null, null);
            if (!t)
            {
                t = true;
                return;
            }
        }
    }

    public void a(gmm gmm, gmy gmy1)
    {
        boolean flag1;
        boolean flag = false;
        l = gmy1;
        k = new glo(gmm);
        gmy1.a(new gme(this));
        gmy1.c(false);
        gmy1.b(0);
        d.registerDisplayListener(i, null);
        eq.a(b).a(g, new IntentFilter("com.google.android.libraries.hangouts.video.sdk.ScreenCapturer"));
        gmm = new IntentFilter("android.intent.action.SCREEN_OFF");
        gmm.addAction("android.intent.action.USER_PRESENT");
        b.registerReceiver(h, gmm);
        flag1 = s;
        s = flag1;
        if (l != null)
        {
            gmm = l;
            if (!flag1)
            {
                flag = true;
            }
            gmm.b(flag);
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        b();
_L6:
        return;
_L2:
        if (o != null) goto _L4; else goto _L3
_L3:
        if (u) goto _L6; else goto _L5
_L5:
        u = true;
        gmm = new Intent(b, com/google/android/libraries/hangouts/video/sdk/ScreenVideoCapturer$HandleAuthIntentActivity);
        gmm.addFlags(0x18800000);
        gmm.putExtra("share_permission_intent", e.createScreenCaptureIntent());
        b.startActivity(gmm);
_L8:
        a(true);
        return;
_L4:
        d();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void g()
    {
        gne.a(3, "vclib", "ScreenVideoCapturer.onDetachFromCall");
        b();
        k = null;
        c();
        eq.a(b).a(g);
        d.unregisterDisplayListener(i);
        b.unregisterReceiver(h);
        if (o != null)
        {
            o.stop();
            o.unregisterCallback(f);
            o = null;
            u = false;
        }
    }

}
