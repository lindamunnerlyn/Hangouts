// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import fzd;
import gfj;
import gfo;
import gfp;
import ggd;
import ghk;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            RendererManager

public final class EncoderManager
{

    private final Context a;
    private int b;
    private long nativeContext;

    public EncoderManager(Context context)
    {
        b = -1;
        a = context;
        nativeInit();
        setSupportedCodecs(d());
    }

    public static int a(Context context)
    {
        int i;
        int j;
        j = 0;
        i = 0;
        if (fzd.a(context.getContentResolver(), "babel_hangout_hardware_encode", true)) goto _L2; else goto _L1
_L1:
        return i & ghk.a(true);
_L2:
        if (fzd.a(context.getContentResolver(), "babel_hangout_vp8_hardware_encode", true))
        {
            j = 1;
        }
        i = j;
        if (fzd.a(context.getContentResolver(), "babel_hangout_h264_hardware_encode2", true))
        {
            i = j | 2;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private int d()
    {
        int j = a(a);
        int i = j;
        if (b != -1)
        {
            i = j & b;
        }
        return i;
    }

    private final native void nativeInit();

    private final native void nativeRelease();

    private final native boolean setSupportedCodecs(int i);

    public gfo a(RendererManager renderermanager, gfp gfp, ggd ggd)
    {
        boolean flag;
        if (d() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return new gfj(this, flag, renderermanager, gfp, ggd, fzd.a(a.getContentResolver(), "babel_hangout_encoder_quality_scaling_mode", 0));
    }

    public void a()
    {
        b = -3;
        setSupportedCodecs(d());
    }

    public void b()
    {
        nativeRelease();
    }

    public long c()
    {
        return nativeContext;
    }

    native boolean getEncoderConfig(long l, Object obj);

    native boolean getNativeSimulcastEncoderIds(Object obj);

    public native int sendEncodedFrame(long l, long l1, ByteBuffer bytebuffer, int i, int j, 
            int k, int i1, int j1, boolean flag);
}
