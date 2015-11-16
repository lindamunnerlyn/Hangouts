// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xi
    implements Runnable
{

    final ArrayList a;
    final xg b;

    xi(xg xg1, ArrayList arraylist)
    {
        b = xg1;
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
            xp xp1 = (xp)iterator.next();
            xg xg1 = b;
            Object obj = xp1.a;
            Object obj1;
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((zq) (obj)).a;
            }
            obj1 = xp1.b;
            if (obj1 != null)
            {
                obj1 = ((zq) (obj1)).a;
            } else
            {
                obj1 = null;
            }
            if (obj != null)
            {
                obj = kb.o(((android.view.View) (obj))).a(xg1.h());
                xg1.g.add(xp1.a);
                ((lr) (obj)).b(xp1.e - xp1.c);
                ((lr) (obj)).c(xp1.f - xp1.d);
                ((lr) (obj)).a(0.0F).a(new xn(xg1, xp1, ((lr) (obj)))).c();
            }
            if (obj1 != null)
            {
                obj = kb.o(((android.view.View) (obj1)));
                xg1.g.add(xp1.b);
                ((lr) (obj)).b(0.0F).c(0.0F).a(xg1.h()).a(1.0F).a(new xo(xg1, xp1, ((lr) (obj)), ((android.view.View) (obj1)))).c();
            }
        } while (true);
        a.clear();
        b.c.remove(a);
    }
}
