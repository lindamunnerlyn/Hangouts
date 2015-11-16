// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public class ldv extends lds
    implements Serializable, ldp
{

    private static final long serialVersionUID = 0x259193af48eL;
    private volatile long a;

    public ldv(long l)
    {
        a = 0L;
    }

    public ldv(ldq ldq, ldq ldq1)
    {
        if (ldq == ldq1)
        {
            a = 0L;
            return;
        } else
        {
            long l = ldb.a(ldq);
            a = h.a(ldb.a(ldq1), -l);
            return;
        }
    }

    public long a()
    {
        return a;
    }
}
