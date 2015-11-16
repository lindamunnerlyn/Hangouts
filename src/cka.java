// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentValues;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.preference.EditTextPreference;
import com.google.android.apps.hangouts.phone.ApnEditorActivity;

public final class cka extends AsyncTask
{

    final String a;
    final String b;
    final String c;
    final ApnEditorActivity d;

    public cka(ApnEditorActivity apneditoractivity, String s, String s1, String s2)
    {
        d = apneditoractivity;
        a = s;
        b = s1;
        c = s2;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        ContentValues contentvalues = new ContentValues();
        String s;
        if (a.length() <= 0)
        {
            aobj = d.getResources().getString(l.sz);
        } else
        {
            aobj = a;
        }
        contentvalues.put("name", ((String) (aobj)));
        contentvalues.put("mmsproxy", ApnEditorActivity.a(ApnEditorActivity.e(d).getText()));
        contentvalues.put("mmsport", ApnEditorActivity.a(ApnEditorActivity.f(d).getText()));
        contentvalues.put("mmsc", ApnEditorActivity.a(ApnEditorActivity.g(d).getText()));
        contentvalues.put("type", "mms");
        contentvalues.put("mcc", b);
        contentvalues.put("mnc", c);
        aobj = String.valueOf(b);
        s = String.valueOf(c);
        if (s.length() != 0)
        {
            aobj = ((String) (aobj)).concat(s);
        } else
        {
            aobj = new String(((String) (aobj)));
        }
        contentvalues.put("numeric", ((String) (aobj)));
        if (ApnEditorActivity.h(d) != null && ApnEditorActivity.i(d) != null && ApnEditorActivity.h(d).equals(c) && ApnEditorActivity.i(d).equals(b))
        {
            contentvalues.put("current", Integer.valueOf(1));
        }
        if (ApnEditorActivity.j(d))
        {
            ApnEditorActivity.b(d).insert("apn", null, contentvalues);
            return null;
        } else
        {
            aobj = ApnEditorActivity.a(d);
            ApnEditorActivity.b(d).update("apn", contentvalues, "_id =?", new String[] {
                aobj
            });
            return null;
        }
    }
}
