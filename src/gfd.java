// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class gfd
    implements Comparator
{

    final gfc a;

    gfd(gfc gfc)
    {
        a = gfc;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (gff)obj;
        obj1 = (gff)obj1;
        return Long.compare(((gff) (obj)).a, ((gff) (obj1)).a);
    }
}
