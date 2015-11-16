// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import org.chromium.net.UrlRequestContextConfig;

public final class dks
{

    public static final String a = org/chromium/net/UrlRequestContextConfig.getName();
    public static final String b = hdw.getName();
    public static final String c = beb.getName();
    private static dkr d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dkr();
        }
        hgx1.a(org/chromium/net/UrlRequestContextConfig, d.b(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new dkr();
        }
        hgx1.a(beb, d.a());
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new dkr();
        }
        hgx1.a(hdw, d.a(context));
    }

}
