// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gfy
    implements Runnable
{

    final gio a;
    final gfu b;

    gfy(gfu gfu1, gio gio1)
    {
        b = gfu1;
        a = gio1;
        super();
    }

    public void run()
    {
        if (!b.b.remove(a))
        {
            String s = String.valueOf(a.d());
            gne.a(5, "vclib", (new StringBuilder(String.valueOf(s).length() + 25)).append("VideoSource ").append(s).append(" not in list.").toString());
        }
        Iterator iterator = b.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ggc ggc1 = (ggc)iterator.next();
            if (ggc1.b == a)
            {
                ggc1.a();
                iterator.remove();
            }
        } while (true);
    }
}
