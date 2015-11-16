// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class gmt
    implements Comparator
{

    gmt()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (gmu)obj;
        obj1 = (gmu)obj1;
        int i = ((gmu) (obj)).a("device_index", 0x7fffffff);
        int j = ((gmu) (obj1)).a("device_index", 0x7fffffff);
        if (i < j)
        {
            return -1;
        }
        return i != j ? 1 : 0;
    }
}
