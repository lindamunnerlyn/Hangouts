// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dcu
{

    public static final String a = gqx.getName();
    public static final String b = hcb.getName();
    public static final String c = dcn.getName();
    private static dct d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dct();
        }
        hlp1.a(dcn, new dcn(context));
    }

    public static void a(hlp hlp1)
    {
        if (d == null)
        {
            d = new dct();
        }
        hlp1.a(gqx, new gqx[] {
            (gqx)hlp1.a(dcn)
        });
    }

    public static void b(hlp hlp1)
    {
        if (d == null)
        {
            d = new dct();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp1.a(dcn)
        });
    }

}
