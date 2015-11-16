// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public class cvs extends cvt
{

    private final int a;

    protected cvs(aoa aoa1, int i, cwx cwx1, dmi dmi1, String s)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(new hih()).a(true).a(), cwx1, cwx1.f(), dmi1, (jds)cwx1.a(s, i, aoa1.h()), new jdt());
        a = aoa1.h();
    }

    public cvs(aoa aoa1, int i, cwx cwx1, String s)
    {
        super(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(new hih()).a(true).a(), cwx1, cwx1.f(), dmi.a, (jds)cwx1.a(s, i, aoa1.h()), new jdt());
        a = aoa1.h();
    }

    private void a(cwx cwx1, long l, int i)
    {
        cwx1 = (new cab()).a(cwx1.c).b(cwx1.j).d(super.o.c());
        h.a(a, l, i, cwx1);
    }

    protected cxr a(jdt jdt1)
    {
        return czx.parseFrom(jdt1);
    }

    protected volatile cxr a(kws kws)
    {
        return a((jdt)kws);
    }

    public void a(int i, Exception exception)
    {
        exception = e();
        if (exception != null)
        {
            cwx cwx1 = (cwx)super.e;
            a(cwx1, SystemClock.elapsedRealtime(), 12);
            RealTimeChatService.a(a, exception);
            exception = cwx1.e();
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
                eev.b("Babel_Stress", exception);
                return;
            }
        }
    }

    protected void d()
    {
        super.d();
        a((cwx)super.e, SystemClock.elapsedRealtime(), 2);
    }
}
