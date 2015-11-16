// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.hangout;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import bnd;
import bnk;
import bof;
import bos;
import bot;
import bpd;
import bqf;
import brf;
import brg;
import brh;
import bri;
import brk;
import bsb;
import bse;
import g;
import gbh;
import gjr;
import h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            FocusedParticipantView

public final class ParticipantTrayView extends LinearLayout
    implements bos
{

    public bot a;
    private final bnk b = new brf(this);
    private final bof c = bof.a();
    private final bnd d = bnd.a();
    private final bri e = new bri(this);
    private bqf f;
    private FocusedParticipantView g;
    private bse h;
    private Handler i;
    private final ArrayList j = new ArrayList();
    private boolean k;
    private final HorizontalScrollNotifier l;
    private final LinearLayout m;
    private final LinearLayout n;
    private final FrameLayout o;

    public ParticipantTrayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = new Handler();
        context = LayoutInflater.from(context).inflate(g.ge, this, true);
        l = (HorizontalScrollNotifier)context.findViewById(h.fF);
        m = (LinearLayout)context.findViewById(h.ew);
        n = (LinearLayout)context.findViewById(h.fr);
        o = (FrameLayout)context.findViewById(h.fH);
    }

    public static void a(ParticipantTrayView participanttrayview)
    {
        participanttrayview.f();
    }

    public static void a(ParticipantTrayView participanttrayview, gjr gjr1)
    {
        participanttrayview.a(gjr1);
    }

    private void a(gjr gjr1)
    {
        Object obj;
        gbh.b(gjr1);
        obj = null;
        if (!gjr1.g()) goto _L2; else goto _L1
_L1:
        gbh.a(h);
        h = new bse(f, gjr1, this, g);
        obj = h;
        o.addView(((View) (obj)));
_L4:
        if (obj != null)
        {
            j.add(obj);
            ((brk) (obj)).a(a);
        }
        if (!k)
        {
            f();
        }
        return;
_L2:
        if (a(gjr1.a()) == null)
        {
            obj = new bsb(f, gjr1, this, g);
            n.addView(((View) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static FrameLayout b(ParticipantTrayView participanttrayview)
    {
        return participanttrayview.o;
    }

    private void f()
    {
        bpd bpd1 = d.t();
        if (j.size() <= 1 || bpd1 != null && bpd1.N())
        {
            n.setVisibility(8);
            o.setVisibility(8);
        } else
        if (j.size() == 2 && h != null && !h.c().k())
        {
            n.setVisibility(8);
            o.setVisibility(0);
        } else
        {
            n.setVisibility(0);
            o.setVisibility(0);
        }
        if (n.getVisibility() == 8)
        {
            e();
        }
    }

    brk a(String s)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            brk brk1 = (brk)iterator.next();
            gjr gjr1 = brk1.c();
            if (s == null && gjr1.g() || s.equals(gjr1.a()))
            {
                return brk1;
            }
        }

        return null;
    }

    public void a(int i1)
    {
    }

    public void a(View view)
    {
        int i1 = ((ViewGroup)view.getParent()).getLeft();
        int j1;
        int k1;
        int l1;
        if (view == o)
        {
            j1 = n.getLeft() + n.getWidth() + i1;
            i1 = o.getWidth() + j1;
        } else
        {
            j1 = view.getLeft() + i1;
            i1 += view.getRight();
        }
        k1 = l.getScrollX();
        l1 = l.getWidth() + k1;
        if (k1 > j1)
        {
            l.smoothScrollTo(j1, 0);
        } else
        if (i1 > l1)
        {
            l.smoothScrollTo(i1 - (l1 - k1), 0);
            return;
        }
    }

    public void a(bot bot)
    {
        a = bot;
        c.a(e);
        d.a(b);
        gbh.b(k);
        k = true;
        for (bot = d.r().iterator(); bot.hasNext(); a((gjr)bot.next())) { }
        gbh.a(k);
        k = false;
        f();
    }

    void a(bqf bqf)
    {
        f = bqf;
        k = false;
        l.a(new brg(this, bqf));
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            bqf = (android.widget.FrameLayout.LayoutParams)m.getLayoutParams();
            bqf.gravity = 3;
            m.setLayoutParams(bqf);
        }
    }

    public void a(brk brk1)
    {
        brk1.b();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j.size())
                {
                    if (j.get(i1) != brk1)
                    {
                        break label0;
                    }
                    j.remove(i1);
                }
                n.removeView(brk1);
                o.removeView(brk1);
                f();
                return;
            }
            i1++;
        } while (true);
    }

    void a(FocusedParticipantView focusedparticipantview)
    {
        g = focusedparticipantview;
    }

    public void b()
    {
        i.postDelayed(new brh(this), 500L);
    }

    public void c()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((brk)iterator.next()).i()) { }
    }

    brk d()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            brk brk1 = (brk)iterator.next();
            if (brk1 != h)
            {
                return brk1;
            }
        }

        return h;
    }

    public void e()
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((brk)iterator.next()).e()) { }
    }

    public void i_()
    {
        d.b(b);
        c.b(e);
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((brk)iterator.next()).i_()) { }
        j.clear();
        h = null;
        n.removeAllViews();
        o.removeAllViews();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext(); ((brk)iterator.next()).onConfigurationChanged(configuration)) { }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        e();
    }

    private class HorizontalScrollNotifier extends HorizontalScrollView
    {

        brj a;

        void a(brj brj1)
        {
            a = brj1;
        }

        public void onScrollChanged(int i1, int j1, int k1, int l1)
        {
            a.a();
        }

        public HorizontalScrollNotifier(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

}
