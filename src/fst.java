// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.data.DataHolder;
import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public final class fst
{

    public static final Map a = new fsu();
    public static Iterable b = new frx();
    public static final Handler c = new Handler(Looper.getMainLooper());
    public static final String d[] = new String[0];
    public static final Pattern e = Pattern.compile("\\,");
    public static final Pattern f = Pattern.compile("[\u2028\u2029 \240\u1680\u180E\u2000\u2001\u2002\u2003\u2004\u2005\u2006\u2007\u2008\u2009\u200A\u202F\u205F\u3000\t\013\f\034\035\036\037\n\r]+");
    public static final Pattern g = Pattern.compile(Pattern.quote("\001"));
    public static final Pattern h = Pattern.compile(Pattern.quote("\002"));
    public static final String i = "\001";
    public static final String j = "\002";
    public static final SecureRandom k = new SecureRandom();
    private static final ThreadLocal l = new fsv();
    private static final ThreadLocal m = new fsw();
    private static final ThreadLocal n = new fsx();
    private static final ThreadLocal o = new fsy();
    private static final ThreadLocal p = new fsz();
    private static final ThreadLocal q = new fta();

    public static String a(Bundle bundle)
    {
        return a(bundle, "", new StringBuilder()).toString();
    }

    public static String a(String s)
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (s.length() != 0)
                {
                    break label0;
                }
            }
            s1 = null;
        }
        return s1;
    }

    public static StringBuilder a()
    {
        StringBuilder stringbuilder = (StringBuilder)l.get();
        stringbuilder.setLength(0);
        return stringbuilder;
    }

    private static StringBuilder a(Object obj, String s, StringBuilder stringbuilder)
    {
        if (obj == null)
        {
            stringbuilder.append("[null]\n");
            return stringbuilder;
        }
        String s1 = (new StringBuilder()).append(s).append("  ").toString();
        stringbuilder.append("(").append(obj.getClass().getSimpleName()).append(") ");
        if (obj instanceof Bundle)
        {
            obj = (Bundle)obj;
            if (((Bundle) (obj)).isEmpty())
            {
                stringbuilder.append("{ }\n");
                return stringbuilder;
            }
            stringbuilder.append("{\n");
            String s2;
            for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext(); a(((Bundle) (obj)).get(s2), s1, stringbuilder))
            {
                s2 = (String)iterator.next();
                stringbuilder.append(s1).append(s2).append(" : ");
            }

            stringbuilder.append(s).append("}\n");
            return stringbuilder;
        }
        if (obj instanceof DataHolder)
        {
            s = (DataHolder)obj;
            stringbuilder.append(" [");
            if (s.e())
            {
                stringbuilder.append("CLOSED");
            } else
            {
                stringbuilder.append(s.d());
            }
            stringbuilder.append("] ").append(obj).append("\n");
            return stringbuilder;
        }
        if (obj instanceof ArrayList)
        {
            obj = (ArrayList)obj;
            if (((ArrayList) (obj)).isEmpty())
            {
                stringbuilder.append("[ ]\n");
                return stringbuilder;
            }
            stringbuilder.append("[\n");
            for (int i1 = 0; i1 < ((ArrayList) (obj)).size(); i1++)
            {
                stringbuilder.append(s1).append(i1).append(" : ");
                a(((ArrayList) (obj)).get(i1), s1, stringbuilder);
            }

            stringbuilder.append(s).append("]\n");
            return stringbuilder;
        }
        if (obj instanceof byte[])
        {
            int j1 = ((byte[])obj).length;
            stringbuilder.append(" [").append(j1).append("] ");
            s = new byte[Math.min(j1, 56)];
            System.arraycopy(obj, 0, s, 0, s.length);
            stringbuilder.append(Base64.encodeToString(s, 0));
            return stringbuilder;
        }
        if (obj instanceof char[])
        {
            stringbuilder.append("\"").append(new String((char[])obj)).append("\"\n");
            return stringbuilder;
        }
        if (obj.getClass().isArray())
        {
            if (Array.getLength(obj) == 0)
            {
                stringbuilder.append("[ ]\n");
                return stringbuilder;
            }
            stringbuilder.append("[ ");
            stringbuilder.append(Array.get(obj, 0));
            for (int k1 = 1; k1 < Array.getLength(obj); k1++)
            {
                stringbuilder.append(", ").append(Array.get(obj, k1));
            }

            stringbuilder.append(" ]\n");
            return stringbuilder;
        }
        if (obj instanceof String)
        {
            stringbuilder.append("\"").append(obj).append("\"\n");
            return stringbuilder;
        } else
        {
            stringbuilder.append(obj).append("\n");
            return stringbuilder;
        }
    }

    public static String[] a(String s, String s1)
    {
        String as[] = (String[])n.get();
        as[0] = s;
        as[1] = s1;
        return as;
    }

    public static String[] b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return d;
        } else
        {
            return e.split(s, 0);
        }
    }

    public static String c(String s)
    {
        g.d(s);
        return (new StringBuilder("g:")).append(s).toString();
    }

    public static String d(String s)
    {
        if (s == null || !s.startsWith("e:"))
        {
            return null;
        } else
        {
            return s.substring(2);
        }
    }

    public static boolean e(String s)
    {
        return s != null && s.startsWith("e:");
    }

}
