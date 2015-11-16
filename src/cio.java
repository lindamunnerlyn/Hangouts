// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.SparseArray;
import android.widget.Toast;

final class cio extends dhy
{

    final cic a;

    cio(cic cic1)
    {
        a = cic1;
        super();
    }

    public void a(int i, aoa aoa, did did1)
    {
        if ((did1.c() instanceof cxz) && g.a(cic.r(a), i))
        {
            cic.a(a, i);
        }
    }

    public void a(int i, aoa aoa, dmf dmf, dcx dcx)
    {
        if (g.a(cic.r(a), i) && (dmf instanceof cwc))
        {
            aoa = a.getActivity();
            dmf = (String)cic.r(a).get(i);
            cic.a(a, i);
            if (bgs.j())
            {
                i = h.iG;
            } else
            {
                i = h.iF;
            }
            Toast.makeText(aoa, aoa.getString(i, new Object[] {
                dmf
            }), 0).show();
        }
    }
}
