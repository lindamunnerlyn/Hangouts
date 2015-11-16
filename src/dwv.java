// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dwv
{

    public static final String a = hcb.getName();
    public static final String b = dij.getName();
    public static final String c = dwt.getName();
    private static dwu d;

    public static void a(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dwu();
        }
        hlp1.a(hcb, new hcb[] {
            (hcb)hlp.a(context, dwt)
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dwu();
        }
        hlp1.a(dij, new dij[] {
            (dij)hlp.a(context, dwt)
        });
    }

    public static void c(Context context, hlp hlp1)
    {
        if (d == null)
        {
            d = new dwu();
        }
        hlp1.a(dwt, new dwt(context));
    }

}
