// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class eec extends HashMap
{

    private static final long serialVersionUID = 1L;

    public eec()
    {
    }

    public boolean containsKey(Object obj)
    {
        if (obj == null || !(obj instanceof cgd))
        {
            return false;
        }
        obj = (cgd)obj;
        for (Iterator iterator = keySet().iterator(); iterator.hasNext();)
        {
            if (((cgd) (obj)).a((cgd)iterator.next()))
            {
                return true;
            }
        }

        return false;
    }

    public Object get(Object obj)
    {
        if (obj == null || !(obj instanceof cgd))
        {
            return null;
        }
        obj = (cgd)obj;
        for (Iterator iterator = entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (((cgd) (obj)).a((cgd)entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return null;
    }

    public Object remove(Object obj)
    {
        cgd cgd1;
        Iterator iterator;
        if (obj == null || !(obj instanceof cgd))
        {
            return null;
        }
        cgd1 = (cgd)obj;
        iterator = entrySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (cgd)((java.util.Map.Entry)iterator.next()).getKey();
        if (!cgd1.a(((cgd) (obj)))) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            return super.remove(obj);
        } else
        {
            return null;
        }
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }
}
