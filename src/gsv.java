// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gsv
{

    public static final String a = gss.getName();
    public static final String b = hmy.getName();
    private static gsu c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new gsu();
        }
        hlp1.a(gss, new gst(context));
    }

    public static void a(hlp hlp1)
    {
        if (c == null)
        {
            c = new gsu();
        }
        hnb hnb = hmy.a;
        hlp1.a(hmy, new hmy[0]);
    }

}
