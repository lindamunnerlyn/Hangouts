// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

final class ccb
    implements Runnable
{

    final ccm a;
    final cca b;

    ccb(cca cca1, ccm ccm1)
    {
        b = cca1;
        a = ccm1;
        super();
    }

    public void run()
    {
        a.a(b.a.getActivity());
    }
}
