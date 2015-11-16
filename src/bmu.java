// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.fragments.dialpad.DialpadKeyButton;

public final class bmu
    implements Runnable
{

    final int a;
    final DialpadKeyButton b;

    public bmu(DialpadKeyButton dialpadkeybutton, int i)
    {
        b = dialpadkeybutton;
        a = i;
        super();
    }

    public void run()
    {
        if (a == DialpadKeyButton.a(b))
        {
            gdv.a("Expected condition to be true", b.isPressed());
            b.setPressed(false);
            DialpadKeyButton.b(b);
            DialpadKeyButton.c(b);
        }
    }
}
