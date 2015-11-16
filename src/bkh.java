// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class bkh extends dgp
{

    final HiddenContactsFragment a;

    public bkh(HiddenContactsFragment hiddencontactsfragment)
    {
        a = hiddencontactsfragment;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        ani = dgu1.c();
        if (HiddenContactsFragment.f(a) == i && (ani instanceof cwt))
        {
            HiddenContactsFragment.g(a);
            HiddenContactsFragment.a(a, a.getView());
        } else
        if ((ani instanceof cyl) && (String)HiddenContactsFragment.a(a).get(i) != null)
        {
            HiddenContactsFragment.a(a, i);
            HiddenContactsFragment.e(a).notifyDataSetChanged();
            HiddenContactsFragment.a(a, a.getView());
            return;
        }
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
    {
        ani = a.getActivity();
        if (HiddenContactsFragment.f(a) == i && (dko instanceof cuh))
        {
            HiddenContactsFragment.g(a);
            if (bgg.j())
            {
                i = l.jb;
            } else
            {
                i = l.jc;
            }
            ebr.a(ani, ani.getResources().getString(i));
            HiddenContactsFragment.a(a, a.getView());
        } else
        if (g.a(HiddenContactsFragment.a(a), i) && (dko instanceof cvi))
        {
            dko = (String)HiddenContactsFragment.d(a).get(i);
            HiddenContactsFragment.a(a, i);
            HiddenContactsFragment.e(a).notifyDataSetChanged();
            if (bgg.j())
            {
                i = l.jA;
            } else
            {
                i = l.jB;
            }
            ebr.a(ani, ani.getResources().getString(i, new Object[] {
                dko
            }));
            return;
        }
    }
}
