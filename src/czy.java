// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

final class czy extends czw
{

    czy(String s)
    {
        super(s, 1);
    }

    public Object a(Cursor cursor, int i)
    {
        return Integer.valueOf(cursor.getInt(i));
    }

    public void a(String s, Object obj, ContentValues contentvalues)
    {
        contentvalues.put(s, (Integer)obj);
    }
}
