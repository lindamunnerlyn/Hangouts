// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;

public final class eaz extends HashSet
{

    private static final long serialVersionUID = 1L;

    public eaz()
    {
    }

    public boolean contains(Object obj)
    {
        if (obj == null || !(obj instanceof cey))
        {
            return false;
        }
        obj = (cey)obj;
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            if (((cey)iterator.next()).a(((cey) (obj))))
            {
                return true;
            }
        }

        return false;
    }

    public boolean remove(Object obj)
    {
        cey cey1;
        Iterator iterator;
        if (obj == null || !(obj instanceof cey))
        {
            return false;
        }
        cey1 = (cey)obj;
        iterator = iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (cey)iterator.next();
        if (!cey1.a(((cey) (obj)))) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            return super.remove(obj);
        } else
        {
            return false;
        }
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }
}
