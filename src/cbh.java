// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class cbh
    implements Comparable
{

    public ani a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public ImageView e;

    public cbh()
    {
    }

    public int a()
    {
        return 0;
    }

    public View a(Activity activity, View view, ViewGroup viewgroup)
    {
        View view2;
label0:
        {
            if (!g())
            {
                View view1 = view;
                if (view == null)
                {
                    view1 = activity.getLayoutInflater().inflate(g.gC, viewgroup, false);
                }
                return view1;
            }
            if (view != null)
            {
                view2 = view;
                if (view.findViewById(h.gq) != null)
                {
                    break label0;
                }
            }
            view2 = activity.getLayoutInflater().inflate(g.gN, viewgroup, false);
        }
        b = (TextView)view2.findViewById(h.gq);
        b.setText(a());
        c = (TextView)view2.findViewById(h.aQ);
        activity = f();
        if (!TextUtils.isEmpty(activity))
        {
            c.setText(activity);
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        d = (ImageView)view2.findViewById(h.cM);
        d.setImageResource(b());
        e = (ImageView)view2.findViewById(h.cN);
        e.setVisibility(8);
        return view2;
    }

    public void a(Activity activity)
    {
    }

    public void a(ani ani)
    {
        a = ani;
    }

    public void a(boolean flag)
    {
    }

    public int b()
    {
        return 0;
    }

    public int c()
    {
        return 0;
    }

    public int compareTo(Object obj)
    {
        obj = (cbh)obj;
        if (e() > ((cbh) (obj)).e())
        {
            return 1;
        }
        if (e() < ((cbh) (obj)).e())
        {
            return -1;
        } else
        {
            throw new IllegalStateException("Two navigation items cannot have the same sort index.");
        }
    }

    public int d()
    {
        return 0;
    }

    public int e()
    {
        return 0;
    }

    public CharSequence f()
    {
        return null;
    }

    public boolean g()
    {
        return true;
    }
}
