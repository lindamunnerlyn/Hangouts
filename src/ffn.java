// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.identity.accounts.api.AccountData;

public final class ffn
{

    static final ffq a;
    private static final ffp b;

    public static boolean a(Context context, Intent intent)
    {
        return ffp.a(context, intent);
    }

    public static AccountData b(Context context, Intent intent)
    {
        g.b(context, "Context must not be null.");
        g.b(intent, "Intent must not be null.");
        if (!ffp.a(context, intent))
        {
            return null;
        } else
        {
            return (AccountData)g.a(intent, "com.google.android.gms.accounts.ACCOUNT_DATA", AccountData.CREATOR);
        }
    }

    static 
    {
        a = new ffq();
        b = new ffp(a);
    }
}
