// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecDecoder;

public final class ggt
    implements Runnable
{

    final int a;
    final MediaCodecDecoder b;

    public ggt(MediaCodecDecoder mediacodecdecoder, int i)
    {
        b = mediacodecdecoder;
        a = i;
        super();
    }

    public void run()
    {
        MediaCodecDecoder.a(b, a);
        MediaCodecDecoder.a(b);
    }
}
