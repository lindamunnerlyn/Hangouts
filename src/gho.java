// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gho
{

    private final String a;
    private final String b;
    private final String c;
    private int d;
    private final ArrayList e = new ArrayList();
    private final ArrayList f = new ArrayList();
    private boolean g;
    private boolean h;
    private boolean i;
    private final boolean j;
    private final boolean k;
    private long l;
    private boolean m;
    private boolean n;
    private volatile Object o;

    protected gho(String s1, String s2, String s3, int i1, boolean flag, boolean flag1)
    {
        m = false;
        n = false;
        a = s1;
        b = s2;
        c = s3;
        d = i1;
        j = flag;
        k = flag1;
        long l1;
        if (i1 == 1)
        {
            l1 = SystemClock.elapsedRealtime();
        } else
        {
            l1 = -1L;
        }
        l = l1;
    }

    public String a()
    {
        return a;
    }

    public void a(Object obj)
    {
        o = obj;
    }

    public void a(boolean flag)
    {
        g = flag;
    }

    public boolean a(int i1)
    {
        int j1 = d;
        d = i1;
        if (l == -1L && d == 1)
        {
            l = SystemClock.elapsedRealtime();
        }
        return j1 != d;
    }

    public boolean a(gho gho1)
    {
        return gho1 != null && a.equals(gho1.a);
    }

    public String b()
    {
        return g.y(a);
    }

    public void b(int i1)
    {
        e.add(Integer.valueOf(i1));
    }

    public void b(boolean flag)
    {
        h = flag;
    }

    public String c()
    {
        Object obj = o;
        if (obj != null && (obj instanceof ghp))
        {
            return ((ghp)obj).a();
        } else
        {
            return b;
        }
    }

    public void c(int i1)
    {
        e.remove(Integer.valueOf(i1));
    }

    public String d()
    {
        return c;
    }

    public void d(int i1)
    {
        f.add(Integer.valueOf(i1));
    }

    public void e(int i1)
    {
        f.remove(Integer.valueOf(i1));
    }

    public boolean e()
    {
        return d == 20;
    }

    public boolean f()
    {
        return d == 21 || e();
    }

    public boolean g()
    {
        return d == 22 || f();
    }

    public long h()
    {
        return l;
    }

    public boolean i()
    {
        return d == 22;
    }

    public boolean j()
    {
        return d == 21;
    }

    public boolean k()
    {
        return d == 1;
    }

    public boolean l()
    {
        return j;
    }

    public List m()
    {
        return Collections.unmodifiableList(e);
    }

    public List n()
    {
        return Collections.unmodifiableList(f);
    }

    public boolean o()
    {
        return g;
    }

    public boolean p()
    {
        return h;
    }

    public boolean q()
    {
        return i;
    }

    public void r()
    {
        i = true;
    }

    public Object s()
    {
        return o;
    }

    public void t()
    {
        m = true;
    }

    public String toString()
    {
        return String.format("%s (%s)", new Object[] {
            b, a
        });
    }

    public boolean u()
    {
        return m;
    }

    public void v()
    {
        n = true;
    }

    public boolean w()
    {
        return n;
    }
}
