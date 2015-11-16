// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

final class caw
    implements Runnable
{

    final cbh a;
    final cav b;

    caw(cav cav1, cbh cbh1)
    {
        b = cav1;
        a = cbh1;
        super();
    }

    public void run()
    {
        a.a(b.a.getActivity());
    }
}
