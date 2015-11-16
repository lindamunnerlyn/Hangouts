// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.FixedParticipantsView;
import java.util.Iterator;
import java.util.List;

public final class bnm
    implements fsn, hjx, hka
{

    private static final boolean l;
    private final bnd a = bnd.a();
    private final bof b = bof.a();
    private final ai c;
    private final Resources d;
    private final bnp e = new bnp(this);
    private final Handler f = new Handler(Looper.getMainLooper());
    private int g;
    private bnq h;
    private boolean i;
    private boolean j;
    private boolean k;
    private final Runnable m = new bnn(this);

    public bnm(ai ai1, hjm hjm1)
    {
        g = 0;
        h = bnq.a;
        c = ai1;
        d = ai1.getResources();
        hjm1.a(this);
    }

    static void a(bnm bnm1)
    {
        bnm1.a(true);
    }

    static void a(bnm bnm1, bpd bpd1)
    {
        bnm1.a(bpd1);
    }

    private void a(bpd bpd1)
    {
        TextView textview;
        View view;
        View view1;
        boolean flag1;
        flag1 = false;
        view1 = c.findViewById(h.bT);
        textview = (TextView)view1.findViewById(h.X);
        int i1;
        if (l)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        kb.e(textview, i1);
        view = view1.findViewById(h.bD);
        view1 = view1.findViewById(h.bE);
        if (bpd1 == null || bpd1.H().size() != 1 || bpd1.M() != 1)
        {
            textview.setVisibility(8);
            view.setVisibility(8);
            view1.setVisibility(8);
            return;
        }
        bpd1 = bpd1.W();
        if (bpd1.size() != 1) goto _L2; else goto _L1
_L1:
        String s;
        bpd1 = (bpk)bpd1.get(0);
        s = bpd1.b();
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L3
_L3:
        int j1;
        int k1;
        boolean flag;
        textview.setText(d.getString(l.bw, new Object[] {
            s
        }));
        textview.setContentDescription(d.getString(l.bx, new Object[] {
            s
        }));
        int l1;
        if (bpd1 instanceof bpm)
        {
            if (((bpm)bpd1).c())
            {
                k1 = 0;
                j1 = 1;
            } else
            {
                k1 = 1;
                j1 = 0;
            }
        } else
        {
            k1 = 0;
            j1 = 0;
        }
        if (!k)
        {
            k = true;
            g.b(1631);
        }
        flag = true;
        l1 = k1;
        k1 = j1;
        j1 = l1;
_L5:
        if (flag)
        {
            l1 = 0;
        } else
        {
            l1 = 8;
        }
        textview.setVisibility(l1);
        if (flag && !l)
        {
            ebr.a(textview, null, textview.getContentDescription());
        }
        if (k1 != 0)
        {
            k1 = 0;
        } else
        {
            k1 = 8;
        }
        view.setVisibility(k1);
        if (j1 != 0)
        {
            j1 = ((flag1) ? 1 : 0);
        } else
        {
            j1 = 8;
        }
        view1.setVisibility(j1);
        return;
_L2:
        j1 = 0;
        k1 = 0;
        flag = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void a(boolean flag)
    {
        Object obj = c.findViewById(h.bZ);
        int i1 = d.getInteger(g.eX);
        obj = ((View) (obj)).animate();
        long l1;
        if (flag)
        {
            l1 = i1;
        } else
        {
            l1 = 0L;
        }
        ((ViewPropertyAnimator) (obj)).setDuration(l1).translationY(0.0F);
        a(true, flag);
    }

    private void a(boolean flag, boolean flag1)
    {
        if (j == flag)
        {
            return;
        }
        j = flag;
        Object obj = c.findViewById(h.cf);
        int i1 = d.getInteger(g.eX);
        ViewPropertyAnimator viewpropertyanimator = ((View) (obj)).animate();
        float f1;
        long l1;
        if (flag1)
        {
            l1 = i1;
        } else
        {
            l1 = 0L;
        }
        obj = viewpropertyanimator.setDuration(l1).setListener(ahx.a(((View) (obj))));
        if (flag)
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        ((ViewPropertyAnimator) (obj)).alpha(f1);
        obj = (TransitionDrawable)c.findViewById(h.cH).getBackground();
        ((TransitionDrawable) (obj)).setCrossFadeEnabled(true);
        if (!flag1)
        {
            i1 = 0;
        }
        ((TransitionDrawable) (obj)).reverseTransition(i1);
    }

    static void b(bnm bnm1)
    {
        bnm1.c();
    }

    static bnd c(bnm bnm1)
    {
        return bnm1.a;
    }

    private void c()
    {
        bpd bpd1;
        bpd1 = a.t();
        Object obj;
        Object obj2;
        int i1;
        if (!i || g != 2 || bpd1 == null || bpd1.Q())
        {
            obj = bnq.a;
        } else
        {
            flag1 = bpd1.E();
            boolean flag;
            boolean flag2;
            boolean flag3;
            if (bpd1.J() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag2 = bpd1.N();
            flag3 = a.m();
            if (flag1 && flag)
            {
                if (flag2)
                {
                    obj = bnq.b;
                } else
                {
                    obj = bnq.c;
                }
            } else
            if (!flag1 && !flag3)
            {
                obj = bnq.d;
            } else
            {
                obj = bnq.a;
            }
        }
        if (obj == h) goto _L2; else goto _L1
_L1:
        long l1;
        boolean flag1;
        if (h == bnq.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj2 = c.findViewById(h.bT);
        ((FixedParticipantsView)((View) (obj2)).findViewById(h.bN)).a();
        ((View) (obj2)).setVisibility(8);
        obj2 = c.findViewById(h.bZ);
        ((FixedParticipantsView)c.findViewById(h.bN)).a();
        i1 = d.getInteger(g.eX);
        obj2 = ((View) (obj2)).animate();
        if (flag1)
        {
            l1 = i1;
        } else
        {
            l1 = 0L;
        }
        ((ViewPropertyAnimator) (obj2)).setDuration(l1).translationY(d.getDimension(g.en));
        f.removeCallbacks(m);
        a(false, flag1);
        h = ((bnq) (obj));
        bno.a[h.ordinal()];
        JVM INSTR tableswitch 1 4: default 228
    //                   1 372
    //                   2 617
    //                   3 1074
    //                   4 269;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break; /* Loop/switch isn't completed */
_L3:
        obj = String.valueOf(h);
        gbh.a((new StringBuilder(String.valueOf(obj).length() + 26)).append("Unsupported overlay type: ").append(((String) (obj))).toString());
_L2:
        return;
_L4:
        Object obj1;
        ceu ceu1;
        View view1 = c.findViewById(h.bT);
        TextView textview2 = (TextView)view1.findViewById(h.es);
        obj1 = (FixedParticipantsView)view1.findViewById(h.bN);
        Object obj3 = bpd1.H();
        int j1;
        if (((List) (obj3)).size() == 1)
        {
            j1 = com.google.android.apps.hangouts.R.drawable.aA;
        } else
        {
            j1 = 0;
        }
        ((FixedParticipantsView) (obj1)).setBackgroundResource(j1);
        ((FixedParticipantsView) (obj1)).a(bpd1.l(), ((List) (obj3)));
        if (!bpd1.N()) goto _L9; else goto _L8
_L8:
        obj1 = bpd1.l();
        obj3 = ((List) (obj3)).iterator();
_L11:
        if (((Iterator) (obj3)).hasNext())
        {
            ceu1 = (ceu)((Iterator) (obj3)).next();
            if (ceu1.e() == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            obj1 = d.getString(l.dY, new Object[] {
                ebz.a(ceu1.e(), ecc.b)
            });
        } else
        {
            obj1 = d.getString(l.dT);
        }
_L12:
        textview2.setText(((CharSequence) (obj1)));
        textview2.setVisibility(0);
        view1.setVisibility(0);
_L9:
        a(bpd1);
        return;
        if (!ceu1.h() || !((ani) (obj1)).A() || ((ani) (obj1)).ab()) goto _L11; else goto _L10
_L10:
        obj1 = d.getString(l.dZ, new Object[] {
            ebz.p(((ani) (obj1)).C())
        });
          goto _L12
        if (true) goto _L11; else goto _L5
_L5:
        TextView textview1;
        obj1 = bpd1.H();
        textview1 = (TextView)c.findViewById(h.bZ).findViewById(h.es);
        FixedParticipantsView fixedparticipantsview1 = (FixedParticipantsView)c.findViewById(h.bN);
        fixedparticipantsview1.a(bpd1.l(), ((List) (obj1)));
        fixedparticipantsview1.setVisibility(0);
        ((List) (obj1)).size();
        JVM INSTR tableswitch 0 4: default 712
    //                   0 806
    //                   1 820
    //                   2 858
    //                   3 913
    //                   4 985;
           goto _L13 _L14 _L15 _L16 _L17 _L18
_L13:
        obj1 = String.format(d.getString(l.ea), new Object[] {
            g.a((ceu)((List) (obj1)).get(0), true), g.a((ceu)((List) (obj1)).get(1), true), g.a((ceu)((List) (obj1)).get(2), true), Integer.valueOf(((List) (obj1)).size() - 3)
        });
_L19:
        textview1.setText(((CharSequence) (obj1)));
        a(false);
        return;
_L14:
        obj1 = d.getString(l.dT);
        continue; /* Loop/switch isn't completed */
_L15:
        obj1 = String.format(d.getString(l.dU), new Object[] {
            g.a((ceu)((List) (obj1)).get(0), true)
        });
        continue; /* Loop/switch isn't completed */
_L16:
        obj1 = String.format(d.getString(l.dV), new Object[] {
            g.a((ceu)((List) (obj1)).get(0), true), g.a((ceu)((List) (obj1)).get(1), true)
        });
        continue; /* Loop/switch isn't completed */
_L17:
        obj1 = String.format(d.getString(l.dW), new Object[] {
            g.a((ceu)((List) (obj1)).get(0), true), g.a((ceu)((List) (obj1)).get(1), true), g.a((ceu)((List) (obj1)).get(2), true)
        });
        continue; /* Loop/switch isn't completed */
_L18:
        obj1 = String.format(d.getString(l.dX), new Object[] {
            g.a((ceu)((List) (obj1)).get(0), true), g.a((ceu)((List) (obj1)).get(1), true), g.a((ceu)((List) (obj1)).get(2), true), g.a((ceu)((List) (obj1)).get(3), true)
        });
        if (true) goto _L19; else goto _L6
_L6:
        View view = c.findViewById(h.bZ);
        TextView textview = (TextView)view.findViewById(h.es);
        FixedParticipantsView fixedparticipantsview = (FixedParticipantsView)c.findViewById(h.bN);
        String s = d.getString(l.dP);
        textview.setText(s);
        fixedparticipantsview.a();
        fixedparticipantsview.setVisibility(8);
        f.postDelayed(m, 4000L);
        ebr.a(view, null, s);
        return;
    }

    public void E_()
    {
        b.a(e);
        i = true;
        c();
    }

    public void a()
    {
        b.b(e);
        i = false;
        c();
    }

    public void a(int i1)
    {
        g = i1;
        c();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
    }
}
