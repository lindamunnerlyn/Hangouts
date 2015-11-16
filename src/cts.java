// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.promo.impl.PromoActivity;

final class cts
    implements gqw, hma, hoy
{

    private ai a;

    cts(ai ai1, hof hof1)
    {
        a = ai1;
        hof1.a(this);
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        ((gqu)hlp1.a(gqu)).a(this);
    }

    public void a(boolean flag, gqv gqv1, gqv gqv2, int i, int j)
    {
        if (gqv2 == gqv.c)
        {
            gqv1 = (ctt)hlp.a(a, ctt);
            gqv1.a(a);
            if (gqv1.a() > 0)
            {
                gqv1 = new Intent(a, com/google/android/apps/hangouts/promo/impl/PromoActivity);
                gqv1.putExtra("account_id", j);
                a.startActivity(gqv1);
            }
        }
    }
}
