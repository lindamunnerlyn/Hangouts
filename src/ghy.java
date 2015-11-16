// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;

final class ghy
    implements gbe
{

    final ghx a;

    ghy(ghx ghx1)
    {
        a = ghx1;
        super();
    }

    public void a(kop kop)
    {
        kop = (jbo)kop;
        if (ghx.a(a))
        {
            gkc.c("vclib", "Resolve flow canceled, ignoring success (%s)", new Object[] {
                kop
            });
            return;
        }
        if (!TextUtils.isEmpty(((jbo) (kop)).a))
        {
            gkc.c("vclib", "Successfully resolved hangout (%s)", new Object[] {
                kop
            });
            ghx.b(a).a(kop);
            return;
        } else
        {
            gkc.e("vclib", "Hangout ID missing in successful resolve response (%s)", new Object[] {
                kop
            });
            gbh.a("Hangout ID missing in successful resolve response");
            ghx.b(a).b(kop);
            return;
        }
    }

    public void b(kop kop)
    {
        kop = (jbo)kop;
        if (ghx.a(a))
        {
            gkc.d("vclib", "Resolve flow canceled, ignoring error (%s)", new Object[] {
                kop
            });
            return;
        }
        if (kop == null || g.a(((jbo) (kop)).b, -1) != 1)
        {
            gkc.e("vclib", "Resolve flow failed (%s)", new Object[] {
                kop
            });
            ghx.b(a).b(kop);
            return;
        }
        if (!ghx.b(ghx.c(a)))
        {
            gkc.e("vclib", "Resolve flow failed (%s)", new Object[] {
                kop
            });
            ghx.b(a).b(kop);
            return;
        }
        if (ghx.d(a) < 0L)
        {
            ghx.a(a, SystemClock.elapsedRealtime() + 30000L);
        }
        if (SystemClock.elapsedRealtime() >= ghx.d(a))
        {
            gkc.e("vclib", "Knocking resolve flow timed out");
            ghx.b(a).b(kop);
            return;
        } else
        {
            ghx.e(a).postDelayed(a, 5000L);
            return;
        }
    }
}
