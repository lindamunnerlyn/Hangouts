// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class bnn
    implements Runnable
{

    final bnk a;

    bnn(bnk bnk1)
    {
        a = bnk1;
        super();
    }

    public void run()
    {
        a.g = true;
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((bns)iterator.next()).a()) { }
        gic.a().a(new bnt(a));
    }
}
