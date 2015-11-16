// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.widget.ArrayAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class atz extends AsyncTask
{

    final aty a;

    atz(aty aty1)
    {
        a = aty1;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        return any.f(new aoe(a.b.a, a.a), a.b.c.a);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (List)obj;
        ArrayAdapter arrayadapter = new ArrayAdapter(a.b.a, 0x1090003);
        for (Iterator iterator = ((List) (obj)).iterator(); iterator.hasNext(); arrayadapter.add((String)iterator.next())) { }
        (new android.app.AlertDialog.Builder(a.b.a)).setTitle(String.format(Locale.US, "%d recipients", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        })).setAdapter(arrayadapter, null).create().show();
    }
}
