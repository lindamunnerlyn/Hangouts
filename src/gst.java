// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class gst
    implements gss
{

    private final gqz a;
    private final grk b;

    gst(Context context)
    {
        a = (gqz)hlp.a(context, gqz);
        b = (grk)hlp.a(context, grk);
    }

    private void a(int i, List list)
    {
        Object obj = a.a(i);
        if (!((grb) (obj)).d("is_managed_account"))
        {
            obj = ((grb) (obj)).b("account_name");
            List list1 = a.a();
            int j = list1.size();
            i = 0;
            while (i < j) 
            {
                Integer integer = (Integer)list1.get(i);
                grb grb1 = a.a(integer.intValue());
                if (grb1.d("is_managed_account") && grb1.b("account_name").equals(obj))
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
        grh agrh[];
        int k;
        hashmap = new HashMap();
        agrh = b.a();
        k = agrh.length;
        int i = 0;
_L2:
        Object obj;
        if (i >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = agrh[i];
        hashmap.put(((grh) (obj)).a(), Integer.valueOf(((grh) (obj)).b()));
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = a.a().iterator();
_L3:
        do
        {
            grb grb1;
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break MISSING_BLOCK_LABEL_254;
                }
                i = ((Integer)((Iterator) (obj)).next()).intValue();
                grb1 = a.a(i);
            } while (grb1.b("effective_gaia_id") != null);
            String s = grb1.b("account_name");
            if (!hashmap.containsKey(s))
            {
                break MISSING_BLOCK_LABEL_232;
            }
            if (((Integer)hashmap.get(s)).intValue() != grb1.a("device_index", -1))
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
