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

public class bje extends hhu
    implements lg
{

    private static final jlr b;
    public final android.view.View.OnClickListener a = new bjf(this);
    private LinearLayout aj;
    private TextView ak;
    private TextView al;
    private View am;
    private EmojiCategoryPageIndicatorView an;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener ao = new bjg(this);
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener ap = new bjh(this);
    private final Runnable aq = new bji(this);
    private final Handler ar = new Handler();
    private final Map c = new gz();
    private bjm d;
    private ViewPager e;
    private bjp f;
    private TabHost g;
    private int h;
    private View i;

    public bje()
    {
        h = -1;
    }

    private Point a()
    {
        Point point = new Point();
        getActivity().getWindowManager().getDefaultDisplay().getSize(point);
        return point;
    }

    static bjm a(bje bje1)
    {
        return bje1.d;
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
        if (ebw.a("Babel", 3))
        {
            long l2 = SystemClock.elapsedRealtime();
            ebw.c("Babel", (new StringBuilder(91)).append("Emoji: Fragment write category ").append(k).append(" @").append(l2).append(" took: ").append(l2 - l1).toString());
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

    static void a(bje bje1, int k, boolean flag)
    {
        bje1.a(k, flag);
    }

    static ViewPager b(bje bje1)
    {
        return bje1.e;
    }

    private void b()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)aj.getLayoutParams();
        layoutparams.height = Math.round((float)getActivity().getResources().getDimensionPixelSize(g.ef) * 0.15F);
        aj.setLayoutParams(layoutparams);
    }

    static bjp c(bje bje1)
    {
        return bje1.f;
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

    static Point d(bje bje1)
    {
        return bje1.a();
    }

    static int e(bje bje1)
    {
        return bje1.h;
    }

    static void f(bje bje1)
    {
        bje1.f = new bjp(bje1.getActivity(), bje1.d, bje1.a().x, bje1.d(), bje1.q(), bje1.r(), bje1.f());
        bje1.e.a(bje1);
        bje1.e.b(1);
        bje1.e.a(bje1.f);
        bje1.e.setAccessibilityDelegate(new bjn());
        bje1.e.postInvalidate();
        bje1.a(bje1.getActivity().getSharedPreferences("recentEmoji", 0).getInt("lastCategoryKey", 1), true);
    }

    static Runnable g(bje bje1)
    {
        return bje1.aq;
    }

    static Handler h(bje bje1)
    {
        return bje1.ar;
    }

    static Map i(bje bje1)
    {
        return bje1.c;
    }

    static void j(bje bje1)
    {
        bje1.c();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        layoutinflater = layoutinflater.inflate(e(), viewgroup, false);
        g = (TabHost)layoutinflater.findViewById(h.bk);
        g.setup();
        a(g, "Recent", h.fn, g.co, 0);
        a(g, "People", h.bu, g.cm, 1);
        a(g, "Objects", h.dW, g.cl, 2);
        a(g, "Nature", h.dR, g.ck, 3);
        a(g, "Places", h.eC, g.cn, 4);
        a(g, "Symbols", h.gn, g.cp, 5);
        g.setOnTabChangedListener(new bjk(this));
        g.getTabWidget().setStripEnabled(true);
        e = (ViewPager)layoutinflater.findViewById(h.bq);
        e.getViewTreeObserver().addOnGlobalLayoutListener(ap);
        an = (EmojiCategoryPageIndicatorView)layoutinflater.findViewById(h.bj);
        viewgroup = getResources();
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)an.getLayoutParams();
        layoutparams.height = (int)viewgroup.getDimension(g.ei);
        an.setLayoutParams(layoutparams);
        i = layoutinflater.findViewById(h.bo);
        i.setOnTouchListener(new bjl(this));
        return layoutinflater;
    }

    public ImageView a(Context context, int k)
    {
        context = new ImageView(context);
        k = g.a((Integer)b.get(Integer.valueOf(k)), 0);
        context.setImageDrawable(getResources().getDrawable(k));
        context.setLayoutParams(new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F));
        k = getResources().getDimensionPixelOffset(g.ek);
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

    public void a(bjm bjm)
    {
        d = bjm;
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
        return g.fQ;
    }

    public Integer f()
    {
        return null;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        int k = getActivity().getResources().getDimensionPixelSize(g.ef);
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
        if (ebw.a("Babel", 3))
        {
            long l = SystemClock.elapsedRealtime();
            ebw.c("Babel", (new StringBuilder(46)).append("Emoji: Fragment onCreate @").append(l).toString());
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        long l = SystemClock.elapsedRealtime();
        layoutinflater = a(layoutinflater, viewgroup);
        aj = (LinearLayout)layoutinflater.findViewById(h.bi);
        b();
        ak = (TextView)layoutinflater.findViewById(h.bm);
        ak.setOnClickListener(a);
        al = (TextView)layoutinflater.findViewById(h.bn);
        al.setOnClickListener(a);
        am = layoutinflater.findViewById(h.bp);
        am.setOnClickListener(new bjj(this));
        if (ebw.a("Babel", 3))
        {
            long l1 = SystemClock.elapsedRealtime();
            ebw.c("Babel", (new StringBuilder(77)).append("Emoji: Fragment onCreateView @").append(l1).append(" took: ").append(l1 - l).toString());
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        gke.a(e, ao);
        gke.a(e, ap);
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
        b = (new jls()).a(Integer.valueOf(0), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bi)).a(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.be)).a(Integer.valueOf(2), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bc)).a(Integer.valueOf(3), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.ba)).a(Integer.valueOf(4), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bg)).a(Integer.valueOf(5), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bk)).a();
    }
}
