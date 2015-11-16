// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

final class buj
    implements fsn, hhi, hjx, hka
{

    final ai a;
    buz b;
    bts c;
    bty d;
    btx e;
    private final btr f = new buk(this);
    private final Handler g = new Handler(Looper.getMainLooper());
    private Runnable h;
    private boolean i;

    buj(ai ai, hjm hjm1)
    {
        a = ai;
        hjm1.a(this);
    }

    public void E_()
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

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = (buz)hgx1.a(buz);
        c = (bts)hgx1.a(bts);
    }

    void a(jba jba)
    {
        if (jba != null && e == null && i)
        {
            h = new bum(this, jba);
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
