// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public final class gql extends gqi
{

    public gql(Context context)
    {
        super(context, g.sl);
    }

    protected Object a(int i, View view)
    {
        gqk gqk1 = (gqk)getItem(i);
        if (gqk1 instanceof gqn)
        {
            return new gqm(view);
        }
        if (gqk1 instanceof gqo)
        {
            return null;
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
        if (!(obj1 instanceof gqn)) goto _L2; else goto _L1
_L1:
        gqm gqm1;
        obj1 = (gqn)obj1;
        gqm1 = (gqm)obj;
        gqm1.a.setText(((gqn) (obj1)).d());
        TextView textview = gqm1.a;
        if (((gqn) (obj1)).e() == null)
        {
            obj = getContext().getResources().getColorStateList(g.se);
        } else
        {
            obj = ((gqn) (obj1)).e();
        }
        textview.setTextColor(((android.content.res.ColorStateList) (obj)));
        if (((gqn) (obj1)).f() == null)
        {
            gqm1.b.setVisibility(8);
        } else
        {
            gqm1.b.setImageDrawable(((gqn) (obj1)).f());
            gqm1.b.setVisibility(0);
        }
        if (((gqn) (obj1)).g() != null) goto _L4; else goto _L3
_L3:
        gqm1.c.setVisibility(8);
_L6:
        return;
_L4:
        gqm1.c.setImageDrawable(((gqn) (obj1)).g());
        gqm1.c.setVisibility(0);
        return;
_L2:
        if (!(obj1 instanceof gqo))
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
        return !(getItem(i) instanceof gqn) ? 1 : 0;
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
