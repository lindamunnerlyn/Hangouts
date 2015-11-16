// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.content.EsProvider;

public abstract class aqv extends AsyncTask
{

    private static final String c[] = csz.a();
    public final int a;
    public final String b;
    private final gms d;

    public aqv(gms gms1, int i, String s)
    {
        d = gms1;
        a = i;
        b = s;
    }

    private transient Void a()
    {
        if (d.d(a)) goto _L2; else goto _L1
_L1:
        Cursor cursor;
        return null;
_L2:
        if ((cursor = g.nS.getContentResolver().query(EsProvider.b(a), c, "gaia_id=?", new String[] {
            b
        }, null)) == null) goto _L1; else goto _L3
_L3:
        if (cursor.moveToFirst())
        {
            a(cursor);
        }
        cursor.close();
        return null;
        Exception exception;
        exception;
        cursor.close();
        throw exception;
    }

    public abstract void a(Cursor cursor);

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

}
