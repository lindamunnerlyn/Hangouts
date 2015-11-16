// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class jpk extends AbstractCollection
{

    final Map a;

    jpk(Map map)
    {
        a = (Map)n.b(map);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return jpc.b(a.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        boolean flag;
        try
        {
            flag = super.remove(obj);
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            for (Iterator iterator1 = a.entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (n.a(obj, entry.getValue()))
                {
                    a.remove(entry.getKey());
                    return true;
                }
            }

            return false;
        }
        return flag;
    }

    public boolean removeAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.removeAll((Collection)n.b(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            java.util.HashSet hashset = h.c();
            Iterator iterator1 = a.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (collection.contains(entry.getValue()))
                {
                    hashset.add(entry.getKey());
                }
            } while (true);
            return a.keySet().removeAll(hashset);
        }
        return flag;
    }

    public boolean retainAll(Collection collection)
    {
        boolean flag;
        try
        {
            flag = super.retainAll((Collection)n.b(collection));
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            java.util.HashSet hashset = h.c();
            Iterator iterator1 = a.entrySet().iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (collection.contains(entry.getValue()))
                {
                    hashset.add(entry.getKey());
                }
            } while (true);
            return a.keySet().retainAll(hashset);
        }
        return flag;
    }

    public int size()
    {
        return a.size();
    }
}
