// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            GlowPadView

class this._cls0 extends AnimatorListenerAdapter
{

    final GlowPadView this$0;

    public void onAnimationEnd(Animator animator)
    {
        GlowPadView.access$300(GlowPadView.this, 0, GlowPadView.access$100(GlowPadView.this), GlowPadView.access$200(GlowPadView.this));
        GlowPadView.access$400(GlowPadView.this);
    }

    ()
    {
        this$0 = GlowPadView.this;
        super();
    }
}
