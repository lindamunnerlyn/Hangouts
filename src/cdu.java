// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cdu
{

    public static final String a = android/app/Application$ActivityLifecycleCallbacks.getName();
    public static final String b = cds.getName();
    public static final String c = cdr.getName();
    private static cdt d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cdt();
        }
        hlp1.a(android/app/Application$ActivityLifecycleCallbacks, new android.app.Application.ActivityLifecycleCallbacks[] {
            (android.app.Application.ActivityLifecycleCallbacks)hlp.a(context, cds)
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cdt();
        }
        hlp1.a(cds, new cds(context));
    }

    public static void c(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new cdt();
        }
        hlp1.a(cdr, (cdr)hlp.a(context, cds));
    }

}
