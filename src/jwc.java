// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.MapMakerInternalMap;

public final class jwc extends jrf
{

    final Object a;
    Object b;
    final MapMakerInternalMap c;

    jwc(MapMakerInternalMap mapmakerinternalmap, Object obj, Object obj1)
    {
        c = mapmakerinternalmap;
        super();
        a = obj;
        b = obj1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof java.util.Map.Entry)
        {
            obj = (java.util.Map.Entry)obj;
            flag = flag1;
            if (a.equals(((java.util.Map.Entry) (obj)).getKey()))
            {
                flag = flag1;
                if (b.equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public Object getKey()
    {
        return a;
    }

    public Object getValue()
    {
        return b;
    }

    public int hashCode()
    {
        return a.hashCode() ^ b.hashCode();
    }

    public Object setValue(Object obj)
    {
        Object obj1 = c.put(a, obj);
        b = obj;
        return obj1;
    }
}
