// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aqh
{

    public static final String a = aqd.getName();
    private static aqg b;

    public static void a(Context context, hlp hlp1)
    {
        if (b == null)
        {
            b = new aqg();
        }
        context = (ahd)hlp.a(context, ahd);
        hlp1.a(aqd, new aqd[] {
            new aqj(context), new aqi(context)
        });
    }

}
