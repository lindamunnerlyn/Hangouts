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

public final class kxo
    implements kxx
{

    private final List a;

    private kxo(List list)
    {
        a = list;
    }

    public static transient kxx a(kxx akxx[])
    {
        return new kxo(Arrays.asList(akxx));
    }

    public Object a()
    {
        Object obj = new ArrayList(a.size());
        int k = a.size();
        int j = 0;
        int i;
        int l;
        for (i = 0; j < k; i += l)
        {
            kxx kxx1 = (kxx)a.get(j);
            Set set = (Set)kxx1.a();
            if (set == null)
            {
                obj = String.valueOf(kxx1);
                throw new NullPointerException((new StringBuilder(String.valueOf(obj).length() + 14)).append(((String) (obj))).append(" returned null").toString());
            }
            ((List) (obj)).add(set);
            l = set.size();
            j++;
        }

        LinkedHashSet linkedhashset;
        if (i < 3)
        {
            i++;
        } else
        if (i < 0x40000000)
        {
            i = (int)((float)i / 0.75F + 1.0F);
        } else
        {
            i = 0x7fffffff;
        }
        linkedhashset = new LinkedHashSet(i);
        j = ((List) (obj)).size();
        for (i = 0; i < j; i++)
        {
            Object obj1;
            for (Iterator iterator = ((Set)((List) (obj)).get(i)).iterator(); iterator.hasNext(); linkedhashset.add(obj1))
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
