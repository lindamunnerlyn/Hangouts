// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cig
    implements hcf
{

    final int a;
    final cie b;

    cig(cie cie1, int i)
    {
        b = cie1;
        a = i;
        super();
    }

    public void a(hch hch1)
    {
        ArrayList arraylist = new ArrayList();
        hcg hcg1;
        for (hch1 = hch1.a().iterator(); hch1.hasNext(); arraylist.add(new cic(hcg1.a, hcg1.b)))
        {
            hcg1 = (hcg)hch1.next();
        }

        hch1 = (cik)cie.a(b).get(a);
        cie.a(b, ((cik) (hch1)).a, arraylist, false, false);
        cie.a(b, a, arraylist);
    }
}
