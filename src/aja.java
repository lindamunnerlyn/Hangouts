// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aja
{

    public static final String a = ait.getName();
    public static final String b = dij.getName();
    public static final String c = ajc.getName();
    private static aiz d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new aiz();
        }
        hlp1.a(dij, new dij[] {
            new ajb(context)
        });
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new aiz();
        }
        hlp1.a(ait, new aiu());
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new aiz();
        }
        hlp1.a(ajc, new ajc());
    }

}
