// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class lr
{

    static final ma a;
    private WeakReference b;
    private Runnable c;
    private Runnable d;
    private int e;

    lr(View view)
    {
        c = null;
        d = null;
        e = -1;
        b = new WeakReference(view);
    }

    static Runnable a(lr lr1)
    {
        return lr1.c;
    }

    static Runnable b(lr lr1)
    {
        return lr1.d;
    }

    static int c(lr lr1)
    {
        lr1.e = -1;
        return -1;
    }

    static int d(lr lr1)
    {
        return lr1.e;
    }

    public long a()
    {
        View view = (View)b.get();
        if (view != null)
        {
            return a.a(view);
        } else
        {
            return 0L;
        }
    }

    public lr a(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, f);
        }
        return this;
    }

    public lr a(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, l);
        }
        return this;
    }

    public lr a(Interpolator interpolator)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, interpolator);
        }
        return this;
    }

    public lr a(me me)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view, me);
        }
        return this;
    }

    public lr a(mg mg)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(view, mg);
        }
        return this;
    }

    public lr b(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view, f);
        }
        return this;
    }

    public lr b(long l)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(view, l);
        }
        return this;
    }

    public void b()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.a(this, view);
        }
    }

    public lr c(float f)
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.c(this, view, f);
        }
        return this;
    }

    public void c()
    {
        View view = (View)b.get();
        if (view != null)
        {
            a.b(this, view);
        }
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new lz();
        } else
        if (i >= 19)
        {
            a = new ly();
        } else
        if (i >= 18)
        {
            a = new lw();
        } else
        if (i >= 16)
        {
            a = new lx();
        } else
        if (i >= 14)
        {
            a = new lu();
        } else
        {
            a = new ls();
        }
    }
}
