// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Looper;

final class edy extends Thread
{

    public edx a;
    final edu b;

    public edy(edu edu1, edx edx1)
    {
        b = edu1;
        super();
        a = edx1;
    }

    public void run()
    {
        Looper.prepare();
        b.c = Looper.myLooper();
        this;
        JVM INSTR monitorenter ;
        AudioManager audiomanager = (AudioManager)g.nU.getSystemService("audio");
        MediaPlayer mediaplayer;
        int i;
        mediaplayer = new MediaPlayer();
        mediaplayer.setAudioStreamType(a.d);
        mediaplayer.setDataSource(g.nU, a.b);
        mediaplayer.setLooping(a.c);
        mediaplayer.setVolume(a.e, a.e);
        mediaplayer.prepare();
        if (a.b == null || a.b.getEncodedPath() == null || a.b.getEncodedPath().length() <= 0)
        {
            break MISSING_BLOCK_LABEL_164;
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
        if (b.h != null)
        {
            b.h.release();
        }
        b.h = mediaplayer;
_L1:
        b.j = audiomanager;
        notify();
        this;
        JVM INSTR monitorexit ;
        Looper.loop();
        return;
        Exception exception1;
        exception1;
        String s = b.d;
        String s1 = String.valueOf(a.b);
        eev.d(s, (new StringBuilder(String.valueOf(s1).length() + 24)).append("error loading sound for ").append(s1).toString(), exception1);
          goto _L1
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
