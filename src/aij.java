// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

public final class aij extends afu
{

    private static final Object h = new Object();
    public final eap d;
    public String e;
    public Long f;
    private final aga g;

    public aij(eap eap1, aga aga1, afz afz)
    {
        super(eap1.t(), afz);
        f = null;
        a(new agc(1000, 2, 2.0F));
        g = aga1;
        d = eap1;
        e = null;
        if (d.o() != null)
        {
            eap1 = cbq.a(ctr.f);
            try
            {
                e = eap1.a(d.o());
            }
            // Misplaced declaration of an exception variable
            catch (aga aga1)
            {
                ebw.e("Babel", "Error getting auth token", aga1);
            }
            if (e != null)
            {
                f = eap1.c(e);
            }
        }
    }

    protected afy a(afr afr1)
    {
        Object obj = h;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new afj();
        obj1.a = afr1.b;
        obj1.g = afr1.c;
        obj1.e = 0x7fffffffffffffffL;
        obj1.f = 0x7fffffffffffffffL;
        obj1.c = System.currentTimeMillis();
        OutOfMemoryError outofmemoryerror;
        boolean flag;
        if (afr1.c.get("VolleyDiskCache") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new afy(new dms(afr1.b, (String)afr1.c.get("Content-Type"), flag), ((afj) (obj1)));
        obj;
        JVM INSTR monitorexit ;
        return ((afy) (obj1));
        outofmemoryerror;
        int i = afr1.b.length;
        afr1 = String.valueOf(c());
        ebw.g("Babel", (new StringBuilder(String.valueOf(afr1).length() + 43)).append("Caught OOM for ").append(i).append(" byte media, url=").append(afr1).toString());
        afr1 = afy.a(new aft(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return afr1;
        afr1;
        obj;
        JVM INSTR monitorexit ;
        throw afr1;
    }

    protected void a(Object obj)
    {
        obj = (dms)obj;
        g.a(obj);
    }

    public Map g()
    {
        if (e != null)
        {
            gz gz1 = new gz();
            String s = String.valueOf(e);
            if (s.length() != 0)
            {
                s = "Bearer ".concat(s);
            } else
            {
                s = new String("Bearer ");
            }
            gz1.put("Authorization", s);
            return gz1;
        } else
        {
            return Collections.emptyMap();
        }
    }

    public afw l()
    {
        return afw.a;
    }

}
