// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class buv
{

    public static final String a = buh.getName();
    public static final String b = bsq.getName();
    public static final String c = ber.getName();
    public static final String d = buf.getName();
    private static bus e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new bus();
        }
        hlp1.a(buh, e.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new bus();
        }
        hlp1.a(ber, e.a());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new bus();
        }
        hlp1.a(bsq, e.c(context));
    }

    public static void c(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new bus();
        }
        hlp1.a(buf, e.b(context));
    }

}
