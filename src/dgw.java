// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.os.Handler;

public abstract class dgw extends Service
{

    private static final boolean a = false;
    private final Handler b = new Handler();
    private int c;
    private boolean d;
    private int e;
    private final Object f = new Object();
    private final Runnable g = new dgx(this);

    public dgw()
    {
        c = 0;
        d = true;
        e = 0;
    }

    static Object a(dgw dgw1)
    {
        return dgw1.f;
    }

    static int b(dgw dgw1)
    {
        return dgw1.c;
    }

    static int c(dgw dgw1)
    {
        return dgw1.e;
    }

    static boolean i()
    {
        return a;
    }

    public abstract int a();

    public String a(String s)
    {
        String s1 = String.valueOf(getClass().getName());
        int j = c;
        int k = e;
        boolean flag = d;
        return (new StringBuilder(String.valueOf(s1).length() + 75 + String.valueOf(s).length())).append("RefCountedService(").append(s1).append(") ").append(s).append(" (count=").append(j).append(", startId=").append(k).append(" stopped=").append(flag).append(")").toString();
    }

    public void a(int j)
    {
        synchronized (f)
        {
            e = j;
            if (a)
            {
                ebw.b("Babel", a("Retain w/ startId"));
            }
            h();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void d()
    {
        d = true;
    }

    public void h()
    {
        gbh.a();
        if (!w_())
        {
            ebw.g("Babel", a("Retain Failed"));
            throw new IllegalStateException();
        } else
        {
            return;
        }
    }

    public void onCreate()
    {
        super.onCreate();
        synchronized (f)
        {
            gbh.a(Integer.valueOf(0), Integer.valueOf(c));
            d = false;
            b.postDelayed(g, a());
            if (a)
            {
                ebw.b("Babel", a("onCreate"));
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (a)
        {
            ebw.b("Babel", a("onDestroy"));
        }
    }

    public boolean w_()
    {
label0:
        {
            synchronized (f)
            {
                if (!d)
                {
                    break label0;
                }
                if (a)
                {
                    ebw.b("Babel", a("Retain failed."));
                }
            }
            return false;
        }
        c = c + 1;
        if (a)
        {
            ebw.b("Babel", a("Retain"));
        }
        b.removeCallbacks(g);
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void x_()
    {
        synchronized (f)
        {
            c = c - 1;
            if (a)
            {
                ebw.b("Babel", a("Release"));
            }
            if (c < 0)
            {
                ebw.g("Babel", a("Negative service count"));
            }
            if (c == 0)
            {
                if (a)
                {
                    ebw.b("Babel", a("Idle"));
                }
                b.postDelayed(g, a());
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
