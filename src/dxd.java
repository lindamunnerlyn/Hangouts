// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class dxd extends dtp
{

    private final int a;
    private final Context b;

    public dxd(Context context, int i)
    {
        b = context;
        a = i;
    }

    private cwe b(String s)
    {
        Semaphore semaphore;
        cwe acwe[];
        gbh.b();
        semaphore = new Semaphore(0);
        acwe = new cwe[1];
        s = new dxe(this, RealTimeChatService.c(a, s), acwe, semaphore);
        RealTimeChatService.a(s);
        if (semaphore.tryAcquire(g.a(b, "babel_telephony_call_rate_lookup_timeout_ms", 10000L), TimeUnit.MILLISECONDS))
        {
            cwe cwe1 = acwe[0];
            RealTimeChatService.b(s);
            return cwe1;
        }
        ebw.g("Babel_telephony", "TeleHangoutsService.getCallRateResponseBlocking, timeout reached");
        throw new dxc();
        Exception exception;
        exception;
        RealTimeChatService.b(s);
        throw exception;
    }

    public int a()
    {
        g.s(b);
        return 1;
    }

    public Bundle a(String s)
    {
        Bundle bundle;
        String s1;
        g.s(b);
        bundle = new Bundle();
        s1 = ebz.g(s);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        ebw.g("Babel_telephony", "TeleHangoutsService.getCallRate, invalid number");
        bundle.putBoolean("invalid_number", true);
_L4:
        return bundle;
_L2:
        try
        {
            s = b(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel_telephony", "TeleHangoutsService.getCallRate, timed out while making request", s);
            bundle.putBoolean("request_timeout", true);
            return bundle;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ebw.e("Babel_telephony", "TeleHangoutsService.getCallRate, interrupted while making request", s);
            bundle.putBoolean("request_timeout", true);
            return bundle;
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        ebw.g("Babel_telephony", "TeleHangoutsService.getCallRate, no call rate response");
        bundle.putBoolean("no_response", true);
        return bundle;
        bundle.putBoolean("is_free", s.n());
        bundle.putBoolean("does_rate_expire", s.p());
        bundle.putInt("initial_free_display_duration_ms", s.l());
        bundle.putInt("rate_ttl_ms", s.o());
        bundle.putInt("fmf_promo", s.k());
        bundle.putString("country_display", ebz.q(s1));
        s1 = s.m();
        if (s.n() || TextUtils.isEmpty(s1)) goto _L4; else goto _L3
_L3:
        bundle.putString("rate_display", b.getString(g.pP, new Object[] {
            s1
        }));
        bundle.putString("rate_display_description", b.getString(g.pQ, new Object[] {
            s1
        }));
        return bundle;
    }
}
