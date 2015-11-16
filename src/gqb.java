// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gqb
{

    private static final Logger a = Logger.getLogger(gqb.getName());
    private static final gqb b = new gqb(new gqc());
    private static final Set c;
    private final gqc d;
    private final Map e = g.r();

    private gqb(gqc gqc1)
    {
        d = gqc1;
    }

    public static gqb a()
    {
        return b;
    }

    public boolean a(gpw gpw1, String s)
    {
        int i = gpw1.a();
        Object obj1 = (List)e.get(Integer.valueOf(i));
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new ArrayList(0);
        }
        if (!Collections.unmodifiableList(((List) (obj))).contains(s))
        {
            return false;
        }
        s = gos.a(s);
        if (s == null)
        {
            return false;
        }
        obj = d;
        obj1 = new StringBuilder();
        if (gpw1.f())
        {
            char ac[] = new char[gpw1.g()];
            Arrays.fill(ac, '0');
            ((StringBuilder) (obj1)).append(new String(ac));
        }
        ((StringBuilder) (obj1)).append(gpw1.b());
        return ((gqc) (obj)).a(((StringBuilder) (obj1)).toString(), s.a());
    }

    public boolean a(String s, String s1)
    {
        s1 = gos.a(s1);
        if (s1 == null)
        {
            return false;
        } else
        {
            return d.a(s, s1.a());
        }
    }

    public boolean b(String s, String s1)
    {
        boolean flag = false;
        String s2 = gpb.a(s);
        if (!gpb.b.matcher(s2).lookingAt())
        {
            if ((s = gos.a(s1)) != null && s.k())
            {
                s2 = gpb.b(s2);
                s = s.l();
                if (!c.contains(s1))
                {
                    flag = true;
                }
                return d.a(s2, s, flag);
            }
        }
        return false;
    }

    static 
    {
        HashSet hashset = new HashSet();
        c = hashset;
        hashset.add("BR");
        c.add("CL");
        c.add("NI");
    }
}
