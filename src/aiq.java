// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aiq
{

    public static final String a = android/app/Application$ActivityLifecycleCallbacks.getName();
    public static final String b = air.getName();
    public static final String c = aio.getName();
    private static aip d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new aip();
        }
        hlp1.a(android/app/Application$ActivityLifecycleCallbacks, new android.app.Application.ActivityLifecycleCallbacks[] {
            (android.app.Application.ActivityLifecycleCallbacks)hlp.a(context, air)
        });
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new aip();
        }
        hlp1.a(air, new air());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new aip();
        }
        hlp1.a(aio, (aio)hlp.a(context, air));
    }

}
