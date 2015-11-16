// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class ekw
    implements ekb
{

    private final WeakReference a;
    private final ejs b;
    private final int c;

    public ekw(ekp ekp1, ejs ejs, int i)
    {
        a = new WeakReference(ekp1);
        b = ejs;
        c = i;
    }

    public void a(ConnectionResult connectionresult)
    {
        ekp ekp1;
        boolean flag = false;
        ekp1 = (ekp)a.get();
        if (ekp1 == null)
        {
            return;
        }
        if (Looper.myLooper() == ekp1.a.a())
        {
            flag = true;
        }
        h.a(flag, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        ekp1.b.lock();
        boolean flag1 = ekp1.b(0);
        if (!flag1)
        {
            ekp1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            ekp1.b(connectionresult, b, c);
        }
        if (ekp1.e())
        {
            ekp1.f();
        }
        ekp1.b.unlock();
        return;
        connectionresult;
        ekp1.b.unlock();
        throw connectionresult;
    }

    public void b(ConnectionResult connectionresult)
    {
        ekp ekp1;
        boolean flag = true;
        ekp1 = (ekp)a.get();
        if (ekp1 == null)
        {
            return;
        }
        if (Looper.myLooper() != ekp1.a.a())
        {
            flag = false;
        }
        h.a(flag, "onReportAccountValidation must be called on the GoogleApiClient handler thread");
        ekp1.b.lock();
        flag = ekp1.b(1);
        if (!flag)
        {
            ekp1.b.unlock();
            return;
        }
        if (!connectionresult.b())
        {
            ekp1.b(connectionresult, b, c);
        }
        if (ekp1.e())
        {
            ekp1.g();
        }
        ekp1.b.unlock();
        return;
        connectionresult;
        ekp1.b.unlock();
        throw connectionresult;
    }
}
