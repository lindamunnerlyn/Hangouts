// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class jnv
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    jnv()
    {
    }

    public static jnv b(Object obj)
    {
        return new jog(n.b(obj));
    }

    public static jnv c(Object obj)
    {
        if (obj == null)
        {
            return jmq.a();
        } else
        {
            return new jog(obj);
        }
    }

    public static jnv d()
    {
        return jmq.a();
    }

    public abstract Object a(Object obj);

    public abstract boolean b();

    public abstract Object c();
}
