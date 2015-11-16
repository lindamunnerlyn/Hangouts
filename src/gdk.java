// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gdk
    implements Runnable
{

    final gfo a;
    final gdg b;

    gdk(gdg gdg1, gfo gfo1)
    {
        b = gdg1;
        a = gfo1;
        super();
    }

    public void run()
    {
        if (!b.b.remove(a))
        {
            String s = a.f();
            gkc.d("vclib", (new StringBuilder(String.valueOf(s).length() + 25)).append("VideoSource ").append(s).append(" not in list.").toString());
        }
        Iterator iterator = b.a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gdo gdo1 = (gdo)iterator.next();
            if (gdo1.b == a)
            {
                gdo1.a();
                iterator.remove();
            }
        } while (true);
    }
}
