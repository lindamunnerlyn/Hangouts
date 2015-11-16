// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class jry extends jsh
{

    jry()
    {
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract jsd b();

    public boolean contains(Object obj)
    {
        return b().contains(obj);
    }

    boolean e()
    {
        return b().e();
    }

    public boolean isEmpty()
    {
        return b().isEmpty();
    }

    public int size()
    {
        return b().size();
    }

    Object writeReplace()
    {
        return new jrz(b());
    }
}
