// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;

public final class ghg
    implements Runnable
{

    final MediaCodecSimulcastEncoder a;

    public ghg(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        a = mediacodecsimulcastencoder;
        super();
    }

    public void run()
    {
        a.f();
    }
}
