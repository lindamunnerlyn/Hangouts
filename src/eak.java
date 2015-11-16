// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class eak
    implements Runnable
{

    final String a;
    final eaj b;

    eak(eaj eaj1, String s)
    {
        b = eaj1;
        a = s;
        super();
    }

    public void run()
    {
        for (Iterator iterator = eaj.l().iterator(); iterator.hasNext(); ((eal)iterator.next()).a(a)) { }
    }
}
