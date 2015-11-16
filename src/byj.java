// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.os.SystemClock;

final class byj
    implements bye
{

    private static final boolean a = false;
    private final SharedPreferences b;
    private final int c;

    public byj(SharedPreferences sharedpreferences, int i)
    {
        b = sharedpreferences;
        c = i;
    }

    private String b(String s)
    {
        int i;
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        i = c;
        return (new StringBuilder(String.valueOf(s).length() + 12)).append(i).append(":").append(s).toString();
    }

    public void a(int i, String s, long l, int j)
    {
        long l1 = b.getLong(b(s), 0L);
        if (l1 > 0L && l > l1)
        {
            h.a(i, System.currentTimeMillis(), c, (new cab()).a(j).c(l - l1));
            b.edit().remove(b(s)).apply();
            if (a)
            {
                s = String.valueOf(b(s));
                eev.d("Babel_LatencyTracker", (new StringBuilder(String.valueOf(s).length() + 95)).append("Latency tracking ends for event ").append(s).append(" with event detail ").append(j).append(", duration ").append(l - l1).append("ms").toString());
            }
        }
    }

    public void a(String s)
    {
        long l = SystemClock.elapsedRealtime();
        boolean flag;
        if (l > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.c(flag);
        b.edit().putLong(b(s), l).apply();
        if (a)
        {
            s = String.valueOf(b(s));
            if (s.length() != 0)
            {
                s = "Latency tracking started for event ".concat(s);
            } else
            {
                s = new String("Latency tracking started for event ");
            }
            eev.d("Babel_LatencyTracker", s);
        }
    }

    static 
    {
        hnc hnc = eev.g;
    }
}
