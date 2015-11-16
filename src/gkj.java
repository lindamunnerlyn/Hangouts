// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class gkj
    implements gdo
{

    final gjw a_;
    final gjr b;
    public final Map c = new ConcurrentHashMap();
    final List d = new CopyOnWriteArrayList();
    public volatile boolean e;
    private final gdt f;
    private final gjs g;

    public gkj(gjw gjw, gdt gdt1, gjs gjs1, gjr gjr)
    {
        a_ = gjw;
        f = gdt1;
        g = gjs1;
        b = gjr;
        e = false;
    }

    static jka a(jko jko)
    {
        jkb jkb1 = new jkb();
        jkb1.b = jko;
        jko = new jka();
        jko.a = (new jkb[] {
            jkb1
        });
        return jko;
    }

    public void a(int i, kws kws1)
    {
        gdv.a();
        i;
        JVM INSTR tableswitch 0 3: default 36
    //                   0 68
    //                   1 202
    //                   2 130
    //                   3 264;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        gne.a("vclib", (new StringBuilder(35)).append("Operation ").append(i).append(" is not found.").toString());
_L6:
        return;
_L2:
        gdv.a("Expected null", c.put(f.a(kws1), kws1));
        Iterator iterator = d.iterator();
        while (iterator.hasNext()) 
        {
            ((gdq)iterator.next()).a(kws1);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        kws kws2 = (kws)c.put(f.a(kws1), kws1);
        gdv.b("Expected non-null", kws2);
        Iterator iterator2 = d.iterator();
        while (iterator2.hasNext()) 
        {
            ((gdq)iterator2.next()).a(kws2, kws1);
        }
        if (true) goto _L6; else goto _L3
_L3:
        gdv.b("Expected non-null", c.remove(f.a(kws1)));
        Iterator iterator1 = d.iterator();
        while (iterator1.hasNext()) 
        {
            ((gdq)iterator1.next()).b(kws1);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        e = true;
        kws1 = d.iterator();
        while (kws1.hasNext()) 
        {
            ((gdq)kws1.next()).a();
        }
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(gdq gdq1)
    {
        g.a(new gkk(this, gdq1));
    }

    public void a(kws kws1, gds gds)
    {
        g.a(kws1, new gkl(this, gds));
    }

    public Map b()
    {
        return Collections.unmodifiableMap(c);
    }

    public void b(gdq gdq1)
    {
        d.remove(gdq1);
    }

    public void b(kws kws1, gds gds)
    {
        g.b(kws1, new gkm(this, gds));
    }

    public void c(kws kws1, gds gds)
    {
        g.c(kws1, new gkn(this, kws1, gds));
    }
}
