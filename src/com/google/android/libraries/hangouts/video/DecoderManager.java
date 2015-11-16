// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import fzd;
import ggd;
import ggv;
import ggw;
import ggy;
import ghk;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            MediaCodecDecoder

public final class DecoderManager
{

    private final Context a;
    private int b;
    private long nativeContext;

    public DecoderManager(Context context)
    {
        b = -1;
        a = context;
        nativeInit();
        setSupportedCodecs(d());
    }

    public static int a(Context context)
    {
        if (fzd.a(context.getContentResolver(), "babel_hangout_hardware_decode", true)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i & ghk.a(false);
_L2:
        int j;
        if (fzd.a(context.getContentResolver(), "babel_hangout_vp8_hardware_decode", true))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (fzd.a(context.getContentResolver(), "babel_hangout_h264_hardware_decode2", true))
        {
            i = j | 2;
        }
        if (true) goto _L4; else goto _L3
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

    public MediaCodecDecoder a(ggd ggd, ggv ggv)
    {
        if (a(a) == 0)
        {
            return null;
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            return new ggw(this, ggd, ggv);
        } else
        {
            return new ggy(this, ggd, ggv);
        }
    }

    public void a()
    {
        nativeRelease();
    }

    public long b()
    {
        return nativeContext;
    }

    public void c()
    {
        b = -3;
        setSupportedCodecs(d());
    }

    native boolean consumeNextEncodedFrame(int i, long l, ByteBuffer bytebuffer);

    native boolean frameRenderedExternally(int i, long l, int j, int k);

    native int getCodecType(int i);

    native boolean getNextEncodedFrameMetadata(int i, boolean flag, Object obj);

    native boolean notifyResolutionNotSupported(int i, int j, int k);
}
