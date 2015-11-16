// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.text.TextUtils;

public class cbj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public boolean f;
    public String g;
    public String h;
    public String i;
    public long j;

    cbj()
    {
    }

    protected static void a(Cursor cursor, cbj cbj1)
    {
        cbj1.a = cursor.getString(3);
        cbj1.b = cursor.getString(4);
        cbj1.c = cursor.getString(5);
        cbj1.d = cursor.getString(6);
        cbj1.f = eep.d(cursor.getInt(7));
        cbj1.e = eep.d(cursor.getInt(8));
        cbj1.g = cursor.getString(9);
        cbj1.h = cursor.getString(10);
        cbj1.i = cursor.getString(11);
        cbj1.j = cursor.getLong(12);
    }

    public boolean a()
    {
        return a == null || TextUtils.isEmpty(a.trim());
    }
}
