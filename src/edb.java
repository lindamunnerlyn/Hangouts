// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class edb extends HashSet
{

    private static final long serialVersionUID = 1L;

    public edb()
    {
    }

    private edb(Collection collection)
    {
        super(collection);
    }

    public static edb a(String s)
    {
        edb edb1 = null;
        if (s != null)
        {
            edb1 = new edb(Arrays.asList(s.split("\\|")));
        }
        return edb1;
    }

    public String a()
    {
        if (size() > 0)
        {
            return (String)iterator().next();
        } else
        {
            return null;
        }
    }

    public String b()
    {
        return gng.a(this, "|");
    }
}
