// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import java.io.IOException;

final class dtx
    implements android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    private final Context a;
    private final int b;
    private final Handler c = new Handler();
    private MediaPlayer d;
    private boolean e;
    private boolean f;

    private dtx(Context context, int i)
    {
        a = context;
        b = i;
    }

    static dtx a(Context context, boolean flag)
    {
        ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary");
        int i;
        if (flag)
        {
            i = g.a(context, "babel_connecting_sound_incoming_delay_millis", 0);
        } else
        {
            i = g.a(context, "babel_connecting_sound_outgoing_delay_millis", -1);
        }
        if (i < 0)
        {
            ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.startConnectingSoundIfNecessary, disabled");
            return null;
        } else
        {
            context = new dtx(context, i);
            i = ((dtx) (context)).b;
            ebw.e("Babel_telephony", (new StringBuilder(64)).append("TeleConnectingSoundPlayer.start, waiting for millis: ").append(i).toString());
            ((dtx) (context)).c.postDelayed(new dty(context), ((dtx) (context)).b);
            return context;
        }
    }

    static void a(dtx dtx1)
    {
        ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay");
        dtx1.d = new MediaPlayer();
        dtx1.d.setLooping(true);
        dtx1.d.setOnPreparedListener(dtx1);
        dtx1.d.setOnErrorListener(dtx1);
        dtx1.d.setAudioStreamType(0);
        try
        {
            dtx1.d.setDataSource(dtx1.a, ebr.c(g.pf));
        }
        catch (IOException ioexception)
        {
            ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to set data source", ioexception);
            dtx1.a();
            return;
        }
        try
        {
            dtx1.d.prepareAsync();
            dtx1.e = true;
            return;
        }
        catch (Exception exception)
        {
            ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.startAfterDelay, failed to prepare", exception);
        }
        dtx1.a();
    }

    void a()
    {
        ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.stop");
        if (!e) goto _L2; else goto _L1
_L1:
        f = true;
_L4:
        c.removeCallbacksAndMessages(null);
        return;
_L2:
        if (d != null)
        {
            f = false;
            if (d.isPlaying())
            {
                d.stop();
            }
            d.reset();
            d.release();
            d = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        ebw.e("Babel_telephony", String.format("TeleConnectingSoundPlayer.onError, what: %d, extra: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        e = false;
        a();
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        ebw.e("Babel_telephony", "TeleConnectingSoundPlayer.onPrepared");
        e = false;
        if (f)
        {
            a();
        } else
        if (mediaplayer != null)
        {
            mediaplayer.start();
            return;
        }
    }
}
