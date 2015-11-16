// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cqf
    implements gqw, how, hox, hoy
{

    private static final boolean a = false;
    private boolean b;
    private cqn c[] = {
        new cqi(this), new cqm(this), new cql(this), new cqj(this)
    };
    private final Handler d = new Handler();
    private Context e;
    private int f;
    private dvi g;
    private gcz h;
    private final dhy i = new cqg(this);
    private final Runnable j = new cqh(this);

    public cqf(Context context, hof hof1)
    {
        f = -1;
        e = context;
        g = (dvi)hlp.a(context, dvi);
        hof1.a(this);
        ((gqu)hlp.a(context, gqu)).a(this);
    }

    static int a(cqf cqf1)
    {
        return cqf1.f;
    }

    static cqn[] b(cqf cqf1)
    {
        return cqf1.c;
    }

    static boolean c(cqf cqf1)
    {
        return cqf1.b;
    }

    static dvi d(cqf cqf1)
    {
        return cqf1.g;
    }

    static gcz e(cqf cqf1)
    {
        return cqf1.h;
    }

    static boolean e()
    {
        return a;
    }

    static Context f(cqf cqf1)
    {
        return cqf1.e;
    }

    static Runnable g(cqf cqf1)
    {
        return cqf1.j;
    }

    static Handler h(cqf cqf1)
    {
        return cqf1.d;
    }

    public void a(boolean flag, gqv gqv, gqv gqv1, int k, int l)
    {
        f = l;
        h = ((gdd)hlp.a(e, gdd)).a(l);
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

    public void k_()
    {
        RealTimeChatService.a(i);
        d();
    }

    public void l_()
    {
        RealTimeChatService.b(i);
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
