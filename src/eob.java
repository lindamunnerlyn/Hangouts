// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class eob
    implements enb, end
{

    final enq a;

    eob(enq enq1)
    {
        a = enq1;
        super();
    }

    public void a(int i)
    {
    }

    public void a(ConnectionResult connectionresult)
    {
        a.b.lock();
        if (!a.a(connectionresult)) goto _L2; else goto _L1
_L1:
        a.i();
        a.h();
_L4:
        a.b.unlock();
        return;
_L2:
        a.b(connectionresult);
        if (true) goto _L4; else goto _L3
_L3:
        connectionresult;
        a.b.unlock();
        throw connectionresult;
    }

    public void a_(Bundle bundle)
    {
        a.d.a(new enu(a));
    }
}
