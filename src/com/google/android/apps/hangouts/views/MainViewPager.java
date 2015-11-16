// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.hangouts.views;

import ad;
import android.content.Context;
import android.util.AttributeSet;
import ap;
import bg;
import com.google.android.apps.hangouts.fragments.CallContactPickerFragment;
import com.google.android.apps.hangouts.fragments.ConversationListFragment;
import eeq;
import ees;
import eet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l;

public class MainViewPager extends eeq
{

    public static final ees a;
    public static final ees b;
    private eet c;
    private int d;
    private boolean e;

    public MainViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = -1;
    }

    private void a(ap ap1, List list, List list1)
    {
        bg bg1 = ap1.a();
        list = list.iterator();
label0:
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ad ad1 = (ad)list.next();
            boolean flag;
            if ((ad1 instanceof ConversationListFragment) || (ad1 instanceof CallContactPickerFragment))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                continue;
            }
            if (ad1.isDetached())
            {
                bg1.a(ad1);
                continue;
            }
            if (!c.a(ad1.getClass()))
            {
                bg1.a(ad1);
                continue;
            }
            Iterator iterator = list1.iterator();
            ad ad2;
            do
            {
                if (!iterator.hasNext())
                {
                    continue label0;
                }
                ad2 = (ad)iterator.next();
            } while (ad2 == null || !ad1.getClass().equals(ad2.getClass()) || ad1 == ad2);
            bg1.a(ad1);
        } while (true);
        bg1.b();
        ap1.b();
    }

    public boolean a(int i1, ap ap1, boolean flag)
    {
        if (d == i1 && e == flag)
        {
            return false;
        }
        ArrayList arraylist = new ArrayList(ap1.d());
        ArrayList arraylist1 = new ArrayList(2);
        if (i1 != -1)
        {
            arraylist1.add(a);
            if (flag)
            {
                arraylist1.add(b);
            }
        }
        c = new eet(ap1, getContext(), i1, arraylist1);
        a(((jq) (c)));
        a(ap1, ((List) (arraylist)), ((List) (new ArrayList(ap1.d()))));
        d = i1;
        e = flag;
        return true;
    }

    public boolean a(ees ees1)
    {
        if (c != null)
        {
            int i1 = c.a(ees1);
            if (i1 >= 0)
            {
                a(i1);
                return true;
            }
        }
        return false;
    }

    public boolean a(String s)
    {
        if (s != null && c != null)
        {
            int i1 = c.a(s);
            if (i1 >= 0)
            {
                a(i1);
                return true;
            }
        }
        return false;
    }

    public eet i()
    {
        return c;
    }

    public ees j()
    {
        if (c != null)
        {
            int i1 = c();
            int j1 = c.b();
            if (i1 >= 0 && i1 < j1)
            {
                return c.d(i1);
            }
        }
        return null;
    }

    public boolean k()
    {
        return c.a(b) >= 0;
    }

    public boolean l()
    {
        return c != null;
    }

    static 
    {
        a = new ees(com/google/android/apps/hangouts/fragments/ConversationListFragment, "conversations", l.sr, com.google.android.apps.hangouts.R.drawable.aW, 1546);
        b = new ees(com/google/android/apps/hangouts/fragments/CallContactPickerFragment, "phone_calls", l.sq, com.google.android.apps.hangouts.R.drawable.aZ, 1547);
    }
}
