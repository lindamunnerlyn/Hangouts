// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteException;

final class dsd
    implements dsc
{

    private Cursor a;
    private final aoe b;

    public dsd(aoe aoe1, long l, long l1)
    {
        b = aoe1;
        try
        {
            a = b.e().a("messages", dsf.a(), dry.a(dry.c(), "timestamp", l * 1000L, 1000L * l1), null, "timestamp DESC");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (aoe aoe1)
        {
            int i = b.f().h();
            String s = String.valueOf(aoe1);
            ebw.e("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 60)).append("SmsSyncManager A#").append(i).append(": failed to query local sms/mms ").append(s).toString(), aoe1);
            throw aoe1;
        }
    }

    public dqp a()
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
        return new dse(cursor.getLong(0), cursor.getInt(3), dry.a(dry.a(cursor.getString(2))), cursor.getLong(1));
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
