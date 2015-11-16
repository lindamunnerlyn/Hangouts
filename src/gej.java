// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;
import java.util.Comparator;

public final class gej
    implements Comparator
{

    final MediaCodecSimulcastEncoder a;

    public gej(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        a = mediacodecsimulcastencoder;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams)obj;
        obj1 = (com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams)obj1;
        return ((com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams) (obj)).width * ((com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams) (obj)).height - ((com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams) (obj1)).width * ((com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams) (obj1)).height;
    }
}
