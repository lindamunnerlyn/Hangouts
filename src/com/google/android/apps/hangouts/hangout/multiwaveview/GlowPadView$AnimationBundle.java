// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout.multiwaveview;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.hangouts.hangout.multiwaveview:
//            Tweener, GlowPadView

class <init> extends ArrayList
{

    private static final long serialVersionUID = 0xa84d78726f127468L;
    private boolean mSuspended;
    final GlowPadView this$0;

    public void cancel()
    {
        int j = size();
        for (int i = 0; i < j; i++)
        {
            ((Tweener)get(i)).animator.cancel();
        }

        clear();
    }

    public void setSuspended(boolean flag)
    {
        mSuspended = flag;
    }

    public void start()
    {
        if (!mSuspended)
        {
            int j = size();
            int i = 0;
            while (i < j) 
            {
                ((Tweener)get(i)).animator.start();
                i++;
            }
        }
    }

    public void stop()
    {
        int j = size();
        for (int i = 0; i < j; i++)
        {
            ((Tweener)get(i)).animator.end();
        }

        clear();
    }

    private ()
    {
        this$0 = GlowPadView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
