// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class ani
    implements dth
{

    final SQLiteDatabase a;

    ani(SQLiteDatabase sqlitedatabase)
    {
        a = sqlitedatabase;
        super();
    }

    public void a(ContentValues contentvalues)
    {
        a.insert("apn", null, contentvalues);
    }
}
