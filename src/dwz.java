// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;

public final class dwz
{

    private static CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Context a;

    private dwz(Context context)
    {
        a = context.getApplicationContext();
    }

    public static dwz a(Context context)
    {
        return new dwz(context);
    }

    public static void a(dxb dxb)
    {
        b.add(dxb);
    }

    private void a(String s, String s1)
    {
        String s2 = String.valueOf(ebw.b(s1));
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 47 + String.valueOf(s2).length())).append("TelePreferences.updatePrefValue, key: ").append(s).append(", value: ").append(s2).toString());
        if (TextUtils.isEmpty(s1))
        {
            l().edit().remove(s).apply();
        } else
        {
            l().edit().putString(s, s1).apply();
        }
        c(s);
    }

    public static int[] a()
    {
        gbh.a();
        return dbf.c();
    }

    private void c(String s)
    {
        (new Handler(a.getMainLooper())).post(new dxa(this, s));
    }

    static CopyOnWriteArrayList k()
    {
        return b;
    }

    private SharedPreferences l()
    {
        return a.getSharedPreferences("telephony_preference", 0);
    }

    public void a(int i1)
    {
        gbh.a();
        a("account_name_v2", dbf.a(a, i1));
    }

    public void a(int i1, String s)
    {
        ((gms)hgx.a(a, gms)).b(i1).c("incoming_wifi_call_invites", s).d();
    }

    public void a(long l1)
    {
        int i1 = e();
        if (i1 == -1)
        {
            ebw.e("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found");
            return;
        } else
        {
            ((gms)hgx.a(a, gms)).b(i1).c("last_emergency_dialed_time_from_dark_number_in_milliseconds", l1).d();
            return;
        }
    }

    public void a(String s)
    {
        a("tycho_account_name", s);
    }

    public void a(boolean flag)
    {
        ebw.e("Babel_telephony", (new StringBuilder(54)).append("TelePreferences.setWifiCallingEnabled, newValue: ").append(flag).toString());
        l().edit().putBoolean("wifi_calling_enabled", flag).apply();
        c("wifi_calling_enabled");
    }

    public int b()
    {
        ani ani1 = dbf.a(l().getString("account_name_v2", h()), null);
        if (ani1 == null)
        {
            return -1;
        } else
        {
            return ani1.h();
        }
    }

    public void b(int i1)
    {
        gbh.a();
        a("account_name_for_incoming_calls", dbf.a(a, i1));
    }

    public void b(int i1, String s)
    {
        ((gms)hgx.a(a, gms)).b(i1).c("dedupe_call_log", s).d();
    }

    public void b(long l1)
    {
        l().edit().putLong("last_emergency_call_over_lte_millis", l1).apply();
        c("last_emergency_call_over_lte_millis");
    }

    public void b(String s)
    {
        a("last_seen_network_country_iso", s);
    }

    public void b(boolean flag)
    {
        ebw.e("Babel_telephony", (new StringBuilder(47)).append("TelePreferences.setAskEachCall, newValue: ").append(flag).toString());
        l().edit().putBoolean("ask_each_call", flag).apply();
        c("ask_each_call");
    }

    public String c(int i1)
    {
        return ((gms)hgx.a(a, gms)).a(i1).a("incoming_wifi_call_invites", null);
    }

    public boolean c()
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(h()))
        {
            flag = true;
        }
        return l().getBoolean("wifi_calling_enabled", flag);
    }

    public String d(int i1)
    {
        return ((gms)hgx.a(a, gms)).a(i1).a("dedupe_call_log", null);
    }

    public boolean d()
    {
        return l().getBoolean("ask_each_call", false);
    }

    public int e()
    {
        ani ani1 = dbf.a(h(), null);
        if (ani1 == null)
        {
            return -1;
        } else
        {
            return ani1.h();
        }
    }

    public long f()
    {
        int i1 = e();
        if (i1 == -1)
        {
            ebw.e("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found");
            return 0L;
        } else
        {
            return ((gms)hgx.a(a, gms)).a(i1).a("last_emergency_dialed_time_from_dark_number_in_milliseconds", 0L);
        }
    }

    public int g()
    {
        gbh.a();
        ani ani1 = dbf.a(l().getString("account_name_for_incoming_calls", null), null);
        if (ani1 == null)
        {
            return -1;
        } else
        {
            return ani1.h();
        }
    }

    public String h()
    {
        return l().getString("tycho_account_name", null);
    }

    public String i()
    {
        return l().getString("last_seen_network_country_iso", null);
    }

    public long j()
    {
        return l().getLong("last_emergency_call_over_lte_millis", 0L);
    }

}
