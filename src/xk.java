// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xk
    implements Runnable
{

    final ArrayList a;
    final xi b;

    xk(xi xi1, ArrayList arraylist)
    {
        b = xi1;
        a = arraylist;
        super();
    }

    public void run()
    {
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            xr xr1 = (xr)iterator.next();
            xi xi1 = b;
            Object obj = xr1.a;
            Object obj1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((zs) (obj)).a;
            }
            obj1 = xr1.b;
            if (obj1 != null)
            {
                obj1 = ((zs) (obj1)).a;
            } else
            {
                obj1 = null;
            }
            if (obj != null)
            {
                obj = kb.p(((android.view.View) (obj))).a(xi1.h());
                xi1.g.add(xr1.a);
                ((lr) (obj)).b(xr1.e - xr1.c);
                ((lr) (obj)).c(xr1.f - xr1.d);
                ((lr) (obj)).a(0.0F).a(new xp(xi1, xr1, ((lr) (obj)))).c();
            }
            if (obj1 != null)
            {
                obj = kb.p(((android.view.View) (obj1)));
                xi1.g.add(xr1.b);
                ((lr) (obj)).b(0.0F).c(0.0F).a(xi1.h()).a(1.0F).a(new xq(xi1, xr1, ((lr) (obj)), ((android.view.View) (obj1)))).c();
            }
        } while (true);
        a.clear();
        b.c.remove(a);
    }
}
