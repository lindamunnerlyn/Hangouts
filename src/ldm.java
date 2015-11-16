// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class ldm extends ldt
    implements Serializable, ldq
{

    private static final long serialVersionUID = 0x2dc8bed0c60e9ccdL;
    private final long a;

    public ldm()
    {
        a = ldb.a();
    }

    public ldm(long l)
    {
        a = l;
    }

    public static ldm a()
    {
        return new ldm();
    }

    public long b()
    {
        return a;
    }

    public lcw c()
    {
        return lep.L();
    }
}
