// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class jgs extends jgq
    implements Serializable
{

    public static final jgs a = new jgs();
    private static final long serialVersionUID = 1L;

    jgs()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    protected int b(Object obj)
    {
        return System.identityHashCode(obj);
    }

    protected boolean b(Object obj, Object obj1)
    {
        return false;
    }

}
