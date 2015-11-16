// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;
import com.google.android.gms.people.accountswitcherview.SelectedAccountNavigationView;

final class ccc
    implements Runnable
{

    final int a;
    final ftl b;
    final cca c;

    ccc(cca cca1, int i, ftl ftl1)
    {
        c = cca1;
        a = i;
        b = ftl1;
        super();
    }

    public void run()
    {
        a;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 47
    //                   1 97
    //                   2 148;
           goto _L1 _L2 _L3 _L4
_L1:
        NavigationDrawerFragment.f(c.a).b(0);
        return;
_L2:
        NavigationDrawerFragment.a(c.a, b);
        NavigationDrawerFragment.a(c.a).a(b.a(), b.e());
        continue; /* Loop/switch isn't completed */
_L3:
        Intent intent = (new hbh(NavigationDrawerFragment.i(c.a))).a((new hbo()).a(hba)).a();
        c.a.startActivityForResult(intent, 1);
        continue; /* Loop/switch isn't completed */
_L4:
        Intent intent1 = new Intent("android.settings.SYNC_SETTINGS");
        intent1.putExtra("authorities", new String[] {
            "gmail-ls", "com.google.android.gm.email.provider"
        });
        c.a.startActivity(intent1);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
