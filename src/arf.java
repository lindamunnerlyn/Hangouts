// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

final class arf
    implements are
{

    eay a;
    private final TreeSet b = new TreeSet();
    private final Object c = new Object();

    public arf()
    {
        a = new eay();
    }

    public List a(long l, long l1)
    {
label0:
        {
            obj1 = new ArrayList();
            synchronized (c)
            {
                if (!b.isEmpty())
                {
                    break label0;
                }
            }
            return ((List) (obj1));
        }
        if (l1 >= ((arg)b.first()).a)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
        Object obj2 = (arg)b.ceiling(new arg(l));
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
        obj2 = b.tailSet(obj2, true).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            arg arg1 = (arg)((Iterator) (obj2)).next();
            if (arg1.a >= l1)
            {
                break;
            }
            ((List) (obj1)).add(arg1.d);
        } while (true);
        break MISSING_BLOCK_LABEL_162;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
    }

    public void a(czn czn1)
    {
        arg arg1;
        if (ard.a)
        {
            String s = String.valueOf("[WatermarkTracker] Record new watermark:  timestamp ");
            long l = czn1.e;
            String s1 = String.valueOf(czn1.d);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 28 + String.valueOf(s1).length())).append(s).append(l).append(" gaiaId ").append(s1).toString());
        }
        arg1 = (arg)a.get(czn1.d);
        if (arg1 != null && czn1.e < arg1.a)
        {
            ebw.c("Babel", "ignore old timestamp");
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (arg1 == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        b.remove(arg1);
        arg arg2 = new arg(czn1);
        a.put(czn1.d, arg2);
        b.add(arg2);
        obj;
        JVM INSTR monitorexit ;
        return;
        czn1;
        obj;
        JVM INSTR monitorexit ;
        throw czn1;
    }

    public void a(StringBuilder stringbuilder)
    {
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuilder.append("\n"))
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            Object obj = (cey)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (arg)((java.util.Map.Entry) (obj1)).getValue();
            obj = String.valueOf(obj);
            long l = ((arg) (obj1)).a;
            stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 50)).append("  participantId: ").append(((String) (obj))).append("  watermark: ").append(l).toString());
        }

    }
}
