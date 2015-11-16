// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class ejt extends AsyncTask
{

    final ejr a;

    ejt(ejr ejr1)
    {
        a = ejr1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        ejr.a(a, aoq.b(ejr.c(a), ejr.d(a), ejr.e(a), "video/*"));
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        super.onPostExecute((Void)obj);
        a.setEnabled(true);
    }
}
