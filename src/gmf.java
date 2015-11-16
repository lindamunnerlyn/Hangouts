// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class gmf extends gmc
{

    public gmf(Context context)
    {
        super(context, g.rK);
    }

    protected Object a(int i, View view)
    {
        gme gme1 = (gme)getItem(i);
        if (gme1 instanceof gmh)
        {
            return new gmg(view);
        }
        if (gme1 instanceof gmi)
        {
            return null;
        }
        view = String.valueOf(gme1.getClass().getSimpleName());
        if (view.length() != 0)
        {
            view = "Unsupported item: ".concat(view);
        } else
        {
            view = new String("Unsupported item: ");
        }
        throw new IllegalStateException(view);
    }

    protected void a(int i, Object obj)
    {
        Object obj1 = (gme)getItem(i);
        if (!(obj1 instanceof gmh)) goto _L2; else goto _L1
_L1:
        gmg gmg1;
        obj1 = (gmh)obj1;
        gmg1 = (gmg)obj;
        gmg1.a.setText(((gmh) (obj1)).d());
        TextView textview = gmg1.a;
        if (((gmh) (obj1)).e() == null)
        {
            obj = getContext().getResources().getColorStateList(g.rD);
        } else
        {
            obj = ((gmh) (obj1)).e();
        }
        textview.setTextColor(((android.content.res.ColorStateList) (obj)));
        if (((gmh) (obj1)).f() == null)
        {
            gmg1.b.setVisibility(8);
        } else
        {
            gmg1.b.setImageDrawable(((gmh) (obj1)).f());
            gmg1.b.setVisibility(0);
        }
        if (((gmh) (obj1)).g() != null) goto _L4; else goto _L3
_L3:
        gmg1.c.setVisibility(8);
_L6:
        return;
_L4:
        gmg1.c.setImageDrawable(((gmh) (obj1)).g());
        gmg1.c.setVisibility(0);
        return;
_L2:
        if (!(obj1 instanceof gmi))
        {
            obj = String.valueOf(obj1.getClass().getSimpleName());
            if (((String) (obj)).length() != 0)
            {
                obj = "Unsupported item: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Unsupported item: ");
            }
            throw new IllegalStateException(((String) (obj)));
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int getItemViewType(int i)
    {
        return !(getItem(i) instanceof gmh) ? 1 : 0;
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
