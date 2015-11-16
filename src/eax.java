// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.content.Context;

public final class eax extends eaz
{

    private final Context a;

    public eax(Context context)
    {
        a = context;
    }

    public int a()
    {
        g.s(a);
        return 3;
    }

    public void a(long l)
    {
        g.s(a);
        String s = String.valueOf("TeleWifiCallingSettingsService.setLastEmergencyDialedTimeMillisFromDarkNumber, dialedTimeMillis: ");
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 20)).append(s).append(l).toString());
        eaj.a(a).a(l);
    }

    public void a(Account account)
    {
        g.s(a);
        String s;
        if (account == null)
        {
            account = null;
        } else
        {
            account = account.name;
        }
        s = String.valueOf(eev.b(account));
        if (s.length() != 0)
        {
            s = "TeleWifiCallingSettingsService.setTychoAccount, account name: ".concat(s);
        } else
        {
            s = new String("TeleWifiCallingSettingsService.setTychoAccount, account name: ");
        }
        eev.e("Babel_telephony", s);
        eaj.a(a).a(account);
    }

    public void a(String s)
    {
        g.s(a);
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 68)).append("TeleWifiCallingSettingsService.setWifiCallingState, state: ").append(s).append(", ignored").toString());
    }

    public String b()
    {
        g.s(a);
        eev.e("Babel_telephony", "TeleWifiCallingSettingsService.getWifiCallingState, API not used");
        return null;
    }

    public Account c()
    {
        g.s(a);
        eev.e("Babel_telephony", "TeleWifiCallingSettingsService.getWifiCallingAccount, API not used");
        return null;
    }

    public void d()
    {
        g.s(a);
        eev.e("Babel_telephony", "TeleWifiCallingSettingsService.setWifiCallingAccount, ignored");
    }

    public Account e()
    {
        g.s(a);
        eev.e("Babel_telephony", "TeleWifiCallingSettingsService.getTychoAccount, API not used");
        return null;
    }
}
