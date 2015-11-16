// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fmh
{

    public fmh()
    {
    }

    private ekd b(ejx ejx1, String s, String s1)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwnerCoverPhoto", new Object[] {
                s, s1
            });
        }
        return ejx1.a(new ffi(this, ejx1, s, s1));
    }

    public ekd a(ejx ejx1, long l)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadContactThumbnailByContactId", new Object[] {
                Long.valueOf(l)
            });
        }
        return ejx1.a(new ffg(this, ejx1, l));
    }

    public ekd a(ejx ejx1, String s, String s1)
    {
        return b(ejx1, s, s1);
    }

    public ekd a(ejx ejx1, String s, String s1, int i)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwnerAvatar", new Object[] {
                s, s1, Integer.valueOf(i), Integer.valueOf(1)
            });
        }
        return ejx1.a(new ffh(this, ejx1, s, s1, i, 1));
    }
}
