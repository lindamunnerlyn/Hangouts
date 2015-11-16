// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashSet;
import java.util.Iterator;

public final class eed extends HashSet
{

    private static final long serialVersionUID = 1L;

    public eed()
    {
    }

    public boolean contains(Object obj)
    {
        if (obj == null || !(obj instanceof cgd))
        {
            return false;
        }
        obj = (cgd)obj;
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            if (((cgd)iterator.next()).a(((cgd) (obj))))
            {
                return true;
            }
        }

        return false;
    }

    public boolean remove(Object obj)
    {
        cgd cgd1;
        Iterator iterator;
        if (obj == null || !(obj instanceof cgd))
        {
            return false;
        }
        cgd1 = (cgd)obj;
        iterator = iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (cgd)iterator.next();
        if (!cgd1.a(((cgd) (obj)))) goto _L4; else goto _L3
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
