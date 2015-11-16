// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.TextView;

public final class bmu extends AsyncTask
{

    private final String a;
    private final TextView b;

    public bmu(String s, TextView textview)
    {
        a = s;
        b = textview;
    }

    protected Object doInBackground(Object aobj[])
    {
        return new ahi(a);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (ahi)obj;
        if (obj == null || isCancelled())
        {
            return;
        } else
        {
            b.addTextChangedListener(((android.text.TextWatcher) (obj)));
            return;
        }
    }
}
