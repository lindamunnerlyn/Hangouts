// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cbu
    implements Runnable
{

    final ftl a;
    final NavigationDrawerFragment b;

    public cbu(NavigationDrawerFragment navigationdrawerfragment, ftl ftl1)
    {
        b = navigationdrawerfragment;
        a = ftl1;
        super();
    }

    public void run()
    {
        NavigationDrawerFragment.a(b).a(a.a(), a.e());
    }
}
