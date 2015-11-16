// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class bnz
{

    private final int a;
    private final boolean b;

    private bnz(int i, boolean flag)
    {
        a = i;
        b = flag;
    }

    public static void a(Context context, boy boy1)
    {
        a(context, boy1, 1004, true);
    }

    public static void a(Context context, boy boy1, int i, boolean flag)
    {
        gbh.a(i, 1, 1019);
        context = context.getSharedPreferences(bnz.getName(), 0).edit();
        context.putBoolean("HISTORY_HAS_EVENT", true);
        boy1.a(context);
        context.putInt("HISTORY_ERROR", i);
        context.putBoolean("HISTORY_EXIT_REPORTED", flag);
        context.apply();
    }

    public static void a(Context context, String s)
    {
        context = context.getSharedPreferences(bnz.getName(), 0);
        if (!TextUtils.isEmpty(context.getString("ONGOING_CALL_SESSION", "")))
        {
            g.b(2723);
        }
        context.edit().putString("ONGOING_CALL_SESSION", s).apply();
    }

    public static boolean a(Context context)
    {
        context = context.getSharedPreferences(bnz.getName(), 0);
        if (TextUtils.isEmpty(context.getString("ONGOING_CALL_SESSION", "")))
        {
            return false;
        } else
        {
            context.edit().remove("ONGOING_CALL_SESSION").apply();
            return true;
        }
    }

    public static bnz b(Context context, boy boy1)
    {
        Object obj = null;
        context = context.getSharedPreferences(bnz.getName(), 0);
        if (!context.getBoolean("HISTORY_HAS_EVENT", false) || !boy1.equals(boy.a(context)))
        {
            context = null;
        }
        boy1 = obj;
        if (context != null)
        {
            boy1 = new bnz(context.getInt("HISTORY_ERROR", 1004), context.getBoolean("HISTORY_EXIT_REPORTED", false));
        }
        return boy1;
    }

    public static void b(Context context, String s)
    {
        context = context.getSharedPreferences(bnz.getName(), 0);
        if (!context.getString("ONGOING_CALL_SESSION", "").equals(s))
        {
            g.b(2715);
        }
        context.edit().remove("ONGOING_CALL_SESSION").apply();
    }

    public int a()
    {
        return a;
    }

    public boolean b()
    {
        return b;
    }
}
