// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

public abstract class ay extends jq
{

    private final ap a;
    private bg b;
    private ad c;

    public ay(ap ap1)
    {
        b = null;
        c = null;
        a = ap1;
    }

    private static String a(int i, long l)
    {
        return (new StringBuilder("android:switcher:")).append(i).append(":").append(l).toString();
    }

    public abstract ad a(int i);

    public Object a(ViewGroup viewgroup, int i)
    {
        if (b == null)
        {
            b = a.a();
        }
        long l = b(i);
        Object obj = a(viewgroup.getId(), l);
        obj = a.a(((String) (obj)));
        if (obj != null)
        {
            b.e(((ad) (obj)));
            viewgroup = ((ViewGroup) (obj));
        } else
        {
            ad ad1 = a(i);
            b.a(viewgroup.getId(), ad1, a(viewgroup.getId(), l));
            viewgroup = ad1;
        }
        if (viewgroup != c)
        {
            viewgroup.setMenuVisibility(false);
            viewgroup.setUserVisibleHint(false);
        }
        return viewgroup;
    }

    public void a()
    {
        if (b != null)
        {
            b.c();
            b = null;
            a.b();
        }
    }

    public void a(ViewGroup viewgroup, int i, Object obj)
    {
        if (b == null)
        {
            b = a.a();
        }
        b.d((ad)obj);
    }

    public void a(Object obj)
    {
        obj = (ad)obj;
        if (obj != c)
        {
            if (c != null)
            {
                c.setMenuVisibility(false);
                c.setUserVisibleHint(false);
            }
            if (obj != null)
            {
                ((ad) (obj)).setMenuVisibility(true);
                ((ad) (obj)).setUserVisibleHint(true);
            }
            c = ((ad) (obj));
        }
    }

    public boolean a(View view, Object obj)
    {
        return ((ad)obj).getView() == view;
    }

    public long b(int i)
    {
        return (long)i;
    }
}
