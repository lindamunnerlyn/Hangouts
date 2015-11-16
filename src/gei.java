// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;

public final class gei
    implements Runnable
{

    final MediaCodecSimulcastEncoder a;

    public gei(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        a = mediacodecsimulcastencoder;
        super();
    }

    public void run()
    {
        MediaCodecSimulcastEncoder.d(a).removeCallbacks(MediaCodecSimulcastEncoder.c(a));
        if (!MediaCodecSimulcastEncoder.e(a))
        {
            MediaCodecSimulcastEncoder.a(a);
            return;
        }
        if (MediaCodecSimulcastEncoder.f(a))
        {
            MediaCodecSimulcastEncoder.a(a);
            return;
        } else
        {
            MediaCodecSimulcastEncoder.d(a).postDelayed(MediaCodecSimulcastEncoder.c(a), 200L);
            return;
        }
    }
}
