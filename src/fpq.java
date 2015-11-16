// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.os.AsyncTask;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class fpq extends AsyncTask
{

    final fpo a;

    fpq(fpo fpo1)
    {
        a = fpo1;
        super();
    }

    private transient Account[] a()
    {
        if (isCancelled())
        {
            return null;
        }
        Account aaccount[] = eld.c(a.a, "com.google");
        return aaccount;
        Object obj;
        obj;
_L2:
        Log.e("AccountOrderingHelper", "Failed to get accounts", ((Throwable) (obj)));
        return null;
        obj;
        continue; /* Loop/switch isn't completed */
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected void onPostExecute(Object obj)
    {
        fpo fpo1;
        obj = (Account[])obj;
        fpo1 = a;
        if (fpo1.b != null && !fpo1.b.isEmpty()) goto _L2; else goto _L1
_L1:
        fpo1.a();
_L4:
        if (fpo1.e != null)
        {
            fpo1.e.a(fpo1.c);
        }
        return;
_L2:
        Object obj1 = fpo1.b;
        fpo1.d.clear();
        if (obj1 != null)
        {
            obj1 = ((Iterable) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ftl ftl2 = (ftl)((Iterator) (obj1)).next();
                if (g.a(ftl2))
                {
                    fpo1.d.put(ftl2.a(), ftl2);
                }
            } while (true);
        }
        if (!fpo1.d.isEmpty())
        {
            break; /* Loop/switch isn't completed */
        }
        fpo1.a();
        if (true) goto _L4; else goto _L3
_L3:
        if (obj != null && obj.length > 0)
        {
            fpo1.c.clear();
            int j = obj.length;
            int i = 0;
            while (i < j) 
            {
                ftl ftl1 = obj[i];
                ftl1 = (ftl)fpo1.d.get(((Account) (ftl1)).name);
                if (ftl1 != null)
                {
                    fpo1.c.add(ftl1);
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
