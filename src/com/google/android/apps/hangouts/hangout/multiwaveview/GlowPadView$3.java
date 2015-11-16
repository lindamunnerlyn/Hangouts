// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.ValueAnimator;

// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            GlowPadView

class this._cls0
    implements android.animation.AnimatorUpdateListener
{

    final GlowPadView this$0;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        invalidate();
    }

    ()
    {
        this$0 = GlowPadView.this;
        super();
    }
}
