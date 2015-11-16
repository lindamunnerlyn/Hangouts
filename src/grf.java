// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class grf
{

    private final Context a;
    private final SparseArray b = new SparseArray();
    private final List c = new ArrayList();
    private final Queue d = new LinkedBlockingQueue();
    private final Handler e = new Handler(Looper.getMainLooper());
    private final gqw f;
    private final gqp g;
    private int h;

    grf(Context context)
    {
        a = context;
        f = new gqw(context, "background_results.bin");
        h = PreferenceManager.getDefaultSharedPreferences(a).getInt("bom_last_listener_id", 0);
        g = (gqp)hgx.a(context, gqp);
    }

    static void a(grf grf1, gqn gqn1, grk grk1)
    {
        String s;
        int i;
        grf1.c.remove(gqn1);
        i = gqn1.i();
        s = gqn1.h();
        if (i != 0) goto _L2; else goto _L1
_L1:
        if (Log.isLoggable("BackgroundTask", 2))
        {
            grf1 = String.valueOf(grk1);
            (new StringBuilder(String.valueOf(s).length() + 36 + String.valueOf(grf1).length())).append("No manager, dropping task result: ").append(s).append(", ").append(grf1);
        }
_L4:
        return;
_L2:
        gqr gqr1 = (gqr)grf1.b.get(i);
        if (gqr1 != null)
        {
            if (gqn1.g())
            {
                if (Log.isLoggable("BackgroundTask", 3))
                {
                    grf1 = String.valueOf(grk1);
                    (new StringBuilder(String.valueOf(s).length() + 50 + String.valueOf(grf1).length())).append("Task is canceled, dropping result from manager: ").append(s).append(", ").append(grf1);
                }
                gqr1.c(s);
                return;
            }
            if (Log.isLoggable("BackgroundTask", 3))
            {
                grf1 = String.valueOf(grk1);
                (new StringBuilder(String.valueOf(s).length() + 34 + String.valueOf(grf1).length())).append("Deliver background task result: ").append(s).append(", ").append(grf1);
            }
            gqr1.a(s, grk1);
            return;
        }
        if (!gqn1.g())
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("BackgroundTask", 3))
        {
            grf1 = String.valueOf(grk1);
            (new StringBuilder(String.valueOf(s).length() + 42 + String.valueOf(grf1).length())).append("Task is canceled, dropping task result: ").append(s).append(", ").append(grf1);
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (grk1.j() == grl.a)
        {
            if (Log.isLoggable("BackgroundTask", 3))
            {
                grf1 = String.valueOf(grk1);
                (new StringBuilder(String.valueOf(s).length() + 24 + String.valueOf(grf1).length())).append("Dropping task result: ").append(s).append(", ").append(grf1);
                return;
            }
        } else
        {
            if (Log.isLoggable("BackgroundTask", 3))
            {
                gqn1 = String.valueOf(grk1);
                (new StringBuilder(String.valueOf(s).length() + 32 + String.valueOf(gqn1).length())).append("Store background task result: ").append(s).append(", ").append(gqn1);
            }
            grk1.i();
            grf1.f.a(i, s, grk1);
            return;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    int a()
    {
        g.w();
        int i = h + 1;
        h = i;
        if (i == 0)
        {
            h = h + 1;
        }
        return h;
    }

    public void a(gqn gqn1, gqr gqr1)
    {
        g.w();
        int i = 0;
        if (gqr1 != null)
        {
            i = gqr1.c();
        }
        gqn1.a(i);
        c.add(gqn1);
        d.add(gqn1);
        g.a();
        if (Log.isLoggable("BackgroundTask", 3))
        {
            gqn1 = gqn1.h();
            (new StringBuilder(String.valueOf(gqn1).length() + 45)).append("Start background task: ").append(gqn1).append(", manager: ").append(i);
        }
    }

    void a(gqn gqn1, grk grk1)
    {
        inn.a(grk1.b, new grg(this, gqn1, grk1)).run();
    }

    public void a(gqr gqr1)
    {
        g.w();
        int k = gqr1.c();
        b.put(k, gqr1);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(29)).append("Register manager: ").append(k);
        }
        String as[] = gqr1.d();
        int l = as.length;
        for (int i = 0; i < l; i++)
        {
            String s = as[i];
            for (int j = gqr1.d(s) - b(gqr1, s); j > 0; j--)
            {
                grk grk1 = f.a(k, s);
                if (Log.isLoggable("BackgroundTask", 4))
                {
                    String s1 = String.valueOf(grk1);
                    (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(s1).length())).append("Deliver saved background task result: ").append(s).append(", ").append(s1);
                }
                gqr1.a(s, grk1);
            }

        }

    }

    public boolean a(gqr gqr1, String s)
    {
        return b(gqr1, s) > 0;
    }

    public int b(gqr gqr1, String s)
    {
        g.w();
        int k = gqr1.c();
        int l = c.size();
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            gqr1 = (gqn)c.get(j);
            if (gqr1.i() == k && gqr1.h().equals(s))
            {
                i++;
            }
        }

        return i;
    }

    public void b(gqr gqr1)
    {
        g.w();
        int i = gqr1.c();
        b.remove(i);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(31)).append("Unregister manager: ").append(i);
        }
    }

    boolean b()
    {
        return !c.isEmpty();
    }

    gqn c()
    {
        return (gqn)d.poll();
    }

    public void c(gqr gqr1)
    {
        int k = gqr1.c();
        int l = c.size();
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            gqr1 = (gqn)c.get(j);
            if (gqr1.i() == k)
            {
                gqr1.a(0);
                i++;
            }
        }

        j = f.a(k);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(95)).append("Permanently remove manager: ").append(k).append(", pending ops: ").append(i).append(", results dropped: ").append(j);
        }
    }

    void c(gqr gqr1, String s)
    {
        int j = 0;
        int i;
        int k;
        if (gqr1 != null)
        {
            i = gqr1.c();
        } else
        {
            i = 0;
        }
        for (k = c.size(); j < k; j++)
        {
            gqr1 = (gqn)c.get(j);
            if (gqr1.i() == i && gqr1.h().equals(s))
            {
                gqr1.f();
            }
        }

    }

    Handler d()
    {
        return e;
    }

    void e()
    {
        f.a();
        PreferenceManager.getDefaultSharedPreferences(a).edit().putInt("bom_last_listener_id", h).apply();
    }
}
