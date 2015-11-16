// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class ldb
{

    private static final ldc a;
    private static volatile ldc b;
    private static volatile Map c;

    public static final long a()
    {
        ldc ldc1 = b;
        return System.currentTimeMillis();
    }

    public static final long a(ldq ldq1)
    {
        if (ldq1 == null)
        {
            ldq1 = b;
            return System.currentTimeMillis();
        } else
        {
            return ldq1.b();
        }
    }

    public static final DateFormatSymbols a(Locale locale)
    {
        DateFormatSymbols dateformatsymbols;
        try
        {
            dateformatsymbols = (DateFormatSymbols)java/text/DateFormatSymbols.getMethod("getInstance", new Class[] {
                java/util/Locale
            }).invoke(null, new Object[] {
                locale
            });
        }
        catch (Exception exception)
        {
            return new DateFormatSymbols(locale);
        }
        return dateformatsymbols;
    }

    public static final lcw a(lcw lcw)
    {
        Object obj = lcw;
        if (lcw == null)
        {
            obj = lep.M();
        }
        return ((lcw) (obj));
    }

    private static void a(Map map, String s, String s1)
    {
        try
        {
            map.put(s, ldd.a(s1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return;
        }
    }

    public static final Map b()
    {
        return c;
    }

    public static final lcw b(ldq ldq1)
    {
        if (ldq1 == null)
        {
            ldq1 = lep.M();
        } else
        {
            lcw lcw = ldq1.c();
            ldq1 = lcw;
            if (lcw == null)
            {
                return lep.M();
            }
        }
        return ldq1;
    }

    static 
    {
        Object obj = new ldc();
        a = ((ldc) (obj));
        b = ((ldc) (obj));
        obj = new LinkedHashMap();
        ((Map) (obj)).put("UT", ldd.a);
        ((Map) (obj)).put("UTC", ldd.a);
        ((Map) (obj)).put("GMT", ldd.a);
        a(((Map) (obj)), "EST", "America/New_York");
        a(((Map) (obj)), "EDT", "America/New_York");
        a(((Map) (obj)), "CST", "America/Chicago");
        a(((Map) (obj)), "CDT", "America/Chicago");
        a(((Map) (obj)), "MST", "America/Denver");
        a(((Map) (obj)), "MDT", "America/Denver");
        a(((Map) (obj)), "PST", "America/Los_Angeles");
        a(((Map) (obj)), "PDT", "America/Los_Angeles");
        c = Collections.unmodifiableMap(((Map) (obj)));
    }
}
