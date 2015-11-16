// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Comparator;

final class jtq
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    final Comparator a;
    final Object b[];

    public jtq(Comparator comparator, Object aobj[])
    {
        a = comparator;
        b = aobj;
    }

    Object readResolve()
    {
        return (new jtp(a)).c(b).b();
    }
}
