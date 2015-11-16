// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;

final class eau extends Thread
{

    public eat a;
    final eaq b;

    public eau(eaq eaq1, eat eat1)
    {
        b = eaq1;
        super();
        a = eat1;
    }

    public void run()
    {
        Looper.prepare();
        eaq.a(b, Looper.myLooper());
        this;
        JVM INSTR monitorenter ;
        AudioManager audiomanager = (AudioManager)g.nS.getSystemService("audio");
        MediaPlayer mediaplayer;
        int i;
        mediaplayer = new MediaPlayer();
        mediaplayer.setAudioStreamType(a.d);
        mediaplayer.setDataSource(g.nS, a.b);
        mediaplayer.setLooping(a.c);
        mediaplayer.setVolume(a.e, a.e);
        mediaplayer.prepare();
        if (a.b == null || a.b.getEncodedPath() == null || a.b.getEncodedPath().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        i = a.d;
        byte byte0;
        if (a.c)
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        audiomanager.requestAudioFocus(null, i, byte0);
        mediaplayer.setOnCompletionListener(b);
        mediaplayer.start();
        if (eaq.a(b) != null)
        {
            eaq.a(b).release();
        }
        eaq.a(b, mediaplayer);
_L1:
        eaq.a(b, audiomanager);
        notify();
        this;
        JVM INSTR monitorexit ;
        Looper.loop();
        return;
        Exception exception1;
        exception1;
        String s = eaq.b(b);
        String s1 = String.valueOf(a.b);
        ebw.d(s, (new StringBuilder(String.valueOf(s1).length() + 24)).append("error loading sound for ").append(s1).toString(), exception1);
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
