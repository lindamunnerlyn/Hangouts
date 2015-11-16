// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;

public final class dqq
{

    public static final String a[] = {
        "address", "charset"
    };
    public static final int b = 0;
    public static final int c;
    private static int d;

    public static String a(Cursor cursor)
    {
        int i = cursor.getInt(c);
        return g.a(g.b(cursor.getString(b), 4), i);
    }

    static 
    {
        d = 0;
        d = 1;
        int i = d;
        d = i + 1;
        c = i;
    }
}
