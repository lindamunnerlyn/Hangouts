// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecDecoder;

public final class ggu
    implements Runnable
{

    final int a;
    final MediaCodecDecoder b;

    public ggu(MediaCodecDecoder mediacodecdecoder, int i)
    {
        b = mediacodecdecoder;
        a = i;
        super();
    }

    public void run()
    {
        g.o(a);
    }
}
