// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.hangouts.views.AvatarView;

public final class cgl extends gqi
{

    public cgl(Context context)
    {
        super(context, g.sl);
    }

    protected Object a(int i, View view)
    {
        gqk gqk1 = (gqk)getItem(i);
        if (gqk1 instanceof gqn)
        {
            return new cgn(view);
        }
        if (gqk1 instanceof cgu)
        {
            return new cgm(view);
        }
        view = String.valueOf(gqk1.getClass().getSimpleName());
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
        Object obj1 = (gqk)getItem(i);
        if (obj1 instanceof gqn)
        {
            obj1 = (gqn)obj1;
            obj = (cgn)obj;
            ((cgn) (obj)).a.setText(((gqn) (obj1)).d());
            ((cgn) (obj)).b.setImageDrawable(((gqn) (obj1)).f());
            ((cgn) (obj)).b.setVisibility(0);
            ((cgn) (obj)).c.setVisibility(8);
            ((cgn) (obj)).a.setTextColor(((gqn) (obj1)).e());
            return;
        }
        if (obj1 instanceof cgu)
        {
            obj1 = (cgu)obj1;
            cgm cgm1 = (cgm)obj;
            aoa aoa1 = dcn.e(((gqu)hlp.a(getContext(), gqu)).a());
            cgm1.a.setText(eep.d(((cgu) (obj1)).c()));
            cgm1.d.a(((cgu) (obj1)).e(), ((cgu) (obj1)).c(), aoa1);
            if (((cgu) (obj1)).f())
            {
                obj = (dvq)hlp.b(getContext(), dvq);
                if (obj == null)
                {
                    obj = new ejk(cgm1.b);
                } else
                {
                    obj = ((dvq) (obj)).a((hof)hlp.a(getContext(), hnn), aoa1.h(), cgm1.b, null);
                }
                ((ejk) (obj)).a(((cgu) (obj1)).c(), ((cgu) (obj1)).d());
                obj = (ejx)hlp.b(getContext(), ejx);
                if (obj != null)
                {
                    ((ejx) (obj)).a(cgm1.c, aoa1.h(), LayoutInflater.from(getContext())).a(((cgu) (obj1)).d());
                }
                cgm1.e.setImageResource(com.google.android.apps.hangouts.R.drawable.aD);
                cgm1.e.setVisibility(0);
                return;
            } else
            {
                cgm1.b.setVisibility(8);
                cgm1.e.setVisibility(8);
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
        return !(getItem(i) instanceof gqn) ? 1 : 0;
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
