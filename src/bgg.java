// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.BlockedPeopleFragment;

public final class bgg extends dhy
{

    final BlockedPeopleFragment a;

    public bgg(BlockedPeopleFragment blockedpeoplefragment)
    {
        a = blockedpeoplefragment;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        aoa = did1.c();
        if (BlockedPeopleFragment.f(a) == i && czj.isInstance(aoa))
        {
            BlockedPeopleFragment.g(a);
        } else
        if (czi.isInstance(aoa))
        {
            BlockedPeopleFragment.a(a, i);
            BlockedPeopleFragment.e(a).notifyDataSetChanged();
            BlockedPeopleFragment.a(a, a.getView());
            return;
        }
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        if (BlockedPeopleFragment.f(a) == i && cuw.isInstance(dmf))
        {
            BlockedPeopleFragment.g(a);
            int j;
            if (bgs.j())
            {
                j = l.ir;
            } else
            {
                j = l.is;
            }
            Toast.makeText(BlockedPeopleFragment.h(a), j, 0).show();
            BlockedPeopleFragment.a(a, a.getView());
        }
        aoa = (bgj)BlockedPeopleFragment.d(a).get(Integer.valueOf(i));
        if (aoa != null && cuv.isInstance(dmf))
        {
            BlockedPeopleFragment.a(a, i);
            BlockedPeopleFragment.e(a).notifyDataSetChanged();
            if (bgs.j())
            {
                i = l.iQ;
            } else
            {
                i = l.iR;
            }
            Toast.makeText(BlockedPeopleFragment.i(a), BlockedPeopleFragment.j(a).getString(i, new Object[] {
                ((bgj) (aoa)).b
            }), 0).show();
        }
    }
}
