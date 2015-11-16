// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.locks.Lock;

final class eli
    implements ekc
{

    final ejs a;
    final int b;
    final ele c;

    eli(ele ele1, ejs ejs, int i)
    {
        c = ele1;
        a = ejs;
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
