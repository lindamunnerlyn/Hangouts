// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.os.Handler;
import com.google.android.apps.hangouts.peoplelistv2.impl.ScrollViewCustom;

public final class chv
    implements android.animation.Animator.AnimatorListener
{

    final ScrollViewCustom a;

    public chv(ScrollViewCustom scrollviewcustom)
    {
        a = scrollviewcustom;
        super();
    }

    public void onAnimationCancel(Animator animator)
    {
        ScrollViewCustom.a(a, false);
        ScrollViewCustom.a(a).post(a.a);
    }

    public void onAnimationEnd(Animator animator)
    {
        ScrollViewCustom.a(a, false);
        ScrollViewCustom.a(a).post(a.a);
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
        ScrollViewCustom.a(a, true);
    }
}
