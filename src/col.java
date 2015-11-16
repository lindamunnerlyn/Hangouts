// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;

final class col extends AsyncTask
{

    final cna a;
    private final String b;

    public col(cna cna1, String s)
    {
        a = cna1;
        super();
        b = s;
    }

    protected Object doInBackground(Object aobj[])
    {
        return Environment.getExternalStorageDirectory().list(new com(this));
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
            bjl.a(((String []) (obj)), b).a(bg, null);
            return;
        }
    }
}
