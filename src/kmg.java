// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class kmg
{

    final kmf a;
    private final Iterator b;
    private java.util.Map.Entry c;
    private final boolean d = true;

    kmg(kmf kmf1, boolean flag)
    {
        a = kmf1;
        super();
        b = a.d.e();
        if (b.hasNext())
        {
            c = (java.util.Map.Entry)b.next();
        }
    }

    public void a(kls kls1)
    {
        while (c != null && ((kmh)c.getKey()).a() < 0x7fffffff) 
        {
            kmh kmh1 = (kmh)c.getKey();
            if (d && kmh1.c() == kob.i && !kmh1.d())
            {
                kls1.c(kmh1.a(), (kmy)c.getValue());
            } else
            {
                klx.a(kmh1, c.getValue(), kls1);
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
