// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractSet;
import java.util.Iterator;

final class hrp extends AbstractSet
{

    final hrm a;

    hrp(hrm hrm1)
    {
        a = hrm1;
        super();
    }

    public Iterator iterator()
    {
        return new hro(a);
    }

    public int size()
    {
        return a.a;
    }
}
