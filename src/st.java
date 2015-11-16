// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class st
    implements tn
{

    public Context a;
    public Context b;
    public sy c;
    public LayoutInflater d;
    public LayoutInflater e;
    public tp f;
    private to g;
    private int h;
    private int i;
    private int j;

    public st(Context context, int k, int l)
    {
        a = context;
        d = LayoutInflater.from(context);
        h = k;
        i = l;
    }

    public View a(tc tc1, View view, ViewGroup viewgroup)
    {
        if (view instanceof tq)
        {
            view = (tq)view;
        } else
        {
            view = b(viewgroup);
        }
        a(tc1, ((tq) (view)));
        return (View)view;
    }

    public to a()
    {
        return g;
    }

    public tp a(ViewGroup viewgroup)
    {
        if (f == null)
        {
            f = (tp)d.inflate(h, viewgroup, false);
            f.a(c);
            b(true);
        }
        return f;
    }

    public void a(int k)
    {
        j = k;
    }

    public void a(Context context, sy sy1)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = sy1;
    }

    protected void a(View view, int k)
    {
        ViewGroup viewgroup = (ViewGroup)view.getParent();
        if (viewgroup != null)
        {
            viewgroup.removeView(view);
        }
        ((ViewGroup)f).addView(view, k);
    }

    public void a(sy sy1, boolean flag)
    {
        if (g != null)
        {
            g.a(sy1, flag);
        }
    }

    public abstract void a(tc tc1, tq tq1);

    public void a(to to1)
    {
        g = to1;
    }

    public boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public boolean a(tc tc1)
    {
        return true;
    }

    public boolean a(ts ts)
    {
        if (g != null)
        {
            return g.a(ts);
        } else
        {
            return false;
        }
    }

    public tq b(ViewGroup viewgroup)
    {
        return (tq)d.inflate(i, viewgroup, false);
    }

    public void b(boolean flag)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null)
        {
            int l;
            if (c != null)
            {
                c.l();
                ArrayList arraylist = c.k();
                int j1 = arraylist.size();
                int i1 = 0;
                int k = 0;
                do
                {
                    l = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    tc tc2 = (tc)arraylist.get(i1);
                    if (a(tc2))
                    {
                        View view = viewgroup.getChildAt(k);
                        tc tc1;
                        View view1;
                        if (view instanceof tq)
                        {
                            tc1 = ((tq)view).a();
                        } else
                        {
                            tc1 = null;
                        }
                        view1 = a(tc2, view, viewgroup);
                        if (tc2 != tc1)
                        {
                            view1.setPressed(false);
                            kb.t(view1);
                        }
                        if (view1 != view)
                        {
                            a(view1, k);
                        }
                        k++;
                    }
                    i1++;
                } while (true);
            } else
            {
                l = 0;
            }
            while (l < viewgroup.getChildCount()) 
            {
                if (!a(viewgroup, l))
                {
                    l++;
                }
            }
        }
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(tc tc1)
    {
        return false;
    }

    public boolean c(tc tc1)
    {
        return false;
    }
}
