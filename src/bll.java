// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public final class bll extends cng
{

    private final boolean j;
    private final ani k;
    private final ceu l;
    private final eem m;

    public bll(Context context, ani ani, ceu ceu, boolean flag, eem eem)
    {
        super(context, null);
        k = ani;
        l = ceu;
        j = flag;
        m = eem;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = new eej(context, k);
        context.a(m);
        return context;
    }

    public void a(View view, Cursor cursor)
    {
        boolean flag;
        if (l != null)
        {
            cursor = l;
        } else
        {
            cursor = amz.a(k, cursor);
        }
        view = (eej)view;
        view.k();
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(amh.a(cursor, null, flag), null, false, eeo.f);
    }

    public int getCount()
    {
        int i1 = super.getCount();
        int i = i1;
        if (l != null)
        {
            i = Math.max(1, i1);
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view != null)
        {
            view1 = view;
            if (!(view instanceof eej))
            {
                view1 = null;
            }
        }
        return super.getView(i, view1, viewgroup);
    }

    public boolean isEnabled(int i)
    {
        return false;
    }
}
