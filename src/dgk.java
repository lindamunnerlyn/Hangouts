// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.LinkedList;
import java.util.List;

public final class dgk
{

    private static final boolean a = false;
    private final List b = new LinkedList();
    private final int c = 0;
    private dgm d;
    private boolean e;
    private long f;
    private dgl g;

    public dgk()
    {
        d = dgm.a;
        f = 0L;
    }

    public static int a()
    {
        return -1;
    }

    private void a(long l, dgm dgm1)
    {
        boolean flag;
        if (dgm1 == dgm.e || dgm1 == dgm.c || dgm1 == dgm.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gdv.a("Expected condition to be true", flag);
        if (a)
        {
            long l1 = System.currentTimeMillis();
            String s = String.valueOf(dgm1);
            String s1 = String.valueOf(d.toString());
            flag = e;
            a((new StringBuilder(String.valueOf(s).length() + 157 + String.valueOf(s1).length())).append("setNotificationTrigger eventTime: ").append(l).append(", currentTimeMillis: ").append(l1).append(", triggerLevel: ").append(s).append(", mNotifTriggerLevel: ").append(s1).append(", mIsFromLivePush: ").append(flag).toString());
        }
        if (d.ordinal() < dgm1.ordinal())
        {
            dgm dgm2 = dgm1;
            if (d == dgm.a)
            {
                dgm2 = dgm1;
                if (e)
                {
                    dgm2 = dgm1;
                    if (l != -1L)
                    {
                        long l2 = System.currentTimeMillis();
                        dgm2 = dgm1;
                        if (l2 - l / 1000L > g.a(g.nU, "babel_pushislate", 60000L))
                        {
                            if (a)
                            {
                                l /= 1000L;
                                a((new StringBuilder(71)).append("push is late by ").append(l2 - l).append(" ms, so setting trigger to deferred").toString());
                            }
                            dgm2 = dgm.b;
                            f = l2 * 1000L;
                        }
                    }
                }
            }
            d = dgm2;
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
        eev.b("Babel", s);
    }

    public void a(long l)
    {
        if (a)
        {
            a("setShouldTriggerLoudNotification");
        }
        a(l, dgm.e);
    }

    public void a(Context context, aow aow, String s, List list)
    {
        if (g != null)
        {
            g.a(context, aow, s, list);
        }
    }

    public void a(aoa aoa)
    {
        g = new dgl(aoa);
    }

    public void a(dmf dmf)
    {
        b.add(dmf);
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
        a(l, dgm.d);
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
        a(-1L, dgm.c);
    }

    public dgm g()
    {
        return d;
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
