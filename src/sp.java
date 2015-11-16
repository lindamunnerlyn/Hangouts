// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

public final class sp
{

    final ArrayList a = new ArrayList();
    me b;
    boolean c;
    private long d;
    private Interpolator e;
    private final mf f = new sq(this);

    public sp()
    {
        d = -1L;
    }

    public sp a(Interpolator interpolator)
    {
        if (!c)
        {
            e = interpolator;
        }
        return this;
    }

    public sp a(lr lr1)
    {
        if (!c)
        {
            a.add(lr1);
        }
        return this;
    }

    public sp a(lr lr1, lr lr2)
    {
        a.add(lr1);
        lr2.b(lr1.a());
        a.add(lr2);
        return this;
    }

    public sp a(me me)
    {
        if (!c)
        {
            b = me;
        }
        return this;
    }

    public void a()
    {
        if (c)
        {
            return;
        }
        lr lr1;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); lr1.c())
        {
            lr1 = (lr)iterator.next();
            if (d >= 0L)
            {
                lr1.a(d);
            }
            if (e != null)
            {
                lr1.a(e);
            }
            if (b != null)
            {
                lr1.a(f);
            }
        }

        c = true;
    }

    public void b()
    {
        if (!c)
        {
            return;
        }
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((lr)iterator.next()).b()) { }
        c = false;
    }

    public sp c()
    {
        if (!c)
        {
            d = 250L;
        }
        return this;
    }
}
