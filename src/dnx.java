// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Intent;
import com.google.android.apps.hangouts.phone.GooglePlusUpgradeActivity;

final class dnx
    implements hff
{

    final dnu a;

    dnx(dnu dnu1)
    {
        a = dnu1;
        super();
    }

    public boolean a()
    {
        if (dnu.a(a).k())
        {
            a.b().show();
        } else
        {
            ani ani1 = dnu.a(a);
            Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/GooglePlusUpgradeActivity);
            intent.putExtra("g_plus_upgrade_type", "g_plus_upgrade_photo");
            if (ani1 != null)
            {
                intent.putExtra("account_id", ani1.h());
            }
            a.startActivity(intent);
        }
        return true;
    }
}
