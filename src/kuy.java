// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class kuy
{

    private static final kty b = kty.a();
    public volatile kvb a;
    private kts c;
    private kty d;
    private volatile kts e;

    public kvb a(kvb kvb1)
    {
        c(kvb1);
        return a;
    }

    public int b()
    {
        if (c != null)
        {
            return c.a();
        }
        if (e != null)
        {
            return e.a();
        }
        if (a != null)
        {
            return a.n();
        } else
        {
            return 0;
        }
    }

    public kvb b(kvb kvb1)
    {
        kvb kvb2 = a;
        c = null;
        e = null;
        a = kvb1;
        return kvb2;
    }

    protected void c(kvb kvb1)
    {
        if (a != null)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        kvb1;
        this;
        JVM INSTR monitorexit ;
        throw kvb1;
        if (c == null) goto _L2; else goto _L1
_L1:
        a = (kvb)kvb1.c().c(c, d);
        e = c;
        c = null;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = kvb1;
        e = kts.a;
        c = null;
          goto _L3
        kuu kuu1;
        kuu1;
        a = kvb1;
        e = kts.a;
        c = null;
          goto _L3
    }

}
