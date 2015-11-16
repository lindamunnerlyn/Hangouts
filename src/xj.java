// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class xj
    implements Runnable
{

    final ArrayList a;
    final xi b;

    xj(xi xi1, ArrayList arraylist)
    {
        b = xi1;
        a = arraylist;
        super();
    }

    public void run()
    {
        xi xi1;
        zs zs1;
        Object obj;
        int i;
        int k;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lr) (obj)).a(xi1.e()).a(new xo(xi1, zs1, k, i, ((lr) (obj)))).c())
        {
            obj = (xs)iterator.next();
            xi1 = b;
            zs1 = ((xs) (obj)).a;
            k = ((xs) (obj)).b;
            i = ((xs) (obj)).c;
            int l = ((xs) (obj)).d;
            int j = ((xs) (obj)).e;
            obj = zs1.a;
            k = l - k;
            i = j - i;
            if (k != 0)
            {
                kb.p(((android.view.View) (obj))).b(0.0F);
            }
            if (i != 0)
            {
                kb.p(((android.view.View) (obj))).c(0.0F);
            }
            obj = kb.p(((android.view.View) (obj)));
            xi1.e.add(zs1);
        }

        a.clear();
        b.b.remove(a);
    }
}
