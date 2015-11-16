// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cap
    implements Runnable
{

    final fqu a;
    final NavigationDrawerFragment b;

    public cap(NavigationDrawerFragment navigationdrawerfragment, fqu fqu1)
    {
        b = navigationdrawerfragment;
        a = fqu1;
        super();
    }

    public void run()
    {
        NavigationDrawerFragment.a(b).a(a.a(), a.e());
    }
}
