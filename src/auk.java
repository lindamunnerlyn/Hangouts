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

public final class auk extends hhu
    implements android.view.View.OnClickListener, android.widget.TabHost.OnTabChangeListener, ata
{

    private ArrayList a;
    private ContentObserver aj;
    private aur b;
    private int c;
    private TabWidget d;
    private atb e;
    private int f;
    private String g;
    private SharedPreferences h;
    private final gsb i = new aul(this);

    public auk()
    {
        a = new ArrayList();
        c = -1;
        f = -1;
        g = "";
    }

    static int a(auk auk1)
    {
        return auk1.c;
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
        g.b(flag);
        bb1.setOnTabChangedListener(null);
        bb1.clearAllTabs();
        for (; j < a.size(); j++)
        {
            Object obj = ((aup)a.get(j)).a;
            android.widget.TabHost.TabSpec tabspec = bb1.newTabSpec(((azn) (obj)).c().getName());
            obj = View.inflate(getActivity(), ((azn) (obj)).a(), null);
            ebr.a(((View) (obj)), true);
            tabspec.setIndicator(((View) (obj)));
            bb1.a(tabspec, ayx);
            ((View) (obj)).setOnClickListener(new auq(this, j));
        }

        bb1.setOnTabChangedListener(this);
    }

    private boolean a(ArrayList arraylist, Class class1, int j)
    {
        class1 = (azn)binder.b(class1);
        if (class1 != null && class1.a(s()))
        {
            arraylist.add(new aup(class1, j));
            return true;
        } else
        {
            return false;
        }
    }

    static void b(auk auk1)
    {
        if (auk1.getView() != null)
        {
            List list = auk1.d();
            if (!auk1.a.equals(list))
            {
                auk1.b(-1);
                auk1.a.clear();
                auk1.a.addAll(list);
                auk1.a((bb)auk1.getView().findViewById(g.kg));
            }
        }
    }

    public static auk c()
    {
        return new auk();
    }

    private aur c(int j)
    {
        Object obj = ((aup)a.get(j)).a;
        obj = hhu.instantiate(context, ((azn) (obj)).c().getName());
        aur aur1 = (aur)obj;
        ap ap1 = getChildFragmentManager();
        ap1.a().b(g.kh, ((ad) (obj))).a().b();
        ap1.b();
        return aur1;
    }

    static ArrayList c(auk auk1)
    {
        return auk1.a;
    }

    private List d()
    {
        ArrayList arraylist = new ArrayList();
        a(arraylist, bar, 2294);
        a(arraylist, bax, 2159);
        if (!a(arraylist, bbp, 2160))
        {
            a(arraylist, baj, 2160);
        }
        a(arraylist, bca, 1922);
        a(arraylist, bbu, 2265);
        return arraylist;
    }

    private void d(int j)
    {
        Object obj = r();
        int k = 0;
        while (k < ((TabWidget) (obj)).getTabCount()) 
        {
            Object obj1 = (LinearLayout)((TabWidget) (obj)).getChildTabViewAt(k);
            if (obj1 != null)
            {
                obj1 = (ImageView)((LinearLayout) (obj1)).findViewWithTag("icon");
                ((ImageView) (obj1)).setColorFilter(getResources().getColor(g.jW), android.graphics.PorterDuff.Mode.SRC_IN);
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
                ((ImageView) (obj)).setColorFilter(getResources().getColor(g.jV), android.graphics.PorterDuff.Mode.SRC_IN);
                ((ImageView) (obj)).setBackgroundResource(g.kb);
            }
        }
    }

    static void d(auk auk1)
    {
        if (auk1.getView() != null)
        {
            auk1.e.b();
            FrameLayout framelayout = (FrameLayout)auk1.getView().findViewById(g.kh);
            android.view.ViewGroup.LayoutParams layoutparams = framelayout.getLayoutParams();
            layoutparams.height = auk1.f;
            framelayout.setLayoutParams(layoutparams);
            framelayout.setVisibility(0);
            auk1.d(auk1.c);
            auk1.r().setStripEnabled(true);
        }
    }

    private void e()
    {
        e.a();
        g.a(new auo(this), 67L);
    }

    private void f()
    {
        getView().findViewById(g.kh).setVisibility(8);
        d(-1);
        q();
        r().setStripEnabled(false);
        if (c != -1)
        {
            e.c();
        }
    }

    private void q()
    {
        if (b != null)
        {
            View view = getView();
            if (view != null)
            {
                ((ViewGroup)view.findViewById(g.kh)).removeAllViews();
            }
            b.b();
            b = null;
        }
    }

    private TabWidget r()
    {
        return (TabWidget)g.d(d);
    }

    private ani s()
    {
        return dbf.e(((gmo)binder.a(gmo)).a());
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
            f();
            q();
            c = -1;
        } else
        if (isResumed())
        {
            if (c != j)
            {
                q();
                aup aup1 = (aup)a.get(j);
                azm azm1 = aup1.a.b();
                if (azm1 != null)
                {
                    boolean flag;
                    if (!azm1.a.isEmpty())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    gbh.a(flag);
                    if (!((chz)binder.a(chz)).a(azm1.a))
                    {
                        cia cia1 = (cia)binder.a(cia);
                        Bundle bundle = new Bundle();
                        bundle.putString("permission_picker_name", aup1.a());
                        cia1.a(g.km, azm1.a, azm1.b, bundle);
                        return;
                    }
                }
                b = c(j);
                g.a(s(), aup1.b);
            }
            if (b == null)
            {
                b = c(j);
            }
            if (c != j)
            {
                if (b.a())
                {
                    e();
                } else
                {
                    e.a();
                    f();
                }
            }
            c = j;
            return;
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        e = (atb)binder.a(atb);
        ((grz)binder.a(grz)).a(i);
        ((cia)binder.a(cia)).a(g.km, new aun(this));
        a.addAll(d());
    }

    public void onClick(View view)
    {
        e();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        aj = new aum(this, new Handler());
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
        j = getResources().getDimensionPixelSize(g.jY);
        f = h.getInt(g, j);
        layoutinflater = layoutinflater.inflate(g.kA, viewgroup, false);
        viewgroup = (bb)layoutinflater.findViewById(g.kg);
        viewgroup.a(getActivity(), getChildFragmentManager(), g.kk);
        d = viewgroup.getTabWidget();
        r().setStripEnabled(false);
        r().setDividerDrawable(g.ka);
        r().setLeftStripDrawable(g.ka);
        r().setRightStripDrawable(g.ka);
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

    public void onTabChanged(String s1)
    {
        for (int j = 0; j < a.size(); j++)
        {
            if (((aup)a.get(j)).a.c().getName().equals(s1))
            {
                b(j);
                return;
            }
        }

        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s1 = "Unknown ".concat(s1);
        } else
        {
            s1 = new String("Unknown ");
        }
        throw new IllegalStateException(s1);
    }
}
