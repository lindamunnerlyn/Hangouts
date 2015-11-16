// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package org.chromium.base:
//            AnimationFrameTimeHistogram

final class  extends AnimatorListenerAdapter
{

    private final AnimationFrameTimeHistogram a;

    public void onAnimationCancel(Animator animator)
    {
        a.b();
    }

    public void onAnimationEnd(Animator animator)
    {
        a.b();
    }

    public void onAnimationStart(Animator animator)
    {
        a.a();
    }
}
