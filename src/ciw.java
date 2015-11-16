// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class ciw extends AsyncTask
{

    final ApnEditorActivity a;

    public ciw(ApnEditorActivity apneditoractivity)
    {
        a = apneditoractivity;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = ApnEditorActivity.a(a);
        ApnEditorActivity.b(a).delete("apn", "_id =?", new String[] {
            aobj
        });
        return null;
    }
}
