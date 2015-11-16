// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;

final class hsg extends AbstractSet
{

    final hsd a;

    hsg(hsd hsd1)
    {
        a = hsd1;
        super();
    }

    public hsf a()
    {
        return new hsf(a);
    }

    public void clear()
    {
        String s;
        for (Iterator iterator1 = a.b.b.iterator(); iterator1.hasNext(); a.b.a(s).a(a.a, null))
        {
            s = (String)iterator1.next();
        }

    }

    public boolean isEmpty()
    {
        for (Iterator iterator1 = a.b.b.iterator(); iterator1.hasNext();)
        {
            String s = (String)iterator1.next();
            if (a.b.a(s).a(a.a) != null)
            {
                return false;
            }
        }

        return true;
    }

    public Iterator iterator()
    {
        return a();
    }

    public int size()
    {
        Iterator iterator1 = a.b.b.iterator();
        int i = 0;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s = (String)iterator1.next();
            if (a.b.a(s).a(a.a) != null)
            {
                i++;
            }
        } while (true);
        return i;
    }
}
