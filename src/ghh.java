// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;
import java.util.List;

public final class ghh
    implements Runnable
{

    final MediaCodecSimulcastEncoder a;

    public ghh(MediaCodecSimulcastEncoder mediacodecsimulcastencoder)
    {
        a = mediacodecsimulcastencoder;
        super();
    }

    public void run()
    {
        boolean flag1;
        flag1 = false;
        a.f.removeCallbacks(a.g);
        if (a.d) goto _L2; else goto _L1
_L1:
        a.g();
_L4:
        return;
_L2:
        if (a.d()) goto _L4; else goto _L3
_L3:
        MediaCodecSimulcastEncoder mediacodecsimulcastencoder;
        List list;
        int i;
        mediacodecsimulcastencoder = a;
        gdv.f();
        list = mediacodecsimulcastencoder.e();
        if (list == null)
        {
            gne.a(4, "vclib", "Native encoders have been reset.");
            mediacodecsimulcastencoder.c = false;
            i = 1;
        } else
        {
label0:
            {
                if (list.size() == mediacodecsimulcastencoder.a.size())
                {
                    break label0;
                }
                i = list.size();
                gne.a(5, "vclib", (new StringBuilder(60)).append("New number of simulcast streams forcing a reset: ").append(i).toString());
                i = 1;
            }
        }
_L5:
        gha gha1;
        com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams encoderconfigurationoutputparams;
        int j;
        if (i != 0)
        {
            a.g();
            return;
        } else
        {
            a.f.postDelayed(a.g, 200L);
            return;
        }
        j = 0;
_L6:
        i = ((flag1) ? 1 : 0);
        if (j < mediacodecsimulcastencoder.a.size())
        {
            gha1 = (gha)mediacodecsimulcastencoder.a.get(j);
            encoderconfigurationoutputparams = (com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder.EncoderConfigurationOutputParams)list.get(j);
            if (encoderconfigurationoutputparams.nativeEncoderId != gha1.g())
            {
                gne.a(5, "vclib", "Encoder setup has changed. Resetting.");
                i = 1;
            } else
            if (encoderconfigurationoutputparams.codecType != gha1.h())
            {
                gne.a(5, "vclib", "Encoder codec has changed. Resetting.");
                i = 1;
            } else
            {
label1:
                {
                    if (encoderconfigurationoutputparams.width == gha1.i() && encoderconfigurationoutputparams.height == gha1.j())
                    {
                        break label1;
                    }
                    gne.a(5, "vclib", "Encoder setup(resolution) has changed. Resetting.");
                    i = 1;
                }
            }
        }
          goto _L5
label2:
        {
            if (!encoderconfigurationoutputparams.requiresKeyFrame)
            {
                boolean flag;
                if (mediacodecsimulcastencoder.b && SystemClock.elapsedRealtime() > mediacodecsimulcastencoder.e)
                {
                    mediacodecsimulcastencoder.e = SystemClock.elapsedRealtime() + 5000L;
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label2;
                }
            }
            gha1.l();
        }
        gha1.c(encoderconfigurationoutputparams.targetBitRate);
        j++;
          goto _L6
    }
}
