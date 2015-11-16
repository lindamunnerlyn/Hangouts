// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.Executor;

public final class inh
    implements kxx
{

    private final kxx a;
    private final kxx b;
    private final kxx c;
    private final kxx d;

    public inh(kxx kxx1, kxx kxx2, kxx kxx3, kxx kxx4)
    {
        a = kxx1;
        b = kxx2;
        c = kxx3;
        d = kxx4;
    }

    public Object a()
    {
        return new ine((ilr)a.a(), (gsi)b.a(), (Executor)c.a(), d);
    }
}
