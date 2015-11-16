// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.res.Resources;
import android.os.Handler;
import android.widget.AbsListView;
import ebw;
import efc;
import efd;
import g;
import java.util.PriorityQueue;
import java.util.Queue;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            MessageListItemWrapperView

public final class MessageListAnimationManager
{

    public static final boolean a = false;
    private static int i;
    private final Queue b = new PriorityQueue();
    private boolean c;
    private AbsListView d;
    private final efc e;
    private efd f;
    private Handler g;
    private MessageListItemWrapperView h;

    public MessageListAnimationManager(AbsListView abslistview, efc efc1, Handler handler)
    {
        c = false;
        d = abslistview;
        e = efc1;
        g = handler;
        i = abslistview.getResources().getInteger(g.eZ);
    }

    static efc a(MessageListAnimationManager messagelistanimationmanager)
    {
        return messagelistanimationmanager.e;
    }

    private void a(Runnable runnable)
    {
        if (runnable != null)
        {
            c = true;
            g.post(runnable);
        }
    }

    static boolean b(MessageListAnimationManager messagelistanimationmanager)
    {
        messagelistanimationmanager.c = false;
        return false;
    }

    static int c()
    {
        return i;
    }

    static efd c(MessageListAnimationManager messagelistanimationmanager)
    {
        return messagelistanimationmanager.f;
    }

    static void d(MessageListAnimationManager messagelistanimationmanager)
    {
        messagelistanimationmanager.a((Runnable)messagelistanimationmanager.b.poll());
    }

    public efc a()
    {
        return e;
    }

    public void a(MessageListItemWrapperView messagelistitemwrapperview)
    {
        h = messagelistitemwrapperview;
    }

    public void a(efd efd)
    {
        f = efd;
    }

    public void a(boolean flag)
    {
        if (e != null)
        {
            e.a();
        }
        MessageListItemWrapperView.c(flag);
        if (h != null && h.getParent() == d)
        {
            h.h();
        }
        if (e != null)
        {
            e.b();
        }
    }

    public MessageListItemWrapperView b()
    {
        return h;
    }

    public void b(MessageListItemWrapperView messagelistitemwrapperview)
    {
        if (a)
        {
            String s = String.valueOf(messagelistitemwrapperview);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 20)).append("enqueueForAnimation ").append(s).toString());
        }
        messagelistitemwrapperview = new AnimateInNewMessageRunnable(messagelistitemwrapperview, d);
        if (c)
        {
            b.offer(messagelistitemwrapperview);
            return;
        } else
        {
            a(messagelistitemwrapperview);
            return;
        }
    }

    static 
    {
        hik hik = ebw.w;
    }

    private class AnimateInNewMessageRunnable
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

        public static void b(AnimateInNewMessageRunnable animateinnewmessagerunnable)
        {
            animateinnewmessagerunnable.a();
        }

        public int a(AnimateInNewMessageRunnable animateinnewmessagerunnable)
        {
            return a.g() <= animateinnewmessagerunnable.a.g() ? -1 : 1;
        }

        public int compareTo(Object obj)
        {
            return a((AnimateInNewMessageRunnable)obj);
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
                int j = a.a(f1);
                d.a(c, a.getTop() - j);
                a.requestLayout();
                if (f)
                {
                    a.a(1.0F);
                    return;
                }
            }
        }

        public AnimateInNewMessageRunnable(MessageListItemWrapperView messagelistitemwrapperview, AbsListView abslistview)
        {
            b = MessageListAnimationManager.this;
            super();
            a = messagelistitemwrapperview;
            d = (MessageListView)abslistview;
            f = false;
        }
    }

}
