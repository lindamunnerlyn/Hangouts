// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;

final class bri
{

    private static final Uri a;
    private static final Uri b;
    private final MediaPlayer c;
    private boolean d;

    bri(boolean flag)
    {
        d = false;
        c = new MediaPlayer();
        c.setLooping(true);
        c.setAudioStreamType(0);
        if (!flag) goto _L2; else goto _L1
_L1:
        Uri uri = b;
_L3:
        c.setDataSource(g.nU, uri);
_L4:
        int i = g.a(g.nU, "babel_hangout_outgoing_ringtone_volume_percentage", 100);
        if (i >= 0 && i <= 100)
        {
            float f = (float)i / 100F;
            c.setVolume(f, f);
        }
        return;
_L2:
        uri = a;
          goto _L3
        IOException ioexception;
        ioexception;
        String s = String.valueOf(ioexception);
        gne.a(6, "Babel_calls", (new StringBuilder(String.valueOf(s).length() + 27)).append("Failed to set data source: ").append(s).toString());
          goto _L4
    }

    private boolean c()
    {
        if (d)
        {
            return true;
        }
        try
        {
            c.prepare();
            d = true;
        }
        catch (Exception exception)
        {
            String s = String.valueOf(exception);
            gne.a(6, "Babel_calls", (new StringBuilder(String.valueOf(s).length() + 26)).append("Failed to prepare ringer: ").append(s).toString());
            return false;
        }
        return true;
    }

    void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (c())
        {
            if (c.isPlaying())
            {
                c.pause();
            }
            c.seekTo(0);
            c.start();
        }
        c.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (c.isPlaying())
        {
            c.stop();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        a = eep.c(g.hX);
        b = eep.c(g.hU);
    }
}
