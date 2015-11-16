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

public abstract class bfk extends bjy
    implements android.widget.AbsListView.OnScrollListener, dmr
{

    public static final boolean a = false;
    private ListView aj;
    private boolean ak;
    public ejx b;
    public dmn c;
    public fqp d;
    public bgy e;
    public View f;
    public gmo g;
    public boolean h;
    private String i;

    public bfk()
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
        e = new bgy(getActivity(), q());
        bha abha[] = a();
        int k = abha.length;
        for (int j = 0; j < k; j++)
        {
            bha bha1 = abha[j];
            e.a(bha1);
        }

        if (aj != null)
        {
            aj.setAdapter(e);
        }
    }

    protected void a(int j, bgz bgz)
    {
        if (e != null)
        {
            bha bha1 = (bha)e.a(j);
            e.a(j, bgz);
            bha1.a(i);
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

    public void a(bfo bfo)
    {
        aj.setOnItemClickListener(new bfn(this, bfo));
    }

    public void a(dmn dmn1, fqp fqp1, fqy fqy)
    {
        if (dmn1 == c)
        {
            s();
            d = fqp1;
            if (e == null)
            {
                t();
            }
        }
    }

    public void a(CharSequence charsequence)
    {
        gbh.a();
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

    protected abstract bha[] a();

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
            c = new dmn(b, q(), this, i);
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
        activity = new ejy(activity.getApplicationContext());
        activity.a(fmn.c, (new fmq()).a(117).a());
        activity.a(new bfl(this));
        activity.a(new bfm(this));
        b = activity.a();
        b.b();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        g = (gmo)binder.a(gmo);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle, int j)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle, j);
        aj = (ListView)layoutinflater.findViewById(0x102000a);
        aj.setOnScrollListener(this);
        f = layoutinflater.findViewById(h.dU);
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

    protected ani q()
    {
        return dbf.e(g.a());
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
        hik hik = ebw.e;
    }
}
