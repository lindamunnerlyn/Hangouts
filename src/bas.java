// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabWidget;
import android.widget.TextView;

public class bas extends bje
    implements aur
{

    private static final jlr b;
    private aye c;

    public bas()
    {
    }

    static hgx a(bas bas1)
    {
        return bas1.binder;
    }

    static aye b(bas bas1)
    {
        return bas1.c;
    }

    static hgx c(bas bas1)
    {
        return bas1.binder;
    }

    static hgx d(bas bas1)
    {
        return bas1.binder;
    }

    protected ImageView a(Context context, int i)
    {
        context = (ImageView)LayoutInflater.from(context).inflate(g.kV, null);
        i = g.a((Integer)b.get(Integer.valueOf(i)), 0);
        context.setImageDrawable(getResources().getDrawable(i));
        return context;
    }

    public boolean a()
    {
        c.E();
        return true;
    }

    public void b()
    {
    }

    protected void c(int i)
    {
        TabWidget tabwidget = s();
        int j = 0;
        do
        {
            while (j < tabwidget.getTabCount()) 
            {
                Object obj = tabwidget.getChildTabViewAt(j);
                if (obj != null)
                {
                    obj = (ImageView)((View) (obj)).findViewWithTag("icon");
                    int k = ((ImageView) (obj)).getPaddingLeft();
                    int l = ((ImageView) (obj)).getPaddingTop();
                    int i1 = ((ImageView) (obj)).getPaddingRight();
                    int j1 = ((ImageView) (obj)).getPaddingBottom();
                    if (i == j)
                    {
                        ((ImageView) (obj)).setColorFilter(getResources().getColor(h.ht), android.graphics.PorterDuff.Mode.SRC_IN);
                        ((ImageView) (obj)).setBackgroundResource(h.hx);
                    } else
                    {
                        ((ImageView) (obj)).setColorFilter(getResources().getColor(h.hv), android.graphics.PorterDuff.Mode.SRC_IN);
                        if (android.os.Build.VERSION.SDK_INT >= 16)
                        {
                            ((ImageView) (obj)).setBackground(null);
                        } else
                        {
                            ((ImageView) (obj)).setBackgroundDrawable(null);
                        }
                    }
                    ((ImageView) (obj)).setPadding(k, l, i1, j1);
                }
                j++;
            }
            return;
        } while (true);
    }

    public boolean c()
    {
        c.H();
        return false;
    }

    protected int d()
    {
        return 10000;
    }

    protected int e()
    {
        return g.kW;
    }

    protected Integer f()
    {
        return Integer.valueOf(getResources().getColor(h.hv));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (aye)binder.a(aye);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new bat(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(layoutinflater, viewgroup);
        s().setStripEnabled(false);
        s().setDividerDrawable(h.hw);
        s().setLeftStripDrawable(h.hw);
        s().setRightStripDrawable(h.hw);
        ((TextView)layoutinflater.findViewById(g.kT)).setOnClickListener(a);
        ((ImageView)layoutinflater.findViewById(g.kU)).setColorFilter(getResources().getColor(h.hv), android.graphics.PorterDuff.Mode.SRC_IN);
        return layoutinflater;
    }

    protected int q()
    {
        return getResources().getColor(h.hu);
    }

    protected boolean r()
    {
        return false;
    }

    static 
    {
        b = (new jls()).a(Integer.valueOf(0), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bj)).a(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bf)).a(Integer.valueOf(2), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bd)).a(Integer.valueOf(3), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bb)).a(Integer.valueOf(4), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bh)).a(Integer.valueOf(5), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bl)).a();
    }
}
