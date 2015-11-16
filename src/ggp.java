// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecDecoder;

public final class ggp
    implements Runnable
{

    final MediaCodecDecoder a;

    public ggp(MediaCodecDecoder mediacodecdecoder)
    {
        a = mediacodecdecoder;
        super();
    }

    public void run()
    {
        MediaCodecDecoder.a(a);
    }
}
