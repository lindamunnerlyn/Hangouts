// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class gfo
{

    private volatile boolean a;
    public final AtomicInteger n = new AtomicInteger(0);
    public final gdg o;
    public final gem p;
    public boolean q;

    gfo(gdg gdg1, gem gem1)
    {
        q = true;
        a = false;
        o = gdg1;
        p = gem1;
        gdg1.a(this);
    }

    void D_()
    {
        o.b(this);
    }

    void c(boolean flag)
    {
        if (q != flag)
        {
            q = flag;
            a = false;
        }
        if (!flag)
        {
            o.b();
        }
    }

    abstract boolean d();

    abstract boolean e();

    abstract String f();

    abstract int g();

    boolean h()
    {
        return false;
    }

    boolean i()
    {
        return false;
    }

    abstract int j();

    abstract int k();

    Rect l()
    {
        return null;
    }

    void m()
    {
        int i1 = n.incrementAndGet();
        String s = f();
        gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 33)).append(s).append(" rendererCount is now ").append(i1).toString());
    }

    void n()
    {
        int i1 = n.decrementAndGet();
        String s = f();
        gkc.a("vclib", (new StringBuilder(String.valueOf(s).length() + 33)).append(s).append(" rendererCount is now ").append(i1).toString());
    }

    void o()
    {
        if (d() && !a)
        {
            a = true;
            p.f();
        }
    }

    boolean p()
    {
        return a && !q;
    }
}
