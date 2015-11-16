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

public class bbi extends bjq
    implements avi
{

    private static final jso b;
    private ays c;

    public bbi()
    {
    }

    static hlp a(bbi bbi1)
    {
        return bbi1.binder;
    }

    static ays b(bbi bbi1)
    {
        return bbi1.c;
    }

    static hlp c(bbi bbi1)
    {
        return bbi1.binder;
    }

    static hlp d(bbi bbi1)
    {
        return bbi1.binder;
    }

    protected ImageView a(Context context, int i)
    {
        context = (ImageView)LayoutInflater.from(context).inflate(g.kN, null);
        i = g.a((Integer)b.get(Integer.valueOf(i)), 0);
        context.setImageDrawable(getResources().getDrawable(i));
        return context;
    }

    public boolean a()
    {
        c.F();
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
                        ((ImageView) (obj)).setColorFilter(getResources().getColor(h.gZ), android.graphics.PorterDuff.Mode.SRC_IN);
                        ((ImageView) (obj)).setBackgroundResource(h.hd);
                    } else
                    {
                        ((ImageView) (obj)).setColorFilter(getResources().getColor(h.hb), android.graphics.PorterDuff.Mode.SRC_IN);
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
        c.I();
        return false;
    }

    protected int d()
    {
        return 10000;
    }

    protected int e()
    {
        return g.kO;
    }

    protected Integer f()
    {
        return Integer.valueOf(getResources().getColor(h.hb));
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        c = (ays)binder.a(ays);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        a(new bbj(this));
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = a(layoutinflater, viewgroup);
        s().setStripEnabled(false);
        s().setDividerDrawable(h.hc);
        s().setLeftStripDrawable(h.hc);
        s().setRightStripDrawable(h.hc);
        ((TextView)layoutinflater.findViewById(g.kL)).setOnClickListener(a);
        ((ImageView)layoutinflater.findViewById(g.kM)).setColorFilter(getResources().getColor(h.hb), android.graphics.PorterDuff.Mode.SRC_IN);
        return layoutinflater;
    }

    protected int q()
    {
        return getResources().getColor(h.ha);
    }

    protected boolean r()
    {
        return false;
    }

    static 
    {
        b = (new jsq()).a(Integer.valueOf(0), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bf)).a(Integer.valueOf(1), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bb)).a(Integer.valueOf(2), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.aZ)).a(Integer.valueOf(3), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.aX)).a(Integer.valueOf(4), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bd)).a(Integer.valueOf(5), Integer.valueOf(com.google.android.apps.hangouts.R.drawable.bh)).a();
    }
}
