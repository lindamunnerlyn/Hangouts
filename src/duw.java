// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteException;

final class duw
    implements duv
{

    private Cursor a;
    private final aow b;

    public duw(aow aow1, long l, long l1)
    {
        b = aow1;
        try
        {
            a = b.e().a("messages", duy.a(), dur.a(dur.c(), "timestamp", l * 1000L, 1000L * l1), null, "timestamp DESC");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aow aow1)
        {
            int i = b.f().h();
            String s = String.valueOf(aow1);
            eev.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 60)).append("SmsSyncManager A#").append(i).append(": failed to query local sms/mms ").append(s).toString(), aow1);
            throw aow1;
        }
    }

    public dtj a()
    {
        Cursor cursor;
label0:
        {
            if (a != null && a.moveToNext())
            {
                cursor = a;
                if (cursor != null)
                {
                    break label0;
                }
            }
            return null;
        }
        return new dux(cursor.getLong(0), cursor.getInt(3), dur.a(dur.a(cursor.getString(2))), cursor.getLong(1));
    }

    public void b()
    {
        if (a != null)
        {
            a.close();
            a = null;
        }
    }
}
