// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aln
{

    public static final String a = all.getName();
    public static final String b = ctf.getName();
    public static final String c = ber.getName();
    private static alm d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new alm();
        }
        hlp1.a(all, d.a(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new alm();
        }
        hlp1.a(ber, d.a());
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new alm();
        }
        hlp1.a(ctf, d.b(context));
    }

}
