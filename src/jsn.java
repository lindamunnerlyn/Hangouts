// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class jsn extends jte
    implements jwl
{

    private static final long serialVersionUID = 0L;

    jsn(jso jso1, int i)
    {
        super(jso1, i);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        int l = objectinputstream.readInt();
        if (l < 0)
        {
            throw new InvalidObjectException((new StringBuilder(29)).append("Invalid key count ").append(l).toString());
        }
        jsq jsq1 = new jsq();
        int i = 0;
        int j = 0;
        for (; i < l; i++)
        {
            Object obj = objectinputstream.readObject();
            int i1 = objectinputstream.readInt();
            if (i1 <= 0)
            {
                throw new InvalidObjectException((new StringBuilder(31)).append("Invalid value count ").append(i1).toString());
            }
            jsj jsj1 = new jsj();
            for (int k = 0; k < i1; k++)
            {
                jsj1.c(objectinputstream.readObject());
            }

            jsq1.a(obj, jsj1.a());
            j += i1;
        }

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
        jtg.b.a(this, j);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        g.a(this, objectoutputstream);
    }

    public jsh a(Object obj)
    {
        jsh jsh1 = (jsh)b.get(obj);
        obj = jsh1;
        if (jsh1 == null)
        {
            obj = jxj.a;
        }
        return ((jsh) (obj));
    }

    public Collection b(Object obj)
    {
        return a(obj);
    }

    public jsd d(Object obj)
    {
        return a(obj);
    }
}
