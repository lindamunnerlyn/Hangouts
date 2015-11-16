// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;

public abstract class jvd
    implements Iterator
{

    int b;
    int c;
    jvi d;
    AtomicReferenceArray e;
    com.google.common.collect.MapMakerInternalMap.ReferenceEntry f;
    jwc g;
    jwc h;
    final MapMakerInternalMap i;

    jvd(MapMakerInternalMap mapmakerinternalmap)
    {
        i = mapmakerinternalmap;
        super();
        b = mapmakerinternalmap.c.length - 1;
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
                jvi ajvi[] = i.c;
                int j = b;
                b = j - 1;
                d = ajvi[j];
                if (d.b != 0)
                {
                    e = d.e;
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

    boolean a(com.google.common.collect.MapMakerInternalMap.ReferenceEntry referenceentry)
    {
        Object obj;
        obj = referenceentry.getKey();
        referenceentry = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (i.b(referenceentry)));
        if (referenceentry == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        g = new jwc(i, obj, referenceentry);
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
            obj = (com.google.common.collect.MapMakerInternalMap.ReferenceEntry)((AtomicReferenceArray) (obj)).get(j);
            f = ((com.google.common.collect.MapMakerInternalMap.ReferenceEntry) (obj));
            if (obj != null && (a(f) || a()))
            {
                return true;
            }
        }
        return false;
    }

    jwc c()
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
        n.b(flag, "no calls to next() since the last call to remove()");
        i.remove(h.getKey());
        h = null;
    }
}
