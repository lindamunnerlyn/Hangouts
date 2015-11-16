// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class ftc
{

    private final HashMap a = new HashMap();

    public ftc()
    {
    }

    public static ftc a(byte abyte0[])
    {
        try
        {
            abyte0 = g.a(new fdc(fdd.a(abyte0), new ArrayList()));
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException("Unable to convert data", abyte0);
        }
        return abyte0;
    }

    private static void a(String s, Object obj, String s1, ClassCastException classcastexception)
    {
        a(s, obj, s1, "<null>");
    }

    private static void a(String s, Object obj, String s1, Object obj1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Key ");
        stringbuilder.append(s);
        stringbuilder.append(" expected ");
        stringbuilder.append(s1);
        stringbuilder.append(" but value was a ");
        stringbuilder.append(obj.getClass().getName());
        stringbuilder.append(".  The default value ");
        stringbuilder.append(obj1);
        stringbuilder.append(" was returned.");
    }

    private boolean h(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = ((Boolean)obj).booleanValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Boolean", Boolean.valueOf(false));
            return false;
        }
        return flag;
    }

    private long i(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0L;
        }
        long l;
        try
        {
            l = ((Long)obj).longValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "long", classcastexception);
            return 0L;
        }
        return l;
    }

    public Object a(String s)
    {
        return a.get(s);
    }

    public void a(ftc ftc1)
    {
        String s;
        for (Iterator iterator = ftc1.b().iterator(); iterator.hasNext(); a.put(s, ftc1.a(s)))
        {
            s = (String)iterator.next();
        }

    }

    public void a(String s, byte byte0)
    {
        a.put(s, Byte.valueOf(byte0));
    }

    public void a(String s, double d1)
    {
        a.put(s, Double.valueOf(d1));
    }

    public void a(String s, float f1)
    {
        a.put(s, Float.valueOf(f1));
    }

    public void a(String s, int j)
    {
        a.put(s, Integer.valueOf(j));
    }

    public void a(String s, long l)
    {
        a.put(s, Long.valueOf(l));
    }

    public void a(String s, Asset asset)
    {
        a.put(s, asset);
    }

    public void a(String s, ftc ftc1)
    {
        a.put(s, ftc1);
    }

    public void a(String s, String s1)
    {
        a.put(s, s1);
    }

    public void a(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public void a(String s, boolean flag)
    {
        a.put(s, Boolean.valueOf(flag));
    }

    public void a(String s, byte abyte0[])
    {
        a.put(s, abyte0);
    }

    public void a(String s, float af[])
    {
        a.put(s, af);
    }

    public void a(String s, long al[])
    {
        a.put(s, al);
    }

    public void a(String s, String as[])
    {
        a.put(s, as);
    }

    public byte[] a()
    {
        return fdo.a(g.a(this).a);
    }

    public String b(String s, String s1)
    {
        s = f(s);
        if (s == null)
        {
            return s1;
        } else
        {
            return s;
        }
    }

    public Set b()
    {
        return a.keySet();
    }

    public void b(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public boolean b(String s)
    {
        return h(s);
    }

    public int c(String s)
    {
        return d(s);
    }

    public void c(String s, ArrayList arraylist)
    {
        a.put(s, arraylist);
    }

    public int d(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return 0;
        }
        int j;
        try
        {
            j = ((Integer)obj).intValue();
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Integer", classcastexception);
            return 0;
        }
        return j;
    }

    public long e(String s)
    {
        return i(s);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ftc))
        {
            return false;
        }
        obj = (ftc)obj;
        if (a.size() != ((ftc) (obj)).a.size())
        {
            return false;
        }
        Iterator iterator = b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (String)iterator.next();
            Object obj1 = a(((String) (obj2)));
            obj2 = ((ftc) (obj)).a(((String) (obj2)));
            if (obj1 instanceof Asset)
            {
                if (!(obj2 instanceof Asset))
                {
                    return false;
                }
                obj1 = (Asset)obj1;
                obj2 = (Asset)obj2;
                boolean flag;
                if (obj1 == null || obj2 == null)
                {
                    if (obj1 == obj2)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                if (!TextUtils.isEmpty(((Asset) (obj1)).b()))
                {
                    flag = ((Asset) (obj1)).b().equals(((Asset) (obj2)).b());
                } else
                {
                    flag = Arrays.equals(((Asset) (obj1)).a(), ((Asset) (obj2)).a());
                }
                if (!flag)
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof String[])
            {
                if (!(obj2 instanceof String[]))
                {
                    return false;
                }
                if (!Arrays.equals((String[])obj1, (String[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof long[])
            {
                if (!(obj2 instanceof long[]))
                {
                    return false;
                }
                if (!Arrays.equals((long[])obj1, (long[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof float[])
            {
                if (!(obj2 instanceof float[]))
                {
                    return false;
                }
                if (!Arrays.equals((float[])obj1, (float[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 instanceof byte[])
            {
                if (!(obj2 instanceof byte[]))
                {
                    return false;
                }
                if (!Arrays.equals((byte[])obj1, (byte[])obj2))
                {
                    return false;
                }
                continue;
            }
            if (obj1 == null || obj2 == null)
            {
                if (obj1 != obj2)
                {
                    return false;
                }
                break;
            }
            if (!obj1.equals(obj2))
            {
                return false;
            }
        } while (true);
        return true;
    }

    public String f(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        String s1;
        try
        {
            s1 = (String)obj;
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "String", classcastexception);
            return null;
        }
        return s1;
    }

    public Asset g(String s)
    {
        Object obj = a.get(s);
        if (obj == null)
        {
            return null;
        }
        Asset asset;
        try
        {
            asset = (Asset)obj;
        }
        catch (ClassCastException classcastexception)
        {
            a(s, obj, "Asset", classcastexception);
            return null;
        }
        return asset;
    }

    public int hashCode()
    {
        return a.hashCode() * 29;
    }

    public String toString()
    {
        return a.toString();
    }
}
