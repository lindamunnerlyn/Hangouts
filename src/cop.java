// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cop
    implements fsn, gmq, hkc, hkd
{

    private static final boolean a = false;
    private boolean b;
    private cox c[] = {
        new cos(this), new cow(this), new cov(this), new cot(this)
    };
    private final Handler d = new Handler();
    private Context e;
    private int f;
    private dsp g;
    private gal h;
    private final dgp i = new coq(this);
    private final Runnable j = new cor(this);

    public cop(Context context, hjm hjm1)
    {
        f = -1;
        e = context;
        g = (dsp)hgx.a(context, dsp);
        hjm1.a(this);
        ((gmo)hgx.a(context, gmo)).a(this);
    }

    static int a(cop cop1)
    {
        return cop1.f;
    }

    static cox[] b(cop cop1)
    {
        return cop1.c;
    }

    static boolean c(cop cop1)
    {
        return cop1.b;
    }

    static dsp d(cop cop1)
    {
        return cop1.g;
    }

    static gal e(cop cop1)
    {
        return cop1.h;
    }

    static boolean e()
    {
        return a;
    }

    static Context f(cop cop1)
    {
        return cop1.e;
    }

    static Runnable g(cop cop1)
    {
        return cop1.j;
    }

    static Handler h(cop cop1)
    {
        return cop1.d;
    }

    public void a(boolean flag, gmp gmp, gmp gmp1, int k, int l)
    {
        f = l;
        h = ((gap)hgx.a(e, gap)).a(l);
        d();
    }

    public void c()
    {
        b = true;
        d();
    }

    public void d()
    {
        j.run();
    }

    public void j_()
    {
        RealTimeChatService.a(i);
        d();
    }

    public void k_()
    {
        RealTimeChatService.b(i);
    }

    static 
    {
        hik hik = ebw.e;
    }
}
