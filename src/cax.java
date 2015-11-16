// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

final class cax
    implements Runnable
{

    final int a;
    final fqu b;
    final cav c;

    cax(cav cav1, int i, fqu fqu1)
    {
        c = cav1;
        a = i;
        b = fqu1;
        super();
    }

    public void run()
    {
        a;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 47
    //                   1 97
    //                   2 119;
           goto _L1 _L2 _L3 _L4
_L1:
        NavigationDrawerFragment.f(c.a).b(0);
        return;
_L2:
        NavigationDrawerFragment.a(c.a, b);
        NavigationDrawerFragment.a(c.a).a(b.a(), b.e());
        continue; /* Loop/switch isn't completed */
_L3:
        c.a.startActivity(new Intent("android.settings.ADD_ACCOUNT_SETTINGS"));
        continue; /* Loop/switch isn't completed */
_L4:
        c.a.startActivity(new Intent("android.settings.SYNC_SETTINGS"));
        if (true) goto _L1; else goto _L5
_L5:
    }
}
