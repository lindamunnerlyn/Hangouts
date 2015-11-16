// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;

final class cmw extends AsyncTask
{

    final cls a;
    private final String b;

    public cmw(cls cls1, String s)
    {
        a = cls1;
        super();
        b = s;
    }

    protected Object doInBackground(Object aobj[])
    {
        return Environment.getExternalStorageDirectory().list(new cmx(this));
    }

    protected void onPostExecute(Object obj)
    {
        obj = (String[])obj;
        if (obj == null || obj.length <= 0)
        {
            return;
        } else
        {
            bg bg = a.e.a();
            biz.a(((String []) (obj)), b).a(bg, null);
            return;
        }
    }
}
