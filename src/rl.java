// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;

final class rl
{

    int a;
    int b;
    int c;
    int d;
    int e;
    int f;
    ViewGroup g;
    View h;
    View i;
    sy j;
    sw k;
    Context l;
    boolean m;
    boolean n;
    boolean o;
    public boolean p;
    boolean q;
    boolean r;
    Bundle s;

    rl(int i1)
    {
        a = i1;
        q = false;
    }

    tp a(to to)
    {
        if (j == null)
        {
            return null;
        }
        if (k == null)
        {
            k = new sw(l, g.by);
            k.a(to);
            j.a(k);
        }
        return k.a(g);
    }

    void a(Context context)
    {
        TypedValue typedvalue = new TypedValue();
        android.content.res.Resources.Theme theme = context.getResources().newTheme();
        theme.setTo(context.getTheme());
        theme.resolveAttribute(g.e, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            theme.applyStyle(typedvalue.resourceId, true);
        }
        theme.resolveAttribute(g.J, typedvalue, true);
        if (typedvalue.resourceId != 0)
        {
            theme.applyStyle(typedvalue.resourceId, true);
        } else
        {
            theme.applyStyle(g.bK, true);
        }
        context = new sg(context, 0);
        context.getTheme().setTo(theme);
        l = context;
        context = context.obtainStyledAttributes(ro.bK);
        b = context.getResourceId(ro.bN, 0);
        f = context.getResourceId(ro.bL, 0);
        context.recycle();
    }

    void a(sy sy1)
    {
        if (sy1 != j)
        {
            if (j != null)
            {
                j.b(k);
            }
            j = sy1;
            if (sy1 != null && k != null)
            {
                sy1.a(k);
                return;
            }
        }
    }

    public boolean a()
    {
        if (h != null)
        {
            if (i != null)
            {
                return true;
            }
            if (k.a().getCount() > 0)
            {
                return true;
            }
        }
        return false;
    }
}
