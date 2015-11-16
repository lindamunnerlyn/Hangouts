// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.GcmIntentService;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class cqc
    implements Thread.UncaughtExceptionHandler
{

    private static final boolean a = false;
    private final Context b;
    private final Thread.UncaughtExceptionHandler c = Thread.getDefaultUncaughtExceptionHandler();

    public cqc(Context context, boolean flag)
    {
        b = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
        int i = dcn.b(context);
        gcz gcz1 = ((gdd)hlp.a(context, gdd)).a(i);
        if (flag)
        {
            PreferenceManager.getDefaultSharedPreferences(b).edit().putInt("crashes", 0).apply();
        }
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(b);
        boolean flag1;
        if (flag)
        {
            i = 0;
        } else
        {
            i = sharedpreferences.getInt("launches", 0);
        }
        sharedpreferences = PreferenceManager.getDefaultSharedPreferences(b);
        if (!flag && sharedpreferences.getBoolean("crashed", false))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            sharedpreferences.edit().putBoolean("crashed", false).apply();
        }
        if (flag1)
        {
            sharedpreferences = PreferenceManager.getDefaultSharedPreferences(context);
            String s = sharedpreferences.getString("exception_class", null);
            eev.g("Babel_Crash", (new StringBuilder(String.valueOf(s).length() + 72)).append("Startup - recovered from crash. Launches: ").append(i).append(" exception class:  ").append(s).toString());
            jli jli1 = new jli();
            boolean flag2;
            if (a() == 1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                long l = sharedpreferences.getLong("first_launch", 0L);
                l = sharedpreferences.getLong("last_crash", 0L) - l;
                eev.g("Babel_Crash", (new StringBuilder(64)).append("Startup - first crash since version change: ").append(l).toString());
                jli1.c = Integer.valueOf((int)TimeUnit.MILLISECONDS.toSeconds(l));
            }
            jli1.b = Integer.valueOf(i);
            jli1.a = s;
            gcz1.a(2369).a(jli1).d();
            context = context.getSharedPreferences(boi.getName(), 0);
            if (TextUtils.isEmpty(context.getString("ONGOING_CALL_SESSION", "")))
            {
                flag2 = false;
            } else
            {
                context.edit().remove("ONGOING_CALL_SESSION").apply();
                flag2 = true;
            }
            if (flag2)
            {
                gcz1.a(2714).d();
            }
            if (a)
            {
                b();
            }
        } else
        {
            eev.e("Babel_Crash", "Startup - clean");
        }
        context = PreferenceManager.getDefaultSharedPreferences(b);
        if (flag1)
        {
            context.edit().putInt("launches", 1).apply();
        } else
        {
            context.edit().putInt("launches", i + 1).apply();
        }
        if (GcmIntentService.a())
        {
            context = PreferenceManager.getDefaultSharedPreferences(b);
            flag = context.getBoolean("processing_push", false);
            if (flag)
            {
                context.edit().putBoolean("processing_push", false).apply();
            }
            if (flag)
            {
                eev.g("Babel", "wasProcessingPush is set; force sync");
                gcz1.a(2370).d();
                RealTimeChatService.a(false);
            }
        }
    }

    private int a()
    {
        return PreferenceManager.getDefaultSharedPreferences(b).getInt("crashes", 0);
    }

    static Thread.UncaughtExceptionHandler a(cqc cqc1)
    {
        return cqc1.c;
    }

    public static void a(Context context)
    {
        PreferenceManager.getDefaultSharedPreferences(context).edit().putBoolean("processing_push", true).commit();
    }

    private void a(Throwable throwable)
    {
        PreferenceManager.getDefaultSharedPreferences(b).edit().putBoolean("crashed", true).putInt("crashes", a() + 1).putLong("last_crash", System.currentTimeMillis()).putString("exception_class", throwable.getClass().getName()).commit();
    }

    private void b()
    {
        Integer integer;
        for (Iterator iterator = aoc.a(b).iterator(); iterator.hasNext(); g.c(b, g.a(integer, -1)))
        {
            integer = (Integer)iterator.next();
        }

    }

    public void uncaughtException(Thread thread, Throwable throwable)
    {
        boolean flag;
        if (!g.u())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            String s = String.valueOf(thread);
            eev.e("Babel_Crash", (new StringBuilder(String.valueOf(s).length() + 40)).append("Uncaught exception in background thread ").append(s).toString(), throwable);
            a(throwable);
            g.a(new cqd(this, thread, throwable));
        } else
        {
            a(throwable);
            if (c != null)
            {
                c.uncaughtException(thread, throwable);
                return;
            }
        }
    }

    static 
    {
        new hnc("debug.chat.crashinfo");
    }
}
