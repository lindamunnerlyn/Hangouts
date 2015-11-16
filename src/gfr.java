// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class gfr extends gmo
{

    private final List a = new CopyOnWriteArrayList();

    gfr()
    {
    }

    public void a(int i)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(i)) { }
    }

    public void a(int i, String s)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(i, s)) { }
    }

    public void a(gmo gmo1)
    {
        a.add(gmo1);
    }

    public void a(gms gms)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(gms)) { }
    }

    public void a(gmt gmt)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(gmt)) { }
    }

    public void a(gmu gmu)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(gmu)) { }
    }

    public void a(itz itz)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(itz)) { }
    }

    public void a(jjt jjt)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).a(jjt)) { }
    }

    public void b(gmo gmo1)
    {
        a.remove(gmo1);
    }

    public void b(gmt gmt)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).b(gmt)) { }
    }

    public void c(gmt gmt)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).c(gmt)) { }
    }

    public void d(gmt gmt)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((gmo)iterator.next()).d(gmt)) { }
    }
}
