// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public final class fck
{

    private static final ComponentName a = new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.http.GoogleHttpService");
    private final enm b;
    private ServiceConnection c;
    private volatile fcm d;
    private int e;
    private CountDownLatch f;
    private Context g;
    private boolean h;

    public fck(Context context)
    {
        g = context;
        f = new CountDownLatch(1);
        b = enm.a(g);
        e = 0;
        h = false;
        c = new fcl(this);
    }

    static fcm a(fck fck1, fcm fcm1)
    {
        fck1.d = fcm1;
        return fcm1;
    }

    static CountDownLatch a(fck fck1)
    {
        return fck1.f;
    }

    private boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = e;
        e = i + 1;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        h = b.a(a, c, "GoogleHttpServiceClient");
        boolean flag = h;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        i = e - 1;
        e = i;
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b.b(a, c, "GoogleHttpServiceClient");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public Bundle a(String s)
    {
        Bundle bundle;
        bundle = null;
        if (!a())
        {
            b();
            return null;
        }
        if (d == null && Looper.getMainLooper().getThread() != Thread.currentThread() && !f.await(500L, TimeUnit.MILLISECONDS))
        {
            new Throwable();
            f.countDown();
        }
        if (d != null)
        {
            bundle = d.a(s);
        }
        b();
        return bundle;
        s;
        b();
        return null;
        s;
        (new StringBuilder("Interrupted waiting for binder: ")).append(s);
        b();
        return null;
        s;
        b();
        throw s;
    }

    public void a(String s, int i)
    {
        if (!a())
        {
            b();
            return;
        }
        if (d != null && i > 0)
        {
            try
            {
                d.a(s, i);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                b();
                return;
            }
            finally
            {
                b();
            }
        }
        b();
        return;
        throw s;
    }

}
