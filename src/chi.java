// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.util.SparseArray;

final class chi extends dgp
{

    final cgw a;

    chi(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public void a(int i, ani ani, dgu dgu1)
    {
        if ((dgu1.c() instanceof cvv) && g.a(cgw.r(a), i))
        {
            cgw.a(a, i);
        }
    }

    public void a(int i, ani ani, dko dko, dbo dbo)
    {
        if (g.a(cgw.r(a), i) && (dko instanceof cty))
        {
            ani = a.getActivity();
            dko = (String)cgw.r(a).get(i);
            cgw.a(a, i);
            if (bgg.j())
            {
                i = l.iR;
            } else
            {
                i = l.iQ;
            }
            ebr.a(ani, ani.getResources().getString(i, new Object[] {
                dko
            }));
        }
    }
}
