// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AbsListView;
import android.widget.ListView;

public abstract class bfw extends bkk
    implements android.widget.AbsListView.OnScrollListener, dpl
{

    public static final boolean a = false;
    private ListView aj;
    private boolean ak;
    public emy b;
    public dph c;
    public fti d;
    public bhk e;
    public View f;
    public gqu g;
    public boolean h;
    private String i;

    public bfw()
    {
        h = false;
    }

    private void a(boolean flag)
    {
        byte byte0 = 8;
        Object obj = aj;
        int j;
        if (flag)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ListView) (obj)).setVisibility(j);
        obj = f;
        if (flag)
        {
            j = byte0;
        } else
        {
            j = 0;
        }
        ((View) (obj)).setVisibility(j);
    }

    private void s()
    {
        if (d != null && !d.c())
        {
            d.b();
            d = null;
        }
    }

    private void t()
    {
        e = new bhk(getActivity(), q());
        bhm abhm[] = a();
        int k = abhm.length;
        for (int j = 0; j < k; j++)
        {
            bhm bhm1 = abhm[j];
            e.a(bhm1);
        }

        if (aj != null)
        {
            aj.setAdapter(e);
        }
    }

    protected void a(int j, bhl bhl)
    {
        if (e != null)
        {
            bhm bhm1 = (bhm)e.a(j);
            e.a(j, bhl);
            bhm1.a(i);
            if (f != null)
            {
                boolean flag;
                if (!e.isEmpty())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a(flag);
            }
        }
    }

    public void a(bga bga)
    {
        aj.setOnItemClickListener(new bfz(this, bga));
    }

    public void a(dph dph1, fti fti1, ftp ftp)
    {
        if (dph1 == c)
        {
            s();
            d = fti1;
            if (e == null)
            {
                t();
            }
        }
    }

    public void a(CharSequence charsequence)
    {
        gdv.a();
        if (e != null)
        {
            CharSequence charsequence1 = charsequence;
            if (charsequence.length() > 70)
            {
                charsequence1 = charsequence.subSequence(0, 70);
            }
            if (!charsequence1.equals(i))
            {
                if (TextUtils.isEmpty(charsequence1))
                {
                    charsequence = null;
                } else
                {
                    charsequence = charsequence1.toString();
                }
                i = charsequence;
                b(i);
            }
        }
    }

    protected abstract bhm[] a();

    protected ListView b()
    {
        return aj;
    }

    protected void b(CharSequence charsequence)
    {
        c();
    }

    public void c()
    {
        c = null;
        if (b.e() && e())
        {
            c = new dph(b, q(), this, i);
            c.a();
        }
    }

    protected String d()
    {
        return i;
    }

    protected boolean e()
    {
        return true;
    }

    public boolean f()
    {
        if (e != null)
        {
            return false;
        }
        t();
        if (e())
        {
            c();
        }
        h = true;
        return true;
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        activity = new emz(activity.getApplicationContext());
        activity.a(fph.c, (new fpk()).a(117).a());
        activity.a(new bfx(this));
        activity.a(new bfy(this));
        b = activity.a();
        b.b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        g = (gqu)binder.a(gqu);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle, int j)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, j);
        aj = (ListView)layoutinflater.findViewById(0x102000a);
        aj.setOnScrollListener(this);
        f = layoutinflater.findViewById(h.dL);
        if (e != null)
        {
            aj.setAdapter(e);
            boolean flag;
            if (!e.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
        }
        if (ak)
        {
            r();
        }
        return layoutinflater;
    }

    public void onDestroy()
    {
        super.onDestroy();
        s();
        c = null;
        e = null;
    }

    public void onDetach()
    {
        super.onDetach();
        if (b.e() || b.f())
        {
            b.d();
        }
    }

    public void onScroll(AbsListView abslistview, int j, int k, int l)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int j)
    {
        switch (j)
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            ((InputMethodManager)abslistview.getContext().getSystemService("input_method")).hideSoftInputFromWindow(abslistview.getWindowToken(), 0);
            break;
        }
    }

    protected aoa q()
    {
        return dcn.e(g.a());
    }

    public void r()
    {
        if (aj == null)
        {
            ak = true;
            return;
        } else
        {
            ak = false;
            aj.setSelectionAfterHeaderView();
            return;
        }
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
