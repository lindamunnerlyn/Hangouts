// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.hangouts.fragments.BlockedPeopleFragment;

public final class bgh extends oa
{

    final BlockedPeopleFragment j;

    public bgh(BlockedPeopleFragment blockedpeoplefragment, Context context)
    {
        j = blockedpeoplefragment;
        super(context, null);
        d = context;
    }

    public View a(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        context = new egk(context);
        context.a(BlockedPeopleFragment.k(j));
        return context;
    }

    public void a(View view, Cursor cursor)
    {
        view = (egk)view;
        String s = eep.d(cursor.getString(3));
        view.a(s);
        view.a(cursor.getString(4), s, BlockedPeopleFragment.c(j));
        view.a(new cgd(cursor.getString(2), cursor.getString(1)));
    }

    public Cursor b(Cursor cursor)
    {
        return super.b(cursor);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag;
        flag = false;
        if (i >= super.getCount() && i >= getCount())
        {
            View view1 = view;
            if (view == null)
            {
                view1 = a(d, a(), viewgroup);
            }
            return view1;
        }
        view = super.getView(i, view, viewgroup);
        if (!egk.isInstance(view)) goto _L2; else goto _L1
_L1:
        Button button;
        viewgroup = (egk)view;
        button = (Button)viewgroup.findViewById(h.gw);
        i = 0;
_L5:
        if (i >= BlockedPeopleFragment.d(j).size())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        if (!((bgj)BlockedPeopleFragment.d(j).c(i)).a.a(viewgroup.a())) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        int k;
        if (i != 0)
        {
            k = l.sm;
        } else
        {
            k = l.sl;
        }
        if (i == 0)
        {
            flag = true;
        }
        button.setText(k);
        button.setClickable(flag);
_L2:
        return view;
_L4:
        i++;
          goto _L5
        i = 0;
          goto _L6
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
