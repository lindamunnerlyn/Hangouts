// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

// Referenced classes of package org.chromium.net:
//            ResponseInfo

final class g
    implements ResponseInfo
{

    private final String a[];
    private final int b;
    private final String c;
    private final h d = new h();
    private final boolean e;
    private final String f;
    private final String g;
    private Map h;
    private List i;

    static g a(g g1)
    {
        return g1.d;
    }

    public int a()
    {
        return b;
    }

    public String b()
    {
        return c;
    }

    public List c()
    {
        if (i == null)
        {
            i = Collections.unmodifiableList(d);
        }
        return i;
    }

    public Map d()
    {
        if (h != null)
        {
            return h;
        }
        TreeMap treemap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Pair pair;
        ArrayList arraylist;
        for (Iterator iterator = d.r(); iterator.hasNext(); treemap.put(pair.first, Collections.unmodifiableList(arraylist)))
        {
            pair = (Pair)iterator.next();
            arraylist = new ArrayList();
            if (treemap.containsKey(pair.first))
            {
                arraylist.addAll((Collection)treemap.get(pair.first));
            }
            arraylist.add(pair.second);
        }

        h = Collections.unmodifiableMap(treemap);
        return h;
    }

    (String as[], int j, String s, boolean flag, String s1, String s2)
    {
        a = as;
        b = j;
        c = s;
        e = flag;
        f = s1;
        g = s2;
    }
}
