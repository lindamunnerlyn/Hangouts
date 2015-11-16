// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gux
{

    public static final String a = hmd.getName();
    public static final String b = gvq.getName();
    public static final String c = gva.getName();
    public static final String d = hmq.getName();
    public static final String e = hmy.getName();
    private static guw f;

    public static void a(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new guw();
        }
        hlp1.a(gvq, new gvq(context));
    }

    public static void a(hlp hlp1)
    {
        if (f == null)
        {
            f = new guw();
        }
        hlp1.a(hmd, new hmd[] {
            new gvd()
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new guw();
        }
        hlp1.a(gva, new gvk(context));
    }

    public static void b(hlp hlp1)
    {
        if (f == null)
        {
            f = new guw();
        }
        hlp1.a(hmq, new hmq[] {
            new gvd()
        });
    }

    public static void c(Context context, hlp hlp1)
    {
        if (f == null)
        {
            f = new guw();
        }
        context = hmy.a;
        hlp1.a(hmy, new hmy[0]);
    }

}
