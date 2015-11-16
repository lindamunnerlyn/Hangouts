// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gtk
{

    public static final String a = hmd.getName();
    public static final String b = gug.getName();
    public static final String c = hmq.getName();
    private static gtj d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new gtj();
        }
        hlp1.a(gug, new gug(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new gtj();
        }
        hlp1.a(hmd, new hmd[] {
            new gui(), new gub(), new gtn(), new gth()
        });
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new gtj();
        }
        hlp1.a(hmq, new hmq[] {
            new gti(), new guc()
        });
    }

}
