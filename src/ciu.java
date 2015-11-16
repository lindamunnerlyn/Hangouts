// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class ciu extends AsyncTask
{

    final ApnEditorActivity a;

    public ciu(ApnEditorActivity apneditoractivity)
    {
        a = apneditoractivity;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        if (ApnEditorActivity.a(a) != null)
        {
            aobj = ApnEditorActivity.a(a);
            ApnEditorActivity.a(a, ApnEditorActivity.b(a).query("apn", ApnEditorActivity.a(), "_id =?", new String[] {
                aobj
            }, null, null, null, null));
        }
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        if (ApnEditorActivity.c(a) == null)
        {
            a.finish();
            return;
        } else
        {
            ApnEditorActivity.c(a).moveToFirst();
            ApnEditorActivity.d(a);
            return;
        }
    }
}
