// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.cache.LocalCache;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

public final class jpg
    implements jpw
{

    volatile jpw a;
    final kas b;
    final joh c;

    public jpg()
    {
        this(LocalCache.i());
    }

    public jpg(jpw jpw1)
    {
        b = kas.j();
        c = new joh();
        a = jpw1;
    }

    public int a()
    {
        return a.a();
    }

    public jpw a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry)
    {
        return this;
    }

    public kak a(Object obj, zp zp1)
    {
        Object obj1;
        try
        {
            c.a();
            obj1 = a.get();
        }
        // Misplaced declaration of an exception variable
        catch (zp zp1)
        {
            if (a(((Throwable) (zp1))))
            {
                obj = b;
            } else
            {
                obj = kaf.a(zp1);
            }
            if (zp1 instanceof InterruptedException)
            {
                Thread.currentThread().interrupt();
                return ((kak) (obj));
            } else
            {
                return ((kak) (obj));
            }
        }
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj = zp1.f();
        if (b(obj))
        {
            return b;
        } else
        {
            return kaf.c(obj);
        }
        obj = zp1.a(obj, obj1);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        return kaf.c(null);
        obj = kaf.a(((kak) (obj)), new jph(this));
        return ((kak) (obj));
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

    public jpw f()
    {
        return a;
    }

    public Object get()
    {
        return a.get();
    }
}
