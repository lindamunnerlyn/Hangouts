// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

public abstract class ldd
    implements Serializable
{

    public static final ldd a;
    private static lgt c;
    private static lgs d;
    private static Set e;
    private static volatile ldd f;
    private static lfo g;
    private static Map h;
    private static Map i;
    private static final long serialVersionUID = 0x4cf893d49479892aL;
    public final String b;

    public ldd(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Id must not be null");
        } else
        {
            b = s;
            return;
        }
    }

    private static String a(int j)
    {
        StringBuffer stringbuffer = new StringBuffer();
        int k;
        if (j >= 0)
        {
            stringbuffer.append('+');
        } else
        {
            stringbuffer.append('-');
            j = -j;
        }
        k = j / 0x36ee80;
        lgj.a(stringbuffer, k, 2);
        j -= k * 0x36ee80;
        k = j / 60000;
        stringbuffer.append(':');
        lgj.a(stringbuffer, k, 2);
        j -= k * 60000;
        if (j == 0)
        {
            return stringbuffer.toString();
        }
        k = j / 1000;
        stringbuffer.append(':');
        lgj.a(stringbuffer, k, 2);
        j -= k * 1000;
        if (j == 0)
        {
            return stringbuffer.toString();
        } else
        {
            stringbuffer.append('.');
            lgj.a(stringbuffer, j, 3);
            return stringbuffer.toString();
        }
    }

    public static ldd a()
    {
        Object obj;
        ldd ldd1;
        obj = f;
        ldd1 = ((ldd) (obj));
        if (obj != null) goto _L2; else goto _L1
_L1:
        ldd;
        JVM INSTR monitorenter ;
        obj = f;
        ldd1 = ((ldd) (obj));
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = System.getProperty("user.timezone");
        if (obj == null) goto _L6; else goto _L5
_L5:
        obj = a(((String) (obj)));
_L15:
        ldd1 = ((ldd) (obj));
_L11:
        obj = ldd1;
        if (ldd1 != null) goto _L8; else goto _L7
_L7:
        TimeZone timezone = TimeZone.getDefault();
        if (timezone != null) goto _L10; else goto _L9
_L9:
        ldd ldd2;
        String s;
        String s1;
        int j;
        try
        {
            obj = a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = ldd1;
        }
        finally { }
_L8:
        ldd1 = ((ldd) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        ldd1 = a;
        f = ldd1;
_L4:
        ldd;
        JVM INSTR monitorexit ;
_L2:
        return ldd1;
        obj;
        ldd1 = null;
          goto _L11
_L10:
label0:
        {
            s = timezone.getID();
            if (!s.equals("UTC"))
            {
                break label0;
            }
            obj = a;
        }
          goto _L8
        s1 = b(s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_279;
        }
        obj = c.a(s1);
_L13:
        ldd2 = ((ldd) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        ldd2 = c.a(s);
        obj = ldd2;
        if (ldd2 != null) goto _L8; else goto _L12
_L12:
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        obj = timezone.getID();
        if (!((String) (obj)).startsWith("GMT+") && !((String) (obj)).startsWith("GMT-"))
        {
            break MISSING_BLOCK_LABEL_219;
        }
        j = c(((String) (obj)).substring(3));
        if ((long)j != 0L)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = a;
          goto _L8
        obj = a(a(j), j);
          goto _L8
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 41)).append("The datetime zone id '").append(s).append("' is not recognised").toString());
        ldd;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        obj = null;
          goto _L8
        obj = null;
          goto _L13
