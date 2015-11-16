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
import android.widget.ImageButton;

public final class bsf extends bov
{

    private final int g;
    private final int h;
    private final String i;

    public bsf(Context context, gjr gjr, int j, int k, int l, int i1, int j1, 
            String s, String s1, boolean flag, boolean flag1, android.view.View.OnClickListener onclicklistener)
    {
        super(context, gjr, l, i1, j, flag, flag1, s, onclicklistener);
        g = k;
        h = j1;
        i = s1;
    }

    public View a(LayoutInflater layoutinflater, int j, ViewGroup viewgroup)
    {
        layoutinflater = super.a(layoutinflater, j, viewgroup);
        ((ImageButton)layoutinflater.findViewById(a)).setOnTouchListener(new bsg(this));
        a(e);
        return layoutinflater;
    }

    public void a(boolean flag)
    {
        ImageButton imagebutton = (ImageButton)f.findViewById(a);
        Object obj = (GradientDrawable)imagebutton.getBackground().mutate();
        int j;
        if (flag)
        {
            j = getResources().getColor(c);
        } else
        {
            j = getResources().getColor(g);
        }
        ((GradientDrawable) (obj)).setColor(j);
        if (flag)
        {
            j = b;
        } else
        {
            j = h;
        }
        imagebutton.setImageResource(j);
        if (flag)
        {
            obj = d;
        } else
        {
            obj = i;
        }
        imagebutton.setContentDescription(((CharSequence) (obj)));
        e = flag;
    }
}
