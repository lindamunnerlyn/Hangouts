// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class eol
{

    private final eop a;

    protected eol(eop eop)
    {
        a = eop;
    }

    protected abstract void a();

    public final void a(eof eof1)
    {
        eof1.a.lock();
        eop eop;
        eop eop1;
        eop = eof1.k;
        eop1 = a;
        if (eop != eop1)
        {
            eof1.a.unlock();
            return;
        }
        a();
        eof1.a.unlock();
        return;
        Exception exception;
        exception;
        eof1.a.unlock();
        throw exception;
    }
}
