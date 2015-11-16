// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class lov
{

    private static ConcurrentMap a = new ConcurrentHashMap();
    private final String b[];
    private final String c[];
    private final String d[];
    private final String e[];
    private final String f[];
    private final String g[];
    private final TreeMap h;
    private final TreeMap i;
    private final TreeMap j;
    private final int k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;

    private lov(Locale locale)
    {
        DateFormatSymbols dateformatsymbols = lnl.a(locale);
        b = dateformatsymbols.getEras();
        c = b(dateformatsymbols.getWeekdays());
        d = b(dateformatsymbols.getShortWeekdays());
        e = a(dateformatsymbols.getMonths());
        f = a(dateformatsymbols.getShortMonths());
        g = dateformatsymbols.getAmPmStrings();
        Integer ainteger[] = new Integer[13];
        for (int i1 = 0; i1 < 13; i1++)
        {
            ainteger[i1] = Integer.valueOf(i1);
        }

        h = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(h, b, ainteger);
        if ("en".equals(locale.getLanguage()))
        {
            h.put("BCE", ainteger[0]);
            h.put("CE", ainteger[1]);
        }
        i = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(i, c, ainteger);
        a(i, d, ainteger);
        a(i, 7, ainteger);
        j = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        a(j, e, ainteger);
        a(j, f, ainteger);
        a(j, 12, ainteger);
        k = c(b);
        l = c(c);
        m = c(d);
        n = c(e);
        o = c(f);
        p = c(g);
    }

    static lov a(Locale locale)
    {
        lov lov1;
label0:
        {
            Locale locale1 = locale;
            if (locale == null)
            {
                locale1 = Locale.getDefault();
            }
            lov1 = (lov)a.get(locale1);
            locale = lov1;
            if (lov1 == null)
            {
                lov1 = new lov(locale1);
                locale = (lov)a.putIfAbsent(locale1, lov1);
                if (locale == null)
                {
                    break label0;
                }
            }
            return locale;
        }
        return lov1;
    }

    private static void a(TreeMap treemap, int i1, Integer ainteger[])
    {
        for (int j1 = 1; j1 <= i1; j1++)
        {
            treemap.put(String.valueOf(j1).intern(), ainteger[j1]);
        }

    }

    private static void a(TreeMap treemap, String as[], Integer ainteger[])
    {
        int i1 = as.length;
        do
        {
            int j1 = i1 - 1;
            if (j1 < 0)
            {
                break;
            }
            String s = as[j1];
            i1 = j1;
            if (s != null)
            {
                treemap.put(s, ainteger[j1]);
                i1 = j1;
            }
        } while (true);
    }

    private static String[] a(String as[])
    {
        String as1[] = new String[13];
        for (int i1 = 1; i1 < 13; i1++)
        {
            as1[i1] = as[i1 - 1];
        }

        return as1;
    }

    private static String[] b(String as[])
    {
        String as1[] = new String[8];
        int i1 = 1;
        while (i1 < 8) 
        {
            int j1;
            if (i1 < 7)
            {
                j1 = i1 + 1;
            } else
            {
                j1 = 1;
            }
            as1[i1] = as[j1];
            i1++;
        }
        return as1;
    }

    private static int c(String as[])
    {
        int i1 = 0;
        int j1 = as.length;
        do
        {
            j1--;
            if (j1 < 0)
            {
                break;
            }
            String s = as[j1];
            if (s != null)
            {
                int k1 = s.length();
                if (k1 > i1)
                {
                    i1 = k1;
                }
            }
        } while (true);
        return i1;
    }

    public int a()
    {
        return k;
    }

    public int a(String s)
    {
        Integer integer = (Integer)h.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new lnu(lnj.w(), s);
        }
    }

    public String a(int i1)
    {
        return b[i1];
    }

    public int b()
    {
        return n;
    }

    public int b(String s)
    {
        Integer integer = (Integer)j.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new lnu(lnj.r(), s);
        }
    }

    public String b(int i1)
    {
        return e[i1];
    }

    public int c()
    {
        return l;
    }

    public int c(String s)
    {
        Integer integer = (Integer)i.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new lnu(lnj.l(), s);
        }
    }

    public String c(int i1)
    {
        return f[i1];
    }

    public int d()
    {
        return p;
    }

    public int d(String s)
    {
        String as[] = g;
        int i1 = as.length;
        do
        {
            int j1 = i1 - 1;
            if (j1 >= 0)
            {
                i1 = j1;
                if (as[j1].equalsIgnoreCase(s))
                {
                    return j1;
                }
            } else
            {
                throw new lnu(lnj.k(), s);
            }
        } while (true);
    }

    public String d(int i1)
    {
        return c[i1];
    }

    public String e(int i1)
    {
        return d[i1];
    }

    public String f(int i1)
    {
        return g[i1];
    }

}
