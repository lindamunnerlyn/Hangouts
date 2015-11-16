// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class leq
    implements Serializable
{

    private static final long serialVersionUID = 0xa9c8116671375027L;
    private transient ldd a;

    leq(ldd ldd1)
    {
        a = ldd1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        a = (ldd)objectinputstream.readObject();
    }

    private Object readResolve()
    {
        return lep.b(a);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(a);
    }
}
