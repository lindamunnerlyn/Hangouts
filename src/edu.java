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

public final class edu
    implements android.media.MediaPlayer.OnCompletionListener
{

    Handler a;
    final LinkedList b = new LinkedList();
    Looper c;
    String d;
    edw e;
    edy f;
    final Object g = new Object();
    MediaPlayer h;
    android.os.PowerManager.WakeLock i;
    AudioManager j;
    private int k;

    public edu(String s)
    {
        a = new Handler();
        k = 2;
        d = s;
    }

    private void a(edx edx1)
    {
        b.add(edx1);
        if (e == null)
        {
            if (i != null)
            {
                i.acquire();
            }
            e = new edw(this);
            e.start();
        }
    }

    public void a(Uri uri)
    {
        edx edx1 = new edx();
        edx1.f = SystemClock.elapsedRealtime();
        edx1.a = 1;
        edx1.b = uri;
        edx1.c = true;
        edx1.d = 2;
        edx1.e = 1.0F;
        synchronized (b)
        {
            a(edx1);
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
                edx edx1 = new edx();
                edx1.f = SystemClock.elapsedRealtime();
                edx1.a = 2;
                edx1.g = flag;
                a(edx1);
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
