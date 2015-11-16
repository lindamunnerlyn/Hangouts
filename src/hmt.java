// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractSet;
import java.util.Iterator;

final class hmt extends AbstractSet
{

    final hmq a;

    hmt(hmq hmq1)
    {
        a = hmq1;
        super();
    }

    public Iterator iterator()
    {
        return new hms(a);
    }

    public int size()
    {
        return a.a;
    }
}
