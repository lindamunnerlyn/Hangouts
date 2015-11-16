// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public class ldu extends ldr
    implements Serializable, ldq
{

    private static final long serialVersionUID = 0xfffff9e14f5d2ea3L;
    private volatile long a;
    private volatile lcw b;

    public ldu()
    {
        this(ldb.a(), ((lcw) (lep.M())));
    }

    public ldu(long l)
    {
        this(l, ((lcw) (lep.M())));
    }

    public ldu(long l, lcw lcw)
    {
        b = a(lcw);
        lcw = b;
        a = c(l);
    }

    public ldu(long l, ldd ldd)
    {
        this(0L, ((lcw) (lep.b(ldd))));
    }

    protected lcw a(lcw lcw)
    {
        return ldb.a(lcw);
    }

    public void a(long l)
    {
        lcw lcw = b;
        a = c(l);
    }

    public long b()
    {
        return a;
    }

    protected long c(long l)
    {
        return l;
    }

    public lcw c()
    {
        return b;
    }
}
