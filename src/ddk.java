// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ddk
{

    public static final String a = gdd.getName();
    private static ddj b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new ddj();
        }
        hlp1.a(gdd, new dcv(context));
    }

}
