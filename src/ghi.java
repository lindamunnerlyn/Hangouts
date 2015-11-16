// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ghi
    implements gba
{

    final ggv a_;
    final ggq b;
    final List c = new CopyOnWriteArrayList();
    public volatile boolean d;
    private final gbf e;
    private final ggr f;
    private final Map g = new ConcurrentHashMap();

    public ghi(ggv ggv, gbf gbf1, ggr ggr1, ggq ggq)
    {
        a_ = ggv;
        e = gbf1;
        f = ggr1;
        b = ggq;
        d = false;
    }

    static jdo a(jec jec)
    {
        jdp jdp1 = new jdp();
        jdp1.b = jec;
        jec = new jdo();
        jec.a = (new jdp[] {
            jdp1
        });
        return jec;
    }

    public void a(int i, kop kop1)
    {
        gbh.a();
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 68
    //                   1 198
    //                   2 128
    //                   3 258;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        gkc.f("vclib", (new StringBuilder(35)).append("Operation ").append(i).append(" is not found.").toString());
_L6:
        return;
_L2:
        gbh.a(g.put(e.a(kop1), kop1));
        Iterator iterator = c.iterator();
        while (iterator.hasNext()) 
        {
            ((gbc)iterator.next()).a(kop1);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        kop kop2 = (kop)g.put(e.a(kop1), kop1);
        gbh.b(kop2);
        Iterator iterator2 = c.iterator();
        while (iterator2.hasNext()) 
        {
            ((gbc)iterator2.next()).a(kop2, kop1);
        }
        if (true) goto _L6; else goto _L3
_L3:
        gbh.b(g.remove(e.a(kop1)));
        Iterator iterator1 = c.iterator();
        while (iterator1.hasNext()) 
        {
            ((gbc)iterator1.next()).b(kop1);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        d = true;
        kop1 = c.iterator();
        while (kop1.hasNext()) 
        {
            ((gbc)kop1.next()).a();
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(gbc gbc1)
    {
        g.a(new ghj(this, gbc1));
    }

    public void a(kop kop1, gbe gbe)
    {
        f.a(kop1, new ghk(this, gbe));
    }

    public Map b()
    {
        return Collections.unmodifiableMap(g);
    }

    public void b(gbc gbc1)
    {
        c.remove(gbc1);
    }

    public void b(kop kop1, gbe gbe)
    {
        f.b(kop1, new ghl(this, gbe));
    }
}
