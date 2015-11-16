// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public final class jrw extends jri
{

    private static final long serialVersionUID = 0L;
    transient int c;

    public jrw()
    {
        super(new HashMap());
        c = 2;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        c = 2;
        int i1 = objectinputstream.readInt();
        a(jwd.c());
        for (int i = 0; i < i1; i++)
        {
            Collection collection = b(objectinputstream.readObject());
            int j1 = objectinputstream.readInt();
            for (int l = 0; l < j1; l++)
            {
                collection.add(objectinputstream.readObject());
            }

        }

    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        g.a(this, objectoutputstream);
    }

    Set a()
    {
        return h.a(c);
    }

    public volatile Set a(Object obj)
    {
        return super.a(obj);
    }

    public volatile boolean a(Object obj, Iterable iterable)
    {
        return super.a(obj, iterable);
    }

    public volatile boolean a(Object obj, Object obj1)
    {
        return super.a(obj, obj1);
    }

    public volatile Map b()
    {
        return super.b();
    }

    Collection c()
    {
        return a();
    }

    public volatile boolean c(Object obj)
    {
        return super.c(obj);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    public volatile int f()
    {
        return super.f();
    }

    public volatile void g()
    {
        super.g();
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile boolean j()
    {
        return super.j();
    }

    public volatile Set k()
    {
        return super.k();
    }

    public volatile String toString()
    {
        return super.toString();
    }
}
