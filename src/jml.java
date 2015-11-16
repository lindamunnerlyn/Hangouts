// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class jml extends jme
    implements jpl
{

    private static final long serialVersionUID = 0L;
    private final transient jmi a;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        Comparator comparator = (Comparator)objectinputstream.readObject();
        int i1 = objectinputstream.readInt();
        if (i1 < 0)
        {
            throw new InvalidObjectException((new StringBuilder("Invalid key count ")).append(i1).toString());
        }
        jls jls1 = jlr.i();
        int i = 0;
        int k = 0;
        for (; i < i1; i++)
        {
            Object obj1 = objectinputstream.readObject();
            int j1 = objectinputstream.readInt();
            if (j1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder("Invalid value count ")).append(j1).toString());
            }
            Object aobj[] = new Object[j1];
            for (int l = 0; l < j1; l++)
            {
                aobj[l] = objectinputstream.readObject();
            }

            Object obj = Arrays.asList(aobj);
            if (comparator == null)
            {
                obj = jmi.a(((Collection) (obj)));
            } else
            {
                obj = jmn.a(comparator, ((Collection) (obj)));
            }
            if (((jmi) (obj)).size() != aobj.length)
            {
                throw new InvalidObjectException((new StringBuilder("Duplicate key-value pairs exist for key ")).append(obj1).toString());
            }
            jls1.a(obj1, obj);
            k += j1;
        }

        jqh jqh1;
        try
        {
            objectinputstream = jls1.a();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw (InvalidObjectException)(new InvalidObjectException(objectinputstream.getMessage())).initCause(objectinputstream);
        }
        jmh.a.a(this, objectinputstream);
        jmh.b.a(this, k);
        jqh1 = jmh.c;
        if (comparator == null)
        {
            objectinputstream = jmi.g();
        } else
        {
            objectinputstream = jmn.a(comparator);
        }
        jqh1.a(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(j());
        g.a(this, objectoutputstream);
    }

    public Collection a(Object obj)
    {
        return b(obj);
    }

    public jmi b(Object obj)
    {
        return (jmi)h.b((jmi)b.get(obj), a);
    }

    public jle c(Object obj)
    {
        return b(obj);
    }

    Comparator j()
    {
        if (a instanceof jmn)
        {
            return ((jmn)a).comparator();
        } else
        {
            return null;
        }
    }
}
