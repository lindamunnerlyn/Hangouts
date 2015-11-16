// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

final class ldf
    implements Serializable
{

    private static final long serialVersionUID = 0xa62f019a7c321ae3L;
    private transient String a;

    ldf(String s)
    {
        a = s;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        a = objectinputstream.readUTF();
    }

    private Object readResolve()
    {
        return ldd.a(a);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.writeUTF(a);
    }
}
