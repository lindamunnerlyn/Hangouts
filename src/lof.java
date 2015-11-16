// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public class lof extends loc
    implements Serializable, lnz
{

    private static final long serialVersionUID = 0x259193af48eL;
    private volatile long a;

    public lof(long l)
    {
        a = 0L;
    }

    public lof(loa loa, loa loa1)
    {
        if (loa == loa1)
        {
            a = 0L;
            return;
        } else
        {
            long l = lnl.a(loa);
            a = h.a(lnl.a(loa1), -l);
            return;
        }
    }

    public long a()
    {
        return a;
    }
}
