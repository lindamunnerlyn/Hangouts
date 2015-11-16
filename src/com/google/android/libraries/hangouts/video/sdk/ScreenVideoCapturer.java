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
import fwz;
import gim;
import gjc;
import gjk;
import gjv;
import gjw;
import gjy;
import gkc;
import gki;

public final class ScreenVideoCapturer
    implements gjv
{

    private static final gki a = new gki(1920, 1080);
    private final Context b;
    private final WindowManager c;
    private final DisplayManager d;
    private final MediaProjectionManager e;
    private final android.media.projection.MediaProjection.Callback f;
    private final BroadcastReceiver g;
    private final BroadcastReceiver h;
    private final android.hardware.display.DisplayManager.DisplayListener i;
    private final int j;
    private gim k;
    private gjw l;
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

    private gki a()
    {
        c.getDefaultDisplay().getRealSize(r);
        int i1 = r.x;
        int j1 = r.y;
        float f1;
        if (l.b().a >= 1280)
        {
            f1 = fwz.a(b.getContentResolver(), "babel_hangout_screen_capture_scale_hw", 1.0F);
        } else
        {
            f1 = fwz.a(b.getContentResolver(), "babel_hangout_screen_capture_scale_sw", 0.75F);
        }
        return gki.b(gki.a(new gki(i1, j1), f1), a);
    }

    private void a(boolean flag)
    {
        if (k == null)
        {
            return;
        }
        k.a(flag);
        if (flag)
        {
            k.a();
        }
        k.b();
    }

    private void b()
    {
        if (p != null)
        {
            gkc.b("vclib", "Releasing virtual display for screen capture");
            p.release();
            p = null;
        }
        if (m != null)
        {
            m.release();
            m = null;
        }
    }

    public static void b(ScreenVideoCapturer screenvideocapturer)
    {
        if (screenvideocapturer.n != null)
        {
            gki gki1 = screenvideocapturer.a();
            int i1;
            if (screenvideocapturer.l.b().a >= 1280)
            {
                i1 = fwz.a(screenvideocapturer.b.getContentResolver(), "babel_hangout_screen_capture_framerate_hw", 10);
            } else
            {
                i1 = fwz.a(screenvideocapturer.b.getContentResolver(), "babel_hangout_screen_capture_framerate_sw", 5);
            }
            screenvideocapturer.q = i1;
            screenvideocapturer.n.setDefaultBufferSize(gki1.a, gki1.b);
            screenvideocapturer.l.a(gki1.a, gki1.b, gki1.a, gki1.b, true);
            screenvideocapturer.l.a(screenvideocapturer.q);
        }
    }

    private void c()
    {
        if (o == null || n == null)
        {
            gkc.b("vclib", "Waiting to create virtual display.");
        } else
        {
            b();
            gki gki1 = a();
            String s1 = String.valueOf(gki1);
            gkc.b("vclib", (new StringBuilder(String.valueOf(s1).length() + 21)).append("Capturing screen at: ").append(s1).toString());
            int i1 = r.x;
            int j1 = r.y;
            int k1 = gki1.a;
            int l1 = gki1.b;
            float f1 = j;
            i1 = Math.round(((float)(k1 * l1) / (float)(i1 * j1)) * f1);
            m = new Surface(n);
            p = o.createVirtualDisplay("HangoutsScreenCapture", gki1.a, gki1.b, i1, 3, m, null, null);
            if (!t)
            {
                t = true;
                return;
            }
        }
    }

    public static void c(ScreenVideoCapturer screenvideocapturer)
    {
        screenvideocapturer.c();
    }

    public void a(gjk gjk, gjw gjw1)
    {
        l = gjw1;
        k = new gim(gjk);
        gjw1.a(new gjc(this));
        gjw1.b(false);
        gjw1.b(0);
        d.registerDisplayListener(i, null);
        eq.a(b).a(g, new IntentFilter("com.google.android.libraries.hangouts.video.sdk.ScreenCapturer"));
        gjk = new IntentFilter("android.intent.action.SCREEN_OFF");
        gjk.addAction("android.intent.action.USER_PRESENT");
        b.registerReceiver(h, gjk);
        boolean flag1 = s;
        s = flag1;
        if (l != null)
        {
            gjk = l;
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            gjk.a(flag);
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        s = false;
        a(false);
_L6:
        return;
_L2:
        if (o != null) goto _L4; else goto _L3
_L3:
        if (u) goto _L6; else goto _L5
_L5:
        u = true;
        gjk = new Intent(b, com/google/android/libraries/hangouts/video/sdk/ScreenVideoCapturer$HandleAuthIntentActivity);
        gjk.addFlags(0x18800000);
        gjk.putExtra("share_permission_intent", e.createScreenCaptureIntent());
        b.startActivity(gjk);
_L8:
        a(true);
        return;
_L4:
        c();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void g()
    {
        gkc.b("vclib", "ScreenVideoCapturer.onDetachFromCall");
        a(false);
        k = null;
        b();
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
