// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class dod
    implements Comparator
{

    final doc a;

    dod(doc doc)
    {
        a = doc;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (aqo)obj;
        obj1 = (aqo)obj1;
        return ((aqo) (obj)).c.compareToIgnoreCase(((aqo) (obj1)).c);
    }
}
