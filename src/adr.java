// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class adr
{

    static String a;
    public static int b = 0xc0000000;
    private static final Map c;
    private static final Set d;

    public static int a(String s)
    {
        String s1 = s.toLowerCase();
        if (c.containsKey(s1))
        {
            return ((Integer)c.get(s1)).intValue();
        }
        if ("default".equalsIgnoreCase(s))
        {
            return b;
        } else
        {
            Log.e("vCard", (new StringBuilder(String.valueOf(s).length() + 29)).append("Unknown vCard type String: \"").append(s).append("\"").toString());
            return b;
        }
    }

    public static boolean a(int i)
    {
        return (i & 3) == 0;
    }

    public static boolean b(int i)
    {
        return (i & 3) == 1;
    }

    public static boolean c(int i)
    {
        return (i & 3) == 2;
    }

    public static int d(int i)
    {
        return i & 0xc;
    }

    public static boolean e(int i)
    {
        return d.contains(Integer.valueOf(i));
    }

    static boolean f(int i)
    {
        return (0x2000000 & i) != 0;
    }

    static 
    {
        a = "v21_generic";
        Object obj = new HashMap();
        c = ((Map) (obj));
        ((Map) (obj)).put(a, Integer.valueOf(0xc0000000));
        c.put("v30_generic", Integer.valueOf(0xc0000001));
        c.put("v21_europe", Integer.valueOf(0xc0000004));
        c.put("v30_europe", Integer.valueOf(0xc0000005));
        c.put("v21_japanese_utf8", Integer.valueOf(0xc0000008));
        c.put("v30_japanese_utf8", Integer.valueOf(0xc0000009));
        c.put("v21_japanese_mobile", Integer.valueOf(0x18000008));
        c.put("docomo", Integer.valueOf(0x38000008));
        obj = new HashSet();
        d = ((Set) (obj));
        ((Set) (obj)).add(Integer.valueOf(0xc0000008));
        d.add(Integer.valueOf(0xc0000009));
        d.add(Integer.valueOf(0x18000008));
        d.add(Integer.valueOf(0x38000008));
    }
}
