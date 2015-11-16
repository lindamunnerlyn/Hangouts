// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class jhb
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    jhb()
    {
    }

    public static jhb b(Object obj)
    {
        return new jhm(n.b(obj));
    }

    public static jhb c(Object obj)
    {
        if (obj == null)
        {
            return jga.a();
        } else
        {
            return new jhm(obj);
        }
    }

    public static jhb d()
    {
        return jga.a();
    }

    public abstract Object a(Object obj);

    public abstract boolean b();

    public abstract Object c();
}
