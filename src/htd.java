// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class htd
    implements Iterable
{

    final Object a;

    public htd(Object obj)
    {
        a = obj;
        super();
    }

    public Iterator iterator()
    {
        return new hte(this);
    }
}
