// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

public abstract class sv
    implements tp
{

    public Context a;
    public Context b;
    public ta c;
    public LayoutInflater d;
    public LayoutInflater e;
    public tr f;
    private tq g;
    private int h;
    private int i;
    private int j;

    public sv(Context context, int k, int l)
    {
        a = context;
        d = LayoutInflater.from(context);
        h = k;
        i = l;
    }

    public View a(te te1, View view, ViewGroup viewgroup)
    {
        if (view instanceof ts)
        {
            view = (ts)view;
        } else
        {
            view = b(viewgroup);
        }
        a(te1, ((ts) (view)));
        return (View)view;
    }

    public tq a()
    {
        return g;
    }

    public tr a(ViewGroup viewgroup)
    {
        if (f == null)
        {
            f = (tr)d.inflate(h, viewgroup, false);
            f.a(c);
            b(true);
        }
        return f;
    }

    public void a(int k)
    {
        j = k;
    }

    public void a(Context context, ta ta1)
    {
        b = context;
        e = LayoutInflater.from(b);
        c = ta1;
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

    public void a(ta ta1, boolean flag)
    {
        if (g != null)
        {
            g.a(ta1, flag);
        }
    }

    public abstract void a(te te1, ts ts1);

    public void a(tq tq1)
    {
        g = tq1;
    }

    public boolean a(ViewGroup viewgroup, int k)
    {
        viewgroup.removeViewAt(k);
        return true;
    }

    public boolean a(te te1)
    {
        return true;
    }

    public boolean a(tu tu)
    {
        if (g != null)
        {
            return g.a(tu);
        } else
        {
            return false;
        }
    }

    public ts b(ViewGroup viewgroup)
    {
        return (ts)d.inflate(i, viewgroup, false);
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
                    te te2 = (te)arraylist.get(i1);
                    if (a(te2))
                    {
                        View view = viewgroup.getChildAt(k);
                        te te1;
                        View view1;
                        if (view instanceof ts)
                        {
                            te1 = ((ts)view).a();
                        } else
                        {
                            te1 = null;
                        }
                        view1 = a(te2, view, viewgroup);
                        if (te2 != te1)
                        {
                            view1.setPressed(false);
                            kb.u(view1);
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

    public boolean b(te te1)
    {
        return false;
    }

    public boolean c(te te1)
    {
        return false;
    }
}
