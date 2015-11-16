// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;

final class gla
    implements gds
{

    final gkz a;

    gla(gkz gkz1)
    {
        a = gkz1;
        super();
    }

    public void a(kws kws)
    {
        kws = (jhx)kws;
        if (a.e)
        {
            gne.a("vclib", "Resolve flow canceled, ignoring success (%s)", new Object[] {
                kws
            });
            return;
        }
        if (!TextUtils.isEmpty(((jhx) (kws)).a))
        {
            gne.a("vclib", "Successfully resolved hangout (%s)", new Object[] {
                kws
            });
            a.b.a(kws);
            return;
        } else
        {
            gne.c("vclib", "Hangout ID missing in successful resolve response (%s)", new Object[] {
                kws
            });
            gdv.a("Hangout ID missing in successful resolve response");
            a.b.b(kws);
            return;
        }
    }

    public void b(kws kws)
    {
        kws = (jhx)kws;
        if (a.e)
        {
            gne.b("vclib", "Resolve flow canceled, ignoring error (%s)", new Object[] {
                kws
            });
            return;
        }
        if (kws == null || g.a(((jhx) (kws)).b, -1) != 1)
        {
            gne.c("vclib", "Resolve flow failed (%s)", new Object[] {
                kws
            });
            a.b.b(kws);
            return;
        }
        if (!gkz.b(a.a))
        {
            gne.c("vclib", "Resolve flow failed (%s)", new Object[] {
                kws
            });
            a.b.b(kws);
            return;
        }
        if (a.d < 0L)
        {
            a.d = SystemClock.elapsedRealtime() + 30000L;
        }
        if (SystemClock.elapsedRealtime() >= a.d)
        {
            gne.a(6, "vclib", "Knocking resolve flow timed out");
            a.b.b(kws);
            return;
        } else
        {
            a.c.postDelayed(a, 5000L);
            return;
        }
    }
}
