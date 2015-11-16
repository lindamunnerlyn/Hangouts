// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class gfv
    implements Runnable
{

    final gmw a;
    final gio b;
    final gfu c;

    gfv(gfu gfu1, gmw gmw1, gio gio)
    {
        c = gfu1;
        a = gmw1;
        b = gio;
        super();
    }

    public void run()
    {
        int j = c.a.size();
        for (int i = 0; i < j; i++)
        {
            ggc ggc1 = (ggc)c.a.get(i);
            if (ggc1.a.equals(a))
            {
                ggc1.a(a, b);
                return;
            }
        }

        c.a.add(new ggc(c, a, b));
        c.b();
    }
}
