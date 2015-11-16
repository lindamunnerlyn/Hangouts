// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.WindowInsets;
import com.google.android.apps.hangouts.navigation.NavigationDrawerFragment;

public final class cat
    implements android.view.View.OnApplyWindowInsetsListener
{

    final NavigationDrawerFragment a;

    public cat(NavigationDrawerFragment navigationdrawerfragment)
    {
        a = navigationdrawerfragment;
        super();
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
    {
        return windowinsets;
    }
}
