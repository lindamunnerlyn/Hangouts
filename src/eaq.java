// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedList;

public final class eaq
    implements android.media.MediaPlayer.OnCompletionListener
{

    private Handler a;
    private final LinkedList b = new LinkedList();
    private Looper c;
    private String d;
    private eas e;
    private eau f;
    private final Object g = new Object();
    private MediaPlayer h;
    private android.os.PowerManager.WakeLock i;
    private AudioManager j;
    private int k;

    public eaq(String s)
    {
        a = new Handler();
        k = 2;
        d = s;
    }

    static AudioManager a(eaq eaq1, AudioManager audiomanager)
    {
        eaq1.j = audiomanager;
        return audiomanager;
    }

    static MediaPlayer a(eaq eaq1)
    {
        return eaq1.h;
    }

    static MediaPlayer a(eaq eaq1, MediaPlayer mediaplayer)
    {
        eaq1.h = mediaplayer;
        return mediaplayer;
    }

    static Looper a(eaq eaq1, Looper looper)
    {
        eaq1.c = looper;
        return looper;
    }

    static void a(eaq eaq1, eat eat1)
    {
        Object obj = eaq1.g;
        obj;
        JVM INSTR monitorenter ;
        if (eaq1.c != null && eaq1.c.getThread().getState() != Thread.State.TERMINATED)
        {
            eaq1.c.quit();
        }
        eaq1.f = new eau(eaq1, eat1);
        synchronized (eaq1.f)
        {
            eaq1.f.start();
            eaq1.f.wait();
        }
        obj;
        JVM INSTR monitorexit ;
        Exception exception1;
        long l;
        try
        {
            l = SystemClock.elapsedRealtime() - eat1.f;
        }
        catch (Exception exception)
        {
            eaq1 = eaq1.d;
            eat1 = String.valueOf(eat1.b);
            ebw.d(eaq1, (new StringBuilder(String.valueOf(eat1).length() + 24)).append("error loading sound for ").append(eat1).toString(), exception);
            return;
        }
        if (l <= 1000L)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        ebw.f(eaq1.d, (new StringBuilder(55)).append("Notification sound delayed by ").append(l).append("msecs").toString());
        return;
        exception2;
        eau1;
        JVM INSTR monitorexit ;
        throw exception2;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    private void a(eat eat1)
    {
        b.add(eat1);
        if (e == null)
        {
            if (i != null)
            {
                i.acquire();
            }
            e = new eas(this);
            e.start();
        }
    }

    static String b(eaq eaq1)
    {
        return eaq1.d;
    }

    static void b(eaq eaq1, eat eat1)
    {
        if (eaq1.h != null)
        {
            long l = SystemClock.elapsedRealtime() - eat1.f;
            if (l > 1000L)
            {
                ebw.f(eaq1.d, (new StringBuilder(54)).append("Notification stop delayed by ").append(l).append("msecs").toString());
            }
            eaq1.h.stop();
            eaq1.h.release();
            eaq1.h = null;
            if (eaq1.j != null)
            {
                if (eat1.g)
                {
                    eaq1.a.postDelayed(new ear(eaq1), 3000L);
                } else
                {
                    eaq1.j.abandonAudioFocus(null);
                    eaq1.j = null;
                }
            }
            if (eaq1.c != null && eaq1.c.getThread().getState() != Thread.State.TERMINATED)
            {
                eaq1.c.quit();
            }
        }
    }

    static AudioManager c(eaq eaq1)
    {
        return eaq1.j;
    }

    static LinkedList d(eaq eaq1)
    {
        return eaq1.b;
    }

    static eas e(eaq eaq1)
    {
        eaq1.e = null;
        return null;
    }

    static void f(eaq eaq1)
    {
        if (eaq1.i != null)
        {
            eaq1.i.release();
        }
    }

    public void a(Uri uri)
    {
        eat eat1 = new eat();
        eat1.f = SystemClock.elapsedRealtime();
        eat1.a = 1;
        eat1.b = uri;
        eat1.c = true;
        eat1.d = 2;
        eat1.e = 1.0F;
        synchronized (b)
        {
            a(eat1);
            k = 1;
        }
        return;
        exception;
        uri;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(boolean flag)
    {
        synchronized (b)
        {
            if (k != 2)
            {
                eat eat1 = new eat();
                eat1.f = SystemClock.elapsedRealtime();
                eat1.a = 2;
                eat1.g = flag;
                a(eat1);
                k = 2;
            }
        }
        return;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (j != null)
        {
            j.abandonAudioFocus(null);
        }
        mediaplayer = b;
        mediaplayer;
        JVM INSTR monitorenter ;
        if (b.size() == 0)
        {
            synchronized (g)
            {
                if (c != null)
                {
                    c.quit();
                }
                f = null;
            }
        }
        mediaplayer;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        mediaplayer;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
