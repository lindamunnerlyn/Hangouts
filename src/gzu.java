// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gzu
{

    public static final String a = gzl.getName();
    public static final String b = gxl.getName();
    public static final String c = gzd.getName();
    public static final String d = hmy.getName();
    private static gzt e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new gzt();
        }
        hlp1.a(gzl, gzt.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new gzt();
        }
        hlp1.a(gxl, new gxl[] {
            new gzk()
        });
    }

    public static void b(hlp hlp1)
    {
        if (e == null)
        {
            e = new gzt();
        }
        hlp1.a(gzd, new gzd[] {
            new gza()
        });
    }

    public static void c(hlp hlp1)
    {
        if (e == null)
        {
            e = new gzt();
        }
        hnb hnb = hmy.a;
        hlp1.a(hmy, new hmy[0]);
    }

}
