// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Set;

public final class dbe extends djb
{

    final String a;
    final int b;

    public dbe(czm czm1)
    {
        a = czm1.a;
        b = czm1.b;
    }

    public dbe(String s)
    {
        a = s;
        b = 1;
    }

    public void a(aoe aoe1)
    {
label0:
        {
            aoe1.c(a, b);
            if (aoe.a(a))
            {
                if (b != 2)
                {
                    break label0;
                }
                aoe1.m(a, 4L);
            }
            return;
        }
        aoe1.l(a, 4L);
    }

    public void b(aoe aoe1)
    {
        aoe1.a();
        aoe1.c(a, b);
        for (Iterator iterator = aoe1.ai(a).iterator(); iterator.hasNext(); aoe1.c((String)iterator.next(), b)) { }
        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        aoe1.c();
        throw exception;
        aoe1.b();
        aoe1.c();
        return;
    }
}
