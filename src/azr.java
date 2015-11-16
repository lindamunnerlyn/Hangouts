// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Iterator;
import java.util.List;

final class azr
{

    private final Context a;
    private final azs b;
    private daw c;
    private ark d;
    private List e;

    public azr(Context context, azs azs1)
    {
        a = context;
        b = azs1;
    }

    private boolean a()
    {
        return d != null && e != null;
    }

    private void b()
    {
        g.b(a());
        int i = ((gmo)hgx.a(a, gmo)).a();
        atd atd1;
        if (g.e(d.b))
        {
            atd1 = atd.b;
        } else
        {
            atd1 = atd.a;
        }
        if (atd1 == atd.a)
        {
            c = daw.a(a, i, atd1, d.b, d.c);
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
                c = daw.a(a, i, atd1, d.b, s);
            } while (c.a);
        }
        if (b != null)
        {
            b.a(c);
        }
    }

    public void a(ark ark1)
    {
        d = ark1;
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
