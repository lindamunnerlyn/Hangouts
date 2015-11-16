// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fmt
{

    public fmt()
    {
    }

    private ekd b(ejx ejx1, String s, String s1, long l)
    {
        return ejx1.a(new ffn(this, ejx1, s, s1, l, false, false));
    }

    public ekd a(ejx ejx1, String s, String s1, long l)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("requestSync", new Object[] {
                s, s1, Long.valueOf(l)
            });
        }
        return b(ejx1, s, s1, l);
    }
}
