// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ccp
{

    public static final String a = android/app/Application$ActivityLifecycleCallbacks.getName();
    public static final String b = ccn.getName();
    public static final String c = ccm.getName();
    private static cco d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cco();
        }
        hgx1.a(android/app/Application$ActivityLifecycleCallbacks, new android.app.Application.ActivityLifecycleCallbacks[] {
            (android.app.Application.ActivityLifecycleCallbacks)hgx.a(context, ccn)
        });
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cco();
        }
        hgx1.a(ccn, new ccn(context));
    }

    public static void c(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new cco();
        }
        hgx1.a(ccm, (ccm)hgx.a(context, ccn));
    }

}
