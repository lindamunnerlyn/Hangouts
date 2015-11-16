// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.view.View;
import java.lang.ref.WeakReference;

final class ehc extends AsyncTask
{

    ehd a;
    final ehb b;

    ehc(ehb ehb1, ehd ehd1)
    {
        b = ehb1;
        super();
        a = ehd1;
    }

    protected Object doInBackground(Object aobj[])
    {
        ehb.a(b, a, edj.a());
        return null;
    }

    protected void onPostExecute(Object obj)
    {
        obj = (View)a.c.get();
        if (obj != null)
        {
            ((View) (obj)).invalidate();
        }
    }
}
