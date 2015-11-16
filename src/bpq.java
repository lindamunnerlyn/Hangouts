// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class bpq
    implements Runnable
{

    final bpm a;

    bpq(bpm bpm1)
    {
        a = bpm1;
        super();
    }

    public void run()
    {
        boq boq1;
        for (Iterator iterator = a.p().iterator(); iterator.hasNext(); boq1.g())
        {
            boq1 = (boq)iterator.next();
            bpm.a(a);
        }

    }
}
