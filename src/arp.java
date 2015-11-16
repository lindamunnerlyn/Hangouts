// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class arp extends dgp
{

    final aro a;

    arp(aro aro1)
    {
        a = aro1;
        super();
    }

    public void a(int i, ani ani1, dko dko, dbo dbo)
    {
        if (dko instanceof ctv)
        {
            dbo = ((ctv)dko).j;
            if (dbo != null)
            {
                i = ani1.h();
                dko = (Set)aro.a(a).get(Integer.valueOf(i));
                ani1 = dko;
                if (dko == null)
                {
                    dko = aro.a(a);
                    ani1 = new HashSet();
                    dko.put(Integer.valueOf(i), ani1);
                }
                ani1.add(dbo);
            }
        }
    }
}
