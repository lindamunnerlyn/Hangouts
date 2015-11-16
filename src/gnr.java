// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class gnr
    implements gmw
{

    final gnj a;
    private final String b;
    private final int c;
    private final Map d;
    private final Map e;
    private boolean f;

    gnr(gnj gnj1, int k)
    {
        this(gnj1, k, "", ((Map) (new HashMap())));
    }

    private gnr(gnj gnj1, int k, String s, Map map)
    {
        a = gnj1;
        super();
        e = gnj.b(a).getAll();
        c = k;
        b = String.valueOf(s).concat(".");
        d = map;
    }

    private Object a(String s, Object obj)
    {
        s = j(s);
        gnu gnu1 = (gnu)d.get(s);
        if (gnu1 != null)
        {
            obj = gnu1.a(obj);
        } else
        {
            s = a(c, s);
            if (e.containsKey(s))
            {
                return e.get(s);
            }
        }
        return obj;
    }

    private static String a(int k, String s)
    {
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(k).append(s).toString();
    }

    private void a(String s, gnu gnu1)
    {
        d.put(j(s), gnu1);
    }

    private String j(String s)
    {
        String s1 = String.valueOf(b);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public float a(String s, float f1)
    {
        return ((Float)a(s, Float.valueOf(f1))).floatValue();
    }

    public int a(String s, int k)
    {
        return ((Integer)a(s, Integer.valueOf(k))).intValue();
    }

    public long a(String s, long l)
    {
        return ((Long)a(s, Long.valueOf(l))).longValue();
    }

    public gmw a(String s, Set set)
    {
        return b(s, set);
    }

    public String a(String s, String s1)
    {
        return (String)a(s, s1);
    }

    void a(int k, android.content.SharedPreferences.Editor editor)
    {
        String s;
        for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); ((gnu)d.get(s)).a(editor, a(k, s)))
        {
            s = (String)iterator.next();
        }

    }

    public boolean a()
    {
        return d("logged_in");
    }

    public boolean a(String s)
    {
        s = j(s);
        gnu gnu1 = (gnu)d.get(s);
        if (gnu1 != null)
        {
            return gnu1 != gnj.b;
        } else
        {
            return gnj.b(a).contains(a(c, s));
        }
    }

    public boolean a(String s, boolean flag)
    {
        return ((Boolean)a(s, Boolean.valueOf(flag))).booleanValue();
    }

    public gmw b(String s, float f1)
    {
        a(s, new gnv(f1));
        return this;
    }

    public gmw b(String s, int k)
    {
        return c(s, k);
    }

    public gmw b(String s, long l)
    {
        return c(s, l);
    }

    public gmw b(String s, String s1)
    {
        return c(s, s1);
    }

    public gmw b(String s, Set set)
    {
        a(s, new gob(set));
        return this;
    }

    public gmw b(String s, boolean flag)
    {
        return c(s, flag);
    }

    public String b(String s)
    {
        return a(s, ((String) (null)));
    }

    public boolean b()
    {
        return d("logged_out");
    }

    public gmw c()
    {
        f = true;
        return this;
    }

    public gmw c(String s, int k)
    {
        a(s, new gnw(k));
        return this;
    }

    public gmw c(String s, long l)
    {
        a(s, new gnx(l));
        return this;
    }

    public gmw c(String s, String s1)
    {
        a(s, new goa(s1));
        return this;
    }

    public gmw c(String s, boolean flag)
    {
        a(s, new gnt(flag));
        return this;
    }

    public Set c(String s)
    {
        return (Set)a(s, null);
    }

    public int d()
    {
        boolean flag;
        int l;
        l = c;
        if (f && c != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            for (Iterator iterator = gnj.c(a).iterator(); iterator.hasNext(); ((gmr)iterator.next()).c(c)) { }
        }
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        int k = a.b(b("account_name"), b("effective_gaia_id"));
        Exception exception;
        android.content.SharedPreferences.Editor editor;
        if (k != c && k != -1)
        {
            k = 0;
        } else
        {
            k = 1;
        }
        if (k != 0)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        throw new bgk("Duplicate account.");
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (l != -1)
        {
            k = l;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_182;
            }
        }
        k = gnj.d(a);
        gnj.a(a, k);
        editor = gnj.b(a).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        gnj.a(a, c, k, editor);
        gnj.b(a, c);
        a(k, editor);
        editor.apply();
        gnj.e(a);
        obj;
        JVM INSTR monitorexit ;
        if (k != c)
        {
            for (obj = gnj.c(a).iterator(); ((Iterator) (obj)).hasNext(); ((gmr)((Iterator) (obj)).next()).b(k)) { }
        }
        gnj.a(a);
        return k;
    }

    public boolean d(String s)
    {
        return a(s, false);
    }

    public gmu e(String s)
    {
        return i(s);
    }

    public gmw f(String s)
    {
        return h(s);
    }

    public gmw g(String s)
    {
        return i(s);
    }

    public gmw h(String s)
    {
        a(s, gnj.b);
        return this;
    }

    public gmw i(String s)
    {
        gnj gnj1 = a;
        int k = c;
        String s1 = String.valueOf(b);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return new gnr(gnj1, k, s, d);
    }
}
