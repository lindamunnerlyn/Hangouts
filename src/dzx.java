// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public final class dzx extends HashSet
{

    private static final long serialVersionUID = 1L;

    public dzx()
    {
    }

    private dzx(Collection collection)
    {
        super(collection);
    }

    public static dzx a(String s)
    {
        dzx dzx1 = null;
        if (s != null)
        {
            dzx1 = new dzx(Arrays.asList(s.split("\\|")));
        }
        return dzx1;
    }

    public static String a(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        }
        if (s1 != null)
        {
            String s2 = String.valueOf("|");
            return (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(s2).length() + String.valueOf(s1).length())).append(s).append(s2).append(s1).toString();
        } else
        {
            return null;
        }
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
        return gke.a(this, "|");
    }
}
