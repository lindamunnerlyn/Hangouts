// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

public abstract class czw extends Enum
{

    public static final czw a;
    public static final czw b;
    public static final czw c;
    public static final czw d;
    private static final czw e[];

    czw(String s, int i)
    {
        super(s, i);
    }

    public static czw valueOf(String s)
    {
        return (czw)Enum.valueOf(czw, s);
    }

    public static czw[] values()
    {
        return (czw[])e.clone();
    }

    public abstract Object a(Cursor cursor, int i);

    public abstract void a(String s, Object obj, ContentValues contentvalues);

    static 
    {
        a = new czx("BOOLEAN");
        b = new czy("INTEGER");
        c = new czz("LONG");
        d = new daa("STRING");
        e = (new czw[] {
            a, b, c, d
        });
    }
}
