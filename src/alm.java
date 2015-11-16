// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.apps.hangouts.callmemaybe.NewPlusAccountService;

public class alm
    implements gxq
{

    private final Context a;
    private final gms b;

    public alm(Context context, hgx hgx1)
    {
        a = context;
        b = (gms)hgx1.a(gms);
    }

    public void a(int i)
    {
        if (b.c(i))
        {
            gmu gmu1 = b.a(i);
            int j = gmu1.a("PAGE_NOTIFICATION_COUNT", 0);
            if (gmu1.b("effective_gaia_id") != null && gmu1.d("is_business_features_eligible") && !gmu1.d("business_features_promo_shown") && j < 3)
            {
                aln.a(a, i);
                j++;
                b.b(i).c("PAGE_NOTIFICATION_COUNT", j).d();
                if (j < 3)
                {
                    NewPlusAccountService.a(dbf.e(i));
                    return;
                }
            }
        }
    }
}
