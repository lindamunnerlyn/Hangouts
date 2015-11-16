// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

final class jmk
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Object a[];

    jmk(Object aobj[])
    {
        a = aobj;
    }

    Object readResolve()
    {
        return jmi.a(a);
    }
}
