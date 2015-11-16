// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.libraries.hangouts.video.MediaCodecDecoder;

public final class ggr
    implements Runnable
{

    final MediaCodecDecoder a;

    public ggr(MediaCodecDecoder mediacodecdecoder)
    {
        a = mediacodecdecoder;
        super();
    }

    public void run()
    {
        MediaCodecDecoder.d(a).removeCallbacks(MediaCodecDecoder.c(a));
        MediaCodecDecoder.d(a).postDelayed(MediaCodecDecoder.c(a), 10L);
        try
        {
            MediaCodecDecoder.e(a);
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            gne.a("vclib", "Decoding failed: ", illegalstateexception);
        }
        gne.a(6, "vclib", "Attempting to reset decoder.");
        MediaCodecDecoder.a(a);
    }
}
