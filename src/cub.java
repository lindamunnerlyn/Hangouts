// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class cub
{

    public static final cub c = new cub();
    public int a;
    public String b;

    public cub()
    {
        a = 1;
        b = null;
    }

    public cub(iyf iyf1)
    {
        a = 1;
        b = null;
        if (iyf1 != null)
        {
            a = g.a(iyf1.a, 1);
            if (iyf1.b != null)
            {
                b = iyf1.b.a;
            }
        }
    }

    public static String a(List list)
    {
        if (list == null || list.size() == 0)
        {
            return "Empty deliveryMediumList. ";
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (list = list.iterator(); list.hasNext(); stringbuilder.append((cub)list.next())) { }
        return stringbuilder.toString();
    }

    public String toString()
    {
        int i = a;
        String s = b;
        return (new StringBuilder(String.valueOf(s).length() + 33)).append("Medium (type=").append(i).append(" phone=").append(s).append(") ").toString();
    }

}
