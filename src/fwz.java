// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fwz
{

    public static final Uri a = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri b = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static HashMap e;
    private static Object f;
    private static String g[] = new String[0];
    private static Context h = null;

    public fwz()
    {
    }

    public static float a(ContentResolver contentresolver, String s, float f1)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        float f2 = f1;
        if (contentresolver != null)
        {
            try
            {
                f2 = Float.parseFloat(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return f1;
            }
        }
        return f2;
    }

    public static int a(ContentResolver contentresolver, String s, int i)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        int j = i;
        if (contentresolver != null)
        {
            try
            {
                j = Integer.parseInt(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return i;
            }
        }
        return j;
    }

    public static long a(ContentResolver contentresolver, String s, long l)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        long l1 = l;
        if (contentresolver != null)
        {
            try
            {
                l1 = Long.parseLong(contentresolver);
            }
            // Misplaced declaration of an exception variable
            catch (ContentResolver contentresolver)
            {
                return l;
            }
        }
        return l1;
    }

    public static Object a(ContentResolver contentresolver)
    {
        c();
        fwz;
        JVM INSTR monitorenter ;
        b(contentresolver);
        contentresolver = ((ContentResolver) (f));
        fwz;
        JVM INSTR monitorexit ;
        return contentresolver;
        contentresolver;
        fwz;
        JVM INSTR monitorexit ;
        throw contentresolver;
    }

    static Object a(Object obj)
    {
        f = obj;
        return obj;
    }

    public static String a(ContentResolver contentresolver, String s)
    {
        return a(contentresolver, s, ((String) (null)));
    }

    public static String a(ContentResolver contentresolver, String s, String s1)
    {
        c();
        fwz;
        JVM INSTR monitorenter ;
        Object obj;
        b(contentresolver);
        obj = f;
        if (!e.containsKey(s))
        {
            break MISSING_BLOCK_LABEL_47;
        }
        contentresolver = (String)e.get(s);
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        fwz;
        JVM INSTR monitorexit ;
        return s1;
        fwz;
        JVM INSTR monitorexit ;
        String s2;
        String as[] = g;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            s2 = s1;
            if (s.startsWith(as[i]))
            {
                break MISSING_BLOCK_LABEL_234;
            }
        }

        break MISSING_BLOCK_LABEL_99;
        contentresolver;
        fwz;
        JVM INSTR monitorexit ;
        throw contentresolver;
        Cursor cursor;
        cursor = contentresolver.query(a, null, null, new String[] {
            s
        }, null);
        if (cursor == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (cursor.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_159;
        }
        e.put(s, null);
        s2 = s1;
        if (cursor != null)
        {
            cursor.close();
            return s1;
        }
        break MISSING_BLOCK_LABEL_234;
        contentresolver = cursor.getString(1);
        fwz;
        JVM INSTR monitorenter ;
        if (obj == f)
        {
            e.put(s, contentresolver);
        }
        fwz;
        JVM INSTR monitorexit ;
        if (contentresolver != null)
        {
            s1 = contentresolver;
        }
        s2 = s1;
        if (cursor != null)
        {
            cursor.close();
            return s1;
        }
        break MISSING_BLOCK_LABEL_234;
        contentresolver;
        fwz;
        JVM INSTR monitorexit ;
        throw contentresolver;
        contentresolver;
        if (cursor != null)
        {
            cursor.close();
        }
        throw contentresolver;
        return s2;
    }

    static HashMap a()
    {
        return e;
    }

    public static transient Map a(ContentResolver contentresolver, String as[])
    {
        c();
        contentresolver = contentresolver.query(b, null, null, as, null);
        as = new TreeMap();
        if (contentresolver == null)
        {
            return as;
        }
        for (; contentresolver.moveToNext(); as.put(contentresolver.getString(0), contentresolver.getString(1))) { }
        break MISSING_BLOCK_LABEL_69;
        as;
        contentresolver.close();
        throw as;
        contentresolver.close();
        return as;
    }

    public static boolean a(ContentResolver contentresolver, String s, boolean flag)
    {
        contentresolver = a(contentresolver, s, ((String) (null)));
        if (contentresolver == null || contentresolver.equals(""))
        {
            return flag;
        }
        if (c.matcher(contentresolver).matches())
        {
            return true;
        }
        if (d.matcher(contentresolver).matches())
        {
            return false;
        } else
        {
            (new StringBuilder("attempt to read gservices key ")).append(s).append(" (value \"").append(contentresolver).append("\") as boolean");
            return flag;
        }
    }

    private static void b(ContentResolver contentresolver)
    {
        if (e == null)
        {
            e = new HashMap();
            f = new Object();
            (new fxa("Gservices", contentresolver)).start();
        }
    }

    public static transient void b(ContentResolver contentresolver, String as[])
    {
        c();
        Map map = a(contentresolver, as);
        fwz;
        JVM INSTR monitorenter ;
        b(contentresolver);
        g = as;
        for (contentresolver = map.entrySet().iterator(); contentresolver.hasNext(); e.put(as.getKey(), as.getValue()))
        {
            as = (java.util.Map.Entry)contentresolver.next();
        }

        break MISSING_BLOCK_LABEL_79;
        contentresolver;
        fwz;
        JVM INSTR monitorexit ;
        throw contentresolver;
        fwz;
        JVM INSTR monitorexit ;
    }

    static String[] b()
    {
        return g;
    }

    private static void c()
    {
        if (h != null)
        {
            h.enforceCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES", "attempting to read gservices without permission");
        }
    }

}
