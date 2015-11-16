// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class kmv
{

    private static final klv b = klv.a();
    public volatile kmy a;
    private klp c;
    private klv d;
    private volatile klp e;

    public kmy a(kmy kmy1)
    {
        c(kmy1);
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
            return a.m();
        } else
        {
            return 0;
        }
    }

    public kmy b(kmy kmy1)
    {
        kmy kmy2 = a;
        c = null;
        e = null;
        a = kmy1;
        return kmy2;
    }

    protected void c(kmy kmy1)
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
        kmy1;
        this;
        JVM INSTR monitorexit ;
        throw kmy1;
        if (c == null) goto _L2; else goto _L1
_L1:
        a = (kmy)kmy1.c().c(c, d);
        e = c;
        c = null;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a = kmy1;
        e = klp.a;
        c = null;
          goto _L3
        kmr kmr1;
        kmr1;
        a = kmy1;
        e = klp.a;
        c = null;
          goto _L3
    }

}
