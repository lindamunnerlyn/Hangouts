// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.LinkedList;

final class edw extends Thread
{

    final edu a;

    edw(edu edu1)
    {
        a = edu1;
        edu1 = String.valueOf(edu1.d);
        if (edu1.length() != 0)
        {
            edu1 = "NotificationPlayer-".concat(edu1);
        } else
        {
            edu1 = new String("NotificationPlayer-");
        }
        super(edu1);
    }

    public void run()
    {
_L6:
        synchronized (a.b)
        {
            obj = (edx)a.b.removeFirst();
        }
        ((edx) (obj)).a;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 110
    //                   2 315;
           goto _L1 _L2 _L3
_L1:
        synchronized (a.b)
        {
            if (a.b.size() != 0)
            {
                break; /* Loop/switch isn't completed */
            }
            a.e = null;
            obj1 = a;
            if (((edu) (obj1)).i != null)
            {
                ((edu) (obj1)).i.release();
            }
        }
        return;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
_L2:
        Object obj2 = a;
        Object obj3 = ((edu) (obj2)).g;
        obj3;
        JVM INSTR monitorenter ;
        if (((edu) (obj2)).c != null && ((edu) (obj2)).c.getThread().getState() != Thread.State.TERMINATED)
        {
            ((edu) (obj2)).c.quit();
        }
        obj2.f = new edy(((edu) (obj2)), ((edx) (obj)));
        synchronized (((edu) (obj2)).f)
        {
            ((edu) (obj2)).f.start();
            ((edu) (obj2)).f.wait();
        }
        obj3;
        JVM INSTR monitorexit ;
        long l = SystemClock.elapsedRealtime() - ((edx) (obj)).f;
        if (l > 1000L)
        {
            try
            {
                eev.f(((edu) (obj2)).d, (new StringBuilder(55)).append("Notification sound delayed by ").append(l).append("msecs").toString());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj3)
            {
                obj2 = ((edu) (obj2)).d;
                obj = String.valueOf(((edx) (obj)).b);
                eev.d(((String) (obj2)), (new StringBuilder(String.valueOf(obj).length() + 24)).append("error loading sound for ").append(((String) (obj))).toString(), ((Throwable) (obj3)));
            }
        }
        continue; /* Loop/switch isn't completed */
        exception2;
        edy1;
        JVM INSTR monitorexit ;
        throw exception2;
        Exception exception1;
        exception1;
        obj3;
        JVM INSTR monitorexit ;
        throw exception1;
_L3:
        edu edu1 = a;
        if (edu1.h != null)
        {
            long l1 = SystemClock.elapsedRealtime() - ((edx) (obj)).f;
            if (l1 > 1000L)
            {
                eev.f(edu1.d, (new StringBuilder(54)).append("Notification stop delayed by ").append(l1).append("msecs").toString());
            }
            edu1.h.stop();
            edu1.h.release();
            edu1.h = null;
            if (edu1.j != null)
            {
                if (((edx) (obj)).g)
                {
                    edu1.a.postDelayed(new edv(edu1), 3000L);
                } else
                {
                    edu1.j.abandonAudioFocus(null);
                    edu1.j = null;
                }
            }
            if (edu1.c != null && edu1.c.getThread().getState() != Thread.State.TERMINATED)
            {
                edu1.c.quit();
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj;
        JVM INSTR monitorexit ;
        if (true) goto _L6; else goto _L5
_L5:
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
