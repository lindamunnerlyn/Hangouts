// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;

public class coy extends oa
{

    public coy(Context context, Cursor cursor)
    {
        super(context, null, (byte)0);
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return null;
    }

    public void a(View view, Cursor cursor)
    {
    }

    public void c()
    {
    }

    public void d()
    {
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (i >= getCount())
        {
            View view1 = view;
            if (view == null)
            {
                view1 = a(d, a(), viewgroup);
            }
            return view1;
        } else
        {
            return super.getView(i, view, viewgroup);
        }
    }

    public boolean isEmpty()
    {
        if (a() == null)
        {
            return true;
        } else
        {
            return super.isEmpty();
        }
    }
}
