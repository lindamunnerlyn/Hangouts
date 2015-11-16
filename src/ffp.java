// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class ffp
{

    private final ffq a;

    public ffp(ffq ffq)
    {
        g.b(ffq, "Callbacks must not be null.");
        a = ffq;
    }

    public static boolean a(Context context, Intent intent)
    {
        g.b(context, "Context must not be null.");
        g.b(intent, "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
