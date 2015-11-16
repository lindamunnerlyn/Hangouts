// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class lpa
    implements Serializable
{

    private static final long serialVersionUID = 0xa9c8116671375027L;
    private transient lnn a;

    lpa(lnn lnn1)
    {
        a = lnn1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        a = (lnn)objectinputstream.readObject();
    }

    private Object readResolve()
    {
        return loz.b(a);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeObject(a);
    }
}
