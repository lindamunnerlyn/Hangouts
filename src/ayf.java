// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class ayf
    implements hor, hou, hoy
{

    final avv a;

    ayf(avv avv1)
    {
        a = avv1;
        super();
    }

    public void G_()
    {
        avv.b(a, true);
        avv.b(a, 3);
        avv.bv(a).b();
        avv.bw(a);
        if (!a.P())
        {
            avv.bx(a);
            avv.ak(a);
        }
        avv.a(a, new ayg(this));
        avv.G(a).post(avv.br(a));
        if (avv.by(a) != null)
        {
            avv.a(a, avv.by(a), avv.h(a));
        }
        avv.bz(a);
    }

    public void a()
    {
        if (avv.m(a).a().a != null)
        {
            avv.G(a).removeCallbacks(avv.br(a));
            avv.a(a, null);
            avv.G(a).removeCallbacks(avv.bs(a));
            avv.b(a, false);
            avv.bt(a);
            avv.b(a, null);
            RealTimeChatService.b();
            avv.bu(a);
            if (a.G() == null)
            {
                avv.b(a, a.S());
                return;
            }
        }
    }
}
