// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;

public final class lfk extends lcy
    implements Serializable
{

    private static HashMap a;
    private static final long serialVersionUID = 0xe526dad19bd069d1L;
    private final lcz b;
    private final ldh c;

    private lfk(lcz lcz1, ldh ldh1)
    {
        if (lcz1 == null || ldh1 == null)
        {
            throw new IllegalArgumentException();
        } else
        {
            b = lcz1;
            c = ldh1;
            return;
        }
    }

    public static lfk a(lcz lcz1, ldh ldh1)
    {
        lfk;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new HashMap(7);
        lfk lfk1 = null;
_L4:
        lfk lfk2;
        lfk2 = lfk1;
        if (lfk1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        lfk2 = new lfk(lcz1, ldh1);
        a.put(lcz1, lfk2);
        lfk;
        JVM INSTR monitorexit ;
        return lfk2;
_L2:
        lfk2 = (lfk)a.get(lcz1);
        lfk1 = lfk2;
        if (lfk2 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ldh ldh2 = lfk2.d();
        lfk1 = lfk2;
        if (ldh2 != ldh1)
        {
            lfk1 = null;
        }
        if (true) goto _L4; else goto _L3
_L3:
        lcz1;
        throw lcz1;
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

    public lcz a()
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

    public ldh d()
    {
        return c;
    }

    public long e(long l)
    {
        throw i();
    }

    public ldh e()
    {
        return null;
    }

    public long f(long l)
    {
        throw i();
    }

    public ldh f()
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
