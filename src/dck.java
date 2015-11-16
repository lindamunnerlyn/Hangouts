// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class dck
{

    final String a;
    final int b;

    public dck(dns dns1)
    {
        a = dns1.a;
        b = dns1.b;
    }

    public dck(String s)
    {
        a = s;
        b = 1;
    }

    public void a(aow aow1)
    {
label0:
        {
            aow1.c(a, b);
            if (aow.a(a))
            {
                if (b != 2)
                {
                    break label0;
                }
                aow1.l(a, 4L);
            }
            return;
        }
        aow1.k(a, 4L);
    }

    public void b(aow aow1)
    {
        aow1.a();
        aow1.c(a, b);
        for (Iterator iterator = aow1.ah(a).iterator(); iterator.hasNext(); aow1.c((String)iterator.next(), b)) { }
        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        aow1.c();
        throw exception;
        aow1.b();
        aow1.c();
        return;
    }
}
