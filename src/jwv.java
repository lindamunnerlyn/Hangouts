// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public final class jwv extends jqp
{

    private static final long serialVersionUID = 0L;
    transient joj c;

    public jwv(Map map, joj joj1)
    {
        super(map);
        c = (joj)n.b(joj1);
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        c = (joj)objectinputstream.readObject();
        a((Map)objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(c);
        objectoutputstream.writeObject(e());
    }

    protected List a()
    {
        return (List)c.a();
    }

    protected Collection c()
    {
        return a();
    }
}
