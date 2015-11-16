// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public abstract class bgs
    implements bgq
{

    public int a;
    public bgr b;
    final Object c = new Object();
    private final Handler d = new Handler();
    private final dhy e = new bgt(this);
    private final Runnable f = new bgu(this);

    public bgs()
    {
        a = -1;
        b = null;
    }

    public static boolean j()
    {
        ConnectivityManager connectivitymanager = (ConnectivityManager)g.nU.getSystemService("connectivity");
        return connectivitymanager != null && connectivitymanager.getActiveNetworkInfo() != null && connectivitymanager.getActiveNetworkInfo().isConnected();
    }

    public void a(bgr bgr1)
    {
        b = bgr1;
    }

    public void a(did did)
    {
        RealTimeChatService.b(e);
        d.removeCallbacks(f);
        if (b != null)
        {
            b.a(this);
        }
    }

    public void a(Exception exception)
    {
        RealTimeChatService.b(e);
        d.removeCallbacks(f);
        if (b != null)
        {
            b.b(this);
        }
    }

    public abstract int b();

    public void c()
    {
    }

    public void d()
    {
    }

    public abstract Class e();

    public abstract Class f();

    public void g()
    {
        RealTimeChatService.a(e);
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        a = b();
        if (a >= 0) goto _L2; else goto _L1
_L1:
        a(new bgw());
        eev.g("Babel", String.valueOf(getClass().getName()).concat(" failed to start!"));
_L4:
        return;
_L2:
        if (i() > 0)
        {
            d.postDelayed(f, i());
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        RealTimeChatService.b(e);
        a = -1;
        d.removeCallbacks(f);
    }

    public int i()
    {
        return -1;
    }
}
