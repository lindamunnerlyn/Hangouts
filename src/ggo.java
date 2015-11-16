// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.CallService;
import java.io.IOException;

final class ggo
    implements gds, Runnable
{

    final ggn a;
    private final gji b;
    private final jjt c;
    private String d;

    ggo(ggn ggn1, gji gji1, jjt jjt1)
    {
        a = ggn1;
        super();
        b = gji1;
        c = jjt1;
    }

    public void a(kws kws)
    {
        gne.a(4, "vclib", "LogData upload succeeded.");
        b.b(a.a, d);
    }

    public void b(kws kws)
    {
        kws = String.valueOf((jiy)kws);
        gne.a(5, "vclib", (new StringBuilder(String.valueOf(kws).length() + 23)).append("LogData upload failed!\n").append(kws).toString());
        b.b(a.a, d);
    }

    public void run()
    {
        gne.a(4, "vclib", "Beginning LogData upload.");
        d = b.a(a.a, "oauth2:https://www.googleapis.com/auth/hangouts ");
        Object obj = new ixb();
        obj.a = Integer.valueOf(1);
        obj.d = Long.valueOf(CallService.a(a.a));
        Object obj2 = new iwy();
        obj = a.a(d, ((ixb) (obj)), ((iwy) (obj2)));
        obj2 = new jix();
        if (c.f != null)
        {
            obj2.a = c.f.a;
        }
        obj2.b = c;
        ((jix) (obj2)).b.u = Long.valueOf(System.currentTimeMillis());
        ((gjl) (obj)).a("media_sessions/log", ((kws) (obj2)), jiy, this, 60000, 5);
        return;
        Object obj1;
        obj1;
_L2:
        gne.a("vclib", "LogData upload failed to get credentials for user", ((Throwable) (obj1)));
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
