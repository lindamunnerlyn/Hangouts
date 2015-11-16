// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cjm
    implements hgw
{

    final int a;
    final cjk b;

    cjm(cjk cjk1, int i)
    {
        b = cjk1;
        a = i;
        super();
    }

    public void a(hgy hgy1)
    {
        ArrayList arraylist = new ArrayList();
        hgx hgx1;
        for (hgy1 = hgy1.a().iterator(); hgy1.hasNext(); arraylist.add(new cji(hgx1.a, hgx1.b)))
        {
            hgx1 = (hgx)hgy1.next();
        }

        hgy1 = (cjq)b.a.get(a);
        cjk.a(b, ((cjq) (hgy1)).a, arraylist, false, false);
        cjk.a(b, a, arraylist);
    }
}
