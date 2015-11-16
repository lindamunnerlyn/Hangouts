// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gcy
{

    public static final String a = gcp.getName();
    public static final String b = gcr.getName();
    public static final String c = gcq.getName();
    private static gcx d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new gcx();
        }
        hlp1.a(gcp, new gcu(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new gcx();
        }
        hlp1.a(gcr, new gcw());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new gcx();
        }
        hlp1.a(gcq, new gcv());
    }

}
