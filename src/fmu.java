// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class fmu
{

    private Context a;
    private ArrayList b;
    private Account c[];
    private HashMap d;

    public fmu(Context context)
    {
        a = context;
        d = new HashMap();
        b = new ArrayList();
    }

    private void a()
    {
        d.clear();
        b.clear();
    }

    public ArrayList a(List list)
    {
        if (list != null && !list.isEmpty()) goto _L2; else goto _L1
_L1:
        a();
_L5:
        return b;
_L2:
        c = eic.c(a, "com.google");
_L4:
        d.clear();
        if (list != null)
        {
            fqu fqu1;
            for (list = list.iterator(); list.hasNext(); d.put(fqu1.a(), fqu1))
            {
                fqu1 = (fqu)list.next();
            }

        }
        break; /* Loop/switch isn't completed */
        Object obj;
        obj;
_L7:
        c = null;
        Log.e("AccountOrderingHelper", "Can't getAccountByName", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        if (!d.isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        a();
          goto _L5
        if (c == null || c.length <= 0) goto _L5; else goto _L6
_L6:
        b.clear();
        list = c;
        int j = list.length;
        int i = 0;
        while (i < j) 
        {
            obj = list[i];
            obj = (fqu)d.get(((Account) (obj)).name);
            if (obj != null)
            {
                b.add(obj);
            }
            i++;
        }
          goto _L5
        obj;
          goto _L7
        obj;
          goto _L7
    }
}
