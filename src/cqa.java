// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cqa
{

    public static final String a = android/app/Application$ActivityLifecycleCallbacks.getName();
    public static final String b = hhl.getName();
    public static final String c = guj.getName();
    private static cpy d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cpy();
        }
        hlp1.a(android/app/Application$ActivityLifecycleCallbacks, new android.app.Application.ActivityLifecycleCallbacks[] {
            new dch(context), ddd.c(), djr.c(), dge.c(), ddc.a(context), new dom(context)
        });
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new cpy();
        }
        hlp1.a(hhl, new cte());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new cpy();
        }
        hlp1.a(guj, d.a());
    }

}
