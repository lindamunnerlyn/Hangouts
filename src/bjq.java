// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.view.ViewPager;
import android.util.Pair;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.EmojiCategoryPageIndicatorView;
import java.util.Map;

public class bjq extends hmm
    implements lg
{

    private static final jso b;
    public final android.view.View.OnClickListener a = new bjr(this);
    private LinearLayout aj;
    private TextView ak;
    private TextView al;
    private View am;
    private EmojiCategoryPageIndicatorView an;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener ao = new bjs(this);
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener ap = new bjt(this);
    private final Runnable aq = new bju(this);
    private final Handler ar = new Handler();
    private final Map c = new gz();
    private bjy d;
    private ViewPager e;
    private bkb f;
    private TabHost g;
    private int h;
    private View i;

    public bjq()
    {
        h = -1;
    }

    private Point a()
    {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    static bjy a(bjq bjq1)
    {
        return bjq1.d;
    }

    private void a(int k, boolean flag)
    {
        if (h == k && !flag)
        {
            return;
        }
        h = k;
        int l = f.d(k);
        int i1 = e.c();
        i1 = g.a((Integer)f.b(i1).first, 0);
        if (flag || i1 != k)
        {
            e.a(l, false);
        }
        Object obj = e.findViewWithTag(Integer.valueOf(l));
        if (obj != null)
        {
            ((View) (obj)).sendAccessibilityEvent(2048);
        }
        if (flag || g.getCurrentTab() != k)
        {
            g.setCurrentTab(k);
        }
        k = h;
        long l1 = SystemClock.elapsedRealtime();
        obj = getActivity().getSharedPreferences("recentEmoji", 0).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("lastCategoryKey", k);
        ((android.content.SharedPreferences.Editor) (obj)).apply();
        if (eev.a("Babel", 3))
        {
            long l2 = SystemClock.elapsedRealtime();
            eev.c("Babel", (new StringBuilder(91)).append("Emoji: Fragment write category ").append(k).append(" @").append(l2).append(" took: ").append(l2 - l1).toString());
        }
        c(h);
    }

    private void a(TabHost tabhost, String s1, int k, int l, int i1)
    {
        ImageView imageview = a(tabhost.getContext(), i1);
        imageview.setContentDescription(getString(l));
        android.widget.TabHost.TabSpec tabspec = tabhost.newTabSpec(s1);
        tabspec.setContent(k);
        tabspec.setIndicator(imageview);
        tabhost.addTab(tabspec);
        c.put(s1, Integer.valueOf(i1));
    }

    static void a(bjq bjq1, int k, boolean flag)
    {
        bjq1.a(k, flag);
    }

    static ViewPager b(bjq bjq1)
    {
        return bjq1.e;
    }

    private void b()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)aj.getLayoutParams();
        layoutparams.height = Math.round((float)getActivity().getResources().getDimensionPixelSize(g.ed) * 0.15F);
        aj.setLayoutParams(layoutparams);
    }

    static bkb c(bjq bjq1)
    {
        return bjq1.f;
    }

    private void c()
    {
        if (an == null)
        {
            return;
        } else
        {
            int k = e.c();
            Pair pair = f.b(k);
            k = g.a((Integer)pair.second, 0);
            int l = f.a(g.a((Integer)pair.first, 0));
            an.a(l, k, 0.0F);
            return;
        }
    }

    static Point d(bjq bjq1)
    {
        return bjq1.a();
    }

    static int e(bjq bjq1)
    {
        return bjq1.h;
    }

    static void f(bjq bjq1)
    {
        bjq1.f = new bkb(bjq1.getActivity(), bjq1.d, bjq1.a().x, bjq1.d(), bjq1.q(), bjq1.r(), bjq1.f());
        bjq1.e.a(bjq1);
        bjq1.e.b(1);
        bjq1.e.a(bjq1.f);
        bjq1.e.setAccessibilityDelegate(new bjz());
        bjq1.e.postInvalidate();
        bjq1.a(bjq1.getActivity().getSharedPreferences("recentEmoji", 0).getInt("lastCategoryKey", 1), true);
    }

    static Runnable g(bjq bjq1)
    {
        return bjq1.aq;
    }

    static Handler h(bjq bjq1)
    {
        return bjq1.ar;
    }

    static Map i(bjq bjq1)
    {
        return bjq1.c;
    }

    static void j(bjq bjq1)
    {
        bjq1.c();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(e(), viewgroup, false);
        g = (TabHost)layoutinflater.findViewById(h.be);
        g.setup();
        a(g, "Recent", h.eV, g.co, 0);
        a(g, "People", h.bo, g.cm, 1);
        a(g, "Objects", h.dN, g.cl, 2);
        a(g, "Nature", h.dI, g.ck, 3);
        a(g, "Places", h.el, g.cn, 4);
        a(g, "Symbols", h.fV, g.cp, 5);
        g.setOnTabChangedListener(new bjw(this));
        g.getTabWidget().setStripEnabled(true);
        e = (ViewPager)layoutinflater.findViewById(h.bk);
        e.getViewTreeObserver().addOnGlobalLayoutListener(ap);
        an = (EmojiCategoryPageIndicatorView)layoutinflater.findViewById(h.bd);
        viewgroup = getResources();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)an.getLayoutParams();
        layoutparams.height = (int)viewgroup.getDimension(g.eg);
        an.setLayoutParams(layoutparams);
        i = layoutinflater.findViewById(h.bi);
        i.setOnTouchListener(new bjx(this));
        return layoutinflater;
    }

    public ImageView a(Context context, int k)
    {
        context = new ImageView(context);
        k = g.a((Integer)b.get(Integer.valueOf(k)), 0);
        context.setImageDrawable(getResources().getDrawable(k));
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
        k = getResources().getDimensionPixelOffset(g.ei);
        context.setPadding(k, k, k, k);
        return context;
    }

    public void a(int k)
    {
        a(g.a((Integer)f.b(k).first, 0), false);
        c();
    }

    public void a(int k, float f1, int l)
    {
        Pair pair = f.b(k);
        k = g.a((Integer)pair.first, 0);
        l = g.a(Integer.valueOf(f.a(k)), 0);
        int i1 = e.c();
        Pair pair1 = f.b(i1);
        i1 = g.a((Integer)pair1.second, 0);
        int j1 = f.a(g.a((Integer)pair1.first, 0));
        if (k == h)
        {
            an.a(l, g.a((Integer)pair.second, 0), f1);
        } else
        {
            if (k > h)
            {
                an.a(j1, i1, f1);
                return;
            }
            if (k < h)
            {
                an.a(j1, i1, f1 - 1.0F);
                return;
            }
        }
    }

    public void a(bjy bjy)
    {
        d = bjy;
    }

    public void b(int k)
    {
    }

    public void c(int k)
    {
    }

    public int d()
    {
        return e.getHeight();
    }

    public int e()
    {
        return g.fO;
    }

    public Integer f()
    {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int k = getActivity().getResources().getDimensionPixelSize(g.ed);
        configuration = getView();
        if (configuration != null)
        {
            configuration.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, k));
        }
        e.getViewTreeObserver().addOnGlobalLayoutListener(ao);
        if (aj != null)
        {
            b();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (eev.a("Babel", 3))
        {
            long l = SystemClock.elapsedRealtime();
            eev.c("Babel", (new StringBuilder(46)).append("Emoji: Fragment onCreate @").append(l).toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        long l = SystemClock.elapsedRealtime();
        layoutinflater = a(layoutinflater, viewgroup);
        aj = (LinearLayout)layoutinflater.findViewById(h.bc);
        b();
        ak = (TextView)layoutinflater.findViewById(h.bg);
        ak.setOnClickListener(a);
        al = (TextView)layoutinflater.findViewById(h.bh);
        al.setOnClickListener(a);
        am = layoutinflater.findViewById(h.bj);
        am.setOnClickListener(new bjv(this));
        if (eev.a("Babel", 3))
        {
            long l1 = SystemClock.elapsedRealtime();
            eev.c("Babel", (new StringBuilder(77)).append("Emoji: Fragment onCreateView @").append(l1).append(" took: ").append(l1 - l).toString());
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        gng.a(e, ao);
        gng.a(e, ap);
    }

    public void onLowMemory()
    {
        super.onLowMemory();
        if (f != null)
        {
            f.e();
        }
    }

    public int q()
    {
        return -1;
    }

    public boolean r()
    {
        return true;
    }

    public TabWidget s()
    {
        return g.getTabWidget();
    }

    static 
    {
        b = (new jsq()).a(Integer.valueOf(0), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.be)).a(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.ba)).a(Integer.valueOf(2), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.aY)).a(Integer.valueOf(3), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.aW)).a(Integer.valueOf(4), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bc)).a(Integer.valueOf(5), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bg)).a();
    }
}
