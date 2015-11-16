// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xl
    implements Runnable
{

    final ArrayList a;
    final xi b;

    xl(xi xi1, ArrayList arraylist)
    {
        b = xi1;
        a = arraylist;
        super();
    }

    public void run()
    {
        zs zs1;
        xi xi1;
        lr lr1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); lr1.a(1.0F).a(xi1.f()).a(new xn(xi1, zs1, lr1)).c())
        {
            zs1 = (zs)iterator.next();
            xi1 = b;
            lr1 = kb.p(zs1.a);
            xi1.d.add(zs1);
        }

        a.clear();
        b.a.remove(a);
    }
}
