// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.HashMap;

public final class lpv extends lnr
    implements Serializable
{

    private static HashMap a;
    private static final long serialVersionUID = 0xa75116d2889f80d3L;
    private final lns b;

    private lpv(lns lns1)
    {
        b = lns1;
    }

    public static lpv a(lns lns1)
    {
        lpv;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        a = new HashMap(7);
        lpv lpv1 = null;
_L4:
        lpv lpv2;
        lpv2 = lpv1;
        if (lpv1 != null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        lpv2 = new lpv(lns1);
        a.put(lns1, lpv2);
        lpv;
        JVM INSTR monitorexit ;
        return lpv2;
_L2:
        lpv1 = (lpv)a.get(lns1);
        if (true) goto _L4; else goto _L3
_L3:
        lns1;
        throw lns1;
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

    public final lns a()
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
            if (obj instanceof lpv)
            {
                obj = (lpv)obj;
                if (((lpv) (obj)).b.m() == null)
                {
                    if (b.m() != null)
                    {
                        return false;
                    }
                } else
                {
                    return ((lpv) (obj)).b.m().equals(b.m());
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
        String s = String.valueOf(b.m());
        return (new StringBuilder(String.valueOf(s).length() + 26)).append("UnsupportedDurationField[").append(s).append("]").toString();
    }
}
