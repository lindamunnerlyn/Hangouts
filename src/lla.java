// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class lla
    implements Iterable
{

    private final List a = new LinkedList();
    private final Map b = new HashMap();

    public lla()
    {
    }

    public llf a(String s)
    {
        s = s.toLowerCase(Locale.US);
        s = (List)b.get(s);
        if (s != null && !s.isEmpty())
        {
            return (llf)s.get(0);
        } else
        {
            return null;
        }
    }

    public void a(llf llf1)
    {
        String s = llf1.a().toLowerCase(Locale.US);
        List list = (List)b.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new LinkedList();
            b.put(s, obj);
        }
        ((List) (obj)).add(llf1);
        a.add(llf1);
    }

    public Iterator iterator()
    {
        return Collections.unmodifiableList(a).iterator();
    }

    public String toString()
    {
        return a.toString();
    }
}
