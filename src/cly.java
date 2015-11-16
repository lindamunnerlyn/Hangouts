// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.Toast;

final class cly extends AsyncTask
{

    final clx a;

    cly(clx clx1)
    {
        a = clx1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = dkz.a(a.a.b);
        ((dkz) (aobj)).a(true);
        ((dkz) (aobj)).e();
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        Toast.makeText(a.a.a, "done cleaning", 1).show();
    }
}
