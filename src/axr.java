// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class axr
    implements fsn, hjx, hka
{

    final ave a;

    axr(ave ave1)
    {
        a = ave1;
        super();
    }

    public void E_()
    {
        ave.b(a, true);
        ave.c(a, 3);
        ave.bz(a).b();
        ave.bA(a);
        if (!a.P())
        {
            ave.bB(a);
            ave.aj(a);
        }
        ave.a(a, new axs(this));
        ave.H(a).post(ave.bv(a));
        if (ave.bC(a) != null)
        {
            ave.a(a, ave.bC(a), ave.h(a));
        }
        ave.bD(a);
    }

    public void a()
    {
        if (ave.o(a).a().a != null)
        {
            ave.H(a).removeCallbacks(ave.bv(a));
            ave.a(a, null);
            ave.H(a).removeCallbacks(ave.bw(a));
            ave.b(a, false);
            ave.bx(a);
            ave.b(a, null);
            RealTimeChatService.b();
            ave.by(a);
            if (a.F() == null)
            {
                ave.b(a, a.S());
                return;
            }
        }
    }
}
