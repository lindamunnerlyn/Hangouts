// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

final class dbf extends dbc
{

    dbf(String s)
    {
        super(s, 2);
    }

    public Object a(Cursor cursor, int i)
    {
        return Long.valueOf(cursor.getLong(i));
    }

    public void a(String s, Object obj, ContentValues contentvalues)
    {
        contentvalues.put(s, (Long)obj);
    }
}
