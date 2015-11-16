// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class eoc extends eod
{

    final enq a;
    private final ArrayList c;

    public eoc(enq enq1, ArrayList arraylist)
    {
        a = enq1;
        super(enq1, (byte)0);
        c = arraylist;
    }

    public void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((emw)iterator.next()).a(a.g)) { }
    }
}
