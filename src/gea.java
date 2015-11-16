// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.CallService;
import java.io.IOException;

final class gea
    implements gbe, Runnable
{

    final gdz a;
    private final ggi b;
    private final String c;
    private final jdh d;
    private String e;

    gea(gdz gdz1, ggi ggi1, String s, jdh jdh1)
    {
        a = gdz1;
        super();
        b = ggi1;
        c = s;
        d = jdh1;
    }

    public void a(kop kop)
    {
        gkc.c("vclib", "LogData upload succeeded.");
        b.b(a.a, e);
    }

    public void b(kop kop)
    {
        kop = String.valueOf((jco)kop);
        gkc.d("vclib", (new StringBuilder(String.valueOf(kop).length() + 23)).append("LogData upload failed!\n").append(kop).toString());
        b.b(a.a, e);
    }

    public void run()
    {
        gkc.c("vclib", "Beginning LogData upload.");
        e = b.a(a.a, "oauth2:https://www.googleapis.com/auth/hangouts ");
        Object obj = new iqw();
        obj.a = Integer.valueOf(1);
        obj.d = Long.valueOf(CallService.a(a.a));
        Object obj2 = new iqt();
        obj = a.a(e, ((iqw) (obj)), ((iqt) (obj2)));
        obj2 = new jcn();
        obj2.a = c;
        obj2.b = d;
        ((jcn) (obj2)).b.u = Long.valueOf(System.currentTimeMillis());
        ((ggl) (obj)).a("media_sessions/log", ((kop) (obj2)), jco, this, 60000, 5);
        return;
        Object obj1;
        obj1;
_L2:
        gkc.b("vclib", "LogData upload failed to get credentials for user", ((Throwable) (obj1)));
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
