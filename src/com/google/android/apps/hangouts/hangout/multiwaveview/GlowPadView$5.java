// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            GlowPadView, PointCloud

class this._cls0 extends AnimatorListenerAdapter
{

    final GlowPadView this$0;

    public void onAnimationEnd(Animator animator)
    {
        GlowPadView.access$900(GlowPadView.this).waveManager.setRadius(0.0F);
        GlowPadView.access$900(GlowPadView.this).waveManager.setAlpha(0.0F);
    }

    eManager()
    {
        this$0 = GlowPadView.this;
        super();
    }
}
