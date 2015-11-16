// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class can
{

    public static final String a = hbx.getName();
    public static final String b = hcb.getName();
    public static final String c = cao.getName();
    public static final String d = grj.getName();
    public static final String e = hbw.getName();
    public static final String f = cae.getName();
    public static final String g = caf.getName();
    private static cam h;

    public static void a(Context context, hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp.a(context, cao)
        });
    }

    public static void a(hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(hbx, new hbx[] {
            new cak()
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(cao, new cao(context));
    }

    public static void b(hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(grj, new grj[] {
            new cav()
        });
    }

    public static void c(hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(hbw, new cal());
    }

    public static void d(hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(cae, new car());
    }

    public static void e(hlp hlp1)
    {
        if (h == null)
        {
            h = new cam();
        }
        hlp1.a(caf, new cat());
    }

}
