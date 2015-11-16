// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class fcr
{

    private final fcs a;

    public fcr(fcs fcs)
    {
        h.a(fcs, "Callbacks must not be null.");
        a = fcs;
    }

    public static boolean a(Context context, Intent intent)
    {
        h.a(context, "Context must not be null.");
        h.a(intent, "Intent must not be null.");
        return intent.hasExtra("com.google.android.gms.accounts.ACCOUNT_DATA");
    }
}
