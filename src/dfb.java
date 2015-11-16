// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.LinkedList;
import java.util.List;

public final class dfb
{

    private static final boolean a = false;
    private final List b = new LinkedList();
    private final int c = 0;
    private dfd d;
    private boolean e;
    private long f;
    private dfc g;

    public dfb()
    {
        d = dfd.a;
        f = 0L;
    }

    public static int a()
    {
        return -1;
    }

    private void a(long l, dfd dfd1)
    {
        boolean flag;
        if (dfd1 == dfd.e || dfd1 == dfd.c || dfd1 == dfd.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a(flag);
        if (a)
        {
            long l1 = System.currentTimeMillis();
            String s = String.valueOf(dfd1);
            String s1 = String.valueOf(d.toString());
            flag = e;
            a((new StringBuilder(String.valueOf(s).length() + 157 + String.valueOf(s1).length())).append("setNotificationTrigger eventTime: ").append(l).append(", currentTimeMillis: ").append(l1).append(", triggerLevel: ").append(s).append(", mNotifTriggerLevel: ").append(s1).append(", mIsFromLivePush: ").append(flag).toString());
        }
        if (d.ordinal() < dfd1.ordinal())
        {
            dfd dfd2 = dfd1;
            if (d == dfd.a)
            {
                dfd2 = dfd1;
                if (e)
                {
                    dfd2 = dfd1;
                    if (l != -1L)
                    {
                        long l2 = System.currentTimeMillis();
                        dfd2 = dfd1;
                        if (l2 - l / 1000L > g.a(g.nS, "babel_pushislate", 60000L))
                        {
                            if (a)
                            {
                                l /= 1000L;
                                a((new StringBuilder(71)).append("push is late by ").append(l2 - l).append(" ms, so setting trigger to deferred").toString());
                            }
                            dfd2 = dfd.b;
                            f = l2 * 1000L;
                        }
                    }
                }
            }
            d = dfd2;
        }
    }

    private static void a(String s)
    {
        String s1 = String.valueOf("[RealTimeChatOperationState] ");
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = s1.concat(s);
        } else
        {
            s = new String(s1);
        }
        ebw.b("Babel", s);
    }

    public void a(long l)
    {
        if (a)
        {
            a("setShouldTriggerLoudNotification");
        }
        a(l, dfd.e);
    }

    public void a(Context context, aoe aoe, String s, List list)
    {
        if (g != null)
        {
            g.a(context, aoe, s, list);
        }
    }

    public void a(ani ani)
    {
        g = new dfc(ani);
    }

    public void a(dko dko)
    {
        b.add(dko);
    }

    public void b()
    {
        e = true;
    }

    public void b(long l)
    {
        if (a)
        {
            a("setShouldTriggerDisplayOnlyNotifications");
        }
        a(l, dfd.d);
    }

    public List c()
    {
        return b;
    }

    public long d()
    {
        return f;
    }

    public void e()
    {
        if (g != null)
        {
            g.a();
        }
    }

    public void f()
    {
        if (a)
        {
            a("setShouldTriggerSilentNotifications");
        }
        a(-1L, dfd.c);
    }

    public dfd g()
    {
        return d;
    }

    static 
    {
        hik hik = ebw.n;
    }
}
