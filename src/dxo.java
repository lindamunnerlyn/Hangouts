// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class dxo
    implements Runnable
{

    final grd a;
    final czm b;
    final dxn c;

    dxo(dxn dxn1, grd grd, czm czm)
    {
        c = dxn1;
        a = grd;
        b = czm;
        super();
    }

    public void run()
    {
        for (Iterator iterator = c.a.iterator(); iterator.hasNext(); ((dij)iterator.next()).a(a, b)) { }
    }
}
