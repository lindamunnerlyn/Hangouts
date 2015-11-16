// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;

public final class com
    implements Thread.UncaughtExceptionHandler
{

    private static final boolean a = false;
    private final Context b;
    private final Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();

    public com(Context context)
    {
        b = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
        SharedPreferences sharedpreferences = b.getSharedPreferences("EsApplication", 0);
        boolean flag = sharedpreferences.getBoolean("crashed", false);
        if (flag)
        {
            sharedpreferences.edit().putBoolean("crashed", false).apply();
        }
        if (flag)
        {
            ebw.e("Babel_Crash", "Startup - recovered from crash");
            g.a(null, 2369);
            if (bnz.a(context))
            {
                g.a(null, 2714);
            }
            if (a)
            {
                b();
            }
        } else
        {
            ebw.e("Babel_Crash", "startup - clean");
        }
        if (GcmIntentService.a())
        {
            context = b.getSharedPreferences("EsApplication", 0);
            boolean flag1 = context.getBoolean("processing_push", false);
            if (flag1)
            {
                context.edit().putBoolean("processing_push", false).apply();
            }
            if (flag1)
            {
                ebw.g("Babel", "wasProcessingPush is set; force sync");
                g.a(null, 2370);
                RealTimeChatService.a(false);
            }
        }
    }

    static Thread.UncaughtExceptionHandler a(com com1)
    {
        return com1.c;
    }

    private void a()
    {
        b.getSharedPreferences("EsApplication", 0).edit().putBoolean("crashed", true).commit();
    }

    public static void a(Context context)
    {
        context.getSharedPreferences("EsApplication", 0).edit().putBoolean("processing_push", true).commit();
    }

    private void b()
    {
        Integer integer;
        for (Iterator iterator = ank.a(b).iterator(); iterator.hasNext(); g.c(b, g.a(integer, -1)))
        {
            integer = (Integer)iterator.next();
        }

    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        boolean flag;
        if (!g.v())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s = String.valueOf(thread);
            ebw.e("Babel_Crash", (new StringBuilder(String.valueOf(s).length() + 40)).append("Uncaught exception in background thread ").append(s).toString(), throwable);
            a();
            g.a(new con(this, thread, throwable));
        } else
        {
            a();
            if (c != null)
            {
                c.uncaughtException(thread, throwable);
                return;
            }
        }
    }

    static 
    {
        new hik("debug.chat.crashinfo");
    }
}
