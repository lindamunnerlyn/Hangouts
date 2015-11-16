// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import epp;
import gap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import llk;
import llp;

// Referenced classes of package org.chromium.base:
//            ThreadUtils

public class ApplicationStatus
{

    private static Application a;
    private static Object b = new Object();
    private static Integer c;
    private static Activity d;
    private static gap e;
    private static final Map f = new ConcurrentHashMap();
    private static final llp g = new llp();
    private static final llp h = new llp();

    private ApplicationStatus()
    {
    }

    public static Activity a()
    {
        return d;
    }

    public static void a(gap gap)
    {
        h.a(gap);
    }

    public static Context b()
    {
        if (a != null)
        {
            return a.getApplicationContext();
        } else
        {
            return null;
        }
    }

    public static void b(gap gap)
    {
        h.b(gap);
    }

    public static int c()
    {
        int i;
        boolean flag1;
        i = 0;
        flag1 = true;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        Iterator iterator = f.values().iterator();
        boolean flag = false;
_L5:
        int j;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        j = ((epp)iterator.next()).a();
        if (j == 4 || j == 5 || j == 6) goto _L4; else goto _L3
_L3:
        i = ((flag1) ? 1 : 0);
_L6:
        c = Integer.valueOf(i);
_L2:
        i = c.intValue();
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        if (j == 4)
        {
            flag = true;
        } else
        if (j == 5)
        {
            i = 1;
        }
          goto _L5
        if (flag)
        {
            i = 2;
        } else
        if (i != 0)
        {
            i = 3;
        } else
        {
            i = 4;
        }
          goto _L6
    }

    public static gap c(gap gap)
    {
        e = gap;
        return gap;
    }

    public static gap d()
    {
        return e;
    }

    private static native void nativeOnApplicationStateChange(int i);

    private static void registerThreadSafeNativeApplicationStateListener()
    {
        ThreadUtils.a(new llk());
    }

}
