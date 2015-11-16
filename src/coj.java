// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class coj
{

    public static final String a = android/app/Application$ActivityLifecycleCallbacks.getName();
    public static final String b = hcu.getName();
    public static final String c = gpy.getName();
    private static coh d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new coh();
        }
        hgx1.a(android/app/Application$ActivityLifecycleCallbacks, new android.app.Application.ActivityLifecycleCallbacks[] {
            new dbb(context), dbu.c(), dig.c(), dev.c(), dbt.a(context)
        });
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new coh();
        }
        hgx1.a(hcu, new cqu());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new coh();
        }
        hgx1.a(gpy, d.a());
    }

}
