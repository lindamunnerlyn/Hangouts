// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class bak extends AsyncTask
{

    final Context a;
    private final bao b;
    private final int c;
    private final List d;

    bak(Context context, List list, bao bao1)
    {
        a = context;
        c = ((gqu)hlp.a(context, gqu)).a();
        d = list;
        b = bao1;
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
            ato ato1 = (ato)iterator.next();
            if (!l.b(ato1.a))
            {
                ((ArrayList) (aobj)).add(ato1);
            } else
            if (ato1.c == atp.b || ato1.c == atp.c)
            {
                atx atx1 = ava.a(a, c, ato1.c, ato1.b, ato1.d);
                if (atx1 != null)
                {
                    if (atx1.c == atp.c)
                    {
                        ((asb)hlp.a(a, asb)).a(new bal(this, atx1));
                    }
                    atx1.b = ato1.b;
                    ((ArrayList) (aobj)).add(atx1);
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
            g.e(obj);
            b.a(jsh.a(((java.util.Collection) (obj))));
        }
    }
}
