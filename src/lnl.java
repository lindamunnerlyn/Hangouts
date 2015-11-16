// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Method;
import java.text.DateFormatSymbols;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

public final class lnl
{

    private static final lnm a;
    private static volatile lnm b;
    private static volatile Map c;

    public static final long a()
    {
        lnm lnm1 = b;
        return System.currentTimeMillis();
    }

    public static final long a(loa loa1)
    {
        if (loa1 == null)
        {
            loa1 = b;
            return System.currentTimeMillis();
        } else
        {
            return loa1.a();
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

    public static final lng a(lng lng)
    {
        Object obj = lng;
        if (lng == null)
        {
            obj = loz.M();
        }
        return ((lng) (obj));
    }

    private static void a(Map map, String s, String s1)
    {
        try
        {
            map.put(s, lnn.a(s1));
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

    public static final lng b(loa loa1)
    {
        if (loa1 == null)
        {
            loa1 = loz.M();
        } else
        {
            lng lng = loa1.b();
            loa1 = lng;
            if (lng == null)
            {
                return loz.M();
            }
        }
        return loa1;
    }

    static 
    {
        Object obj = new lnm();
        a = ((lnm) (obj));
        b = ((lnm) (obj));
        obj = new LinkedHashMap();
        ((Map) (obj)).put("UT", lnn.a);
        ((Map) (obj)).put("UTC", lnn.a);
        ((Map) (obj)).put("GMT", lnn.a);
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
