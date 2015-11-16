// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.hangouts.service.AudioPlayerService;
import java.io.IOException;

public final class dnu
    implements android.media.AudioManager.OnAudioFocusChangeListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    final AudioPlayerService a;
    private final MediaPlayer b = new MediaPlayer();
    private final AudioManager c;
    private final String d;
    private boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private final Object i = new Object();
    private final Handler j = new Handler();
    private final Runnable k = new dnv(this);

    public dnu(AudioPlayerService audioplayerservice, Context context, String s, String s1)
    {
        a = audioplayerservice;
        super();
        d = s1;
        c = (AudioManager)context.getSystemService("audio");
        h = 0;
        try
        {
            b.setOnPreparedListener(this);
            b.setOnCompletionListener(this);
            b.setOnErrorListener(this);
            b.setAudioStreamType(0);
            b.setDataSource(context, Uri.parse(s));
        }
        // Misplaced declaration of an exception variable
        catch (AudioPlayerService audioplayerservice)
        {
            eev.d("Babel", "AudioPlayerService got an IOException in PlayOperation constructor.", audioplayerservice);
            b.release();
            throw audioplayerservice;
        }
        g = false;
        e = true;
        b.prepareAsync();
    }

    private Intent a(String s)
    {
        if (AudioPlayerService.a())
        {
            String s1 = d;
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 30 + String.valueOf(s1).length())).append("Sending Action: ").append(s).append(" for play_id: ").append(s1).toString());
        }
        return AudioPlayerService.a(s, d);
    }

    private void h()
    {
label0:
        {
            synchronized (i)
            {
                if (h != 0)
                {
                    break label0;
                }
            }
            return;
        }
        obj;
        JVM INSTR monitorexit ;
        obj = a("current_position");
        ((Intent) (obj)).putExtra("position_in_milliseconds", b.getCurrentPosition());
        ((Intent) (obj)).putExtra("duration_in_milliseconds", b.getDuration());
        a.sendBroadcast(((Intent) (obj)));
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String a()
    {
        return d;
    }

    public void a(int l)
    {
        b.seekTo(l);
    }

    public void b()
    {
        if (!g && c.requestAudioFocus(this, 0, 1) != 1)
        {
            eev.f("Babel", "Unable to get audio focus.");
            g();
            return;
        } else
        {
            g = true;
            b.start();
            a.sendBroadcast(a("play_started"));
            return;
        }
    }

    public void c()
    {
        if (g)
        {
            c.abandonAudioFocus(this);
            g = false;
        }
        b.pause();
        a.sendBroadcast(a("play_paused"));
    }

    public void d()
    {
        boolean flag = true;
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        h = h + 1;
        Exception exception;
        if (h != 1)
        {
            flag = false;
        }
        if (flag)
        {
            f();
            return;
        } else
        {
            h();
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void e()
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        if (h <= 0)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        h = h - 1;
_L2:
        return;
        eev.g("Babel", "unregisterForCurrentPositionNotification: currentPositionListenerCount <= 0!");
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    void f()
    {
        h();
        synchronized (i)
        {
            if (h != 0)
            {
                j.postDelayed(k, 250L);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void g()
    {
        synchronized (i)
        {
            h = 0;
        }
        if (e)
        {
            f = true;
        } else
        {
            if (g)
            {
                c.abandonAudioFocus(this);
                g = false;
            }
            b.stop();
            b.reset();
            b.release();
            a.sendBroadcast(a("play_stopped"));
            if (this == AudioPlayerService.a(a))
            {
                AudioPlayerService.b(a);
                return;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onAudioFocusChange(int l)
    {
        l;
        JVM INSTR tableswitch -3 1: default 36
    //                   -3 96
    //                   -2 78
    //                   -1 60
    //                   0 36
    //                   1 37;
           goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
        return;
_L5:
        if (AudioPlayerService.a())
        {
            eev.b("Babel", "audioFocusChange: AUDIOFOCUS_GAIN");
        }
        b.setVolume(1.0F, 1.0F);
        return;
_L4:
        if (AudioPlayerService.a())
        {
            eev.b("Babel", "audioFocusChange: AUDIOFOCUS_LOSS");
        }
        g();
        return;
_L3:
        if (AudioPlayerService.a())
        {
            eev.b("Babel", "audioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT");
        }
        c();
        return;
_L2:
        if (AudioPlayerService.a())
        {
            eev.b("Babel", "audioFocusChange: AUDIOFOCUS_LOSS_TRANSIENT_CAN_DUCK");
        }
        if (b.isPlaying())
        {
            b.setVolume(0.1F, 0.1F);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        g();
    }

    public boolean onError(MediaPlayer mediaplayer, int l, int i1)
    {
        eev.f("Babel", (new StringBuilder(75)).append("AudioPlayerService: MediaPlayer error. what: ").append(l).append(" extra: ").append(i1).toString());
        if (e)
        {
            mediaplayer.reset();
            mediaplayer.release();
            a.sendBroadcast(a("play_stopped"));
        } else
        {
            g();
        }
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        e = false;
        if (f)
        {
            g();
            return;
        } else
        {
            Intent intent = a("ready_to_play");
            intent.putExtra("duration_in_milliseconds", mediaplayer.getDuration());
            a.sendBroadcast(intent);
            return;
        }
    }
}
