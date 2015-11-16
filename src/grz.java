// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class grz
    implements grd
{

    final grq a;
    private final String b;
    private final int c;
    private final Map d;
    private final Map e;
    private boolean f;

    grz(grq grq1, int k)
    {
        this(grq1, k, "", ((Map) (new HashMap())));
    }

    private grz(grq grq1, int k, String s, Map map)
    {
        a = grq1;
        super();
        e = grq.b(a).getAll();
        c = k;
        b = String.valueOf(s).concat(".");
        d = map;
    }

    private Object a(String s, Object obj)
    {
        s = j(s);
        gsc gsc1 = (gsc)d.get(s);
        if (gsc1 != null)
        {
            obj = gsc1.a(obj);
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

    private void a(String s, gsc gsc1)
    {
        d.put(j(s), gsc1);
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

    public grd a(String s, Set set)
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
        for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); ((gsc)d.get(s)).a(editor, a(k, s)))
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
        gsc gsc1 = (gsc)d.get(s);
        if (gsc1 != null)
        {
            return gsc1 != grq.b;
        } else
        {
            return grq.b(a).contains(a(c, s));
        }
    }

    public boolean a(String s, boolean flag)
    {
        return ((Boolean)a(s, Boolean.valueOf(flag))).booleanValue();
    }

    public grd b(String s, float f1)
    {
        a(s, new gsd(f1));
        return this;
    }

    public grd b(String s, int k)
    {
        return c(s, k);
    }

    public grd b(String s, long l)
    {
        return c(s, l);
    }

    public grd b(String s, String s1)
    {
        return c(s, s1);
    }

    public grd b(String s, Set set)
    {
        a(s, new gsj(set));
        return this;
    }

    public grd b(String s, boolean flag)
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

    public grd c()
    {
        f = true;
        return this;
    }

    public grd c(String s, int k)
    {
        a(s, new gse(k));
        return this;
    }

    public grd c(String s, long l)
    {
        a(s, new gsf(l));
        return this;
    }

    public grd c(String s, String s1)
    {
        a(s, new gsi(s1));
        return this;
    }

    public grd c(String s, boolean flag)
    {
        a(s, new gsb(flag));
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
            for (Iterator iterator = grq.c(a).iterator(); iterator.hasNext(); ((gqx)iterator.next()).c(c)) { }
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
        throw new bgw("Duplicate account.");
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
        k = grq.d(a);
        grq.a(a, k);
        editor = grq.b(a).edit();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_224;
        }
        grq.a(a, c, k, editor);
        grq.b(a, c);
        a(k, editor);
        editor.apply();
        grq.e(a);
        obj;
        JVM INSTR monitorexit ;
        if (k != c)
        {
            for (obj = grq.c(a).iterator(); ((Iterator) (obj)).hasNext(); ((gqx)((Iterator) (obj)).next()).b(k)) { }
        }
        grq.a(a);
        return k;
    }

    public boolean d(String s)
    {
        return a(s, false);
    }

    public grb e(String s)
    {
        return i(s);
    }

    public grd f(String s)
    {
        return h(s);
    }

    public grd g(String s)
    {
        return i(s);
    }

    public grd h(String s)
    {
        a(s, grq.b);
        return this;
    }

    public grd i(String s)
    {
        grq grq1 = a;
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
        return new grz(grq1, k, s, d);
    }
}
