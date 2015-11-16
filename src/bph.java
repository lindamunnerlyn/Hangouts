// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class bph
    implements Runnable
{

    final bpd a;

    bph(bpd bpd1)
    {
        a = bpd1;
        super();
    }

    public void run()
    {
        boh boh1;
        for (Iterator iterator = a.q().iterator(); iterator.hasNext(); boh1.g())
        {
            boh1 = (boh)iterator.next();
            bpd.a(a);
        }

    }
}
