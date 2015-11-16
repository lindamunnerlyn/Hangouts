// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cto extends ctp
{

    private final int a;

    public cto(ani ani1, int i, cut cut1, String s)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a(new hdq()).a().b(), cut1, cut1.g(), "hangouts", (ixn)cut1.a(s, i, ani1.h()), new ixo());
        a = ani1.h();
    }

    protected cto(ani ani1, int i, cut cut1, String s, String s1)
    {
        super(hdx.newBuilder().a(ani1.a()).b(ani1.ae()).a(new hdq()).a().b(), cut1, cut1.g(), s, (ixn)cut1.a(s1, i, ani1.h()), new ixo());
        a = ani1.h();
    }

    private void a(cut cut1, long l, int i)
    {
        cut1 = (new byy()).a(cut1.c).b(cut1.j).d(super.o.c());
        h.a(a, l, i, cut1);
    }

    protected cvn a(ixo ixo1)
    {
        return cxt.parseFrom(ixo1);
    }

    protected volatile cvn a(kop kop)
    {
        return a((ixo)kop);
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception != null)
        {
            cut cut1 = (cut)super.e;
            a(cut1, SystemClock.elapsedRealtime(), 12);
            RealTimeChatService.a(a, exception);
            exception = cut1.e();
            if (exception != null)
            {
                exception = String.valueOf(exception);
                if (exception.length() != 0)
                {
                    exception = "Sending stress message succeeded:".concat(exception);
                } else
                {
                    exception = new String("Sending stress message succeeded:");
                }
                ebw.b("Babel_Stress", exception);
                return;
            }
        }
    }

    protected void d()
    {
        super.d();
        a((cut)super.e, SystemClock.elapsedRealtime(), 2);
    }
}
