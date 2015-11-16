// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Locale;

final class cdy extends cfs
{

    private final String x;

    cdy(Context context, int j, ced ced, int k)
    {
        super(context, j, ced, false, false);
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
        if (cec.b(o))
        {
            g.a(dcn.e(p), 1929);
        }
    }
}
