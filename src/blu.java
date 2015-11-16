// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public final class blu extends coy
{

    private final boolean j;
    private final aoa k;
    private final cfz l;
    private final eho m;

    public blu(Context context, aoa aoa, cfz cfz, boolean flag, eho eho)
    {
        super(context, null);
        k = aoa;
        l = cfz;
        j = flag;
        m = eho;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = new ehl(context, k);
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
            cursor = anr.a(k, cursor);
        }
        view = (ehl)view;
        view.k();
        if (!j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.a(amz.a(cursor, null, flag), null, false, ehq.f);
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
            if (!(view instanceof ehl))
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
