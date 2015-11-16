// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gdh
    implements Runnable
{

    final gju a;
    final gfo b;
    final gdg c;

    gdh(gdg gdg1, gju gju1, gfo gfo)
    {
        c = gdg1;
        a = gju1;
        b = gfo;
        super();
    }

    public void run()
    {
        int j = c.a.size();
        for (int i = 0; i < j; i++)
        {
            gdo gdo1 = (gdo)c.a.get(i);
            if (gdo1.a.equals(a))
            {
                gdo1.a(a, b);
                return;
            }
        }

        c.a.add(new gdo(c, a, b));
        c.b();
    }
}
