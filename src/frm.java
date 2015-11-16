// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;

final class frm extends AsyncTask
{

    final Context a;
    final frn b;

    frm(Context context, frn frn1)
    {
        a = context;
        b = frn1;
        super();
    }

    private transient Integer a()
    {
        try
        {
            frl.a(a);
        }
        catch (ejm ejm1)
        {
            return Integer.valueOf(ejm1.a());
        }
        catch (ejl ejl1)
        {
            return Integer.valueOf(ejl1.a);
        }
        return Integer.valueOf(0);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected void onPostExecute(Object obj)
    {
        obj = (Integer)obj;
        if (((Integer) (obj)).intValue() != 0)
        {
            ejn.a(((Integer) (obj)).intValue());
            b.b(((Integer) (obj)).intValue());
        }
    }
}
