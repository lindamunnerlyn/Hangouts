// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public final class ayh
    implements Serializable
{

    public final int a;
    public final int b;
    public final String c;

    public ayh(List list)
    {
        int i = 0;
        super();
        Iterator iterator = list.iterator();
        list = null;
        int j = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bay bay1 = (bay)iterator.next();
            if (bay1.a())
            {
                j++;
            } else
            if (bay1.b == baz.b)
            {
                i++;
                if (i == 1)
                {
                    list = bay1.a;
                } else
                {
                    list = null;
                }
            }
        } while (true);
        a = j;
        b = i;
        c = list;
    }

    public void a(Context context)
    {
        Integer integer;
        if (c != null)
        {
            integer = Integer.valueOf(g.j(c));
        } else
        {
            integer = null;
        }
        ((bdp)hgx.a(context, bdp)).a(2323, a, b, integer);
    }
}
