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

public class gvq
{

    final SparseArray a = new SparseArray();
    final List b = new ArrayList();
    final gvh c;
    private final Context d;
    private final Queue e = new LinkedBlockingQueue();
    private final Handler f = new Handler(Looper.getMainLooper());
    private final gva g;
    private int h;

    gvq(Context context)
    {
        d = context;
        c = new gvh(context, "background_results.bin");
        h = PreferenceManager.getDefaultSharedPreferences(d).getInt("bom_last_listener_id", 0);
        g = (gva)hlp.a(context, gva);
    }

    int a()
    {
        g.v();
        int i = h + 1;
        h = i;
        if (i == 0)
        {
            h = h + 1;
        }
        return h;
    }

    public void a(guy guy1, gvc gvc1)
    {
        g.v();
        int i = 0;
        if (gvc1 != null)
        {
            i = gvc1.c();
        }
        guy1.a(i);
        b.add(guy1);
        e.add(guy1);
        g.a();
        if (Log.isLoggable("BackgroundTask", 3))
        {
            guy1 = String.valueOf(guy1.h());
            (new StringBuilder(String.valueOf(guy1).length() + 45)).append("Start background task: ").append(guy1).append(", manager: ").append(i);
        }
    }

    void a(guy guy1, gvv gvv1)
    {
        itr.a(gvv1.b, new gvr(this, guy1, gvv1)).run();
    }

    public void a(gvc gvc1)
    {
        g.v();
        int k = gvc1.c();
        a.put(k, gvc1);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(29)).append("Register manager: ").append(k);
        }
        String as[] = gvc1.d();
        int l = as.length;
        for (int i = 0; i < l; i++)
        {
            String s = as[i];
            for (int j = gvc1.d(s) - b(gvc1, s); j > 0; j--)
            {
                gvv gvv1 = c.a(k, s);
                if (Log.isLoggable("BackgroundTask", 4))
                {
                    String s1 = String.valueOf(gvv1);
                    (new StringBuilder(String.valueOf(s).length() + 40 + String.valueOf(s1).length())).append("Deliver saved background task result: ").append(s).append(", ").append(s1);
                }
                gvc1.a(s, gvv1);
            }

        }

    }

    public boolean a(gvc gvc1, String s)
    {
        return b(gvc1, s) > 0;
    }

    public int b(gvc gvc1, String s)
    {
        g.v();
        int k = gvc1.c();
        int l = b.size();
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            gvc1 = (guy)b.get(j);
            if (gvc1.i() == k && gvc1.h().equals(s))
            {
                i++;
            }
        }

        return i;
    }

    public void b(gvc gvc1)
    {
        g.v();
        int i = gvc1.c();
        a.remove(i);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(31)).append("Unregister manager: ").append(i);
        }
    }

    boolean b()
    {
        return !b.isEmpty();
    }

    guy c()
    {
        return (guy)e.poll();
    }

    public void c(gvc gvc1)
    {
        int k = gvc1.c();
        int l = b.size();
        int j = 0;
        int i = 0;
        for (; j < l; j++)
        {
            gvc1 = (guy)b.get(j);
            if (gvc1.i() == k)
            {
                gvc1.a(0);
                i++;
            }
        }

        j = c.a(k);
        if (Log.isLoggable("BackgroundTask", 3))
        {
            (new StringBuilder(95)).append("Permanently remove manager: ").append(k).append(", pending ops: ").append(i).append(", results dropped: ").append(j);
        }
    }

    void c(gvc gvc1, String s)
    {
        int j = 0;
        int i;
        int k;
        if (gvc1 != null)
        {
            i = gvc1.c();
        } else
        {
            i = 0;
        }
        for (k = b.size(); j < k; j++)
        {
            gvc1 = (guy)b.get(j);
            if (gvc1.i() == i && gvc1.h().equals(s))
            {
                gvc1.f();
            }
        }

    }

    Handler d()
    {
        return f;
    }

    void e()
    {
        c.a();
        PreferenceManager.getDefaultSharedPreferences(d).edit().putInt("bom_last_listener_id", h).apply();
    }
}
