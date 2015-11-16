// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class bov extends FrameLayout
{

    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public boolean e;
    public View f;
    private final gjr g;
    private boolean h;
    private android.view.View.OnClickListener i;
    private bow j;

    public bov(Context context, gjr gjr1, int k, int l, int i1, boolean flag, boolean flag1, 
            String s, android.view.View.OnClickListener onclicklistener)
    {
        super(context);
        g = gjr1;
        a = k;
        b = l;
        c = i1;
        h = flag;
        e = flag1;
        d = s;
        i = onclicklistener;
    }

    public View a(LayoutInflater layoutinflater, int k, ViewGroup viewgroup)
    {
        f = layoutinflater.inflate(k, viewgroup, false);
        layoutinflater = (ImageButton)f.findViewById(a);
        layoutinflater.setImageResource(b);
        a(e);
        b(h);
        setOnClickListener(i);
        ((GradientDrawable)layoutinflater.getBackground().mutate()).setColor(getResources().getColor(c));
        layoutinflater.setContentDescription(d);
        return f;
    }

    public void a(bow bow1)
    {
        j = bow1;
    }

    public void a(bpd bpd)
    {
        if (j != null)
        {
            j.a(bpd);
        }
    }

    public void a(gjr gjr1)
    {
        if (j != null && g.equals(gjr1))
        {
            j.a(gjr1);
        }
    }

    public void a(boolean flag)
    {
        e = flag;
        if (f != null)
        {
            ((ImageButton)f.findViewById(a)).setEnabled(flag);
            View view = f;
            float f1;
            if (flag)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.2F;
            }
            view.setAlpha(f1);
        }
    }

    public boolean a()
    {
        return e;
    }

    public void b(boolean flag)
    {
        h = flag;
        if (f != null)
        {
            View view = f;
            int k;
            if (flag)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            view.setVisibility(k);
        }
    }

    public boolean b()
    {
        return h;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        i = onclicklistener;
        if (f != null)
        {
            ((ImageButton)f.findViewById(a)).setOnClickListener(onclicklistener);
        }
    }
}
