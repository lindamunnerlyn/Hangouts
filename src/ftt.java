// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;

final class ftt extends AsyncTask
{

    final Context a;
    final ftu b;

    ftt(Context context, ftu ftu1)
    {
        a = context;
        b = ftu1;
        super();
    }

    private transient Integer a()
    {
        try
        {
            fts.a(a);
        }
        catch (emn emn1)
        {
            return Integer.valueOf(emn1.a());
        }
        catch (emm emm1)
        {
            return Integer.valueOf(emm1.a);
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
            emo.a(((Integer) (obj)).intValue());
            b.b(((Integer) (obj)).intValue());
        }
    }
}
