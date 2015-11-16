// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;

final class ghe extends android.media.MediaCodec.Callback
{

    final ghd a;

    ghe(ghd ghd1)
    {
        a = ghd1;
        super();
    }

    public void onError(MediaCodec mediacodec, android.media.MediaCodec.CodecException codecexception)
    {
        boolean flag;
        if (codecexception.isRecoverable() || codecexception.isTransient())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.a(codecexception, flag);
    }

    public void onInputBufferAvailable(MediaCodec mediacodec, int i)
    {
        gne.a(5, "vclib", "Ignoring unexpected onInputBufferAvailable from encoder MediaCodec.");
    }

    public void onOutputBufferAvailable(MediaCodec mediacodec, int i, android.media.MediaCodec.BufferInfo bufferinfo)
    {
        a.a(i, bufferinfo);
    }

    public void onOutputFormatChanged(MediaCodec mediacodec, MediaFormat mediaformat)
    {
        a.a(mediaformat);
    }
}
