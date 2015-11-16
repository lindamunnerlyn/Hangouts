// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

public abstract class dbc extends Enum
{

    public static final dbc a;
    public static final dbc b;
    public static final dbc c;
    public static final dbc d;
    private static final dbc e[];

    dbc(String s, int i)
    {
        super(s, i);
    }

    public static dbc valueOf(String s)
    {
        return (dbc)Enum.valueOf(dbc, s);
    }

    public static dbc[] values()
    {
        return (dbc[])e.clone();
    }

    public abstract Object a(Cursor cursor, int i);

    public abstract void a(String s, Object obj, ContentValues contentvalues);

    static 
    {
        a = new dbd("BOOLEAN");
        b = new dbe("INTEGER");
        c = new dbf("LONG");
        d = new dbg("STRING");
        e = (new dbc[] {
            a, b, c, d
        });
    }
}
