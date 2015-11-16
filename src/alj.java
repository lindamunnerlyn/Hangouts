// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.hangouts.callmemaybe.NewPlusAccountService;

public class alj
    implements hcb
{

    private final Context a;
    private final gqz b;

    public alj(Context context, hlp hlp1)
    {
        a = context;
        b = (gqz)hlp1.a(gqz);
    }

    public void a(int i)
    {
        if (b.c(i))
        {
            grb grb1 = b.a(i);
            int j = grb1.a("PAGE_NOTIFICATION_COUNT", 0);
            if (grb1.b("effective_gaia_id") != null && grb1.d("is_business_features_eligible") && !grb1.d("business_features_promo_shown") && j < 3)
            {
                alk.a(a, i);
                j++;
                b.b(i).c("PAGE_NOTIFICATION_COUNT", j).d();
                if (j < 3)
                {
                    Object obj = dcn.e(i);
                    Context context = g.nU;
                    Intent intent = new Intent(context, com/google/android/apps/hangouts/callmemaybe/NewPlusAccountService);
                    intent.putExtra("account_id", ((aoa) (obj)).h());
                    obj = PendingIntent.getService(context, 0, intent, 0);
                    ((AlarmManager)context.getSystemService("alarm")).set(1, 0x240c8400L, ((PendingIntent) (obj)));
                    return;
                }
            }
        }
    }
}
