// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dcx
{

    private static final boolean a = false;
    private static final String b[] = {
        "Uninit", "RegSent", "Registered", "RegFailed"
    };
    private static volatile dcx h = null;
    private String c;
    private volatile int d;
    private long e;
    private List f;
    private volatile int g;

    private dcx()
    {
        f = new ArrayList();
        SharedPreferences sharedpreferences = g.nS.getSharedPreferences("gcm", 0);
        c = sharedpreferences.getString("gcm_registration_id", null);
        d = sharedpreferences.getInt("gcm_registration_state", 100);
        g = sharedpreferences.getInt("gcm_retry_strategy", 0);
        e = sharedpreferences.getLong("gcm_android_id", -1L);
    }

    public static long a()
    {
        dcx dcx1;
        dcx1 = h;
        if (dcx1 == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        dcx1;
        JVM INSTR monitorenter ;
        long l = dcx1.e;
        dcx1;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        dcx1;
        JVM INSTR monitorexit ;
        throw exception;
        return 0L;
    }

    private void a(int l)
    {
        if (ebw.a("Babel", 3))
        {
            ebw.c("Babel", (new StringBuilder(46)).append("GcmRegistration: set retryStrategy=").append(l).toString());
        }
        g = l;
        android.content.SharedPreferences.Editor editor = g.nS.getSharedPreferences("gcm", 0).edit();
        editor.putInt("gcm_retry_strategy", g);
        editor.apply();
    }

    public static void a(PrintWriter printwriter)
    {
        if (h == null)
        {
            printwriter.println("GCM Registration not inited");
            return;
        }
        synchronized (c())
        {
            String s = b(dcx1.d);
            String s1 = dcx1.c;
            printwriter.println((new StringBuilder(String.valueOf(s).length() + 31 + String.valueOf(s1).length())).append("GCM Registration state: ").append(s).append(", reg: ").append(s1).toString());
        }
        return;
        printwriter;
        dcx1;
        JVM INSTR monitorexit ;
        throw printwriter;
    }

    private void a(String s, int l)
    {
        c = s;
        d = l;
        s = g.nS.getSharedPreferences("gcm", 0).edit();
        s.putLong("gcm_android_id", e);
        s.putString("gcm_registration_id", c);
        s.putInt("gcm_registration_state", d);
        s.apply();
    }

    private static String b(int l)
    {
        if (l >= 100 && l <= 103)
        {
            return b[l - 100];
        } else
        {
            return Integer.toString(l);
        }
    }

    public static void b()
    {
        dcx;
        JVM INSTR monitorenter ;
        if (a)
        {
            ebw.b("Babel", "Initializing GcmRegistration");
        }
        if (h == null) goto _L2; else goto _L1
_L1:
        ebw.f("Babel", "GcmRegistration.initialize() called twice");
_L4:
        dcx;
        JVM INSTR monitorexit ;
        return;
_L2:
        dcx dcx1 = new dcx();
        h = dcx1;
        dcx1;
        JVM INSTR monitorenter ;
        h.k();
        dcx1;
        JVM INSTR monitorexit ;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception1;
        exception1;
        dcx1;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        dcx;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static dcx c()
    {
        if (h == null)
        {
            ebw.g("Babel", "GcmRegistration.initialize() should be called called first");
        }
        return h;
    }

    public static void i()
    {
        synchronized (c())
        {
            if (dcx1.d == 102)
            {
                ebw.c("Babel", "GcmRegistration: Forcing re-registration");
                dcx1.a(null, 100);
                dcx1.k();
            }
        }
        return;
        exception;
        dcx1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void j()
    {
        synchronized (c())
        {
            if (dcx1.d == 102 && dcx1.e != dzk.a())
            {
                ebw.f("Babel", "Android Id mismatch. Force new GcmRegistration");
                dcx1.a(null, 100);
                dcx1.k();
            }
        }
        return;
        exception;
        dcx1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean k()
    {
        boolean flag = true;
        byte byte0 = 1;
        ebw.c("Babel", "GcmRegistration: Checking GCM registration");
        if (d != 102)
        {
            ebw.c("Babel", "GcmRegistration: Requesting GCM registration");
            dbf.q();
            if (dbf.s())
            {
                byte0 = 2;
            }
            a(byte0);
            e = dzk.a();
            GcmIntentService.b();
            d = 101;
            flag = false;
        }
        return flag;
    }

    public void a(Runnable runnable)
    {
        f.add(runnable);
        this;
        JVM INSTR monitorenter ;
        if (d == 102)
        {
            runnable.run();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        runnable;
        this;
        JVM INSTR monitorexit ;
        throw runnable;
    }

    public void a(String s)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        long l1;
        if (d != 101)
        {
            String s1 = String.valueOf("Setting GCM registration. Expected,Actual state=101,");
            int l = d;
            ebw.f("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(l).toString());
        }
        l1 = dzk.a();
        if (e != l1) goto _L2; else goto _L1
_L1:
        a(s, 102);
        a(0);
_L3:
        this;
        JVM INSTR monitorexit ;
        if (!flag)
        {
            ebw.f("Babel", "Ignoring GCM registration due to android_id mismatch. Retrying");
            h();
        } else
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Start registration for accounts on the device with registration string ".concat(s);
            } else
            {
                s = new String("Start registration for accounts on the device with registration string ");
            }
            ebw.e("Babel", s);
            dbf.o();
            s = (new ArrayList(f)).iterator();
            while (s.hasNext()) 
            {
                ((Runnable)s.next()).run();
            }
        }
        return;
_L2:
        a(null, 103);
        flag = false;
          goto _L3
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void b(Runnable runnable)
    {
        f.remove(runnable);
    }

    public boolean d()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == 102)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean e()
    {
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d == 103 || d == 100)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String f()
    {
        this;
        JVM INSTR monitorenter ;
        if (d == 102)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        String s = String.valueOf("Getting GCM registcd pration. Expected,Actual state=102,");
        int l = d;
        ebw.g("Babel", (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(l).toString());
        this;
        JVM INSTR monitorexit ;
        return null;
        String s1 = c;
        this;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        if (g == 1)
        {
            a(0);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        if (ebw.a("Babel", 3))
        {
            String s = String.valueOf(b(d));
            if (s.length() != 0)
            {
                s = "Retry GcmRegistration. Current state: ".concat(s);
            } else
            {
                s = new String("Retry GcmRegistration. Current state: ");
            }
            ebw.c("Babel", s);
        }
        this;
        JVM INSTR monitorenter ;
        if (d != 101)
        {
            d = 101;
            e = dzk.a();
            GcmIntentService.b();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
