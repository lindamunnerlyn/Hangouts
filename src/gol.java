// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gol
    implements gok
{

    private final gms a;
    private final gnd b;

    gol(Context context)
    {
        a = (gms)hgx.a(context, gms);
        b = (gnd)hgx.a(context, gnd);
    }

    private void a(int i, List list)
    {
        Object obj = a.a(i);
        if (!((gmu) (obj)).d("is_managed_account"))
        {
            obj = ((gmu) (obj)).b("account_name");
            List list1 = a.a();
            int j = list1.size();
            i = 0;
            while (i < j) 
            {
                Integer integer = (Integer)list1.get(i);
                gmu gmu1 = a.a(integer.intValue());
                if (gmu1.d("is_managed_account") && gmu1.b("account_name").equals(obj))
                {
                    list.add(integer);
                }
                i++;
            }
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        HashMap hashmap;
        gna agna[];
        int k;
        hashmap = new HashMap();
        agna = b.a();
        k = agna.length;
        int i = 0;
_L2:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = agna[i];
        hashmap.put(((gna) (obj)).a(), Integer.valueOf(((gna) (obj)).b()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = a.a().iterator();
_L3:
        do
        {
            gmu gmu1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_254;
                }
                i = ((Integer)((Iterator) (obj)).next()).intValue();
                gmu1 = a.a(i);
            } while (gmu1.b("effective_gaia_id") != null);
            String s = gmu1.b("account_name");
            if (!hashmap.containsKey(s))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            if (((Integer)hashmap.get(s)).intValue() != gmu1.a("device_index", -1))
            {
                a.b(i).c("device_index", ((Integer)hashmap.get(s)).intValue()).d();
            }
        } while (true);
        Exception exception;
        exception;
        throw exception;
        arraylist.add(Integer.valueOf(i));
        a(i, ((List) (arraylist)));
          goto _L3
        int j;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); a.f(j))
        {
            j = ((Integer)iterator.next()).intValue();
        }

        this;
        JVM INSTR monitorexit ;
    }
}
