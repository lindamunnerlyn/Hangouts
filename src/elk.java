// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.locks.Lock;

abstract class elk
{

    private final elo a;

    protected elk(elo elo)
    {
        a = elo;
    }

    protected abstract void a();

    public final void a(ele ele1)
    {
        ele1.a.lock();
        elo elo;
        elo elo1;
        elo = ele1.k;
        elo1 = a;
        if (elo != elo1)
        {
            ele1.a.unlock();
            return;
        }
        a();
        ele1.a.unlock();
        return;
        Exception exception;
        exception;
        ele1.a.unlock();
        throw exception;
    }
}
