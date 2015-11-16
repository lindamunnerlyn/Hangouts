// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

public final class fpb
{

    public fpb()
    {
    }

    private ene b(emy emy1, String s, String s1)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwnerCoverPhoto", new Object[] {
                s, s1
            });
        }
        return emy1.a(new fie(this, emy1, s, s1));
    }

    public ene a(emy emy1, long l)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadContactThumbnailByContactId", new Object[] {
                Long.valueOf(l)
            });
        }
        return emy1.a(new fic(this, emy1, l));
    }

    public ene a(emy emy1, String s, String s1)
    {
        return b(emy1, s, s1);
    }

    public ene a(emy emy1, String s, String s1, int i)
    {
        if (Log.isLoggable("PeopleClientCall", 3))
        {
            g.a("loadOwnerAvatar", new Object[] {
                s, s1, Integer.valueOf(i), Integer.valueOf(1)
            });
        }
        return emy1.a(new fid(this, emy1, s, s1, i, 1));
    }
}
