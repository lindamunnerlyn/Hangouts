// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import android.widget.Toast;
import com.google.android.apps.hangouts.fragments.HiddenContactsFragment;

public final class bkt extends dhy
{

    final HiddenContactsFragment a;

    public bkt(HiddenContactsFragment hiddencontactsfragment)
    {
        a = hiddencontactsfragment;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        aoa = did1.c();
        if (HiddenContactsFragment.f(a) == i && (aoa instanceof cyx))
        {
            HiddenContactsFragment.g(a);
            HiddenContactsFragment.a(a, a.getView());
        } else
        if ((aoa instanceof dap) && (String)HiddenContactsFragment.a(a).get(i) != null)
        {
            HiddenContactsFragment.a(a, i);
            HiddenContactsFragment.e(a).notifyDataSetChanged();
            HiddenContactsFragment.a(a, a.getView());
            return;
        }
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        if (HiddenContactsFragment.f(a) == i && (dmf instanceof cwl))
        {
            HiddenContactsFragment.g(a);
            if (bgs.j())
            {
                i = l.it;
            } else
            {
                i = l.iu;
            }
            Toast.makeText(HiddenContactsFragment.h(a), i, 0).show();
            HiddenContactsFragment.a(a, a.getView());
        } else
        if (g.a(HiddenContactsFragment.a(a), i) && (dmf instanceof cxm))
        {
            aoa = (String)HiddenContactsFragment.d(a).get(i);
            HiddenContactsFragment.a(a, i);
            HiddenContactsFragment.e(a).notifyDataSetChanged();
            if (bgs.j())
            {
                i = l.iT;
            } else
            {
                i = l.iU;
            }
            Toast.makeText(HiddenContactsFragment.i(a), HiddenContactsFragment.j(a).getString(i, new Object[] {
                aoa
            }), 0).show();
            return;
        }
    }
}
