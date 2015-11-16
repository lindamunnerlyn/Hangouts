// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.Toast;

final class cng extends AsyncTask
{

    final cnf a;

    cng(cnf cnf1)
    {
        a = cnf1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = dnw.a(a.a.b);
        ((dnw) (aobj)).a(true);
        ((dnw) (aobj)).a(a.a.a);
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        Toast.makeText(a.a.a, "done cleaning", 0).show();
    }
}
