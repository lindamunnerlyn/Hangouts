// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

final class eoa extends eod
{

    final enq a;
    private final ArrayList c;

    public eoa(enq enq1, ArrayList arraylist)
    {
        a = enq1;
        super(enq1, (byte)0);
        c = arraylist;
    }

    public void a()
    {
        Set set = a.a.g;
        if (set.isEmpty())
        {
            set = a.j();
        }
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((emw)iterator.next()).a(a.g, set)) { }
    }
}
