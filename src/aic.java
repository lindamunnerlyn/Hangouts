// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collections;
import java.util.Map;

public final class aic extends afw
{

    private static final Object i = new Object();
    public final edt e;
    public String f;
    public Long g;
    private final agc h;

    public aic(edt edt1, agc agc1, agb agb)
    {
        super(edt1.t(), agb);
        g = null;
        a(new age(1000, 2, 2.0F));
        h = agc1;
        e = edt1;
        f = null;
        if (e.o() != null)
        {
            edt1 = ccv.a(cvv.f);
            try
            {
                f = edt1.a(e.o());
            }
            // Misplaced declaration of an exception variable
            catch (agc agc1)
            {
                eev.e("Babel", "Error getting auth token", agc1);
            }
            if (f != null)
            {
                g = edt1.c(f);
            }
        }
    }

    protected aga a(aft aft1)
    {
        Object obj = i;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        obj1 = new afl();
        obj1.a = aft1.b;
        obj1.g = aft1.c;
        obj1.e = 0x7fffffffffffffffL;
        obj1.f = 0x7fffffffffffffffL;
        obj1.c = System.currentTimeMillis();
        OutOfMemoryError outofmemoryerror;
        boolean flag;
        if (aft1.c.get("VolleyDiskCache") != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = new aga(new dpm(aft1.b, (String)aft1.c.get("Content-Type"), flag), ((afl) (obj1)));
        obj;
        JVM INSTR monitorexit ;
        return ((aga) (obj1));
        outofmemoryerror;
        int j = aft1.b.length;
        aft1 = String.valueOf(c());
        eev.g("Babel", (new StringBuilder(String.valueOf(aft1).length() + 43)).append("Caught OOM for ").append(j).append(" byte media, url=").append(aft1).toString());
        aft1 = aga.a(new afv(outofmemoryerror));
        obj;
        JVM INSTR monitorexit ;
        return aft1;
        aft1;
        obj;
        JVM INSTR monitorexit ;
        throw aft1;
    }

    protected void a(Object obj)
    {
        obj = (dpm)obj;
        h.a(obj);
    }

    public Map g()
    {
        if (f != null)
        {
            gz gz1 = new gz();
            String s = String.valueOf(f);
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

    public afy l()
    {
        return afy.a;
    }

}
