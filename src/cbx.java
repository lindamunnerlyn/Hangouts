// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cbx
    implements eni
{

    final NavigationDrawerFragment a;

    public cbx(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public void a(enh enh)
    {
        enh = (fox)enh;
        if (a.getActivity() != null)
        {
            NavigationDrawerFragment.a(a, enh.c());
        }
    }
}
