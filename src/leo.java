// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class leo extends lee
{

    private static final leo k;
    private static final ConcurrentHashMap l = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xf40baa8c7e176bc6L;

    private leo(lcw lcw1, int i)
    {
        super(lcw1, null, i);
    }

    public static leo V()
    {
        return k;
    }

    private static leo a(ldd ldd1, int i)
    {
        Object obj;
        ldd ldd2;
        Object obj1;
        ldd2 = ldd1;
        if (ldd1 == null)
        {
            ldd2 = ldd.a();
        }
        ldd1 = (leo[])l.get(ldd2);
        if (ldd1 == null)
        {
            ldd1 = new leo[7];
            leo aleo[] = (leo[])l.putIfAbsent(ldd2, ldd1);
            if (aleo != null)
            {
                ldd1 = aleo;
            }
        }
        obj1 = ldd1[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ldd1;
        JVM INSTR monitorenter ;
        obj1 = ldd1[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (ldd2 != ldd.a) goto _L6; else goto _L5
_L5:
        obj = new leo(null, i);
          goto _L7
_L4:
        ldd1;
        JVM INSTR monitorexit ;
_L2:
        return ((leo) (obj));
_L6:
        obj = new leo(les.a(a(ldd.a, i), ldd2), i);
          goto _L7
        obj;
        ldd1;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        ldd1[i - 1] = obj;
        if (true) goto _L4; else goto _L8
_L8:
    }

    private Object readResolve()
    {
        lcw lcw1 = super.a;
        int j = L();
        int i = j;
        if (j == 0)
        {
            i = 4;
        }
        if (lcw1 == null)
        {
            return a(ldd.a, i);
        } else
        {
            return a(lcw1.a(), i);
        }
    }

    public volatile int L()
    {
        return super.L();
    }

    int O()
    {
        return 0xee943c92;
    }

    int P()
    {
        return 0x116bd2d1;
    }

    long R()
    {
        return 0x758f0dfc0L;
    }

    long S()
    {
        return 0x9cbebd50L;
    }

    public lcw a(ldd ldd1)
    {
        ldd ldd2 = ldd1;
        if (ldd1 == null)
        {
            ldd2 = ldd.a();
        }
        if (ldd2 == a())
        {
            return this;
        } else
        {
            return a(ldd2, 4);
        }
    }

    public volatile ldd a()
    {
        return super.a();
    }

    protected void a(ldx ldx)
    {
        if (super.a == null)
        {
            super.a(ldx);
        }
    }

    public lcw b()
    {
        return k;
    }

    boolean e(int i)
    {
        return (i & 3) == 0 && (i % 100 != 0 || i % 400 == 0);
    }

    public volatile boolean equals(Object obj)
    {
        return super.equals(obj);
    }

    long f(int i)
    {
        int j = i / 100;
        if (i >= 0) goto _L2; else goto _L1
_L1:
        j = ((j + 3 >> 2) + ((i + 3 >> 2) - j)) - 1;
_L4:
        long l1 = i;
        return ((long)(j - 0xafaa7) + l1 * 365L) * 0x5265c00L;
_L2:
        int i1 = (j >> 2) + ((i >> 2) - j);
        j = i1;
        if (e(i))
        {
            j = i1 - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile int hashCode()
    {
        return super.hashCode();
    }

    public volatile String toString()
    {
        return super.toString();
    }

    static 
    {
        k = a(ldd.a, 4);
    }
}
