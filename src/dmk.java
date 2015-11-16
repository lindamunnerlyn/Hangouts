// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import org.chromium.net.UrlRequestContextConfig;

public final class dmk
{

    public static final String a = org/chromium/net/UrlRequestContextConfig.getName();
    public static final String b = hin.getName();
    public static final String c = dmh.getName();
    public static final String d = ber.getName();
    private static dmj e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dmj();
        }
        hlp1.a(org/chromium/net/UrlRequestContextConfig, e.c(context));
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new dmj();
        }
        hlp1.a(ber, e.a());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dmj();
        }
        hlp1.a(hin, e.a(context));
    }

    public static void c(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new dmj();
        }
        hlp1.a(dmh, e.b(context));
    }

}
