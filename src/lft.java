// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public final class lft
    implements joj
{

    private final List a;

    private lft(List list)
    {
        a = list;
    }

    public static transient joj a(joj ajoj[])
    {
        return new lft(Arrays.asList(ajoj));
    }

    public Object a()
    {
        Object obj = new ArrayList(a.size());
        int l = a.size();
        int k = 0;
        int i;
        int i1;
        for (i = 0; k < l; i += i1)
        {
            joj joj1 = (joj)a.get(k);
            Set set = (Set)joj1.a();
            if (set == null)
            {
                obj = String.valueOf(joj1);
                throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 14)).append(((String) (obj))).append(" returned null").toString());
            }
            ((List) (obj)).add(set);
            i1 = set.size();
            k++;
        }

        LinkedHashSet linkedhashset = new LinkedHashSet(g.q(i));
        k = ((List) (obj)).size();
        for (int j = 0; j < k; j++)
        {
            Object obj1;
            for (Iterator iterator = ((Set)((List) (obj)).get(j)).iterator(); iterator.hasNext(); linkedhashset.add(obj1))
            {
                obj1 = iterator.next();
                if (obj1 == null)
                {
                    throw new NullPointerException("a null element was provided");
                }
            }

        }

        return Collections.unmodifiableSet(linkedhashset);
    }
}
