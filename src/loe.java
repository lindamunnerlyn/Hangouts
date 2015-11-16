// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public class loe extends lob
    implements Serializable, loa
{

    private static final long serialVersionUID = 0xfffff9e14f5d2ea3L;
    private volatile long a;
    private volatile lng b;

    public loe()
    {
        this(lnl.a(), ((lng) (loz.M())));
    }

    private loe(long l, lng lng)
    {
        b = a(lng);
        lng = b;
        a = b(l);
    }

    public loe(long l, lnn lnn)
    {
        this(0L, ((lng) (loz.b(lnn))));
    }

    public long a()
    {
        return a;
    }

    protected lng a(lng lng)
    {
        return lnl.a(lng);
    }

    public void a(long l)
    {
        lng lng = b;
        a = b(l);
    }

    protected long b(long l)
    {
        return l;
    }

    public lng b()
    {
        return b;
    }
}
