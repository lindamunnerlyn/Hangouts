// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import java.util.Collection;

final class dao
    implements dak
{

    private static final String a = dak.getSimpleName();
    private static final boolean b = false;

    dao()
    {
    }

    private static void a(Context context, String s, boolean flag)
    {
        context.startService((new Intent()).setClassName("com.google.android.apps.hangoutsdialer", "com.google.android.apps.hangoutsdialer.app.CallInterceptor$ResponseService").putExtra("op_code", 4).putExtra("android.intent.extra.PHONE_NUMBER", s).putExtra("will_reroute_reply", flag));
        if (b)
        {
            ebw.b(a, (new StringBuilder(24)).append("Will reroute call: ").append(flag).toString());
        }
    }

    public Collection a()
    {
        return jlk.a(Integer.valueOf(3));
    }

    public void a(Context context, Intent intent)
    {
        String s = intent.getStringExtra("android.intent.extra.PHONE_NUMBER");
        dal dal1 = (dal)hgx.b(context, dal);
        if (dal1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        jhb.c(intent.getStringExtra("com.android.phone.extra.GATEWAY_PROVIDER_PACKAGE"));
        intent = dal1.a();
        if (intent.a())
        {
            a(context, s, true);
            intent.b();
            return;
        }
        try
        {
            a(context, s, false);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            a(context, s, false);
        }
        throw intent;
    }

    static 
    {
        hik hik = ebw.l;
    }
}
