// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ahp
    implements ahm
{

    private final Class a;
    private final Object b;

    ahp(Context context)
    {
        try
        {
            a = Class.forName("android.location.CountryDetector");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("Couldn't load android.location.CountryDetector", context);
        }
        b = context.getSystemService("country_detector");
    }
}
