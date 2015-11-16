// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.view.View;
import java.lang.ref.WeakReference;

final class eea extends AsyncTask
{

    eeb a;
    final edz b;

    eea(edz edz1, eeb eeb1)
    {
        b = edz1;
        super();
        a = eeb1;
    }

    protected Object doInBackground(Object aobj[])
    {
        edz.a(b, a, eaf.a());
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
