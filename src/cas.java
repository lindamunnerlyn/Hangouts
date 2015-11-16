// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cas
    implements ekh
{

    final NavigationDrawerFragment a;

    public cas(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public void a(ekg ekg)
    {
        ekg = (fmd)ekg;
        if (a.getActivity() != null)
        {
            NavigationDrawerFragment.a(a, ekg.c());
        }
    }
}
