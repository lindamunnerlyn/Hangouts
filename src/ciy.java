// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.preference.PreferenceGroup;
import com.google.android.apps.hangouts.phone.ApnSettingsActivity;

public final class ciy extends AsyncTask
{

    final String a;
    final ApnSettingsActivity b;

    public ciy(ApnSettingsActivity apnsettingsactivity, String s)
    {
        b = apnsettingsactivity;
        a = s;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = a;
        return ApnSettingsActivity.a(b).query("apn", ApnSettingsActivity.a(), "numeric =?", new String[] {
            aobj
        }, null, null, null, null);
    }

    protected void onPostExecute(Object obj)
    {
        boolean flag;
        flag = true;
        obj = (Cursor)obj;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_241;
        }
        PreferenceGroup preferencegroup;
        preferencegroup = (PreferenceGroup)b.findPreference("apn_list");
        preferencegroup.removeAll();
        ApnSettingsActivity.a(b, dsj.a(ApnSettingsActivity.a(b), a));
_L5:
        String s2;
        cix cix1;
        String s;
        String s1;
        do
        {
            if (!((Cursor) (obj)).moveToNext())
            {
                break MISSING_BLOCK_LABEL_235;
            }
            s = ((Cursor) (obj)).getString(1);
            s1 = ((Cursor) (obj)).getString(2);
            s2 = ((Cursor) (obj)).getString(0);
        } while (!dsj.b(((Cursor) (obj)).getString(3), "mms"));
        cix1 = new cix(b, (byte)0);
        cix1.setKey(s2);
        cix1.setTitle(s);
        cix1.setSummary(s1);
        cix1.setPersistent(false);
        cix1.setOnPreferenceChangeListener(b);
        cix1.setSelectable(true);
        if (ApnSettingsActivity.b(b) != null && ApnSettingsActivity.b(b).equals(s2)) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag;
        if (!flag) goto _L4; else goto _L3
_L3:
        flag1 = flag;
        if (ApnSettingsActivity.b(b) != null) goto _L4; else goto _L2
_L2:
        cix1.a();
        flag1 = false;
_L4:
        preferencegroup.addPreference(cix1);
        flag = flag1;
          goto _L5
        Exception exception;
        exception;
        ((Cursor) (obj)).close();
        throw exception;
        ((Cursor) (obj)).close();
    }
}
