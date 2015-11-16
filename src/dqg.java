// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.HiddenContactsActivity;

final class dqg
    implements hjw
{

    final dqf a;

    dqg(dqf dqf1)
    {
        a = dqf1;
        super();
    }

    public boolean a()
    {
        ai ai1 = a.getActivity();
        aoa aoa1 = dqf.a(a);
        Intent intent = new Intent(g.nU, com/google/android/apps/hangouts/phone/HiddenContactsActivity);
        if (aoa1 != null)
        {
            intent.putExtra("account_id", aoa1.h());
        }
        ai1.startActivity(intent);
        return true;
    }
}
