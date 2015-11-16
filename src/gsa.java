// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Set;

final class gsa
    implements grb
{

    final grq a;
    private final String b;

    gsa(grq grq1, int i)
    {
        this(grq1, Integer.toString(i));
    }

    private gsa(grq grq1, String s)
    {
        a = grq1;
        super();
        b = String.valueOf(s).concat(".");
    }

    private String f(String s)
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
        s = f(s);
        return grq.b(a).getFloat(s, f1);
    }

    public int a(String s, int i)
    {
        s = f(s);
        return grq.b(a).getInt(s, i);
    }

    public long a(String s, long l)
    {
        s = f(s);
        return grq.b(a).getLong(s, l);
    }

    public String a(String s, String s1)
    {
        s = f(s);
        return grq.b(a).getString(s, s1);
    }

    public boolean a()
    {
        return d("logged_in");
    }

    public boolean a(String s)
    {
        s = f(s);
        return grq.b(a).contains(s);
    }

    public boolean a(String s, boolean flag)
    {
        s = f(s);
        return grq.b(a).getBoolean(s, flag);
    }

    public String b(String s)
    {
        return a(s, ((String) (null)));
    }

    public boolean b()
    {
        return d("logged_out");
    }

    public Set c(String s)
    {
        s = f(s);
        s = grq.b(a).getStringSet(s, null);
        if (s == null)
        {
            return null;
        } else
        {
            return Collections.unmodifiableSet(s);
        }
    }

    public boolean d(String s)
    {
        return a(s, false);
    }

    public grb e(String s)
    {
        grq grq1 = a;
        String s1 = String.valueOf(b);
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        return new gsa(grq1, s);
    }
}
