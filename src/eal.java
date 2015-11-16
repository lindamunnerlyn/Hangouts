// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class eal
{

    public final Context a;

    public eal(Context context)
    {
        a = context.getApplicationContext();
    }

    public void a(String s)
    {
        gdv.a();
        if ("account_name_v2".equals(s) || "wifi_calling_enabled".equals(s) || "tycho_account_name".equals(s))
        {
            dyl.f(a);
            dyl.g(a);
        }
    }
}
