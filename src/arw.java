// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

final class arw
    implements arv
{

    eec a;
    private final TreeSet b = new TreeSet();
    private final Object c = new Object();

    public arw()
    {
        a = new eec();
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
        if (l1 >= ((arx)b.first()).a)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        obj;
        JVM INSTR monitorexit ;
        return ((List) (obj1));
        Object obj2 = (arx)b.ceiling(new arx(l));
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
            arx arx1 = (arx)((Iterator) (obj2)).next();
            if (arx1.a >= l1)
            {
                break;
            }
            ((List) (obj1)).add(arx1.d);
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

    public void a(dnt dnt1)
    {
        arx arx1;
        if (aru.a)
        {
            String s = String.valueOf("[WatermarkTracker] Record new watermark:  timestamp ");
            long l = dnt1.e;
            String s1 = String.valueOf(dnt1.d);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 28 + String.valueOf(s1).length())).append(s).append(l).append(" gaiaId ").append(s1).toString());
        }
        arx1 = (arx)a.get(dnt1.d);
        if (arx1 != null && dnt1.e < arx1.a)
        {
            eev.c("Babel", "ignore old timestamp");
            return;
        }
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        if (arx1 == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        b.remove(arx1);
        arx arx2 = new arx(dnt1);
        a.put(dnt1.d, arx2);
        b.add(arx2);
        obj;
        JVM INSTR monitorexit ;
        return;
        dnt1;
        obj;
        JVM INSTR monitorexit ;
        throw dnt1;
    }

    public void a(StringBuilder stringbuilder)
    {
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext(); stringbuilder.append("\n"))
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            Object obj = (cgd)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (arx)((java.util.Map.Entry) (obj1)).getValue();
            obj = String.valueOf(obj);
            long l = ((arx) (obj1)).a;
            stringbuilder.append((new StringBuilder(String.valueOf(obj).length() + 50)).append("  participantId: ").append(((String) (obj))).append("  watermark: ").append(l).toString());
        }

    }
}
