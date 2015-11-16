// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class dqw
    implements Comparator
{

    final dqv a;

    dqw(dqv dqv)
    {
        a = dqv;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (arf)obj;
        obj1 = (arf)obj1;
        return ((arf) (obj)).c.compareToIgnoreCase(((arf) (obj1)).c);
    }
}
