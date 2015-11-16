// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

abstract class jkz extends jlk
{

    jkz()
    {
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Use SerializedForm");
    }

    abstract jle c();

    public boolean contains(Object obj)
    {
        return c().contains(obj);
    }

    boolean e()
    {
        return c().e();
    }

    public boolean isEmpty()
    {
        return c().isEmpty();
    }

    public int size()
    {
        return c().size();
    }

    Object writeReplace()
    {
        return new jla(c());
    }
}
