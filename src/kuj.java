// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class kuj
{

    final kui a;
    private final Iterator b;
    private java.util.Map.Entry c;
    private final boolean d = true;

    kuj(kui kui1, boolean flag)
    {
        a = kui1;
        super();
        b = a.d.e();
        if (b.hasNext())
        {
            c = (java.util.Map.Entry)b.next();
        }
    }

    public void a(ktv ktv1)
    {
        while (c != null && ((kuk)c.getKey()).a() < 0x7fffffff) 
        {
            kuk kuk1 = (kuk)c.getKey();
            if (d && kuk1.c() == kwe.i && !kuk1.d())
            {
                ktv1.c(kuk1.a(), (kvb)c.getValue());
            } else
            {
                kua.a(kuk1, c.getValue(), ktv1);
            }
            if (b.hasNext())
            {
                c = (java.util.Map.Entry)b.next();
            } else
            {
                c = null;
            }
        }
    }
}
