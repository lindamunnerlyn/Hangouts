// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class cry
{

    public static final cry c = new cry();
    public int a;
    public String b;

    public cry()
    {
        a = 1;
        b = null;
    }

    public cry(isa isa1)
    {
        a = 1;
        b = null;
        if (isa1 != null)
        {
            a = g.a(isa1.a, 1);
            if (isa1.b != null)
            {
                b = isa1.b.a;
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
        for (list = list.iterator(); list.hasNext(); stringbuilder.append((cry)list.next())) { }
        return stringbuilder.toString();
    }

    public String toString()
    {
        int i = a;
        String s = b;
        return (new StringBuilder(String.valueOf(s).length() + 33)).append("Medium (type=").append(i).append(" phone=").append(s).append(") ").toString();
    }

}
