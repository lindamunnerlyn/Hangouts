// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class gkq
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

    protected gkq(String s1, String s2, String s3, int i1, boolean flag, boolean flag1)
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

    public String b()
    {
        Object obj = o;
        if (obj instanceof gkr)
        {
            return ((gkr)obj).a();
        } else
        {
            return b;
        }
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
        return c;
    }

    public void c(int i1)
    {
        e.remove(Integer.valueOf(i1));
    }

    public void d(int i1)
    {
        f.add(Integer.valueOf(i1));
    }

    public boolean d()
    {
        return d == 20;
    }

    public void e(int i1)
    {
        f.remove(Integer.valueOf(i1));
    }

    public boolean e()
    {
        return d == 21 || d();
    }

    public boolean f()
    {
        return d == 22 || e();
    }

    public long g()
    {
        return l;
    }

    public boolean h()
    {
        return d == 22;
    }

    public boolean i()
    {
        return d == 21;
    }

    public boolean j()
    {
        return d == 1;
    }

    public boolean k()
    {
        return j;
    }

    public List l()
    {
        return Collections.unmodifiableList(e);
    }

    public List m()
    {
        return Collections.unmodifiableList(f);
    }

    public boolean n()
    {
        return g;
    }

    public boolean o()
    {
        return h;
    }

    public boolean p()
    {
        return i;
    }

    public void q()
    {
        i = true;
    }

    public Object r()
    {
        return o;
    }

    public void s()
    {
        m = true;
    }

    public boolean t()
    {
        return m;
    }

    public String toString()
    {
        return String.format("%s (%s)", new Object[] {
            b, a
        });
    }

    public void u()
    {
        n = true;
    }

    public boolean v()
    {
        return n;
    }
}
