// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class flx
{

    public flx()
    {
    }

    public ekd a(ejx ejx1, fmc fmc1)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwners", new Object[] {
                fmc1
            });
        }
        if (fmc1 == null)
        {
            fmc1 = fmc.a;
        }
        return ejx1.a(new fey(this, ejx1, fmc1));
    }

    public ekd a(ejx ejx1, String s, String s1, fly fly)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadAggregatedPeople", new Object[] {
                s, s1, fly
            });
        }
        return ejx1.a(new ffe(this, ejx1, s, s1, fly));
    }

    public ekd a(ejx ejx1, String s, String s1, fma fma)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadCircles", new Object[] {
                s, s1, fma
            });
        }
        return ejx1.a(new ffa(this, ejx1, s, s1, fma));
    }

    public ekd a(ejx ejx1, String s, String s1, fme fme)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadPeople", new Object[] {
                s, s1, fme
            });
        }
        return ejx1.a(new ffc(this, ejx1, s, s1, fme));
    }
}
