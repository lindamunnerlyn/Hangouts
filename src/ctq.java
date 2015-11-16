// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ctq
{

    public static final String a = ctn.getName();
    public static final String b = ber.getName();
    public static final String c = ctt.getName();
    private static ctp d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new ctp();
        }
        hlp1.a(ctn, d.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new ctp();
        }
        hlp1.a(ber, d.a());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new ctp();
        }
        hlp1.a(ctt, d.b());
    }

}
