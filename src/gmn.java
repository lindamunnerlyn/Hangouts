// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Comparator;

public final class gmn
    implements Comparator
{

    private final gms a;

    public gmn(gms gms1)
    {
        a = gms1;
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (Integer)obj;
        obj1 = (Integer)obj1;
        obj = a.a(((Integer) (obj)).intValue());
        obj1 = a.a(((Integer) (obj1)).intValue());
        boolean flag = ((gmu) (obj)).d("is_managed_account");
        boolean flag1 = ((gmu) (obj1)).d("is_managed_account");
        if (flag && !flag1)
        {
            return 1;
        }
        if (!flag && flag1)
        {
            return -1;
        } else
        {
            return ((gmu) (obj)).b("account_name").compareToIgnoreCase(((gmu) (obj1)).b("account_name"));
        }
    }
}
