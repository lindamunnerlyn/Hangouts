// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import aia;
import android.animation.ObjectAnimator;
import android.view.View;
import efc;
import efr;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            MessageListItemWrapperView, MessageListAnimationManager, MessageListView

public class e
    implements Runnable
{

    public final MessageListItemWrapperView a;
    private final int b;
    private MessageListView c;
    private ObjectAnimator d;
    private final View e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private int k;

    public static int a(e e1)
    {
        return e1.b;
    }

    public void run()
    {
        efc efc1;
        if (b == 1)
        {
            j = 0;
            k = MessageListItemWrapperView.a(a.getResources());
        } else
        {
            j = MessageListItemWrapperView.a(a.getResources());
            k = 0;
        }
        d = ObjectAnimator.ofInt(this, "watermarkGalleryMeasuredHeightReduction", new int[] {
            j, k
        });
        d.setDuration(MessageListItemWrapperView.i());
        d.setInterpolator(new aia());
        d.addListener(new efr(this));
        efc1 = MessageListItemWrapperView.d(a).a();
        if (efc1 != null)
        {
            efc1.a();
        }
        d.start();
    }

    public void setWatermarkGalleryMeasuredHeightReduction(int l)
    {
        MessageListItemWrapperView.b(a, l);
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
            a.requestLayout();
            return;
        }
    }

    public (MessageListItemWrapperView messagelistitemwrapperview, View view, int l)
    {
        a = messagelistitemwrapperview;
        super();
        b = l;
        e = view;
    }
}
