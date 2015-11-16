// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
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
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickContactView;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ben
    implements bef
{

    private static final int a;
    private static final int b;
    private static final int c;
    private static final int d;
    private static final int e;
    private static final String f[] = {
        "_id", "name", "gaia_id", "profile_photo_url"
    };
    private cfe A;
    private bdz B;
    private Menu C;
    private SubMenu D;
    private MenuItem E;
    private MenuItem F;
    private MenuItem G;
    private MenuItem H;
    private MenuItem I;
    private MenuItem J;
    private MenuItem K;
    private MenuItem L;
    private int M;
    private List N;
    private android.view.View.OnClickListener O;
    private beg P;
    private bez Q;
    private bew R;
    private gmo S;
    private dan T;
    private int U;
    private final bev g = new bev(this);
    private Context h;
    private FloatingActionButton i;
    private FrameLayout j;
    private int k;
    private int l;
    private int m;
    private Dialog n;
    private QuickButtonContainer o;
    private LinearLayout p;
    private Space q;
    private float r;
    private bee s;
    private QuickContactView t;
    private QuickContactView u;
    private QuickContactView v;
    private bey w;
    private cfc x;
    private cff y;
    private cfd z;

    ben(Context context)
    {
        w = new bey(this);
        M = 0;
        N = new ArrayList();
        Q = new bez(this);
        R = new bew(this);
        h = context;
        S = (gmo)hgx.a(context, gmo);
        S.a(new beu(this));
        T = (dan)hgx.a(context, dan);
    }

    static cfe A(ben ben1)
    {
        return ben1.A;
    }

    static MenuItem B(ben ben1)
    {
        return ben1.I;
    }

    static bdz C(ben ben1)
    {
        return ben1.B;
    }

    static bew D(ben ben1)
    {
        return ben1.R;
    }

    static void E(ben ben1)
    {
        ben1.o();
    }

    static QuickContactView a(ben ben1)
    {
        return ben1.t;
    }

    private void a(float f1)
    {
        ((ViewGroup)i.getParent()).setTranslationX(-f1);
    }

    static void a(Context context, bee bee1)
    {
        bee1.a(context);
    }

    private void a(LayoutInflater layoutinflater, ViewGroup viewgroup, List list)
    {
        p = (LinearLayout)o.findViewById(g.lR);
        Iterator iterator = list.iterator();
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bee bee1 = (bee)iterator.next();
            if (bee1 != null)
            {
                ImageView imageview;
                boolean flag1;
                boolean flag3;
                boolean flag4;
                if (j1 == 0)
                {
                    list = viewgroup.findViewById(g.lP);
                    s = bee1;
                    boolean flag = true;
                    j1 = i1;
                    i1 = ((flag) ? 1 : 0);
                } else
                {
                    list = layoutinflater.inflate(h.hO, o, false);
                    p.addView(list, 3);
                    boolean flag2 = j1;
                    j1 = i1 + 1;
                    i1 = ((flag2) ? 1 : 0);
                }
                ((TextView)list.findViewById(g.lS)).setText(bee1.a());
                imageview = (ImageView)list.findViewById(g.lQ);
                if (imageview != null)
                {
                    imageview.setImageResource(bee1.b());
                }
                list.setOnClickListener(new bes(this, bee1));
                flag1 = j1;
                j1 = i1;
                i1 = ((flag1) ? 1 : 0);
            }
        } while (i1 != U);
        if (s == null)
        {
            layoutinflater = String.valueOf("primaryAction == null; account_id: ");
            i1 = q().h();
            flag3 = q().q();
            flag4 = q().r();
            ebw.g("Babel_FAB", (new StringBuilder(String.valueOf(layoutinflater).length() + 46)).append(layoutinflater).append(i1).append(" carrier_sms_only: ").append(flag3).append(" sms: ").append(flag4).toString());
        }
        gbh.b("Primary action must be set at this point", s);
    }

    static void a(ben ben1, float f1)
    {
        ben1.b(f1);
    }

    static void a(ben ben1, String s1, String s2, String s3)
    {
        RealTimeChatService.a(ben1.R);
        s1 = ais.a(daf.a(s1, s2), s2, s3);
        ben1.R.b = aik.newBuilder().a(s1).a();
        s1 = dhi.b();
        ben1.R.a = s1.a();
        RealTimeChatService.a(s1, (new dce(ben1.h)).a(ben1.q().h()).a(ben1.R.b).a(aob.c).a());
    }

    private void a(QuickContactView quickcontactview, Cursor cursor)
    {
        quickcontactview.b(cursor.getString(2));
        quickcontactview.a(cursor.getString(1));
        quickcontactview.a(cursor.getString(3), cursor.getString(1), q());
        quickcontactview.setVisibility(0);
    }

    static MenuItem b(ben ben1)
    {
        return ben1.J;
    }

    private void b(float f1)
    {
        if (ebr.d())
        {
            ((ViewGroup)i.getParent()).setTranslationX(f1);
            return;
        } else
        {
            ((ViewGroup)i.getParent()).setTranslationX(-f1);
            return;
        }
    }

    static void b(ben ben1, float f1)
    {
        ben1.a(f1);
    }

    static QuickContactView c(ben ben1)
    {
        return ben1.u;
    }

    static MenuItem d(ben ben1)
    {
        return ben1.K;
    }

    static QuickContactView e(ben ben1)
    {
        return ben1.v;
    }

    static MenuItem f(ben ben1)
    {
        return ben1.L;
    }

    static ani g(ben ben1)
    {
        return ben1.q();
    }

    static FrameLayout h(ben ben1)
    {
        return ben1.j;
    }

    static int i()
    {
        return a;
    }

    static QuickButtonContainer i(ben ben1)
    {
        return ben1.o;
    }

    static int j()
    {
        return b;
    }

    static bee j(ben ben1)
    {
        return ben1.s;
    }

    static int k()
    {
        return c;
    }

    static FloatingActionButton k(ben ben1)
    {
        return ben1.i;
    }

    static int l()
    {
        return d;
    }

    static Dialog l(ben ben1)
    {
        return ben1.n;
    }

    static int m()
    {
        return e;
    }

    static List m(ben ben1)
    {
        return ben1.N;
    }

    static android.view.View.OnClickListener n(ben ben1)
    {
        return ben1.O;
    }

    static String[] n()
    {
        return f;
    }

    private void o()
    {
        if (!q().q()) goto _L2; else goto _L1
_L1:
        x = null;
        y = null;
_L4:
        z = null;
_L5:
        if (q().r())
        {
            A = (cfe)hgx.b(h, cfe);
        } else
        {
            A = null;
        }
        if (T.a(h, q()))
        {
            B = (bdz)hgx.b(h, bdz);
            return;
        } else
        {
            B = null;
            return;
        }
_L2:
        x = (cfc)hgx.b(h, cfc);
        y = (cff)hgx.b(h, cff);
        if (!g.a(q(), apk.g)) goto _L4; else goto _L3
_L3:
        z = (cfd)hgx.b(h, cfd);
          goto _L5
    }

    static void o(ben ben1)
    {
        ben1.p();
    }

    static int p(ben ben1)
    {
        return ben1.k;
    }

    private void p()
    {
        if (n != null && n.isShowing())
        {
            n.dismiss();
        }
        if (i != null)
        {
            i.a(a, bem.b);
        }
        if (j != null)
        {
            j.setBackgroundResource(0);
        }
    }

    static int q(ben ben1)
    {
        return ben1.l;
    }

    private ani q()
    {
        return dbf.e(S.a());
    }

    static Context r(ben ben1)
    {
        return ben1.h;
    }

    static bey s(ben ben1)
    {
        return ben1.w;
    }

    static MenuItem t(ben ben1)
    {
        return ben1.E;
    }

    static cfc u(ben ben1)
    {
        return ben1.x;
    }

    static MenuItem v(ben ben1)
    {
        return ben1.G;
    }

    static cff w(ben ben1)
    {
        return ben1.y;
    }

    static MenuItem x(ben ben1)
    {
        return ben1.F;
    }

    static cfd y(ben ben1)
    {
        return ben1.z;
    }

    static MenuItem z(ben ben1)
    {
        return ben1.H;
    }

    public lg a()
    {
        return new bet(this);
    }

    public void a(float f1, boolean flag)
    {
label0:
        {
            r = f1;
            if (j != null)
            {
                if (flag)
                {
                    j.animate().translationY(-1F * f1);
                } else
                {
                    j.setY(-1F * f1);
                }
            }
            if (q != null)
            {
                if (!flag || !n.isShowing())
                {
                    break label0;
                }
                q.startAnimation(new bex(q, (int)f1));
            }
            return;
        }
        android.view.ViewGroup.LayoutParams layoutparams = q.getLayoutParams();
        layoutparams.height = (int)f1;
        q.setLayoutParams(layoutparams);
    }

    public void a(int i1)
    {
        M = i1;
        if (i == null)
        {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            float f1;
            if (i1 == 1)
            {
                f1 = l;
            } else
            {
                f1 = k;
            }
            b(f1);
        } else
        {
            float f2;
            if (i1 == 1)
            {
                f2 = l;
            } else
            {
                f2 = k;
            }
            a(f2);
        }
        if (i1 == 1)
        {
            i.setVisibility(0);
            i.a(g());
            return;
        }
        if (ebr.a(h))
        {
            i.setVisibility(4);
            return;
        } else
        {
            i.a(a);
            return;
        }
    }

    public void a(ai ai1)
    {
        ai1.f().a(0);
        p();
        if (j != null)
        {
            j.removeAllViews();
            j = null;
        }
        if (o != null)
        {
            o.removeAllViews();
            o = null;
        }
        n = null;
        if (t != null)
        {
            t.d();
            t = null;
        }
        if (u != null)
        {
            u.d();
            u = null;
        }
        if (v != null)
        {
            v.d();
            v = null;
        }
        i = null;
        q = null;
        if (D != null)
        {
            D.clear();
            C.removeItem(D.getItem().getItemId());
        }
        C = null;
        D = null;
        J = null;
        K = null;
        L = null;
        E = null;
        F = null;
        G = null;
        H = null;
        I = null;
    }

    public void a(ai ai1, ViewGroup viewgroup, Menu menu)
    {
        int i1 = h.getResources().getDisplayMetrics().heightPixels;
        int k1 = dzk.a(h);
        int i2 = h.getResources().getDimensionPixelSize(g.lI);
        int j2 = h.getResources().getDimensionPixelSize(g.lI);
        int k2 = h.getResources().getDimensionPixelSize(g.lJ);
        int l2 = h.getResources().getDimensionPixelSize(g.lK);
        U = (i1 - k1 - i2 - j2 - l2) / (k2 + l2);
        if (q() == null)
        {
            ebw.c("Babel_FAB", "Not decorating since account is not yet available");
        } else
        {
            j = (FrameLayout)viewgroup.findViewById(h.bB);
            viewgroup = ai1.getLayoutInflater();
            viewgroup.inflate(h.hN, j, true);
            n = new Dialog(h, 0x1030009);
            Object obj = n.getWindow();
            ((Window) (obj)).setBackgroundDrawable(new ColorDrawable(0));
            n.setCancelable(false);
            n.setOnKeyListener(new beq(this));
            o = (QuickButtonContainer)viewgroup.inflate(h.hP, null);
            o.setOnClickListener(new ber(this));
            ((Window) (obj)).setContentView(o);
            q = (Space)o.findViewById(g.lM);
            obj = new ArrayList();
            o();
            ((List) (obj)).add(x);
            ((List) (obj)).add(z);
            ((List) (obj)).add(A);
            ((List) (obj)).add(B);
            ((List) (obj)).add(y);
            a(((LayoutInflater) (viewgroup)), ((ViewGroup) (o)), ((List) (obj)));
            t = (QuickContactView)o.findViewById(g.lT);
            t.setOnClickListener(w);
            u = (QuickContactView)o.findViewById(g.lU);
            u.setOnClickListener(w);
            v = (QuickContactView)o.findViewById(g.lV);
            v.setOnClickListener(w);
            i = (FloatingActionButton)j.findViewById(g.lN);
            i.a(new bep(this));
            m = i.getResources().getDimensionPixelSize(g.lI);
            k = 0;
            viewgroup = ((WindowManager)i.getContext().getSystemService("window")).getDefaultDisplay();
            obj = new Point();
            viewgroup.getSize(((Point) (obj)));
            int j1 = ((Point) (obj)).x;
            int l1 = i.getResources().getDimensionPixelSize(g.lH);
            l = (j1 - m) / 2 - l1;
            a(r, false);
            i.a(o.a());
            i.a(o.b());
            ai1 = ai1.f();
            h();
            ai1.b(0, null, Q);
            if (menu != null && ebr.a(h))
            {
                C = menu;
                D = C.addSubMenu(0, h.fk, 0, g.lY);
                D.setIcon(com.google.android.apps.hangouts.R.drawable.bT);
                ja.a(D.getItem(), 2);
                D.getItem().setOnMenuItemClickListener(new beo(this));
                o();
                if (x != null)
                {
                    E = D.add(x.a());
                    E.setOnMenuItemClickListener(g);
                }
                if (y != null)
                {
                    G = D.add(y.a());
                    G.setOnMenuItemClickListener(g);
                }
                if (z != null)
                {
                    F = D.add(z.a());
                    F.setOnMenuItemClickListener(g);
                }
                if (A != null)
                {
                    H = D.add(A.a());
                    H.setOnMenuItemClickListener(g);
                }
                if (B != null)
                {
                    I = D.add(B.a());
                    I.setOnMenuItemClickListener(g);
                }
                J = D.add("");
                J.setOnMenuItemClickListener(g);
                K = D.add("");
                K.setOnMenuItemClickListener(g);
                L = D.add("");
                L.setOnMenuItemClickListener(g);
                return;
            }
        }
    }

    void a(Cursor cursor)
    {
        if (cursor != null)
        {
            int i1 = p.getChildCount();
            i1 = U - (i1 - 5);
            if (cursor.moveToFirst() && i1 > 0)
            {
                a(t, cursor);
            }
            if (cursor.moveToNext() && i1 > 1)
            {
                a(u, cursor);
            }
            if (cursor.moveToNext() && i1 > 2)
            {
                a(v, cursor);
                return;
            }
        }
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        N.add(onclicklistener);
    }

    public void a(beg beg1)
    {
        P = beg1;
    }

    public void a(boolean flag)
    {
        if (j != null)
        {
            FrameLayout framelayout = j;
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

    public void b()
    {
        if (M == 1)
        {
            i.a(e, bem.a);
            i.setContentDescription(i.getResources().getString(g.lZ));
        }
    }

    public void b(android.view.View.OnClickListener onclicklistener)
    {
        N.remove(onclicklistener);
    }

    public void c()
    {
        if (M == 1)
        {
            i.a(e);
            i.setContentDescription(i.getResources().getString(g.lZ));
        }
    }

    public void c(android.view.View.OnClickListener onclicklistener)
    {
        O = onclicklistener;
    }

    public void d()
    {
        if (M == 1)
        {
            i.a(d, bem.b);
            i.setContentDescription(i.getResources().getString(g.lX));
        }
    }

    public void e()
    {
        i.callOnClick();
    }

    public boolean f()
    {
        if (o != null && n != null && n.isShowing())
        {
            p();
            return true;
        } else
        {
            return false;
        }
    }

    public int g()
    {
        if (P != null && P.a() == 1)
        {
            return e;
        } else
        {
            return d;
        }
    }

    void h()
    {
        if (t != null)
        {
            t.setVisibility(8);
        }
        if (u != null)
        {
            u.setVisibility(8);
        }
        if (v != null)
        {
            v.setVisibility(8);
        }
    }

    static 
    {
        a = h.hH;
        b = h.hI;
        c = h.hL;
        d = h.hJ;
        e = h.hK;
    }
}
