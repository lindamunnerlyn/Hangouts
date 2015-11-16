// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class gvz
    implements Comparator
{

    final gvy a;

    gvz(gvy gvy)
    {
        a = gvy;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (gvo)obj;
        obj1 = (gvo)obj1;
        return Long.signum(((gvo) (obj)).c - ((gvo) (obj1)).c);
    }
}
