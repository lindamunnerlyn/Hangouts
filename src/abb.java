// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public abstract class abb extends jq
{

    private final ap a;
    private ad b;
    private he c;
    bg f;

    public abb(ap ap1)
    {
        f = null;
        b = null;
        c = new abc(this);
        a = ap1;
    }

    public abstract ad a(int i);

    public Object a(View view, int i)
    {
        if (f == null)
        {
            f = a.a();
        }
        Object obj = a(view.getId(), i);
        c.b(obj);
        obj = a.a(((String) (obj)));
        if (obj != null)
        {
            f.e(((ad) (obj)));
            view = ((View) (obj));
        } else
        {
            ad ad1 = a(i);
            if (ad1 == null)
            {
                return null;
            }
            f.a(view.getId(), ad1, a(view.getId(), i));
            view = ad1;
        }
        if (view != b)
        {
            view.setMenuVisibility(false);
        }
        return view;
    }

    protected String a(int i, int j)
    {
        return (new StringBuilder(40)).append("android:switcher:").append(i).append(":").append(j).toString();
    }

    public void a(View view, int i, Object obj)
    {
        if (f == null)
        {
            f = a.a();
        }
        ad ad1 = (ad)obj;
        String s = ad1.getTag();
        obj = s;
        if (s == null)
        {
            obj = a(view.getId(), i);
        }
        c.a(obj, ad1);
        f.d(ad1);
    }

    public boolean a(View view, Object obj)
    {
        obj = ((ad)obj).getView();
        for (; view instanceof View; view = ((View)view).getParent())
        {
            if (view == obj)
            {
                return true;
            }
        }

        return false;
    }

    public void b(Object obj)
    {
        obj = (ad)obj;
        if (obj != b)
        {
            if (b != null)
            {
                b.setMenuVisibility(false);
            }
            if (obj != null)
            {
                ((ad) (obj)).setMenuVisibility(true);
            }
            b = ((ad) (obj));
        }
    }

    public void c()
    {
        if (f != null && !a.e())
        {
            f.c();
            f = null;
            a.b();
        }
    }
}
