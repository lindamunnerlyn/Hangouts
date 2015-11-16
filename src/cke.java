// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class cke extends AsyncTask
{

    final String a;
    final ApnSettingsActivity b;

    public cke(ApnSettingsActivity apnsettingsactivity, String s)
    {
        b = apnsettingsactivity;
        a = s;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        ApnSettingsActivity.a(b).update("apn", ApnSettingsActivity.b(), "current =?", ApnSettingsActivity.c());
        aobj = a;
        ApnSettingsActivity.a(b).update("apn", ApnSettingsActivity.d(), "_id =?", new String[] {
            aobj
        });
        return null;
    }
}
