// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fml
{

    public fml()
    {
    }

    private ekd b(ejx ejx1, fmm fmm, String s, String s1, int i)
    {
        return ejx1.a(new ffl(this, ejx1, ejx1, fmm, s, s1, i));
    }

    public ekd a(ejx ejx1, fmm fmm)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("unregisterOnDataChangedListener", new Object[0]);
        }
        return ejx1.a(new ffm(this, ejx1, ejx1, fmm));
    }

    public ekd a(ejx ejx1, fmm fmm, String s, String s1, int i)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("account must not be null");
        }
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("registerOnDataChangedListenerForOwner", new Object[] {
                s, s1, Integer.valueOf(i)
            });
        }
        return b(ejx1, fmm, s, s1, i);
    }
}
