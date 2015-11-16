// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class efw
{

    public static final String a = efu.getName();
    private static efv b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new efv();
        }
        hlp1.a(efu, new efu(context));
    }

}
