// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class fcp
{

    static final fcs a;
    private static final fcr b;

    public static boolean a(Context context, Intent intent)
    {
        return fcr.a(context, intent);
    }

    public static AccountData b(Context context, Intent intent)
    {
        h.a(context, "Context must not be null.");
        h.a(intent, "Intent must not be null.");
        if (!fcr.a(context, intent))
        {
            return null;
        } else
        {
            return (AccountData)g.a(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
        }
    }

    static 
    {
        a = new fcs();
        b = new fcr(a);
    }
}
