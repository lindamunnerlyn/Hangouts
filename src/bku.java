// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class bku extends oa
{

    final HiddenContactsFragment j;

    public bku(HiddenContactsFragment hiddencontactsfragment, Context context)
    {
        j = hiddencontactsfragment;
        super(context, null);
        d = context;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = new ehw(context);
        context.a(HiddenContactsFragment.k(j));
        return context;
    }

    public void a(View view, Cursor cursor)
    {
        view = (ehw)view;
        view.a(cursor.getString(3));
        view.a(cursor.getString(4), cursor.getString(3), dcn.e(HiddenContactsFragment.c(j).a()));
        view.a(new cgd(cursor.getString(2), cursor.getString(1)));
    }

    public Cursor b(Cursor cursor)
    {
        return super.b(cursor);
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
        }
        view = super.getView(i, view, viewgroup);
        viewgroup = (Button)view.findViewById(h.gx);
        String s = ((ehw)view).a().a;
        boolean flag = g.a(HiddenContactsFragment.a(j), s);
        if (flag)
        {
            i = l.so;
        } else
        {
            i = l.sn;
        }
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.setText(i);
        viewgroup.setClickable(flag);
        return view;
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

    public boolean isEnabled(int i)
    {
        return false;
    }
}
