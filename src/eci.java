// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class eci
{

    public static final String a = aqd.getName();
    public static final String b = aqe.getName();
    private static ech c;

    public static void a(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new ech();
        }
        hlp1.a(aqd, new aqd[] {
            new ecf((ahd)hlp.a(context, ahd))
        });
    }

    public static void b(Context context, hlp hlp1)
    {
        if (c == null)
        {
            c = new ech();
        }
        hlp1.a(aqe, new aqe[] {
            new ecg((ahd)hlp.a(context, ahd))
        });
    }

}
