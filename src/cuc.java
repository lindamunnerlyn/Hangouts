// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class cuc extends cvt
{

    static final int a[] = {
        7
    };
    static final int b[] = {
        1, 2, 3, 4, 6, 8, 11, 12, 13, 15, 
        18, 20, 17
    };
    private final int r;
    private final aoa s;

    public cuc(aoa aoa1, int i, det det)
    {
        this(hio.newBuilder().a(aoa1.a()).b(aoa1.ab()).a(new hih()).a(true).a(), i, aoa1, det);
    }

    private cuc(hio hio1, int i, aoa aoa1, det det)
    {
        super(hio1, det, "contacts/getselfinfo", dmi.a, new jae(), new jaf());
        r = i;
        s = aoa1;
        boolean flag;
        if (!"SMS".equals(hio1.b()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
    }

    public cuc(hio hio1, det det)
    {
        this(hio1, 0, null, det);
    }

    protected cxr a(kws kws)
    {
        return cyw.parseFrom((jaf)kws);
    }

    public void a(int i, Exception exception)
    {
        if (m() || exception != null)
        {
            eev.d("Babel_GetSelfInfo", (new StringBuilder(47)).append("Failed to get self info. ErrorCode: ").append(i).toString(), exception);
        } else
        if (e() != null && s != null)
        {
            i = s.h();
            exception = (gqz)hlp.a(g, gqz);
            grd grd1 = exception.b(i);
            a(grd1);
            grd1.d();
            long l = ((drj)hlp.a(g, drj)).d(i);
            RealTimeChatService.b(s, l);
            RealTimeChatService.f(s);
            dcn.a(exception, i);
            return;
        }
    }

    public void a(grd grd1)
    {
        cyw cyw1 = (cyw)e();
        cfz cfz1 = cyw1.k();
        if (eev.a("Babel_GetSelfInfo", 3))
        {
            String s1 = String.valueOf(cfz1.b);
            eev.c("Babel_GetSelfInfo", (new StringBuilder(String.valueOf(s1).length() + 47)).append("processResponse for GetSelfInfo, participantId=").append(s1).toString());
        }
        for (Iterator iterator1 = cyw1.s().iterator(); iterator1.hasNext();)
        {
            Object obj = (ctv)iterator1.next();
            ctv ctv1 = dcz.a(((ctv) (obj)).b());
            if (ctv1 != null)
            {
                ctv1.a(grd1, ((ctv) (obj)));
                ctv1.a(((ctv) (obj)).c());
            } else
            {
                obj = String.valueOf(((ctv) (obj)).b());
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unknown experiment ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unknown experiment ");
                }
                eev.c("Babel_GetSelfInfo", ((String) (obj)));
            }
        }

        aoc.a(grd1, cfz1.b, cfz1.e, cfz1.m, cfz1.x, cfz1.h, cyw1.l(), cyw1.n(), cyw1.r(), cfz1.p);
        for (Iterator iterator = hlp.c(g, deu).iterator(); iterator.hasNext(); ((deu)iterator.next()).a(grd1, cyw1)) { }
        if (cyw1.o())
        {
            grd1.b("dnd_expiration", cyw1.p());
        } else
        {
            grd1.b("dnd_expiration", 0L);
        }
        if (cyw1.q() != null)
        {
            RealTimeChatService.a(grd1, cyw1.q());
        }
        grd1.b("setting_time", System.currentTimeMillis());
    }

    protected void b(kws kws)
    {
        kws = (jae)kws;
        super.b(kws);
        ctx ctx1 = (new ctx()).b(r).a();
        if (s != null)
        {
            ctx1.a(s.h());
            ctx1.a(dcn.g(s.h()));
        }
        kws.requestHeader = a(ctx1.b());
        kws.a = a;
        kws.b = b;
    }

}
