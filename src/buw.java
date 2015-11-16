// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

final class buw
    implements hma, hor, hou, hoy
{

    final ai a;
    bvm b;
    buf c;
    bul d;
    buk e;
    private final bue f = new bux(this);
    private final Handler g = new Handler(Looper.getMainLooper());
    private Runnable h;
    private boolean i;

    buw(ai ai, hof hof1)
    {
        a = ai;
        hof1.a(this);
    }

    public void G_()
    {
        i = true;
        c.a(f);
        if (c.a() != null)
        {
            a(c.a());
        }
    }

    public void a()
    {
        i = false;
        c.b(f);
        c();
        if (e != null)
        {
            e.b();
            e = null;
        }
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        b = (bvm)hlp1.a(bvm);
        c = (buf)hlp1.a(buf);
    }

    void a(jhh jhh)
    {
        if (jhh != null && e == null && i)
        {
            h = new buz(this, jhh);
            g.postDelayed(h, 1000L);
        }
    }

    void c()
    {
        if (h != null)
        {
            g.removeCallbacks(h);
            h = null;
        }
        if (d != null)
        {
            d.b();
            d = null;
        }
    }
}
