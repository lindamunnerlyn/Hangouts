// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabWidget;
import java.util.ArrayList;
import java.util.List;

public final class avb extends hmm
    implements android.view.View.OnClickListener, android.widget.TabHost.OnTabChangeListener, atq
{

    private ArrayList a;
    private ContentObserver aj;
    private avi b;
    private int c;
    private TabWidget d;
    private atr e;
    private int f;
    private String g;
    private SharedPreferences h;
    private final gwm i = new avc(this);

    public avb()
    {
        a = new ArrayList();
        c = -1;
        f = -1;
        g = "";
    }

    static int a(avb avb1)
    {
        return avb1.c;
    }

    private void a(bb bb1)
    {
        int j = 0;
        boolean flag;
        if (!a.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.d(flag);
        bb1.setOnTabChangedListener(null);
        bb1.clearAllTabs();
        for (; j < a.size(); j++)
        {
            Object obj = ((avg)a.get(j)).a;
            android.widget.TabHost.TabSpec tabspec = bb1.newTabSpec(((bac) (obj)).c().getName());
            obj = View.inflate(getActivity(), ((bac) (obj)).a(), null);
            eep.a(((View) (obj)), true);
            tabspec.setIndicator(((View) (obj)));
            bb1.a(tabspec, azl);
            ((View) (obj)).setOnClickListener(new avh(this, j));
        }

        bb1.setOnTabChangedListener(this);
    }

    private boolean a(ArrayList arraylist, Class class1, int j)
    {
        class1 = (bac)binder.b(class1);
        if (class1 != null && class1.a(r()))
        {
            arraylist.add(new avg(class1, j));
            return true;
        } else
        {
            return false;
        }
    }

    static void b(avb avb1)
    {
        if (avb1.getView() != null)
        {
            List list = avb1.c();
            if (!avb1.a.equals(list))
            {
                avb1.b(-1);
                avb1.a.clear();
                avb1.a.addAll(list);
                avb1.a((bb)avb1.getView().findViewById(g.jZ));
            }
        }
    }

    private avi c(int j)
    {
        Object obj = ((avg)a.get(j)).a;
        obj = hmm.instantiate(context, ((bac) (obj)).c().getName());
        avi avi1 = (avi)obj;
        ap ap1 = getChildFragmentManager();
        ap1.a().b(g.ka, ((ad) (obj))).a().b();
        ap1.b();
        return avi1;
    }

    static ArrayList c(avb avb1)
    {
        return avb1.a;
    }

    private List c()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, bbh, 2294);
        a(arraylist, bbn, 2159);
        if (!a(arraylist, bcf, 2160))
        {
            a(arraylist, baz, 2160);
        }
        a(arraylist, bcq, 1922);
        a(arraylist, bck, 2265);
        return arraylist;
    }

    private void d()
    {
        e.a();
        g.a(new avf(this), 67L);
    }

    private void d(int j)
    {
        Object obj = q();
        int k = 0;
        while (k < ((TabWidget) (obj)).getTabCount()) 
        {
            Object obj1 = (LinearLayout)((TabWidget) (obj)).getChildTabViewAt(k);
            if (obj1 != null)
            {
                obj1 = (ImageView)((LinearLayout) (obj1)).findViewWithTag("icon");
                ((ImageView) (obj1)).setColorFilter(getResources().getColor(g.jP), android.graphics.PorterDuff.Mode.SRC_IN);
                if (android.os.Build.VERSION.SDK_INT >= 16)
                {
                    ((ImageView) (obj1)).setBackground(null);
                } else
                {
                    ((ImageView) (obj1)).setBackgroundDrawable(null);
                }
            }
            k++;
        }
        if (j >= 0)
        {
            obj = (LinearLayout)((TabWidget) (obj)).getChildTabViewAt(j);
            if (obj != null)
            {
                obj = (ImageView)((LinearLayout) (obj)).findViewWithTag("icon");
                ((ImageView) (obj)).setColorFilter(getResources().getColor(g.jO), android.graphics.PorterDuff.Mode.SRC_IN);
                ((ImageView) (obj)).setBackgroundResource(g.jU);
            }
        }
    }

    static void d(avb avb1)
    {
        if (avb1.getView() != null)
        {
            avb1.e.b();
            FrameLayout framelayout = (FrameLayout)avb1.getView().findViewById(g.ka);
            android.view.ViewGroup.LayoutParams layoutparams = framelayout.getLayoutParams();
            layoutparams.height = avb1.f;
            framelayout.setLayoutParams(layoutparams);
            framelayout.setVisibility(0);
            avb1.d(avb1.c);
            avb1.q().setStripEnabled(true);
        }
    }

    private void e()
    {
        getView().findViewById(g.ka).setVisibility(8);
        d(-1);
        f();
        q().setStripEnabled(false);
        if (c != -1)
        {
            e.c();
        }
    }

    private void f()
    {
        if (b != null)
        {
            View view = getView();
            if (view != null)
            {
                ((ViewGroup)view.findViewById(g.ka)).removeAllViews();
            }
            b.b();
            b = null;
        }
    }

    private TabWidget q()
    {
        return (TabWidget)g.e(d);
    }

    private aoa r()
    {
        return dcn.e(((gqu)binder.a(gqu)).a());
    }

    public void a()
    {
        if (b != null && b.c())
        {
            b();
        }
    }

    public void a(int j)
    {
        f = j;
        android.content.SharedPreferences.Editor editor = h.edit();
        editor.putInt(g, j);
        editor.apply();
    }

    public void b()
    {
        b(-1);
    }

    void b(int j)
    {
        if (j == -1)
        {
            e();
            f();
            c = -1;
        } else
        if (isResumed())
        {
            if (c != j)
            {
                f();
                avg avg1 = (avg)a.get(j);
                bab bab1 = avg1.a.b();
                if (bab1 != null)
                {
                    boolean flag;
                    if (!bab1.a.isEmpty())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    gdv.a("Expected condition to be true", flag);
                    if (!((cjf)binder.a(cjf)).a(bab1.a))
                    {
                        cjg cjg1 = (cjg)binder.a(cjg);
                        Bundle bundle = new Bundle();
                        bundle.putString("permission_picker_name", avg1.a());
                        cjg1.a(g.kf, bab1.a, bab1.b, bundle);
                        return;
                    }
                }
                b = c(j);
                g.a(r(), avg1.b);
            }
            if (b == null)
            {
                b = c(j);
            }
            if (c != j)
            {
                if (b.a())
                {
                    d();
                } else
                {
                    e.a();
                    e();
                }
            }
            c = j;
            return;
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        e = (atr)binder.a(atr);
        ((gwk)binder.a(gwk)).a(i);
        ((cjg)binder.a(cjg)).a(g.kf, new ave(this));
        a.addAll(c());
    }

    public void onClick(View view)
    {
        d();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aj = new avd(this, new Handler());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        h = context.getSharedPreferences("attachment_prefs", 0);
        int j;
        if (getActivity().getResources().getConfiguration().orientation == 2)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            bundle = "attachment_area_height_landscape";
        } else
        {
            bundle = "attachment_area_height_portrait";
        }
        g = bundle;
        j = getResources().getDimensionPixelSize(g.jR);
        f = h.getInt(g, j);
        layoutinflater = layoutinflater.inflate(g.kt, viewgroup, false);
        viewgroup = (bb)layoutinflater.findViewById(g.jZ);
        viewgroup.a(getActivity(), getChildFragmentManager(), g.kd);
        d = viewgroup.getTabWidget();
        q().setStripEnabled(false);
        q().setDividerDrawable(g.jT);
        q().setLeftStripDrawable(g.jT);
        q().setRightStripDrawable(g.jT);
        a(viewgroup);
        return layoutinflater;
    }

    public void onPause()
    {
        context.getContentResolver().unregisterContentObserver(aj);
        e.a();
        b(-1);
        super.onPause();
    }

    public void onResume()
    {
        b(-1);
        super.onResume();
        context.getContentResolver().registerContentObserver(android.provider.Settings.Secure.getUriFor("default_input_method"), false, aj);
    }

    public void onTabChanged(String s)
    {
        for (int j = 0; j < a.size(); j++)
        {
            if (((avg)a.get(j)).a.c().getName().equals(s))
            {
                b(j);
                return;
            }
        }

        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Unknown ".concat(s);
        } else
        {
            s = new String("Unknown ");
        }
        throw new IllegalStateException(s);
    }
}
