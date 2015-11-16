// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.os.Handler;

final class ggx
    implements Runnable
{

    final ggw a;

    ggx(ggw ggw1)
    {
        a = ggw1;
        super();
    }

    public void run()
    {
        MediaCodec mediacodec;
        android.media.MediaCodec.BufferInfo bufferinfo;
        int i;
        long l;
        a.e().removeCallbacks(ggw.a(a));
        l = System.currentTimeMillis();
        mediacodec = a.d();
        if (mediacodec == null)
        {
            return;
        }
        bufferinfo = new android.media.MediaCodec.BufferInfo();
        i = mediacodec.dequeueOutputBuffer(bufferinfo, 0L);
        if (i < 0) goto _L2; else goto _L1
_L1:
        a.a(i, bufferinfo);
_L4:
        l = Math.max(0L, 10L - (System.currentTimeMillis() - l));
        a.e().postDelayed(ggw.a(a), l);
        return;
_L2:
        if (i == -2)
        {
            a.a(mediacodec.getOutputFormat());
        } else
        if (i == -3)
        {
            ggw.a(a, mediacodec.getOutputBuffers());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
