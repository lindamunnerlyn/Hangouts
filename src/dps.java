// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;

final class dps
    implements hff
{

    final dpo a;

    dps(dpo dpo1)
    {
        a = dpo1;
        super();
    }

    public boolean a()
    {
        try
        {
            ai ai1 = a.getActivity();
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setComponent(new ComponentName("com.android.cellbroadcastreceiver", "com.android.cellbroadcastreceiver.CellBroadcastListActivity"));
            intent.setFlags(0x10000000);
            ai1.startActivity(intent);
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            ebw.e("Babel", "Could not set wireless alert prefs", activitynotfoundexception);
        }
        return true;
    }
}
