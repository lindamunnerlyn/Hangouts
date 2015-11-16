// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.List;

public abstract class kud extends ktl
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public kvu b;
    public int c;

    public kud()
    {
        b = null;
        c = -1;
    }

    static kud a(kud kud1, ktu ktu, kty kty)
    {
        try
        {
            kud1 = (kud)kud1.a(kum.b, ktu, kty);
        }
        // Misplaced declaration of an exception variable
        catch (kud kud1)
        {
            if (kud1.getCause() instanceof kuu)
            {
                throw (kuu)kud1.getCause();
            } else
            {
                throw kud1;
            }
        }
        return kud1;
    }

    public static kut a(List list)
    {
        return new kvg(list);
    }

    protected static final boolean a(kud kud1)
    {
        boolean flag = false;
        if (kud1.a(kum.a, Boolean.valueOf(false)) != null)
        {
            flag = true;
        }
        return flag;
    }

    private final void k()
    {
        if (b == null)
        {
            b = kvu.b();
        }
    }

    public final boolean E_()
    {
        return a(kum.a, Boolean.TRUE) != null;
    }

    protected Object a(int l)
    {
        return a(l, null, null);
    }

    protected Object a(int l, Object obj)
    {
        return a(l, obj, null);
    }

    public abstract Object a(int l, Object obj, Object obj1);

    public void a(int l, int i1)
    {
        k();
        b.a(l, i1);
    }

    public final void a(kvu kvu1)
    {
        b = kvu.a(b, kvu1);
    }

    public boolean a(int l, ktu ktu)
    {
        k();
        return b.a(l, ktu);
    }

    public final kvf c()
    {
        return (kvf)a(kum.h);
    }

    public final kud d()
    {
        return (kud)a(kum.g);
    }

    public final kuf e()
    {
        return (kuf)a(kum.f);
    }

    public void f()
    {
        if (b == null)
        {
            b = kvu.a();
            return;
        } else
        {
            b.c();
            return;
        }
    }

    public final kuf h()
    {
        kuf kuf1 = (kuf)a(kum.f);
        kuf1.a(this);
        return kuf1;
    }

    public kvc i()
    {
        return h();
    }

    public kvc j()
    {
        return e();
    }

    protected Object writeReplace()
    {
        return new kun(this);
    }
}