_L6:
        obj = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    public static ldd a(String s)
    {
        ldd ldd1;
        if (s == null)
        {
            ldd1 = a();
        } else
        {
            if (s.equals("UTC"))
            {
                return a;
            }
            ldd ldd2 = c.a(s);
            ldd1 = ldd2;
            if (ldd2 == null)
            {
                if (s.startsWith("+") || s.startsWith("-"))
                {
                    int j = c(s);
                    if ((long)j == 0L)
                    {
                        return a;
                    } else
                    {
                        return a(a(j), j);
                    }
                } else
                {
                    throw new IllegalArgumentException((new StringBuilder(String.valueOf(s).length() + 41)).append("The datetime zone id '").append(s).append("' is not recognised").toString());
                }
            }
        }
        return ldd1;
    }

    private static ldd a(String s, int j)
    {
        ldd;
        JVM INSTR monitorenter ;
        if (j != 0) goto _L2; else goto _L1
_L1:
        Object obj = a;
_L4:
        ldd;
        JVM INSTR monitorexit ;
        return ((ldd) (obj));
_L2:
        if (h == null)
        {
            h = new HashMap();
        }
        obj = (Reference)h.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        ldd ldd1 = (ldd)((Reference) (obj)).get();
        obj = ldd1;
        if (ldd1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = new lgr(s, null, j, j);
        h.put(s, new SoftReference(obj));
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    private static String b(String s)
    {
        ldd;
        JVM INSTR monitorenter ;
        Map map = i;
        Object obj;
        obj = map;
        if (map != null)
        {
            break MISSING_BLOCK_LABEL_426;
        }
        obj = new HashMap();
        ((Map) (obj)).put("GMT", "UTC");
        ((Map) (obj)).put("WET", "WET");
        ((Map) (obj)).put("CET", "CET");
        ((Map) (obj)).put("MET", "CET");
        ((Map) (obj)).put("ECT", "CET");
        ((Map) (obj)).put("EET", "EET");
        ((Map) (obj)).put("MIT", "Pacific/Apia");
        ((Map) (obj)).put("HST", "Pacific/Honolulu");
        ((Map) (obj)).put("AST", "America/Anchorage");
        ((Map) (obj)).put("PST", "America/Los_Angeles");
        ((Map) (obj)).put("MST", "America/Denver");
        ((Map) (obj)).put("PNT", "America/Phoenix");
        ((Map) (obj)).put("CST", "America/Chicago");
        ((Map) (obj)).put("EST", "America/New_York");
        ((Map) (obj)).put("IET", "America/Indiana/Indianapolis");
        ((Map) (obj)).put("PRT", "America/Puerto_Rico");
        ((Map) (obj)).put("CNT", "America/St_Johns");
        ((Map) (obj)).put("AGT", "America/Argentina/Buenos_Aires");
        ((Map) (obj)).put("BET", "America/Sao_Paulo");
        ((Map) (obj)).put("ART", "Africa/Cairo");
        ((Map) (obj)).put("CAT", "Africa/Harare");
        ((Map) (obj)).put("EAT", "Africa/Addis_Ababa");
        ((Map) (obj)).put("NET", "Asia/Yerevan");
        ((Map) (obj)).put("PLT", "Asia/Karachi");
        ((Map) (obj)).put("IST", "Asia/Kolkata");
        ((Map) (obj)).put("BST", "Asia/Dhaka");
        ((Map) (obj)).put("VST", "Asia/Ho_Chi_Minh");
        ((Map) (obj)).put("CTT", "Asia/Shanghai");
        ((Map) (obj)).put("JST", "Asia/Tokyo");
        ((Map) (obj)).put("ACT", "Australia/Darwin");
        ((Map) (obj)).put("AET", "Australia/Sydney");
        ((Map) (obj)).put("SST", "Pacific/Guadalcanal");
        ((Map) (obj)).put("NST", "Pacific/Auckland");
        i = ((Map) (obj));
        s = (String)((Map) (obj)).get(s);
        ldd;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    public static Set b()
    {
        return e;
    }

    private static int c(String s)
    {
        lde lde1 = new lde();
        return -(int)f().a(lde1).a(s);
    }

    private static lgt d()
    {
        Object obj1 = null;
        String s = System.getProperty("org.joda.time.DateTimeZone.Provider");
        Object obj;
        obj = obj1;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        obj = (lgt)Class.forName(s).newInstance();
_L1:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj1 = new lgv("org/joda/time/tz/data");
        obj = obj1;
_L2:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = new lgu();
        }
        return ((lgt) (obj1));
        obj;
        Thread thread = Thread.currentThread();
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
        obj = obj1;
          goto _L1
        SecurityException securityexception;
        securityexception;
        securityexception = ((SecurityException) (obj1));
          goto _L1
        Exception exception;
        exception;
        Thread thread1 = Thread.currentThread();
        thread1.getThreadGroup().uncaughtException(thread1, exception);
          goto _L2
    }

    private static lgs e()
    {
        Object obj = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (lgs)Class.forName(((String) (obj))).newInstance();
_L4:
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = new lgs();
        }
        return ((lgs) (obj1));
        obj;
        Thread thread = Thread.currentThread();
        thread.getThreadGroup().uncaughtException(thread, ((Throwable) (obj)));
_L2:
        obj = null;
        continue; /* Loop/switch isn't completed */
        SecurityException securityexception;
        securityexception;
        securityexception = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static lfo f()
    {
        ldd;
        JVM INSTR monitorenter ;
        lfo lfo1;
        if (g == null)
        {
            g = (new lfp()).a(null, true, 4).a();
        }
        lfo1 = g;
        ldd;
        JVM INSTR monitorexit ;
        return lfo1;
        Exception exception;
        exception;
        throw exception;
    }

    public long a(long l, long l1)
    {
        int j = b(l1);
        l1 = l - (long)j;
        if (b(l1) == j)
        {
            return l1;
        } else
        {
            return a(l, false);
        }
    }

    public long a(long l, boolean flag)
    {
        int j;
        int k;
        long l2;
        l2 = 0x7fffffffffffffffL;
        j = b(l);
        k = b(l - (long)j);
        if (j == k || j >= 0) goto _L2; else goto _L1
_L1:
        long l3 = e(l - (long)j);
        long l1 = l3;
        if (l3 == l - (long)j)
        {
            l1 = 0x7fffffffffffffffL;
        }
        l3 = e(l - (long)k);
        if (l3 != l - (long)k)
        {
            l2 = l3;
        }
        if (l1 == l2) goto _L2; else goto _L3
_L3:
        l1 = l - (long)j;
        if ((l ^ l1) < 0L && ((long)j ^ l) < 0L)
        {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        } else
        {
            return l1;
        }
_L2:
        j = k;
        if (true) goto _L3; else goto _L4
_L4:
    }

    public abstract String a(long l);

    public String a(long l, Locale locale)
    {
        Object obj = locale;
        if (locale == null)
        {
            obj = Locale.getDefault();
        }
        locale = a(l);
        if (locale == null)
        {
            locale = b;
        } else
        {
            obj = d.a(((Locale) (obj)), b, locale);
            locale = ((Locale) (obj));
            if (obj == null)
            {
                return a(b(l));
            }
        }
        return locale;
    }

    public abstract int b(long l);

    public String b(long l, Locale locale)
    {
        Object obj = locale;
        if (locale == null)
        {
            obj = Locale.getDefault();
        }
        locale = a(l);
        if (locale == null)
        {
            locale = b;
        } else
        {
            obj = d.b(((Locale) (obj)), b, locale);
            locale = ((Locale) (obj));
            if (obj == null)
            {
                return a(b(l));
            }
        }
        return locale;
    }

    public int c(long l)
    {
        int j = b(l);
        long l1 = l - (long)j;
        int k = b(l1);
        if (j != k)
        {
            if (j - k < 0 && e(l1) != e(l - (long)k))
            {
                return j;
            }
        } else
        if (j >= 0)
        {
            l = f(l1);
            if (l < l1)
            {
                int i1 = b(l);
                if (l1 - l <= (long)(i1 - j))
                {
                    return i1;
                }
            }
        }
        return k;
    }

    public abstract boolean c();

    public long d(long l)
    {
        int j = b(l);
        long l1 = (long)j + l;
        if ((l ^ l1) < 0L && ((long)j ^ l) >= 0L)
        {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        } else
        {
            return l1;
        }
    }

    public abstract long e(long l);

    public abstract boolean equals(Object obj);

    public abstract long f(long l);

    public int hashCode()
    {
        return b.hashCode() + 57;
    }

    public String toString()
    {
        return b;
    }

    protected Object writeReplace()
    {
        return new ldf(b);
    }

    static 
    {
        a = new lgr("UTC", "UTC", 0, 0);
        lgt lgt1 = d();
        Set set = lgt1.a();
        if (set == null || set.size() == 0)
        {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!set.contains("UTC"))
        {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (!a.equals(lgt1.a("UTC")))
        {
            throw new IllegalArgumentException("Invalid UTC zone provided");
        } else
        {
            c = lgt1;
            e = set;
            d = e();
        }
    }
}
