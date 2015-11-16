// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;

public final class bfq extends AnimatorListenerAdapter
{

    final QuickButtonContainer a;

    public bfq(QuickButtonContainer quickbuttoncontainer)
    {
        a = quickbuttoncontainer;
        super();
    }

    public void onAnimationEnd(Animator animator)
    {
        if (a.c != animator)
        {
            return;
        } else
        {
            a.b = false;
            a.setVisibility(a.d);
            a.a = false;
            a.c = null;
            return;
        }
    }
}
