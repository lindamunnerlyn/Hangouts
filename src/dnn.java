// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.phone.HiddenContactsActivity;

final class dnn
    implements hff
{

    final dnm a;

    dnn(dnm dnm1)
    {
        a = dnm1;
        super();
    }

    public boolean a()
    {
        ai ai1 = a.getActivity();
        ani ani1 = dnm.a(a);
        Intent intent = new Intent(g.nS, com/google/android/apps/hangouts/phone/HiddenContactsActivity);
        if (ani1 != null)
        {
            intent.putExtra("account_id", ani1.h());
        }
        ai1.startActivity(intent);
        return true;
    }
}
