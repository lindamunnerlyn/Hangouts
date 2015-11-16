// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.util.concurrent.ConcurrentLinkedQueue;

final class ggz extends android.media.MediaCodec.Callback
{

    final ggy a;

    ggz(ggy ggy1)
    {
        a = ggy1;
        super();
    }

    public void onError(MediaCodec mediacodec, android.media.MediaCodec.CodecException codecexception)
    {
        gne.a("vclib", "Decoder codec error.", codecexception);
    }

    public void onInputBufferAvailable(MediaCodec mediacodec, int i)
    {
        if (mediacodec == a.d())
        {
            ggy.a(a).add(Integer.valueOf(i));
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediacodec, int i, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        if (mediacodec == a.d())
        {
            a.a(i, bufferinfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
    {
        if (mediacodec == a.d())
        {
            a.a(mediaformat);
        }
    }
}
