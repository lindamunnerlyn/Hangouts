// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public final class lpu extends lni
    implements Serializable
{

    private static HashMap a;
    private static final long serialVersionUID = 0xe526dad19bd069d1L;
    private final lnj b;
    private final lnr c;

    private lpu(lnj lnj1, lnr lnr1)
    {
        if (lnj1 == null || lnr1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            b = lnj1;
            c = lnr1;
            return;
        }
    }

    public static lpu a(lnj lnj1, lnr lnr1)
    {
        lpu;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new HashMap(7);
        lpu lpu1 = null;
_L4:
        lpu lpu2;
        lpu2 = lpu1;
        if (lpu1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        lpu2 = new lpu(lnj1, lnr1);
        a.put(lnj1, lpu2);
        lpu;
        JVM INSTR monitorexit ;
        return lpu2;
_L2:
        lpu2 = (lpu)a.get(lnj1);
        lpu1 = lpu2;
        if (lpu2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        lnr lnr2 = lpu2.d();
        lpu1 = lpu2;
        if (lnr2 != lnr1)
        {
            lpu1 = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        lnj1;
        throw lnj1;
    }

    private UnsupportedOperationException i()
    {
        String s = String.valueOf(b);
        return new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 21)).append(s).append(" field is unsupported").toString());
    }

    private Object readResolve()
    {
        return a(b, c);
    }

    public int a(long l)
    {
        throw i();
    }

    public int a(Locale locale)
    {
        throw i();
    }

    public long a(long l, int j)
    {
        return d().a(l, j);
    }

    public long a(long l, long l1)
    {
        return d().a(l, l1);
    }

    public long a(long l, String s, Locale locale)
    {
        throw i();
    }

    public String a(int j, Locale locale)
    {
        throw i();
    }

    public String a(long l, Locale locale)
    {
        throw i();
    }

    public lnj a()
    {
        return b;
    }

    public long b(long l, int j)
    {
        throw i();
    }

    public String b()
    {
        return b.x();
    }

    public String b(int j, Locale locale)
    {
        throw i();
    }

    public String b(long l, Locale locale)
    {
        throw i();
    }

    public boolean b(long l)
    {
        throw i();
    }

    public int c(long l)
    {
        throw i();
    }

    public boolean c()
    {
        return false;
    }

    public long d(long l)
    {
        throw i();
    }

    public lnr d()
    {
        return c;
    }

    public long e(long l)
    {
        throw i();
    }

    public lnr e()
    {
        return null;
    }

    public long f(long l)
    {
        throw i();
    }

    public lnr f()
    {
        return null;
    }

    public int g()
    {
        throw i();
    }

    public long g(long l)
    {
        throw i();
    }

    public int h()
    {
        throw i();
    }

    public long h(long l)
    {
        throw i();
    }

    public long i(long l)
    {
        throw i();
    }

    public String toString()
    {
        return "UnsupportedDateTimeField";
    }
}
