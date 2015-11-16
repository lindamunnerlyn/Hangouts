// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class bws
{

    public static final String a = bwn.getName();
    public static final String b = bwm.getName();
    public static final String c = crc.getName();
    public static final String d = ccm.getName();
    private static bwr e;

    public static void a(Context context, hlp hlp1)
    {
        if (e == null)
        {
            e = new bwr();
        }
        hlp1.a(crc, new crc[] {
            (crc)hlp.a(context, bwn)
        });
    }

    public static void a(hlp hlp1)
    {
        if (e == null)
        {
            e = new bwr();
        }
        hlp1.a(bwn, new bwp());
    }

    public static void b(hlp hlp1)
    {
        if (e == null)
        {
            e = new bwr();
        }
        hlp1.a(bwm, new bwt());
    }

    public static void c(hlp hlp1)
    {
        if (e == null)
        {
            e = new bwr();
        }
        hlp1.a(ccm, new ccm[] {
            new bwo()
        });
    }

}
