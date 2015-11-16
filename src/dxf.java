// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;

final class dxf
    implements android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    final Context a;
    MediaPlayer b;
    boolean c;
    private final int d;
    private final Handler e = new Handler();
    private boolean f;

    dxf(Context context, int i)
    {
        a = context;
        d = i;
    }

    void a()
    {
        int i = d;
        eev.e("Babel_telephony", (new StringBuilder(64)).append("TeleConnectingSoundPlayer.start, waiting for millis: ").append(i).toString());
        e.postDelayed(new dxg(this), d);
    }

    void b()
    {
        eev.e("Babel_telephony", "TeleConnectingSoundPlayer.stop");
        if (!c) goto _L2; else goto _L1
_L1:
        f = true;
_L4:
        e.removeCallbacksAndMessages(null);
        return;
_L2:
        if (b != null)
        {
            f = false;
            if (b.isPlaying())
            {
                b.stop();
            }
            b.reset();
            b.release();
            b = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        eev.e("Babel_telephony", String.format("TeleConnectingSoundPlayer.onError, what: %d, extra: %d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        c = false;
        b();
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        eev.e("Babel_telephony", "TeleConnectingSoundPlayer.onPrepared");
        c = false;
        if (f)
        {
            b();
        } else
        if (mediaplayer != null)
        {
            mediaplayer.start();
            return;
        }
    }
}
