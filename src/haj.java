// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class haj
    implements Comparator
{

    final hai a;

    haj(hai hai)
    {
        a = hai;
        super();
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (gzy)obj;
        obj1 = (gzy)obj1;
        return Long.signum(((gzy) (obj)).c - ((gzy) (obj1)).c);
    }
}
