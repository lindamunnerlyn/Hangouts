// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fot
{

    public fot()
    {
    }

    public ene a(emy emy1, fow fow1)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwners", new Object[] {
                fow1
            });
        }
        if (fow1 == null)
        {
            fow1 = fow.a;
        }
        return emy1.a(new fhw(this, emy1, fow1));
    }

    public ene a(emy emy1, String s, String s1, fou fou)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadAggregatedPeople", new Object[] {
                s, s1, fou
            });
        }
        return emy1.a(new fia(this, emy1, s, s1, fou));
    }

    public ene a(emy emy1, String s, String s1, foy foy)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadPeople", new Object[] {
                s, s1, foy
            });
        }
        return emy1.a(new fhy(this, emy1, s, s1, foy));
    }
}
