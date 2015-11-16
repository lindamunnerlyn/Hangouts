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

public class ccm
    implements Comparable
{

    public aoa a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public ImageView e;

    public ccm()
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
                    view1 = activity.getLayoutInflater().inflate(g.gx, viewgroup, false);
                }
                return view1;
            }
            if (view != null)
            {
                view2 = view;
                if (view.findViewById(h.fY) != null)
                {
                    break label0;
                }
            }
            view2 = activity.getLayoutInflater().inflate(g.gG, viewgroup, false);
        }
        b = (TextView)view2.findViewById(h.fY);
        b.setText(a());
        c = (TextView)view2.findViewById(h.aK);
        activity = f();
        if (!TextUtils.isEmpty(activity))
        {
            c.setText(activity);
            c.setVisibility(0);
        } else
        {
            c.setVisibility(8);
        }
        d = (ImageView)view2.findViewById(h.cC);
        d.setImageResource(b());
        e = (ImageView)view2.findViewById(h.cD);
        e.setVisibility(8);
        return view2;
    }

    public void a(Activity activity)
    {
    }

    public void a(aoa aoa)
    {
        a = aoa;
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
        obj = (ccm)obj;
        if (e() > ((ccm) (obj)).e())
        {
            return 1;
        }
        if (e() < ((ccm) (obj)).e())
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
