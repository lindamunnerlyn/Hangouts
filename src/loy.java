// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.ConcurrentHashMap;

public final class loy extends loo
{

    private static final loy k;
    private static final ConcurrentHashMap l = new ConcurrentHashMap();
    private static final long serialVersionUID = 0xf40baa8c7e176bc6L;

    private loy(lng lng1, int i)
    {
        super(lng1, null, i);
    }

    public static loy V()
    {
        return k;
    }

    private static loy a(lnn lnn1, int i)
    {
        Object obj;
        lnn lnn2;
        Object obj1;
        lnn2 = lnn1;
        if (lnn1 == null)
        {
            lnn2 = lnn.a();
        }
        lnn1 = (loy[])l.get(lnn2);
        if (lnn1 == null)
        {
            lnn1 = new loy[7];
            loy aloy[] = (loy[])l.putIfAbsent(lnn2, lnn1);
            if (aloy != null)
            {
                lnn1 = aloy;
            }
        }
        obj1 = lnn1[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        lnn1;
        JVM INSTR monitorenter ;
        obj1 = lnn1[i - 1];
        obj = obj1;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        if (lnn2 != lnn.a) goto _L6; else goto _L5
_L5:
        obj = new loy(null, i);
          goto _L7
_L4:
        lnn1;
        JVM INSTR monitorexit ;
_L2:
        return ((loy) (obj));
_L6:
        obj = new loy(lpc.a(a(lnn.a, i), lnn2), i);
          goto _L7
        obj;
        lnn1;
        JVM INSTR monitorexit ;
        throw obj;
_L7:
        lnn1[i - 1] = obj;
        if (true) goto _L4; else goto _L8
_L8:
    }

    private Object readResolve()
    {
        lng lng1 = super.a;
        int j = L();
        int i = j;
        if (j == 0)
        {
            i = 4;
        }
        if (lng1 == null)
        {
            return a(lnn.a, i);
        } else
        {
            return a(lng1.a(), i);
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

    public lng a(lnn lnn1)
    {
        lnn lnn2 = lnn1;
        if (lnn1 == null)
        {
            lnn2 = lnn.a();
        }
        if (lnn2 == a())
        {
            return this;
        } else
        {
            return a(lnn2, 4);
        }
    }

    public volatile lnn a()
    {
        return super.a();
    }

    protected void a(loh loh)
    {
        if (super.a == null)
        {
            super.a(loh);
        }
    }

    public lng b()
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
        k = a(lnn.a, 4);
    }
}
