// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaCodecSimulcastEncoder;
import java.util.Iterator;
import java.util.List;

public final class ghj
    implements Runnable
{

    final List a;
    final MediaCodecSimulcastEncoder b;

    public ghj(MediaCodecSimulcastEncoder mediacodecsimulcastencoder, List list)
    {
        b = mediacodecsimulcastencoder;
        a = list;
        super();
    }

    public void run()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gfn)iterator.next()).b()) { }
    }
}
