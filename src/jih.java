// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class jih
    implements Iterator
{

    int b;
    int c;
    jin d;
    AtomicReferenceArray e;
    com.google.common.cache.LocalCache.ReferenceEntry f;
    jjk g;
    jjk h;
    final LocalCache i;

    jih(LocalCache localcache)
    {
        i = localcache;
        super();
        b = localcache.d.length - 1;
        c = -1;
        d();
    }

    private void d()
    {
        g = null;
        break MISSING_BLOCK_LABEL_5;
        if (!a() && !b())
        {
            while (b >= 0) 
            {
                jin ajin[] = i.d;
                int j = b;
                b = j - 1;
                d = ajin[j];
                if (d.b != 0)
                {
                    e = d.f;
                    c = e.length() - 1;
                    if (b())
                    {
                        return;
                    }
                }
            }
        }
        return;
    }

    boolean a()
    {
        if (f != null)
        {
            for (f = f.getNext(); f != null; f = f.getNext())
            {
                if (a(f))
                {
                    return true;
                }
            }

        }
        return false;
    }

    boolean a(com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        Object obj;
        long l = i.o.a();
        obj = referenceentry.getKey();
        referenceentry = ((com.google.common.cache.LocalCache.ReferenceEntry) (i.a(referenceentry, l)));
        if (referenceentry == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        g = new jjk(i, obj, referenceentry);
        d.b();
        return true;
        d.b();
        return false;
        referenceentry;
        d.b();
        throw referenceentry;
    }

    boolean b()
    {
        while (c >= 0) 
        {
            Object obj = e;
            int j = c;
            c = j - 1;
            obj = (com.google.common.cache.LocalCache.ReferenceEntry)((AtomicReferenceArray) (obj)).get(j);
            f = ((com.google.common.cache.LocalCache.ReferenceEntry) (obj));
            if (obj != null && (a(f) || a()))
            {
                return true;
            }
        }
        return false;
    }

    jjk c()
    {
        if (g == null)
        {
            throw new NoSuchElementException();
        } else
        {
            h = g;
            d();
            return h;
        }
    }

    public boolean hasNext()
    {
        return g != null;
    }

    public void remove()
    {
        boolean flag;
        if (h != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        n.b(flag);
        i.remove(h.getKey());
        h = null;
    }
}
