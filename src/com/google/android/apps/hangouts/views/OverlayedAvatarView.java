// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import aoa;
import cgd;
import cuz;
import cvc;
import ecj;
import eev;
import eja;
import ejb;
import fzd;
import g;
import gqu;
import h;
import hlp;
import hnn;
import hof;

// Referenced classes of package com.google.android.apps.hangouts.views:
//            AvatarView, RichStatusView

public class OverlayedAvatarView extends RelativeLayout
{

    private static final boolean a = false;
    private static final int b;
    private static final Handler c = new Handler(Looper.getMainLooper());
    private static volatile boolean d = true;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private AvatarView i;
    private cgd j;
    private RichStatusView k;
    private int l;
    private String m;
    private ejb n;
    private ecj o;
    private Runnable p;

    public OverlayedAvatarView(Context context)
    {
        super(context);
        g = 0;
        h = 0;
        l = -1;
    }

    public OverlayedAvatarView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        g = 0;
        h = 0;
        l = -1;
    }

    public OverlayedAvatarView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = 0;
        h = 0;
        l = -1;
    }

    public static OverlayedAvatarView a(LayoutInflater layoutinflater, String s, cgd cgd1, int i1, ecj ecj1)
    {
        layoutinflater = (OverlayedAvatarView)layoutinflater.inflate(g.gJ, null, false);
        layoutinflater.a(s, cgd1, i1, ecj1);
        return layoutinflater;
    }

    public static RichStatusView a(OverlayedAvatarView overlayedavatarview)
    {
        return overlayedavatarview.k;
    }

    public static String a(int i1)
    {
        switch (b(i1))
        {
        case 3: // '\003'
        default:
            return "UNKNOWN";

        case 0: // '\0'
            return "NULL";

        case 1: // '\001'
            return "STATE_WATERMARK";

        case 2: // '\002'
            return "STATE_FOCUSED";

        case 4: // '\004'
            return "STATE_TYPING";
        }
    }

    public static int b(int i1)
    {
        i1 = i1 >> 1 | i1;
        i1 |= i1 >> 2;
        return i1 - (i1 >> 1);
    }

    private void b(boolean flag)
    {
        boolean flag2 = true;
        Object obj = i;
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((AvatarView) (obj)).a(flag1);
        obj = k;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((RichStatusView) (obj)).b(flag);
    }

    private void c(boolean flag)
    {
        if (l == -1)
        {
            return;
        } else
        {
            k.a(flag);
            return;
        }
    }

    public static int h()
    {
        return b;
    }

    private void i()
    {
        if (!e || TextUtils.isEmpty(m) || k == null)
        {
            setContentDescription(null);
        } else
        {
            StringBuilder stringbuilder = new StringBuilder(m);
            k.a(stringbuilder);
            setContentDescription(stringbuilder.toString());
        }
        if (o != null)
        {
            o.b();
        }
    }

    public int a()
    {
        return b(g);
    }

    public void a(cuz cuz)
    {
        k.a(cuz);
        if (f && k.b())
        {
            if (p == null)
            {
                p = new eja(this);
            }
            c.removeCallbacks(p);
            c.postDelayed(p, 10000L);
        }
        i();
    }

    public void a(String s, cgd cgd1, int i1, ecj ecj1)
    {
        m = s;
        j = cgd1;
        k.a(j);
        o = ecj1;
        g(i1);
        d = fzd.a(getContext().getContentResolver(), "babel_richstatus", true);
        e = true;
        i();
    }

    public void a(String s, String s1, aoa aoa)
    {
        i.a(s, s1, aoa);
    }

    public void a(boolean flag)
    {
label0:
        {
            if (!d)
            {
                flag = false;
            }
            if (f == flag)
            {
                break label0;
            }
            f = flag;
            String s;
            if (f)
            {
                s = j.a;
            } else
            {
                s = null;
            }
            if (n == null)
            {
                if (s == null)
                {
                    break label0;
                }
                Object obj = hlp.b(getContext());
                int i1 = ((gqu)((hlp) (obj)).a(gqu)).a();
                obj = (hof)((hlp) (obj)).a(hnn);
                n = new ejb(this, getContext(), ((hof) (obj)), i1);
            }
            n.a(s);
        }
    }

    public int b()
    {
        return g;
    }

    public int c()
    {
        return h;
    }

    public int c(int i1)
    {
        return g & ~i1;
    }

    public int d(int i1)
    {
        return g | i1;
    }

    public boolean d()
    {
        return (g & 2) == 2;
    }

    public void e(int i1)
    {
        int j1;
        int k1;
        j1 = b(g);
        k1 = b(i1);
        g = i1;
        if (a)
        {
            String s = String.valueOf(a(k1));
            String s1 = String.valueOf(j);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append("[AvatarView] new state  ").append(s).append(" for ").append(s1).toString());
        }
        if (k1 == j1) goto _L2; else goto _L1
_L1:
        k1;
        JVM INSTR tableswitch 1 4: default 136
    //                   1 159
    //                   2 137
    //                   3 136
    //                   4 148;
           goto _L2 _L3 _L4 _L2 _L5
_L2:
        return;
_L4:
        b(true);
        c(false);
        return;
_L5:
        c(true);
        b(true);
        return;
_L3:
        b(false);
        c(false);
        return;
    }

    public boolean e()
    {
        return (g & 4) == 4;
    }

    public void f()
    {
        a(false);
    }

    public void f(int i1)
    {
        h = i1;
    }

    public cgd g()
    {
        return j;
    }

    public void g(int i1)
    {
        if (l != i1)
        {
            l = i1;
            k.a(i1);
        }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        i = (AvatarView)findViewById(h.H);
        i.a(true);
        k = (RichStatusView)findViewById(h.fg);
    }

    static 
    {
        hnc hnc = eev.w;
        b = cvc.d.j | cvc.e.j;
    }
}
