// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public class boi
{

    private final int a;
    private final boolean b;

    public boi(int i, boolean flag)
    {
        a = i;
        b = flag;
    }

    public static void a(Context context, bph bph1)
    {
        a(context, bph1, 1004, true);
    }

    public static void a(Context context, bph bph1, int i, boolean flag)
    {
        gdv.a(i, 1, 1019);
        context = context.getSharedPreferences(boi.getName(), 0).edit();
        context.putBoolean("HISTORY_HAS_EVENT", true);
        bph1.a(context);
        context.putInt("HISTORY_ERROR", i);
        context.putBoolean("HISTORY_EXIT_REPORTED", flag);
        context.apply();
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
