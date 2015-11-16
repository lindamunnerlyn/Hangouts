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
        if (GlowPadView.access$500(GlowPadView.this) != 0)
        {
            GlowPadView.access$600(GlowPadView.this, GlowPadView.access$500(GlowPadView.this));
            GlowPadView.access$502(GlowPadView.this, 0);
            GlowPadView.access$700(GlowPadView.this, false, false);
        }
        GlowPadView.access$802(GlowPadView.this, false);
    }

    ()
    {
        this$0 = GlowPadView.this;
        super();
    }
}
