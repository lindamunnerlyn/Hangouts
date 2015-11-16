// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xh
    implements Runnable
{

    final ArrayList a;
    final xg b;

    xh(xg xg1, ArrayList arraylist)
    {
        b = xg1;
        a = arraylist;
        super();
    }

    public void run()
    {
        xg xg1;
        zq zq1;
        Object obj;
        int i;
        int k;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lr) (obj)).a(xg1.e()).a(new xm(xg1, zq1, k, i, ((lr) (obj)))).c())
        {
            obj = (xq)iterator.next();
            xg1 = b;
            zq1 = ((xq) (obj)).a;
            k = ((xq) (obj)).b;
            i = ((xq) (obj)).c;
            int l = ((xq) (obj)).d;
            int j = ((xq) (obj)).e;
            obj = zq1.a;
            k = l - k;
            i = j - i;
            if (k != 0)
            {
                kb.o(((android.view.View) (obj))).b(0.0F);
            }
            if (i != 0)
            {
                kb.o(((android.view.View) (obj))).c(0.0F);
            }
            obj = kb.o(((android.view.View) (obj)));
            xg1.e.add(zq1);
        }

        a.clear();
        b.b.remove(a);
    }
}
