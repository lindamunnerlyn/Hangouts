// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

final class dlm
    implements Comparator
{

    dlm()
    {
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (dll)obj;
        obj1 = (dll)obj1;
        return ((dll) (obj)).d.compareToIgnoreCase(((dll) (obj1)).d);
    }
}
