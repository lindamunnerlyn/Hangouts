// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fpf
{

    public fpf()
    {
    }

    private ene a(emy emy1, fpg fpg, String s, String s1, int i)
    {
        return emy1.a(new fih(this, emy1, emy1, fpg, s, null, 8));
    }

    public ene a(emy emy1, fpg fpg)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("unregisterOnDataChangedListener", new Object[0]);
        }
        return emy1.a(new fii(this, emy1, emy1, fpg));
    }

    public ene a(emy emy1, fpg fpg, String s)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("registerOnDataChangedListenerForOwner", new Object[] {
                s, null, Integer.valueOf(8)
            });
        }
        return a(emy1, fpg, s, null, 8);
    }
}
