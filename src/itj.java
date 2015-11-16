// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

final class itj
    implements Runnable
{

    final UUID a;
    final ArrayList b;
    final kak c;
    final iti d;

    itj(iti iti1, UUID uuid, ArrayList arraylist, kak kak1)
    {
        d = iti1;
        a = uuid;
        b = arraylist;
        c = kak1;
        super();
    }

    public void run()
    {
        java.util.List list;
        iti.a(d).remove(a);
        list = Collections.unmodifiableList(b);
        its.a(ita.a);
        itg itg1;
        for (Iterator iterator = ((Set)iti.b(d).a()).iterator(); iterator.hasNext(); c.a(itp.a(new itk(this, itg1, list)), iti.c(d)))
        {
            itg1 = (itg)iterator.next();
        }

        break MISSING_BLOCK_LABEL_110;
        Exception exception;
        exception;
        its.a(null);
        throw exception;
        its.a(null);
        return;
    }
}
