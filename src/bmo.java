// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

public final class bmo
    implements Runnable
{

    final DialpadKeyButton a;

    public bmo(DialpadKeyButton dialpadkeybutton)
    {
        a = dialpadkeybutton;
        super();
    }

    public void run()
    {
        DialpadKeyButton.d(a);
        DialpadKeyButton.a(a, DialpadKeyButton.e(a));
        ebr.a(a, DialpadKeyButton.f(a), DialpadKeyButton.e(a));
    }
}
