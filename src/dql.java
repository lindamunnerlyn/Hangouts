// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

final class dql
    implements dqo
{

    final ContentValues a;
    final SQLiteDatabase b;

    dql(ContentValues contentvalues, SQLiteDatabase sqlitedatabase)
    {
        a = contentvalues;
        b = sqlitedatabase;
        super();
    }

    public void a(String s, String s1, String s2, String s3)
    {
        a.clear();
        a.put("numeric", s);
        a.put("key", s1);
        a.put("value", s2);
        a.put("type", s3);
        b.insert("mmsconfig", null, a);
    }
}
