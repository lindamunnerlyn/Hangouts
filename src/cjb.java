// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.os.Handler;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class cjb
    implements android.animation.Animator.AnimatorListener
{

    final ScrollViewCustom a;

    public cjb(ScrollViewCustom scrollviewcustom)
    {
        a = scrollviewcustom;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        a.c = false;
        a.b.post(a.d);
    }

    public void onAnimationEnd(Animator animator)
    {
        a.c = false;
        a.b.post(a.d);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        a.c = true;
    }
}
