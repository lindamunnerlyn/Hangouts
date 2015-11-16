// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.ArrayList;
import java.util.Iterator;

public final class frk extends ena
{

    private final String e;
    private final frj f;
    private final frg g = new frg();
    private final Object h = new Object();
    private boolean i;

    public frk(Context context, Looper looper, frj frj1, emo emo)
    {
        super(context, looper, 24, emo, frj1, frj1);
        e = context.getPackageName();
        f = (frj)h.a(frj1);
        f.a(this);
        i = true;
    }

    private void b(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        g.a(playloggercontext, logevent);
    }

    private void p()
    {
        boolean flag;
        if (!i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            throw new IllegalStateException();
        }
        if (g.c()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = g.a().iterator();
        Object obj = null;
_L5:
        frh frh1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_203;
        }
        frh1 = (frh)iterator.next();
        if (frh1.c == null) goto _L4; else goto _L3
_L3:
        ((frd)n()).a(e, frh1.a, fdo.a(frh1.c));
          goto _L5
        obj;
        Log.e("PlayLoggerImpl", "Couldn't send cached log events to AndroidLog service.  Retaining in memory cache.");
_L2:
        return;
_L4:
label0:
        {
            if (!frh1.a.equals(obj))
            {
                break label0;
            }
            arraylist.add(frh1.b);
        }
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((frd)n()).a(e, ((PlayLoggerContext) (obj)), arraylist);
            arraylist.clear();
        }
        obj = frh1.a;
        arraylist.add(frh1.b);
          goto _L5
        if (!arraylist.isEmpty())
        {
            ((frd)n()).a(e, ((PlayLoggerContext) (obj)), arraylist);
        }
        g.b();
        return;
    }

    protected IInterface a(IBinder ibinder)
    {
        return fre.a(ibinder);
    }

    protected String a()
    {
        return "com.google.android.gms.playlog.service.START";
    }

    public void a(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        if (!i) goto _L2; else goto _L1
_L1:
        b(playloggercontext, logevent);
_L3:
        return;
_L2:
        p();
        ((frd)n()).a(e, playloggercontext, logevent);
          goto _L3
        Object obj1;
        obj1;
        Log.e("PlayLoggerImpl", "Couldn't send log event.  Will try caching.");
        b(playloggercontext, logevent);
          goto _L3
        playloggercontext;
        obj;
        JVM INSTR monitorexit ;
        throw playloggercontext;
        obj1;
        Log.e("PlayLoggerImpl", "Service was disconnected.  Will try caching.");
        b(playloggercontext, logevent);
          goto _L3
    }

    void a(boolean flag)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        boolean flag1;
        flag1 = i;
        i = flag;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (!i)
        {
            p();
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String b()
    {
        return "com.google.android.gms.playlog.internal.IPlayLogService";
    }

    public void o()
    {
label0:
        {
            synchronized (h)
            {
                if (!i() && !d())
                {
                    break label0;
                }
            }
            return;
        }
        f.a();
        h();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
