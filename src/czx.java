// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.database.Cursor;

final class czx extends czw
{

    czx(String s)
    {
        super(s, 0);
    }

    public Object a(Cursor cursor, int i)
    {
        if (cursor.getInt(i) > 0)
        {
            return Boolean.TRUE;
        } else
        {
            return Boolean.FALSE;
        }
    }

    public void a(String s, Object obj, ContentValues contentvalues)
    {
        contentvalues.put(s, (Boolean)obj);
    }
}
