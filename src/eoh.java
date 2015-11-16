// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

final class eoh
    implements enb
{

    final eof a;

    eoh(eof eof1)
    {
        a = eof1;
        super();
    }

    public void a(int i)
    {
        a.a.lock();
        a.k.a(i);
        a.a.unlock();
        return;
        Exception exception;
        exception;
        a.a.unlock();
        throw exception;
    }

    public void a_(Bundle bundle)
    {
        a.a.lock();
        a.k.a(bundle);
        a.a.unlock();
        return;
        bundle;
        a.a.unlock();
        throw bundle;
    }
}
