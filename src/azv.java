// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class azv extends AsyncTask
{

    private final azz a;
    private final Context b;
    private final int c;
    private final List d;

    azv(Context context, List list, azz azz1)
    {
        b = context;
        c = ((gmo)hgx.a(context, gmo)).a();
        d = list;
        a = azz1;
    }

    static Context a(azv azv1)
    {
        return azv1.b;
    }

    protected Object doInBackground(Object aobj[])
    {
        aobj = new ArrayList();
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            asy asy1 = (asy)iterator.next();
            if (!l.b(asy1.a))
            {
                ((ArrayList) (aobj)).add(asy1);
            } else
            if (asy1.c == asz.b || asy1.c == asz.c)
            {
                atg atg1 = auj.a(b, c, asy1.c, asy1.b, asy1.d);
                if (atg1 != null)
                {
                    if (atg1.c == asz.c)
                    {
                        ((arl)hgx.a(b, arl)).a(new azw(this, atg1));
                    }
                    atg1.b = asy1.b;
                    ((ArrayList) (aobj)).add(atg1);
                }
            }
        } while (true);
        return ((Object) (aobj));
    }

    protected void onPostExecute(Object obj)
    {
        obj = (ArrayList)obj;
        if (!isCancelled())
        {
            g.d(obj);
            a.a(jlk.a(((java.util.Collection) (obj))));
        }
    }
}
