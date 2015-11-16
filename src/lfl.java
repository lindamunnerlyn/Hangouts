// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;

public final class lfl extends ldh
    implements Serializable
{

    private static HashMap a;
    private static final long serialVersionUID = 0xa75116d2889f80d3L;
    private final ldi b;

    private lfl(ldi ldi1)
    {
        b = ldi1;
    }

    public static lfl a(ldi ldi1)
    {
        lfl;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new HashMap(7);
        lfl lfl1 = null;
_L4:
        lfl lfl2;
        lfl2 = lfl1;
        if (lfl1 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        lfl2 = new lfl(ldi1);
        a.put(ldi1, lfl2);
        lfl;
        JVM INSTR monitorexit ;
        return lfl2;
_L2:
        lfl1 = (lfl)a.get(ldi1);
        if (true) goto _L4; else goto _L3
_L3:
        ldi1;
        throw ldi1;
    }

    private UnsupportedOperationException e()
    {
        String s = String.valueOf(b);
        return new UnsupportedOperationException((new StringBuilder(String.valueOf(s).length() + 21)).append(s).append(" field is unsupported").toString());
    }

    private Object readResolve()
    {
        return a(b);
    }

    public long a(long l, int i)
    {
        throw e();
    }

    public long a(long l, long l1)
    {
        throw e();
    }

    public final ldi a()
    {
        return b;
    }

    public boolean b()
    {
        return false;
    }

    public boolean c()
    {
        return true;
    }

    public volatile int compareTo(Object obj)
    {
        return 0;
    }

    public long d()
    {
        return 0L;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof lfl)
            {
                obj = (lfl)obj;
                if (((lfl) (obj)).b.m() == null)
                {
                    if (b.m() != null)
                    {
                        return false;
                    }
                } else
                {
                    return ((lfl) (obj)).b.m().equals(b.m());
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return b.m().hashCode();
    }

    public String toString()
    {
        String s = b.m();
        return (new StringBuilder(String.valueOf(s).length() + 26)).append("UnsupportedDurationField[").append(s).append("]").toString();
    }
}
