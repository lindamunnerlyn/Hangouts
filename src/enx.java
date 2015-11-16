// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class enx
    implements enc
{

    private final WeakReference a;
    private final emt b;
    private final int c;

    public enx(enq enq1, emt emt, int i)
    {
        a = new WeakReference(enq1);
        b = emt;
        c = i;
    }

    public void a(ConnectionResult connectionresult)
    {
        enq enq1;
        boolean flag = false;
        enq1 = (enq)a.get();
        if (enq1 == null)
        {
            return;
        }
        if (Looper.myLooper() == enq1.a.a())
        {
            flag = true;
        }
        g.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        enq1.b.lock();
        boolean flag1 = enq1.b(0);
        if (!flag1)
        {
            enq1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            enq1.b(connectionresult, b, c);
        }
        if (enq1.e())
        {
            enq1.f();
        }
        enq1.b.unlock();
        return;
        connectionresult;
        enq1.b.unlock();
        throw connectionresult;
    }

    public void b(ConnectionResult connectionresult)
    {
        enq enq1;
        boolean flag = true;
        enq1 = (enq)a.get();
        if (enq1 == null)
        {
            return;
        }
        if (Looper.myLooper() != enq1.a.a())
        {
            flag = false;
        }
        g.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        enq1.b.lock();
        flag = enq1.b(1);
        if (!flag)
        {
            enq1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            enq1.b(connectionresult, b, c);
        }
        if (enq1.e())
        {
            enq1.g();
        }
        enq1.b.unlock();
        return;
        connectionresult;
        enq1.b.unlock();
        throw connectionresult;
    }
}
