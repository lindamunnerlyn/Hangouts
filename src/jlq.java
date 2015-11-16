// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class jlq extends jme
    implements jpl
{

    private static final long serialVersionUID = 0L;

    jlq(jlr jlr1, int i)
    {
        super(jlr1, i);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder("Invalid key count ")).append(l).toString());
        }
        jls jls1 = jlr.i();
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            Object obj = objectinputstream.readObject();
            int i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder("Invalid value count ")).append(i1).toString());
            }
            Object aobj[] = new Object[i1];
            for (int k = 0; k < i1; k++)
            {
                aobj[k] = objectinputstream.readObject();
            }

            jls1.a(obj, jlk.a(aobj));
            j += i1;
        }

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
        jmh.b.a(this, j);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        g.a(this, objectoutputstream);
    }

    public Collection a(Object obj)
    {
        return b(obj);
    }

    public jlk b(Object obj)
    {
        jlk jlk1 = (jlk)b.get(obj);
        obj = jlk1;
        if (jlk1 == null)
        {
            obj = jlk.d();
        }
        return ((jlk) (obj));
    }

    public jle c(Object obj)
    {
        return b(obj);
    }
}
