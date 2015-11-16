// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.os.Handler;

final class ged
    implements Runnable
{

    final gec a;

    ged(gec gec1)
    {
        a = gec1;
        super();
    }

    public void run()
    {
        MediaCodec mediacodec;
        android.media.MediaCodec.BufferInfo bufferinfo;
        int i;
        long l;
        l = System.currentTimeMillis();
        mediacodec = a.c();
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
        a.b.postDelayed(a.a, l);
        return;
_L2:
        if (i == -2)
        {
            a.a(mediacodec.getOutputFormat());
        } else
        if (i == -3)
        {
            a.c = mediacodec.getOutputBuffers();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
