// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

public final class jik
    implements jja
{

    volatile jja a;
    final jsr b;
    final jhn c;

    public jik()
    {
        this(LocalCache.i());
    }

    public jik(jja jja1)
    {
        b = jsr.a();
        c = new jhn();
        a = jja1;
    }

    public int a()
    {
        return a.a();
    }

    public jja a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return this;
    }

    public jsj a(Object obj, zn zn1)
    {
        Object obj1;
        c.a();
        obj1 = a.get();
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = zn1.f();
        if (b(obj))
        {
            return b;
        } else
        {
            return jsa.a(obj);
        }
        obj = zn1.a(obj, obj1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        return jsa.a(null);
        obj = jsa.a(((jsj) (obj)), new jil(this));
        return ((jsj) (obj));
        obj;
        if (obj instanceof InterruptedException)
        {
            Thread.currentThread().interrupt();
        }
        if (a(((Throwable) (obj))))
        {
            return b;
        } else
        {
            return jsa.a(((Throwable) (obj)));
        }
    }

    public void a(Object obj)
    {
        if (obj != null)
        {
            b(obj);
            return;
        } else
        {
            a = LocalCache.i();
            return;
        }
    }

    public boolean a(Throwable throwable)
    {
        return b.a(throwable);
    }

    public com.google.common.cache.LocalCache.ReferenceEntry b()
    {
        return null;
    }

    public boolean b(Object obj)
    {
        return b.a(obj);
    }

    public boolean c()
    {
        return true;
    }

    public boolean d()
    {
        return a.d();
    }

    public long e()
    {
        return c.a(TimeUnit.NANOSECONDS);
    }

    public jja f()
    {
        return a;
    }

    public Object get()
    {
        return a.get();
    }
}
