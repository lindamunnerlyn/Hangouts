// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;

public class jtm extends jte
    implements jwl
{

    private static final long serialVersionUID = 0L;
    private final transient jth a;

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        Comparator comparator = (Comparator)objectinputstream.readObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder(29)).append("Invalid key count ").append(l).toString());
        }
        jsq jsq1 = new jsq();
        int j = 0;
        int i;
        int i1;
        for (i = 0; j < l; i += i1)
        {
            Object obj1 = objectinputstream.readObject();
            i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder(31)).append("Invalid value count ").append(i1).toString());
            }
            Object obj;
            int k;
            if (comparator == null)
            {
                obj = new jti();
            } else
            {
                obj = new jtp(comparator);
            }
            for (k = 0; k < i1; k++)
            {
                ((jti) (obj)).c(objectinputstream.readObject());
            }

            obj = ((jti) (obj)).a();
            if (((jth) (obj)).size() != i1)
            {
                objectinputstream = String.valueOf(obj1);
                throw new InvalidObjectException((new StringBuilder(String.valueOf(objectinputstream).length() + 40)).append("Duplicate key-value pairs exist for key ").append(objectinputstream).toString());
            }
            jsq1.a(obj1, obj);
            j++;
        }

        jxp jxp1;
        try
        {
            objectinputstream = jsq1.a();
        }
        // Misplaced declaration of an exception variable
        catch (ObjectInputStream objectinputstream)
        {
            throw (InvalidObjectException)(new InvalidObjectException(objectinputstream.getMessage())).initCause(objectinputstream);
        }
        jtg.a.a(this, objectinputstream);
        jtg.b.a(this, i);
        jxp1 = jtg.c;
        if (comparator == null)
        {
            objectinputstream = jxl.a;
        } else
        {
            objectinputstream = jto.a(comparator);
        }
        jxp1.a(this, objectinputstream);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(d());
        g.a(this, objectoutputstream);
    }

    public jth a(Object obj)
    {
        return (jth)g.e((jth)b.get(obj), a);
    }

    public Collection b(Object obj)
    {
        return a(obj);
    }

    Comparator d()
    {
        if (a instanceof jto)
        {
            return ((jto)a).comparator();
        } else
        {
            return null;
        }
    }

    public jsd d(Object obj)
    {
        return a(obj);
    }
}
