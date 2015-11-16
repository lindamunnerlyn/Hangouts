// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.hangouts.fragments.BlockedPeopleFragment;

public final class bfu extends dgp
{

    final BlockedPeopleFragment a;

    public bfu(BlockedPeopleFragment blockedpeoplefragment)
    {
        a = blockedpeoplefragment;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        ani = dgu1.c();
        if (BlockedPeopleFragment.e(a) == i && cxf.isInstance(ani))
        {
            BlockedPeopleFragment.f(a);
        } else
        if (cxe.isInstance(ani))
        {
            BlockedPeopleFragment.a(a, i);
            BlockedPeopleFragment.d(a).notifyDataSetChanged();
            BlockedPeopleFragment.a(a, a.getView());
            return;
        }
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
    {
        ani = a.getActivity();
        if (BlockedPeopleFragment.e(a) == i && cst.isInstance(dko))
        {
            BlockedPeopleFragment.f(a);
            int j;
            if (bgg.j())
            {
                j = l.iZ;
            } else
            {
                j = l.ja;
            }
            ebr.a(ani, ani.getResources().getString(j));
            BlockedPeopleFragment.a(a, a.getView());
        }
        dbo = (bfx)BlockedPeopleFragment.c(a).get(Integer.valueOf(i));
        if (dbo != null && css.isInstance(dko))
        {
            BlockedPeopleFragment.a(a, i);
            BlockedPeopleFragment.d(a).notifyDataSetChanged();
            if (bgg.j())
            {
                i = l.jx;
            } else
            {
                i = l.jy;
            }
            ebr.a(ani, ani.getResources().getString(i, new Object[] {
                ((bfx) (dbo)).b
            }));
        }
    }
}
