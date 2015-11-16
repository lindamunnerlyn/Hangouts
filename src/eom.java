// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Debug;
import android.os.Process;
import android.os.SystemClock;
import com.google.android.gms.common.stats.ConnectionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class eom
{

    private static final Object a = new Object();
    private static eom b;
    private static final ComponentName g = new ComponentName("com.google.android.gms", "com.google.android.gms.common.stats.GmsCoreStatsService");
    private static Integer i;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private eoq h;

    private eom()
    {
        if (b() == eop.a)
        {
            c = Collections.EMPTY_LIST;
            d = Collections.EMPTY_LIST;
            e = Collections.EMPTY_LIST;
            f = Collections.EMPTY_LIST;
            return;
        }
        Object obj = (String)eoo.b.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        c = ((List) (obj));
        obj = (String)eoo.c.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        d = ((List) (obj));
        obj = (String)eoo.d.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        e = ((List) (obj));
        obj = (String)eoo.e.d();
        if (obj == null)
        {
            obj = Collections.EMPTY_LIST;
        } else
        {
            obj = Arrays.asList(((String) (obj)).split(","));
        }
        f = ((List) (obj));
        h = new eoq(((Long)eoo.f.d()).longValue());
    }

    private static ServiceInfo a(Context context, Intent intent)
    {
        context = context.getPackageManager().queryIntentServices(intent, 128);
        if (context == null || context.size() == 0)
        {
            String.format("There are no handler of this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), g.l(20)
            });
            return null;
        }
        if (context.size() > 1)
        {
            String.format("Multiple handlers found for this intent: %s\n Stack trace: %s", new Object[] {
                intent.toUri(0), g.l(20)
            });
            intent = context.iterator();
            if (intent.hasNext())
            {
                context = ((ResolveInfo)intent.next()).serviceInfo.name;
                return null;
            }
        }
        return ((ResolveInfo)context.get(0)).serviceInfo;
    }

    public static eom a()
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new eom();
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void a(Context context, ServiceConnection serviceconnection, String s, Intent intent, int j)
    {
        if (emx.a)
        {
            String s1 = String.valueOf(Process.myPid() << 32 | System.identityHashCode(serviceconnection));
            int k = b();
            if (k == eop.a || h == null)
            {
                k = 0;
            } else
            if (j == 4 || j == 1)
            {
                if (h.b(s1))
                {
                    k = 1;
                } else
                {
                    k = 0;
                }
            } else
            {
                Object obj = a(context, intent);
                if (obj == null)
                {
                    String.format("Client %s made an invalid request %s", new Object[] {
                        s, intent.toUri(0)
                    });
                    k = 0;
                } else
                {
                    serviceconnection = g.w(context);
                    String s2 = ((ServiceInfo) (obj)).processName;
                    obj = ((ServiceInfo) (obj)).name;
                    if (c.contains(serviceconnection) || d.contains(s) || e.contains(s2) || f.contains(obj) || s2.equals(serviceconnection) && (k & eop.f) != 0)
                    {
                        k = 0;
                    } else
                    {
                        h.a(s1);
                        k = 1;
                    }
                }
            }
            if (k != 0)
            {
                long l1 = System.currentTimeMillis();
                serviceconnection = null;
                if ((b() & eop.e) != 0)
                {
                    serviceconnection = g.l(5);
                }
                long l = 0L;
                if ((b() & eop.g) != 0)
                {
                    l = Debug.getNativeHeapAllocatedSize();
                }
                if (j == 1 || j == 4)
                {
                    serviceconnection = new ConnectionEvent(l1, j, null, null, null, null, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                } else
                {
                    intent = a(context, intent);
                    serviceconnection = new ConnectionEvent(l1, j, g.w(context), s, ((ServiceInfo) (intent)).processName, ((ServiceInfo) (intent)).name, serviceconnection, s1, SystemClock.elapsedRealtime(), l);
                }
                context.startService((new Intent()).setComponent(g).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", serviceconnection));
                return;
            }
        }
    }

    private static int b()
    {
        if (i != null) goto _L2; else goto _L1
_L1:
        int j;
        if (emx.a && fdz.b() && fdz.a() == Process.myUid())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j == 0) goto _L4; else goto _L3
_L3:
        j = ((Integer)eoo.a.d()).intValue();
_L5:
        i = Integer.valueOf(j);
_L2:
        return i.intValue();
_L4:
        j = eop.a;
          goto _L5
        SecurityException securityexception;
        securityexception;
        i = Integer.valueOf(eop.a);
          goto _L2
    }

    public void a(Context context, ServiceConnection serviceconnection)
    {
        context.unbindService(serviceconnection);
        a(context, serviceconnection, null, null, 1);
    }

    public void a(Context context, ServiceConnection serviceconnection, String s, Intent intent)
    {
        a(context, serviceconnection, s, intent, 3);
    }

    public boolean a(Context context, String s, Intent intent, ServiceConnection serviceconnection)
    {
        ComponentName componentname = intent.getComponent();
        boolean flag;
        if (componentname == null || emx.a && "com.google.android.gms".equals(componentname.getPackageName()))
        {
            flag = false;
        } else
        {
            flag = g.d(context, componentname.getPackageName());
        }
        if (flag)
        {
            return false;
        }
        flag = context.bindService(intent, serviceconnection, 129);
        if (flag)
        {
            a(context, serviceconnection, s, intent, 2);
        }
        return flag;
    }

    public void b(Context context, ServiceConnection serviceconnection)
    {
        a(context, serviceconnection, null, null, 4);
    }

}
