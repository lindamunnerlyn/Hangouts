// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;

final class elb extends elc
{

    final ekp a;
    private final ArrayList c;

    public elb(ekp ekp1, ArrayList arraylist)
    {
        a = ekp1;
        super(ekp1, (byte)0);
        c = arraylist;
    }

    public void a()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ejv)iterator.next()).a(a.g)) { }
    }
}
