// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class bag
{

    private final Context a;
    private final bah b;
    private dcc c;
    private asa d;
    private List e;

    public bag(Context context, bah bah1)
    {
        a = context;
        b = bah1;
    }

    private boolean a()
    {
        return d != null && e != null;
    }

    private void b()
    {
        g.d(a());
        int i = ((gqu)hlp.a(a, gqu)).a();
        atu atu1;
        if (g.e(d.b))
        {
            atu1 = atu.b;
        } else
        {
            atu1 = atu.a;
        }
        if (atu1 == atu.a)
        {
            c = dcc.a(a, i, atu1, d.b, d.c);
        } else
        {
            Iterator iterator = e.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                c = dcc.a(a, i, atu1, d.b, s);
            } while (c.a);
        }
        if (b != null)
        {
            b.a(c);
        }
    }

    public void a(asa asa1)
    {
        d = asa1;
        if (a())
        {
            b();
        }
    }

    public void a(List list)
    {
        e = list;
        if (a())
        {
            b();
        }
    }
}
