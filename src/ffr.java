// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class ffr
{

    private static final String a = ffr.getSimpleName();
    private static final long b;
    private static ffr c;
    private final Context d;
    private final Handler e;
    private final Runnable f;
    private final Object g;
    private ArrayList h;
    private ArrayList i;

    private ffr(Context context)
    {
        this((Context)h.a(context), new Handler(Looper.getMainLooper()));
    }

    private ffr(Context context, Handler handler)
    {
        f = new ffs(this);
        g = new Object();
        h = null;
        i = null;
        d = context;
        e = handler;
    }

    public static ffr a(Context context)
    {
        ffr;
        JVM INSTR monitorenter ;
        int j;
        h.a(context);
        j = android.os.Build.VERSION.SDK_INT;
        if (j >= 14) goto _L2; else goto _L1
_L1:
        context = null;
_L4:
        ffr;
        JVM INSTR monitorexit ;
        return context;
_L2:
        if (c == null)
        {
            c = new ffr(context.getApplicationContext());
        }
        context = c;
        if (true) goto _L4; else goto _L3
_L3:
        context;
        throw context;
    }

    static Object a(ffr ffr1)
    {
        return ffr1.g;
    }

    static ArrayList b(ffr ffr1)
    {
        return ffr1.h;
    }

    static ArrayList c(ffr ffr1)
    {
        return ffr1.i;
    }

    static Context d(ffr ffr1)
    {
        return ffr1.d;
    }

    static ArrayList e(ffr ffr1)
    {
        ffr1.h = null;
        return null;
    }

    static ArrayList f(ffr ffr1)
    {
        ffr1.i = null;
        return null;
    }

    public void a(String s, String s1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (h == null)
        {
            h = new ArrayList();
            i = new ArrayList();
            e.postDelayed(f, b);
        }
        h.add(s);
        i.add(s1);
        if (h.size() >= 10000)
        {
            f.run();
            e.removeCallbacks(f);
            return;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(1L);
    }
}
