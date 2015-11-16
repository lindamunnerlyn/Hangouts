// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class gvv
{

    static final long a;
    itr b;
    private final int c;
    private final Exception d;
    private final String e;
    private final long f;
    private int g;
    private Bundle h;
    private byte i[];

    public gvv(int k, Exception exception, String s)
    {
        g = gvw.c;
        c = k;
        d = exception;
        e = s;
        f = System.currentTimeMillis();
    }

    gvv(int k, Exception exception, String s, byte abyte0[], long l)
    {
        g = gvw.c;
        c = k;
        d = exception;
        e = s;
        i = abyte0;
        f = l;
    }

    public gvv(boolean flag)
    {
        char c1;
        if (flag)
        {
            c1 = '\310';
        } else
        {
            c1 = '\0';
        }
        this(c1, null, null);
    }

    public static boolean a(gvv gvv1)
    {
        return gvv1 != null && gvv1.f();
    }

    public int a()
    {
        return c;
    }

    void a(int k)
    {
        g = k;
    }

    public Exception b()
    {
        return d;
    }

    public String c()
    {
        return e;
    }

    public Bundle d()
    {
        if (i != null)
        {
            ClassLoader classloader = getClass().getClassLoader();
            h = (Bundle)g.a(i, classloader);
            h.setClassLoader(classloader);
            i = null;
        }
        if (h == null)
        {
            h = new Bundle();
        }
        return h;
    }

    byte[] e()
    {
        i();
        return i;
    }

    public boolean f()
    {
        return c != 200;
    }

    long g()
    {
        return f;
    }

    boolean h()
    {
        return System.currentTimeMillis() - f > a;
    }

    void i()
    {
        if (h == null)
        {
            return;
        } else
        {
            i = g.a(h);
            h = null;
            return;
        }
    }

    int j()
    {
        return g;
    }

    public String toString()
    {
        if (f())
        {
            return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, errorCode=%d, exception=%s)", new Object[] {
                e, g.c(f), Integer.valueOf(c), d
            });
        }
        String s;
        if (h != null)
        {
            int k = h.size();
            s = (new StringBuilder(19)).append("Bundle(").append(k).append(")").toString();
        } else
        if (i != null)
        {
            int l = i.length;
            s = (new StringBuilder(17)).append("byte[").append(l).append("]").toString();
        } else
        {
            s = "null";
        }
        return String.format(Locale.getDefault(), "TaskResult(message=%s, age=%s, extras=%s)", new Object[] {
            e, g.c(f), s
        });
    }

    static 
    {
        a = TimeUnit.DAYS.toMillis(1L);
    }
}
