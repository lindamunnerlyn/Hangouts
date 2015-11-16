// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

public class ftd
{

    private final String a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();

    public ftd(String s)
    {
        a = s;
        a("");
    }

    public void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        b.add(Long.valueOf(System.currentTimeMillis()));
        c.add(s);
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public void b(String s)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        long l1;
        a("");
        l = ((Long)b.get(0)).longValue();
        l1 = ((Long)b.get(b.size() - 1)).longValue();
        l1 -= l;
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = fst.a();
        s.append(a);
        s.append(",");
        s.append(l1);
        s.append("ms: ");
        int i = 1;
_L4:
        if (i >= b.size())
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = ((Long)b.get(i)).longValue();
        s.append((String)c.get(i));
        s.append(",");
        s.append(l1 - l);
        s.append("ms ");
        i++;
        l = l1;
        if (true) goto _L4; else goto _L3
_L3:
        g.m(2);
        if (true) goto _L1; else goto _L5
_L5:
        s;
        throw s;
    }
}
