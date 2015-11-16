// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import aia;
import android.animation.ObjectAnimator;
import android.widget.AbsListView;
import efb;
import efc;
import efd;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            MessageListView, MessageListAnimationManager, MessageListItemWrapperView

public class f
    implements Comparable, Runnable
{

    public MessageListItemWrapperView a;
    final MessageListAnimationManager b;
    private int c;
    private MessageListView d;
    private ObjectAnimator e;
    private boolean f;

    private void a()
    {
        if (MessageListAnimationManager.a(b) != null)
        {
            MessageListAnimationManager.a(b).b();
        }
        MessageListAnimationManager.b(b);
        a.d();
        if (MessageListAnimationManager.c(b) != null)
        {
            MessageListAnimationManager.c(b).a(a);
        }
        MessageListAnimationManager.d(b);
    }

    public static void b(b b1)
    {
        b1.a();
    }

    public int a(a a1)
    {
        return a.g() <= a1.a.g() ? -1 : 1;
    }

    public int compareTo(Object obj)
    {
        return a((a)obj);
    }

    public void run()
    {
        e = ObjectAnimator.ofFloat(this, "percentage", new float[] {
            0.0F, 1.0F
        });
        e.setDuration(MessageListAnimationManager.c());
        e.setInterpolator(new aia((byte)0));
        e.addListener(new efb(this));
        if (MessageListAnimationManager.a(b) != null)
        {
            MessageListAnimationManager.a(b).a();
        }
        if (a.getParent() == d)
        {
            c = d.getPositionForView(a);
            e.start();
            return;
        } else
        {
            a();
            return;
        }
    }

    public void setPercentage(float f1)
    {
        if (!f)
        {
            if (a.getParent() == null)
            {
                f = true;
                e.cancel();
            }
            int i = a.a(f1);
            d.a(c, a.getTop() - i);
            a.requestLayout();
            if (f)
            {
                a.a(1.0F);
                return;
            }
        }
    }

    public (MessageListAnimationManager messagelistanimationmanager, MessageListItemWrapperView messagelistitemwrapperview, AbsListView abslistview)
    {
        b = messagelistanimationmanager;
        super();
        a = messagelistitemwrapperview;
        d = (MessageListView)abslistview;
        f = false;
    }
}
