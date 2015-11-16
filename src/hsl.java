// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.util.GenericData;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class hsl
    implements Iterator
{

    final GenericData a;
    private boolean b;
    private final Iterator c;
    private final Iterator d;

    hsl(GenericData genericdata, hsg hsg1)
    {
        a = genericdata;
        super();
        c = hsg1.a();
        d = genericdata.unknownFields.entrySet().iterator();
    }

    public boolean hasNext()
    {
        return c.hasNext() || d.hasNext();
    }

    public Object next()
    {
        if (!b)
        {
            if (c.hasNext())
            {
                return (java.util.Map.Entry)c.next();
            }
            b = true;
        }
        return (java.util.Map.Entry)d.next();
    }

    public void remove()
    {
        if (b)
        {
            d.remove();
        }
        c.remove();
    }
}
