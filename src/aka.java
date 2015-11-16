// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;

final class aka
    implements gsn
{

    private static final String a[] = {
        "client_callerid_settings"
    };

    aka()
    {
    }

    public String a()
    {
        return "caller_id";
    }

    public void a(SQLiteDatabase sqlitedatabase)
    {
        sqlitedatabase.execSQL("CREATE TABLE client_callerid_settings (phone_number_e164 TEXT PRIMARY KEY,is_default INT,refreshed_at INT,client_callerid_setting BLOB);");
    }

    public boolean a(int i, int j)
    {
        if (ebw.a("caller_id_database", 3))
        {
            ebw.c("caller_id_database", (new StringBuilder(45)).append("Upgrade database: ").append(i).append(" --> 1").toString());
        }
        switch (i)
        {
        default:
            ebw.f("caller_id_database", "db upgrade not supported");
            return false;

        case 1: // '\001'
        case 2147483647: 
            ebw.e("caller_id_database", (new StringBuilder(52)).append("db upgrade from ").append(i).append(" to 1").append(" succeeded").toString());
            break;
        }
        return true;
    }

    public String[] b()
    {
        return a;
    }

    public String[] c()
    {
        return new String[0];
    }

}
