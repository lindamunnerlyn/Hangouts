// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

public abstract class ea extends em
{

    volatile eb a;
    volatile eb b;
    long c;
    long d;
    Handler e;
    private final Executor f;

    public ea(Context context)
    {
        this(context, eu.c);
    }

    private ea(Context context, Executor executor)
    {
        super(context);
        d = -10000L;
        f = executor;
    }

    protected void a()
    {
        super.a();
        t();
        a = new eb(this);
        c();
    }

    void a(eb eb1, Object obj)
    {
        a(obj);
        if (b == eb1)
        {
            A();
            d = SystemClock.uptimeMillis();
            b = null;
            m();
            c();
        }
    }

    public void a(Object obj)
    {
    }

    public void a(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        super.a(s, filedescriptor, printwriter, as);
        if (a != null)
        {
            printwriter.print(s);
            printwriter.print("mTask=");
            printwriter.print(a);
            printwriter.print(" waiting=");
            printwriter.println(a.a);
        }
        if (b != null)
        {
            printwriter.print(s);
            printwriter.print("mCancellingTask=");
            printwriter.print(b);
            printwriter.print(" waiting=");
            printwriter.println(b.a);
        }
        if (c != 0L)
        {
            printwriter.print(s);
            printwriter.print("mUpdateThrottle=");
            ho.a(c, printwriter);
            printwriter.print(" mLastLoadCompleteTime=");
            ho.a(d, SystemClock.uptimeMillis(), printwriter);
            printwriter.println();
        }
    }

    void b(eb eb1, Object obj)
    {
        if (a != eb1)
        {
            a(eb1, obj);
            return;
        }
        if (q())
        {
            a(obj);
            return;
        } else
        {
            z();
            d = SystemClock.uptimeMillis();
            a = null;
            b(obj);
            return;
        }
    }

    protected boolean b()
    {
label0:
        {
            if (a != null)
            {
                if (b == null)
                {
                    break label0;
                }
                if (a.a)
                {
                    a.a = false;
                    e.removeCallbacks(a);
                }
                a = null;
            }
            return false;
        }
        if (a.a)
        {
            a.a = false;
            e.removeCallbacks(a);
            a = null;
            return false;
        }
        boolean flag = ((eu) (a)).e.cancel(false);
        if (flag)
        {
            b = a;
            f();
        }
        a = null;
        return flag;
    }

    void c()
    {
        eb eb1;
        Executor executor;
label0:
        {
            if (b == null && a != null)
            {
                if (a.a)
                {
                    a.a = false;
                    e.removeCallbacks(a);
                }
                if (c <= 0L || SystemClock.uptimeMillis() >= d + c)
                {
                    break label0;
                }
                a.a = true;
                e.postAtTime(a, d + c);
            }
            return;
        }
        eb1 = a;
        executor = f;
        if (((eu) (eb1)).f == fb.a) goto _L2; else goto _L1
_L1:
        ey.a[((eu) (eb1)).f - 1];
        JVM INSTR tableswitch 1 2: default 152
    //                   1 178
    //                   2 188;
           goto _L2 _L3 _L4
_L2:
        eb1.f = fb.b;
        ((eu) (eb1)).d.b = null;
        executor.execute(((eu) (eb1)).e);
        return;
_L3:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
_L4:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    }

    public abstract Object d();

    protected Object e()
    {
        return d();
    }

    public void f()
    {
    }

    public boolean g()
    {
        return b != null;
    }
}
