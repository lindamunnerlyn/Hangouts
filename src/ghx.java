// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.RemoteRenderer;
import com.google.android.libraries.hangouts.video.VideoViewRequest;
import java.util.concurrent.atomic.AtomicInteger;

final class ghx
    implements Runnable
{

    final ghu a;

    ghx(ghu ghu1)
    {
        a = ghu1;
        super();
    }

    public void run()
    {
        Object obj = a.r.d();
        if (a.c == 0)
        {
            gne.a(4, "vclib", "No ssrc for renderer; not sending ViewRequest");
            return;
        }
        int i;
        int j;
        int k;
        if (((gkq) (obj)).o() || ((gkq) (obj)).p() || a.p.get() == 0)
        {
            String s = String.valueOf(a.r.a());
            boolean flag = ((gkq) (obj)).o();
            boolean flag1 = ((gkq) (obj)).p();
            i = a.p.get();
            gne.a(4, "vclib", (new StringBuilder(String.valueOf(s).length() + 74)).append("No view request for ").append(s).append(" muted=").append(flag).append(", blocked=").append(flag1).append(", rendererCount=").append(i).toString());
            k = 0;
            j = 0;
            i = 0;
        } else
        {
            giq giq1;
            if (a.d)
            {
                giq1 = giq.a(a.b.f());
            } else
            {
                giq1 = giq.b(a.b.f());
            }
            j = giq1.c().a;
            k = giq1.e();
            i = j;
        }
        obj = new VideoViewRequest(a.c, a.b, i, j, k);
        gne.a(3, "vclib", "Sending view request %s", new Object[] {
            obj
        });
        a.a.a(new VideoViewRequest[] {
            obj
        });
    }
}
