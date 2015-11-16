// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class dxa
    implements Runnable
{

    final String a;
    final dwz b;

    dxa(dwz dwz1, String s)
    {
        b = dwz1;
        a = s;
        super();
    }

    public void run()
    {
        for (Iterator iterator = dwz.k().iterator(); iterator.hasNext(); ((dxb)iterator.next()).a(a)) { }
    }
}
