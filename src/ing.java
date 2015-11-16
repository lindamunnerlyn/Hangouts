// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class ing
    implements Runnable
{

    final inc a;
    final List b;
    final inf c;

    ing(inf inf, inc inc, List list)
    {
        c = inf;
        a = inc;
        b = list;
        super();
    }

    public void run()
    {
        List list;
        list = b;
        if (!Log.isLoggable("trace_manager", 2))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        Object obj1 = new hd();
        list;
        JVM INSTR monitorenter ;
        kvl kvl1;
        for (Iterator iterator1 = list.iterator(); iterator1.hasNext(); ((hd) (obj1)).a(kvl1.j(), kvl1))
        {
            kvl1 = (kvl)iterator1.next();
        }

        break MISSING_BLOCK_LABEL_70;
        obj1;
        list;
        JVM INSTR monitorexit ;
        throw obj1;
        list;
        JVM INSTR monitorexit ;
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < ((hd) (obj1)).a(); i++)
        {
            Object obj = (kvl)((hd) (obj1)).a(i);
            long l = ((kvl) (obj)).j();
            long l1 = (long)((kvl) (obj)).n();
            long l2 = Math.max(l1, (long)((kvl) (obj)).o());
            obj = (new StringBuilder(23)).append(l2 - l1).append(" ms").toString();
            do
            {
                Object obj2 = (kvl)((hd) (obj1)).a(l);
                l = ((kvl) (obj2)).k();
                obj2 = String.valueOf(((kvl) (obj2)).l());
                obj = (new StringBuilder(String.valueOf(obj2).length() + 3 + String.valueOf(obj).length())).append(((String) (obj2))).append(" > ").append(((String) (obj))).toString();
            } while (l != 0L);
            arraylist.add(obj);
        }

        Collections.sort(arraylist);
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); iterator.next()) { }
    }
}
