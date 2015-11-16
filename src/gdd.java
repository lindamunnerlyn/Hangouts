// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class gdd extends gjm
{

    private final List a = new CopyOnWriteArrayList();

    gdd()
    {
    }

    public void a(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).a(i)) { }
    }

    public void a(gjm gjm1)
    {
        a.add(gjm1);
    }

    public void a(gjq gjq)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).a(gjq)) { }
    }

    public void a(gjr gjr)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).a(gjr)) { }
    }

    public void a(gjs gjs)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).a(gjs)) { }
    }

    public void a(jdh jdh)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).a(jdh)) { }
    }

    public void b(gjm gjm1)
    {
        a.remove(gjm1);
    }

    public void b(gjr gjr)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).b(gjr)) { }
    }

    public void c(gjr gjr)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).c(gjr)) { }
    }

    public void d(gjr gjr)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gjm)iterator.next()).d(gjr)) { }
    }
}
