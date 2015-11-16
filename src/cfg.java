// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public final class cfg extends gmc
{

    public cfg(Context context)
    {
        super(context, g.rK);
    }

    protected Object a(int i, View view)
    {
        gme gme1 = (gme)getItem(i);
        if (gme1 instanceof gmh)
        {
            return new cfi(view);
        }
        if (gme1 instanceof cfo)
        {
            return new cfh(view);
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
        if (obj1 instanceof gmh)
        {
            obj1 = (gmh)obj1;
            obj = (cfi)obj;
            ((cfi) (obj)).a.setText(((gmh) (obj1)).d());
            ((cfi) (obj)).b.setImageDrawable(((gmh) (obj1)).f());
            ((cfi) (obj)).b.setVisibility(0);
            ((cfi) (obj)).c.setVisibility(8);
            ((cfi) (obj)).a.setTextColor(((gmh) (obj1)).e());
            return;
        }
        if (obj1 instanceof cfo)
        {
            obj1 = (cfo)obj1;
            cfh cfh1 = (cfh)obj;
            ani ani1 = dbf.e(((gmo)hgx.a(getContext(), gmo)).a());
            cfh1.a.setText(ebr.d(((cfo) (obj1)).c()));
            cfh1.d.a(((cfo) (obj1)).e(), ((cfo) (obj1)).c(), ani1);
            if (((cfo) (obj1)).f())
            {
                obj = (dsx)hgx.b(getContext(), dsx);
                if (obj == null)
                {
                    obj = new egi(cfh1.b);
                } else
                {
                    obj = ((dsx) (obj)).a((hjm)hgx.a(getContext(), hiv), ani1.h(), cfh1.b, null);
                }
                ((egi) (obj)).a(((cfo) (obj1)).c(), ((cfo) (obj1)).d());
                obj = (egv)hgx.b(getContext(), egv);
                if (obj != null)
                {
                    ((egv) (obj)).a(cfh1.c, ani1.h(), LayoutInflater.from(getContext())).a(((cfo) (obj1)).d());
                }
                cfh1.e.setImageResource(com.google.android.apps.hangouts.R.drawable.aE);
                cfh1.e.setVisibility(0);
                return;
            } else
            {
                cfh1.b.setVisibility(8);
                cfh1.e.setVisibility(8);
                return;
            }
        }
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

    public int getItemViewType(int i)
    {
        return !(getItem(i) instanceof gmh) ? 1 : 0;
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
