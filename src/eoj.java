// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class eoj
    implements end
{

    final emt a;
    final int b;
    final eof c;

    eoj(eof eof1, emt emt, int i)
    {
        c = eof1;
        a = emt;
        b = i;
        super();
    }

    public void a(ConnectionResult connectionresult)
    {
        c.a.lock();
        c.k.a(connectionresult, a, b);
        c.a.unlock();
        return;
        connectionresult;
        c.a.unlock();
        throw connectionresult;
    }
}
