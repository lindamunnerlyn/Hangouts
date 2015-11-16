// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

final class cct extends cen
{

    private final String x;

    cct(Context context, int j, ccy ccy, int k)
    {
        super(context, j, ccy, false, false);
        x = String.format(Locale.US, "%02d", new Object[] {
            Integer.valueOf(k)
        });
    }

    protected boolean c()
    {
        return false;
    }

    protected void h()
    {
        t.b(Integer.toString(p)).c(x);
        super.h();
    }

    protected void i()
    {
        if (ccx.b(o))
        {
            g.a(dbf.e(p), 1929);
        }
    }
}
