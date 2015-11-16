// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class egr extends AsyncTask
{

    final egp a;

    egr(egp egp1)
    {
        a = egp1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        egp.a(a, any.b(egp.c(a), egp.d(a), egp.e(a), "video/*"));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        a.setEnabled(true);
    }
}
