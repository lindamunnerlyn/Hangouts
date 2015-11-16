// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xj
    implements Runnable
{

    final ArrayList a;
    final xg b;

    xj(xg xg1, ArrayList arraylist)
    {
        b = xg1;
        a = arraylist;
        super();
    }

    public void run()
    {
        zq zq1;
        xg xg1;
        lr lr1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); lr1.a(1.0F).a(xg1.f()).a(new xl(xg1, zq1, lr1)).c())
        {
            zq1 = (zq)iterator.next();
            xg1 = b;
            lr1 = kb.o(zq1.a);
            xg1.d.add(zq1);
        }

        a.clear();
        b.a.remove(a);
    }
}
