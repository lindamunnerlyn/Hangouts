// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bfd
    implements bev
{

    static final int a;
    static final int b;
    static final int c;
    static final int d;
    static final int e;
    private final bfk A = new bfk(this);
    private int B;
    private LinearLayout C;
    private Space D;
    private float E;
    private Menu F;
    private SubMenu G;
    private int H;
    private bew I;
    private gqu J;
    private dbt K;
    private int L;
    Context f;
    FloatingActionButton g;
    View h;
    FrameLayout i;
    int j;
    int k;
    Dialog l;
    QuickButtonContainer m;
    beu n;
    cgh o;
    cgk p;
    cgi q;
    cgj r;
    bep s;
    MenuItem t;
    MenuItem u;
    MenuItem v;
    MenuItem w;
    MenuItem x;
    List y;
    android.view.View.OnClickListener z;

    bfd(Context context)
    {
        H = 0;
        y = new ArrayList();
        f = context;
        J = (gqu)hlp.a(context, gqu);
        J.a(new bfj(this));
        K = (dbt)hlp.a(context, dbt);
    }

    static void a(Context context, beu beu1)
    {
        beu1.a(context);
    }

    private void a(LayoutInflater layoutinflater, ViewGroup viewgroup, List list)
    {
        C = (LinearLayout)m.findViewById(g.lI);
        Iterator iterator = list.iterator();
        int j1 = 0;
        int i1 = 0;
        do
        {
label0:
            {
                if (iterator.hasNext())
                {
                    Object obj = (beu)iterator.next();
                    int l1;
                    if (obj != null)
                    {
                        TextView textview;
                        ImageView imageview;
                        int k1;
                        boolean flag;
                        boolean flag1;
                        if (i1 == 0)
                        {
                            list = viewgroup.findViewById(g.lG);
                            n = ((beu) (obj));
                            i1 = 1;
                        } else
                        {
                            list = layoutinflater.inflate(h.hu, m, false);
                            C.addView(list, 0);
                            j1++;
                        }
                        textview = (TextView)list.findViewById(g.lJ);
                        textview.setText(((beu) (obj)).a());
                        imageview = (ImageView)list.findViewById(g.lH);
                        if (imageview != null)
                        {
                            imageview.setImageResource(((beu) (obj)).b());
                        }
                        obj = new bfh(this, ((beu) (obj)));
                        textview.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                        list.setOnClickListener(((android.view.View.OnClickListener) (obj)));
                        k1 = j1;
                        j1 = i1;
                        i1 = k1;
                    } else
                    {
                        int i2 = i1;
                        i1 = j1;
                        j1 = i2;
                    }
                    if (i1 != L)
                    {
                        break label0;
                    }
                }
                if (n == null)
                {
                    layoutinflater = String.valueOf("primaryAction == null; account_id: ");
                    i1 = k().h();
                    flag = k().o();
                    flag1 = k().p();
                    eev.g("Babel_FAB", (new StringBuilder(String.valueOf(layoutinflater).length() + 46)).append(layoutinflater).append(i1).append(" carrier_sms_only: ").append(flag).append(" sms: ").append(flag1).toString());
                }
                gdv.b("Primary action must be set at this point", n);
                return;
            }
            l1 = j1;
            j1 = i1;
            i1 = l1;
        } while (true);
    }

    public void a()
    {
        j();
        if (i != null)
        {
            i.removeAllViews();
            i = null;
        }
        if (m != null)
        {
            m.removeAllViews();
            m = null;
        }
        l = null;
        g = null;
        D = null;
        if (G != null)
        {
            G.clear();
            F.removeItem(G.getItem().getItemId());
        }
        F = null;
        G = null;
        t = null;
        u = null;
        v = null;
        w = null;
        x = null;
    }

    void a(float f1)
    {
        ((ViewGroup)g.getParent()).setTranslationX(-f1);
    }

    public void a(float f1, boolean flag)
    {
label0:
        {
            E = f1;
            if (i != null)
            {
                if (flag)
                {
                    i.animate().translationY(-1F * f1);
                } else
                {
                    i.setY(-1F * f1);
                }
            }
            if (D != null)
            {
                if (!flag || !l.isShowing())
                {
                    break label0;
                }
                D.startAnimation(new bfl(D, (int)f1));
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutparams = D.getLayoutParams();
        layoutparams.height = (int)f1;
        D.setLayoutParams(layoutparams);
    }

    public void a(int i1)
    {
        H = i1;
        if (g == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            float f1;
            if (i1 == 1)
            {
                f1 = k;
            } else
            {
                f1 = j;
            }
            b(f1);
        } else
        {
            float f2;
            if (i1 == 1)
            {
                f2 = k;
            } else
            {
                f2 = j;
            }
            a(f2);
        }
        if (i1 == 1)
        {
            h.setVisibility(0);
            g.a(i());
            return;
        }
        if (eep.a(f))
        {
            h.setVisibility(4);
            return;
        } else
        {
            g.a(a);
            return;
        }
    }

    public void a(ai ai1, ViewGroup viewgroup, Menu menu)
    {
        int i1 = f.getResources().getDisplayMetrics().heightPixels;
        int k1 = eco.a(f);
        int i2 = f.getResources().getDimensionPixelSize(g.lA);
        int j2 = f.getResources().getDimensionPixelSize(g.lA);
        int k2 = f.getResources().getDimensionPixelSize(g.lB);
        int l2 = f.getResources().getDimensionPixelSize(g.lC);
        L = (i1 - k1 - i2 - j2 - l2) / (k2 + l2);
        if (k() == null)
        {
            eev.c("Babel_FAB", "Not decorating since account is not yet available");
        } else
        {
            i = (FrameLayout)viewgroup.findViewById(h.bv);
            ai1 = ai1.getLayoutInflater();
            ai1.inflate(h.ht, i, true);
            l = new Dialog(f, 0x1030009);
            viewgroup = l.getWindow();
            viewgroup.setBackgroundDrawable(new ColorDrawable(0));
            l.setCancelable(false);
            l.setOnKeyListener(new bff(this));
            m = (QuickButtonContainer)ai1.inflate(h.hv, null);
            m.setOnClickListener(new bfg(this));
            viewgroup.setContentView(m);
            D = (Space)m.findViewById(g.lD);
            viewgroup = new ArrayList();
            h();
            viewgroup.add(o);
            viewgroup.add(q);
            viewgroup.add(r);
            viewgroup.add(s);
            viewgroup.add(p);
            a(((LayoutInflater) (ai1)), ((ViewGroup) (m)), ((List) (viewgroup)));
            h = i.findViewById(g.lF);
            g = (FloatingActionButton)h.findViewById(g.lE);
            g.a(new bfe(this));
            B = g.getResources().getDimensionPixelSize(g.lA);
            j = 0;
            ai1 = ((WindowManager)g.getContext().getSystemService("window")).getDefaultDisplay();
            viewgroup = new Point();
            ai1.getSize(viewgroup);
            int j1 = ((Point) (viewgroup)).x;
            int l1 = g.getResources().getDimensionPixelSize(g.lz);
            k = (j1 - B) / 2 - l1;
            a(E, false);
            g.a(m.a());
            g.a(m.b());
            if (menu != null && eep.a(f))
            {
                F = menu;
                G = F.addSubMenu(0, h.eS, 0, g.lM);
                G.setIcon(com.google.android.apps.hangouts.R.drawable.bL);
                ja.a(G.getItem(), 2);
                h();
                if (o != null)
                {
                    t = G.add(o.a());
                    t.setOnMenuItemClickListener(A);
                }
                if (p != null)
                {
                    v = G.add(p.a());
                    v.setOnMenuItemClickListener(A);
                }
                if (q != null)
                {
                    u = G.add(q.a());
                    u.setOnMenuItemClickListener(A);
                }
                if (r != null)
                {
                    w = G.add(r.a());
                    w.setOnMenuItemClickListener(A);
                }
                if (s != null)
                {
                    x = G.add(s.a());
                    x.setOnMenuItemClickListener(A);
                    return;
                }
            }
        }
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        y.add(onclicklistener);
    }

    public void a(bew bew1)
    {
        I = bew1;
    }

    public void a(boolean flag)
    {
        if (i != null)
        {
            FrameLayout framelayout = i;
            int i1;
            if (flag)
            {
                i1 = 0;
            } else
            {
                i1 = 4;
            }
            framelayout.setVisibility(i1);
        }
    }

    public lg b()
    {
        return new bfi(this);
    }

    void b(float f1)
    {
        if (eep.d())
        {
            ((ViewGroup)g.getParent()).setTranslationX(f1);
            return;
        } else
        {
            ((ViewGroup)g.getParent()).setTranslationX(-f1);
            return;
        }
    }

    public void b(android.view.View.OnClickListener onclicklistener)
    {
        y.remove(onclicklistener);
    }

    public void c()
    {
        if (H == 1)
        {
            g.a(e, bfc.a);
            g.setContentDescription(g.getResources().getString(g.lN));
        }
    }

    public void c(android.view.View.OnClickListener onclicklistener)
    {
        z = onclicklistener;
    }

    public void d()
    {
        if (H == 1)
        {
            g.a(e);
            g.setContentDescription(g.getResources().getString(g.lN));
        }
    }

    public void e()
    {
        if (H == 1)
        {
            g.a(d, bfc.b);
            g.setContentDescription(g.getResources().getString(g.lL));
        }
    }

    public void f()
    {
        g.callOnClick();
    }

    public boolean g()
    {
        if (m != null && l != null && l.isShowing())
        {
            j();
            return true;
        } else
        {
            return false;
        }
    }

    void h()
    {
        if (!k().o()) goto _L2; else goto _L1
_L1:
        o = null;
        p = null;
_L4:
        q = null;
_L5:
        if (k().p())
        {
            r = (cgj)hlp.b(f, cgj);
        } else
        {
            r = null;
        }
        if (K.a(f, k()))
        {
            s = (bep)hlp.b(f, bep);
            return;
        } else
        {
            s = null;
            return;
        }
_L2:
        o = (cgh)hlp.b(f, cgh);
        p = (cgk)hlp.b(f, cgk);
        if (!g.a(k(), aqc.g)) goto _L4; else goto _L3
_L3:
        q = (cgi)hlp.b(f, cgi);
          goto _L5
    }

    public int i()
    {
        if (I != null && I.a() == 1)
        {
            return e;
        } else
        {
            return d;
        }
    }

    void j()
    {
        if (l != null && l.isShowing())
        {
            l.dismiss();
        }
        if (g != null)
        {
            g.a(a, bfc.b);
        }
        if (i != null)
        {
            i.setBackgroundResource(0);
        }
    }

    aoa k()
    {
        return dcn.e(J.a());
    }

    static 
    {
        a = h.hn;
        b = h.ho;
        c = h.hr;
        d = h.hp;
        e = h.hq;
    }
}
