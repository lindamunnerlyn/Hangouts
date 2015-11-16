// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class cja extends Handler
{

    private Handler a;
    private SQLiteDatabase b;

    public cja(SQLiteDatabase sqlitedatabase, Looper looper, Handler handler)
    {
        super(looper);
        a = handler;
        b = sqlitedatabase;
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 1: // '\001'
            amp.b(b);
            break;
        }
        a.sendEmptyMessage(2);
    }
}
