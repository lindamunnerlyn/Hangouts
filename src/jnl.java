// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

public class jnl extends jkt
    implements Serializable
{

    private static final long serialVersionUID = 3L;
    final jok a;
    final jok b;
    final jgq c;
    final jgq d;
    final long e;
    final long f;
    final int g;
    final int h;
    final fsn i;
    transient ConcurrentMap j;

    jnl(jok jok, jok jok1, jgq jgq, jgq jgq1, long l, long l1, int k, int i1, fsn fsn, ConcurrentMap concurrentmap)
    {
        a = jok;
        b = jok1;
        c = jgq;
        d = jgq1;
        e = l;
        f = l1;
        g = k;
        h = i1;
        i = fsn;
        j = concurrentmap;
    }

    protected ConcurrentMap a()
    {
        return j;
    }

    jmz a(ObjectInputStream objectinputstream)
    {
        int k = objectinputstream.readInt();
        objectinputstream = (new jmz()).a(k).a(a).b(b).a(c).c(h);
        objectinputstream.a(i);
        if (e > 0L)
        {
            objectinputstream.a(e, TimeUnit.NANOSECONDS);
        }
        if (f > 0L)
        {
            objectinputstream.b(f, TimeUnit.NANOSECONDS);
        }
        if (g != -1)
        {
            objectinputstream.b(g);
        }
        return objectinputstream;
    }

    void a(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeInt(j.size());
        java.util.Map.Entry entry;
        for (Iterator iterator = j.entrySet().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            objectoutputstream.writeObject(entry.getKey());
        }

        objectoutputstream.writeObject(null);
    }

    protected Map b()
    {
        return a();
    }

    void b(ObjectInputStream objectinputstream)
    {
        do
        {
            Object obj = objectinputstream.readObject();
            if (obj != null)
            {
                Object obj1 = objectinputstream.readObject();
                j.put(obj, obj1);
            } else
            {
                return;
            }
        } while (true);
    }

    protected Object c()
    {
        return a();
    }
}
