// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import aht;
import android.animation.ObjectAnimator;
import android.view.View;
import eie;
import eit;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            MessageListItemWrapperView, MessageListAnimationManager, MessageListView

public class e
    implements Runnable
{

    public final int a;
    public final MessageListItemWrapperView b;
    private MessageListView c;
    private ObjectAnimator d;
    private final View e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private int k;

    public void run()
    {
        eie eie1;
        if (a == 1)
        {
            j = 0;
            k = MessageListItemWrapperView.a(b.getResources());
        } else
        {
            j = MessageListItemWrapperView.a(b.getResources());
            k = 0;
        }
        d = ObjectAnimator.ofInt(this, "watermarkGalleryMeasuredHeightReduction", new int[] {
            j, k
        });
        d.setDuration(MessageListItemWrapperView.i());
        d.setInterpolator(new aht());
        d.addListener(new eit(this));
        eie1 = MessageListItemWrapperView.d(b).a();
        if (eie1 != null)
        {
            eie1.a();
        }
        d.start();
    }

    public void setWatermarkGalleryMeasuredHeightReduction(int l)
    {
        MessageListItemWrapperView.b(b, l);
        if (c == null)
        {
            c = (MessageListView)e.getParent();
        }
        boolean flag;
        if (c == null)
        {
            d.cancel();
            flag = false;
        } else
        {
            if (!i)
            {
                h = e.getTop();
                g = c.getHeight();
                f = c.getPositionForView(e);
                i = true;
            }
            flag = true;
        }
        if (!flag)
        {
            return;
        } else
        {
            int i1 = j;
            int j1 = h;
            int k1 = g;
            int l1 = c.getHeight();
            c.a(f, j1 - (i1 - l) - (k1 - l1));
            b.requestLayout();
            return;
        }
    }

    public (MessageListItemWrapperView messagelistitemwrapperview, View view, int l)
    {
        b = messagelistitemwrapperview;
        super();
        a = l;
        e = view;
    }
}
