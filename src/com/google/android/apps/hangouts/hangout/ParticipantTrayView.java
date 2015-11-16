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
import bnk;
import bns;
import boo;
import bpb;
import bpc;
import bpm;
import bqo;
import bro;
import brp;
import brq;
import brr;
import brt;
import bsk;
import bsn;
import g;
import gdv;
import gmt;
import h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.apps.hangouts.hangout:
//            FocusedParticipantView

public final class ParticipantTrayView extends LinearLayout
    implements bpb
{

    public bpc a;
    public final FrameLayout b;
    private final bns c = new bro(this);
    private final boo d = boo.a();
    private final bnk e = bnk.a();
    private final brr f = new brr(this);
    private bqo g;
    private FocusedParticipantView h;
    private bsn i;
    private Handler j;
    private final ArrayList k = new ArrayList();
    private boolean l;
    private final HorizontalScrollNotifier m;
    private final LinearLayout n;
    private final LinearLayout o;

    public ParticipantTrayView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = new Handler();
        context = LayoutInflater.from(context).inflate(g.ga, this, true);
        m = (HorizontalScrollNotifier)context.findViewById(h.fn);
        n = (LinearLayout)context.findViewById(h.ef);
        o = (LinearLayout)context.findViewById(h.eZ);
        b = (FrameLayout)context.findViewById(h.fp);
    }

    brt a(String s)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext();)
        {
            brt brt1 = (brt)iterator.next();
            gmt gmt1 = brt1.c();
            if (s == null && gmt1.g() || s.equals(gmt1.a()))
            {
                return brt1;
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
        if (view == b)
        {
            j1 = o.getLeft() + o.getWidth() + i1;
            i1 = b.getWidth() + j1;
        } else
        {
            j1 = view.getLeft() + i1;
            i1 += view.getRight();
        }
        k1 = m.getScrollX();
        l1 = m.getWidth() + k1;
        if (k1 > j1)
        {
            m.smoothScrollTo(j1, 0);
        } else
        if (i1 > l1)
        {
            m.smoothScrollTo(i1 - (l1 - k1), 0);
            return;
        }
    }

    public void a(bpc bpc)
    {
        a = bpc;
        d.a(f);
        e.a(c);
        gdv.b("Expected condition to be false", l);
        l = true;
        for (bpc = e.q().iterator(); bpc.hasNext(); a((gmt)bpc.next())) { }
        gdv.a("Expected condition to be true", l);
        l = false;
        g();
    }

    void a(bqo bqo)
    {
        g = bqo;
        l = false;
        m.a(new brp(this, bqo));
        if (android.os.Build.VERSION.SDK_INT < 19)
        {
            bqo = (android.widget.FrameLayout.LayoutParams)n.getLayoutParams();
            bqo.gravity = 3;
            n.setLayoutParams(bqo);
        }
    }

    public void a(brt brt1)
    {
        brt1.b();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < k.size())
                {
                    if (k.get(i1) != brt1)
                    {
                        break label0;
                    }
                    k.remove(i1);
                }
                o.removeView(brt1);
                b.removeView(brt1);
                g();
                return;
            }
            i1++;
        } while (true);
    }

    void a(FocusedParticipantView focusedparticipantview)
    {
        h = focusedparticipantview;
    }

    public void a(gmt gmt1)
    {
        Object obj;
        gdv.b("Expected non-null", gmt1);
        obj = null;
        if (!gmt1.g()) goto _L2; else goto _L1
_L1:
        gdv.a("Expected null", i);
        i = new bsn(g, gmt1, this, h);
        obj = i;
        b.addView(((View) (obj)));
_L4:
        if (obj != null)
        {
            k.add(obj);
            ((brt) (obj)).a(a);
        }
        if (!l)
        {
            g();
        }
        return;
_L2:
        if (a(gmt1.a()) == null)
        {
            obj = new bsk(g, gmt1, this, h);
            o.addView(((View) (obj)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    void b()
    {
        m.a(null);
    }

    public void c()
    {
        j.postDelayed(new brq(this), 500L);
    }

    public void d()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((brt)iterator.next()).i()) { }
    }

    brt e()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext();)
        {
            brt brt1 = (brt)iterator.next();
            if (brt1 != i)
            {
                return brt1;
            }
        }

        return i;
    }

    public void f()
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((brt)iterator.next()).e()) { }
    }

    public void g()
    {
        bpm bpm1 = e.s();
        if (k.size() <= 1 || bpm1 != null && bpm1.M())
        {
            o.setVisibility(8);
            b.setVisibility(8);
        } else
        if (k.size() == 2 && i != null && !i.c().k())
        {
            o.setVisibility(8);
            b.setVisibility(0);
        } else
        {
            o.setVisibility(0);
            b.setVisibility(0);
        }
        if (o.getVisibility() == 8)
        {
            f();
        }
    }

    public void j_()
    {
        e.b(c);
        d.b(f);
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((brt)iterator.next()).j_()) { }
        k.clear();
        i = null;
        o.removeAllViews();
        b.removeAllViews();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        for (Iterator iterator = k.iterator(); iterator.hasNext(); ((brt)iterator.next()).onConfigurationChanged(configuration)) { }
    }

    protected void onVisibilityChanged(View view, int i1)
    {
        f();
    }

    private class HorizontalScrollNotifier extends HorizontalScrollView
    {

        brs a;

        void a(brs brs1)
        {
            a = brs1;
        }

        public void onScrollChanged(int i1, int j1, int k1, int l1)
        {
            if (a != null)
            {
                a.a();
            }
        }

        public HorizontalScrollNotifier(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }
    }

}
