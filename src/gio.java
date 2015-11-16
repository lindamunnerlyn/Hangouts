// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.atomic.AtomicInteger;

public abstract class gio
{

    public final AtomicInteger p = new AtomicInteger(0);
    public final gfu q;
    public final ghm r;
    public final gfq s = new gfq((byte)0);
    public final gfq t = new gfq((byte)0);
    public volatile boolean u;
    public volatile boolean v;

    gio(gfu gfu1, ghm ghm1)
    {
        u = true;
        v = false;
        q = gfu1;
        r = ghm1;
        gfu1.a(this);
    }

    void F_()
    {
        q.b(this);
    }

    void a(boolean flag)
    {
        if (u != flag)
        {
            u = flag;
            v = false;
            r.f();
        }
        if (!flag)
        {
            q.b();
        }
    }

    abstract boolean b();

    abstract boolean c();

    abstract String d();

    abstract int e();

    boolean f()
    {
        return false;
    }

    boolean g()
    {
        return false;
    }

    abstract int h();

    abstract int i();

    gfq j()
    {
        return s;
    }

    gfq k()
    {
        return t;
    }

    void l()
    {
        int i1 = p.incrementAndGet();
        String s1 = String.valueOf(d());
        gne.a(2, "vclib", (new StringBuilder(String.valueOf(s1).length() + 33)).append(s1).append(" rendererCount is now ").append(i1).toString());
    }

    void m()
    {
        int i1 = p.decrementAndGet();
        String s1 = String.valueOf(d());
        gne.a(2, "vclib", (new StringBuilder(String.valueOf(s1).length() + 33)).append(s1).append(" rendererCount is now ").append(i1).toString());
    }

    void p()
    {
        if (b() && !v)
        {
            v = true;
            r.f();
        }
    }

    boolean q()
    {
        return v && !u;
    }
}
