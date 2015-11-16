// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class cih
    implements Runnable
{

    final List a;
    final int b;
    final cie c;

    cih(cie cie1, List list, int i)
    {
        c = cie1;
        a = list;
        b = i;
        super();
    }

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(new cic((String)iterator.next(), true))) { }
        cie.a(c, b, arraylist);
    }
}
