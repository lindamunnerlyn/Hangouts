// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

public final class db
{

    private static final int a;
    private static final Object b = new Object();
    private static String c;
    private static Set d = new HashSet();
    private static final Object g = new Object();
    private static di h;
    private static final dd i;
    private final Context e;
    private final NotificationManager f;

    private db(Context context)
    {
        e = context;
        f = (NotificationManager)e.getSystemService("notification");
    }

    static int a()
    {
        return a;
    }

    public static db a(Context context)
    {
        return new db(context);
    }

    private void a(dk dk)
    {
        synchronized (g)
        {
            if (h == null)
            {
                h = new di(e.getApplicationContext());
            }
        }
        h.a(dk);
        return;
        dk;
        obj;
        JVM INSTR monitorexit ;
        throw dk;
    }

    public static Set b(Context context)
    {
        context = android.provider.Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (context != null && !context.equals(c))
        {
            String as[] = context.split(":");
            HashSet hashset = new HashSet(as.length);
            int k = as.length;
            for (int j = 0; j < k; j++)
            {
                ComponentName componentname = ComponentName.unflattenFromString(as[j]);
                if (componentname != null)
                {
                    hashset.add(componentname.getPackageName());
                }
            }

            synchronized (b)
            {
                d = hashset;
                c = context;
            }
        }
        return d;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void a(String s, int j)
    {
        i.a(f, s, j);
        if (android.os.Build.VERSION.SDK_INT <= 19)
        {
            a(((dk) (new dc(e.getPackageName(), j, s))));
        }
    }

    public void a(String s, int j, Notification notification)
    {
        Bundle bundle = ca.a(notification);
        boolean flag;
        if (bundle != null && bundle.getBoolean("android.support.useSideChannel"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(((dk) (new dg(e.getPackageName(), j, s, notification))));
            i.a(f, s, j);
            return;
        } else
        {
            i.a(f, s, j, notification);
            return;
        }
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            i = new df();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            i = new de();
        } else
        {
            i = new dd();
        }
        a = i.a();
    }
}
