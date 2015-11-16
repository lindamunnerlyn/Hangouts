// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;

final class inf
    implements Runnable
{

    final UUID a;
    final ArrayList b;
    final jsj c;
    final ine d;

    inf(ine ine1, UUID uuid, ArrayList arraylist, jsj jsj1)
    {
        d = ine1;
        a = uuid;
        b = arraylist;
        c = jsj1;
        super();
    }

    public void run()
    {
        java.util.List list;
        ine.a(d).remove(a);
        list = Collections.unmodifiableList(b);
        ino.a(imw.a);
        inc inc1;
        for (Iterator iterator = ((Set)ine.b(d).a()).iterator(); iterator.hasNext(); c.a(inl.a(new ing(this, inc1, list)), ine.c(d)))
        {
            inc1 = (inc)iterator.next();
        }

        break MISSING_BLOCK_LABEL_110;
        Exception exception;
        exception;
        ino.a(null);
        throw exception;
        ino.a(null);
        return;
    }
}
