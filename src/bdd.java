// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

final class bdd
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final int a;
    final bdc b;

    bdd(bdc bdc1, int i)
    {
        b = bdc1;
        a = i;
        super();
    }

    public void onGlobalLayout()
    {
        int i = bdc.a(b).getWidth();
        if (i != 0)
        {
            bdc.a(b).b(i / 2 - a / 2);
        }
    }
}
