// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaCodec;
import android.media.MediaFormat;

final class gef extends android.media.MediaCodec.Callback
{

    final gee a;

    gef(gee gee1)
    {
        a = gee1;
        super();
    }

    public void onError(MediaCodec mediacodec, android.media.MediaCodec.CodecException codecexception)
    {
        gkc.b("vclib", "Encoder codec error.", codecexception);
    }

    public void onInputBufferAvailable(MediaCodec mediacodec, int i)
    {
        gkc.d("vclib", "Ignoring unexpected onInputBufferAvailable from encoder MediaCodec.");
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
