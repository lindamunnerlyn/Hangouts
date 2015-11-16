// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.conversation.v2.stickerpicker.impl.SlidingTabLayout;

final class bdt
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final int a;
    final bds b;

    bdt(bds bds1, int i)
    {
        b = bds1;
        a = i;
        super();
    }

    public void onGlobalLayout()
    {
        int i = bds.a(b).getWidth();
        if (i != 0)
        {
            bds.a(b).b(i / 2 - a / 2);
        }
    }
}
