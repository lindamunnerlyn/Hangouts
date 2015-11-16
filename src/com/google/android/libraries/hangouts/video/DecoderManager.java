// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import android.content.Context;
import fwz;
import gct;
import gdp;
import gel;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Decoder

public final class DecoderManager
{

    private final Context a;
    private long nativeContext;

    public DecoderManager(Context context)
    {
        a = context;
        nativeInit();
    }

    public static int a(Context context)
    {
        if (fwz.a(context.getContentResolver(), "babel_hangout_hardware_decode", true)) goto _L2; else goto _L1
_L1:
        int i = 0;
_L4:
        return i & gel.a(false);
_L2:
        int j;
        if (fwz.a(context.getContentResolver(), "babel_hangout_vp8_hardware_decode", true))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (fwz.a(context.getContentResolver(), "babel_hangout_h264_hardware_decode2", true))
        {
            i = j | 2;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static native boolean consumeNextEncodedFrame(int i, long l, ByteBuffer bytebuffer);

    static native boolean frameRenderedExternally(int i, long l, int j, int k);

    public static native int getCodecType(int i);

    static native boolean getNextEncodedFrameMetadata(int i, boolean flag, Object obj);

    private final native void nativeInit();

    private final native void nativeRelease();

    static native boolean notifyResolutionNotSupported(int i, int j, int k);

    public Decoder a(gdp gdp, gct gct)
    {
        if (a(a) == 0)
        {
            return null;
        } else
        {
            return new Decoder(gdp, gct);
        }
    }

    public void a()
    {
        nativeRelease();
    }
}
