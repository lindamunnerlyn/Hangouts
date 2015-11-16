// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.promo.impl.PromoActivity;

final class cri
    implements fsn, gmq, hhi
{

    private ai a;

    cri(ai ai1, hjm hjm1)
    {
        a = ai1;
        hjm1.a(this);
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        ((gmo)hgx1.a(gmo)).a(this);
    }

    public void a(boolean flag, gmp gmp1, gmp gmp2, int i, int j)
    {
        if (gmp2 == gmp.c)
        {
            gmp1 = (crj)hgx.a(a, crj);
            gmp1.a(a);
            if (gmp1.a() > 0)
            {
                gmp1 = new Intent(a, com/google/android/apps/hangouts/promo/impl/PromoActivity);
                gmp1.putExtra("account_id", j);
                a.startActivity(gmp1);
            }
        }
    }
}
