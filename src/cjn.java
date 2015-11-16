// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cjn
    implements Runnable
{

    final List a;
    final int b;
    final cjk c;

    cjn(cjk cjk1, List list, int i)
    {
        c = cjk1;
        a = list;
        b = i;
        super();
    }

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(new cji((String)iterator.next(), true))) { }
        cjk.a(c, b, arraylist);
    }
}
