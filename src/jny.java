// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public final class jny
{

    private static final jno a = new jno(",");

    public static jnx a(Object obj)
    {
        if (obj == null)
        {
            return job.c.a();
        } else
        {
            return new joa(obj);
        }
    }

    public static jnx a(Collection collection)
    {
        return new jnz(collection);
    }

}
