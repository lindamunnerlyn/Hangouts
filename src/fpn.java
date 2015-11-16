// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fpn
{

    public fpn()
    {
    }

    private ene b(emy emy1, String s, String s1, long l)
    {
        return emy1.a(new fij(this, emy1, s, s1, l, false, false));
    }

    public ene a(emy emy1, String s, String s1, long l)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("requestSync", new Object[] {
                s, s1, Long.valueOf(l)
            });
        }
        return b(emy1, s, s1, l);
    }
}
