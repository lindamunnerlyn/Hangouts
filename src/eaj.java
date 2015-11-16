// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.CopyOnWriteArrayList;

public final class eaj
{

    private static CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Context a;

    private eaj(Context context)
    {
        a = context.getApplicationContext();
    }

    public static eaj a(Context context)
    {
        return new eaj(context);
    }

    public static void a(eal eal)
    {
        b.add(eal);
    }

    private void a(String s, String s1)
    {
        String s2 = String.valueOf(eev.b(s1));
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 47 + String.valueOf(s2).length())).append("TelePreferences.updatePrefValue, key: ").append(s).append(", value: ").append(s2).toString());
        if (TextUtils.isEmpty(s1))
        {
            m().edit().remove(s).apply();
        } else
        {
            m().edit().putString(s, s1).apply();
        }
        c(s);
    }

    public static int[] a()
    {
        gdv.a();
        return dcn.c();
    }

    private void c(String s)
    {
        (new Handler(a.getMainLooper())).post(new eak(this, s));
    }

    static CopyOnWriteArrayList l()
    {
        return b;
    }

    private SharedPreferences m()
    {
        return a.getSharedPreferences("telephony_preference", 0);
    }

    public void a(int i1)
    {
        gdv.a();
        a("account_name_v2", dcn.a(a, i1));
    }

    public void a(int i1, String s)
    {
        ((gqz)hlp.a(a, gqz)).b(i1).c("incoming_wifi_call_invites", s).d();
    }

    public void a(long l1)
    {
        int i1 = e();
        if (i1 == -1)
        {
            eev.e("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found");
            return;
        } else
        {
            ((gqz)hlp.a(a, gqz)).b(i1).c("last_emergency_dialed_time_from_dark_number_in_milliseconds", l1).d();
            return;
        }
    }

    public void a(String s)
    {
        a("tycho_account_name", s);
    }

    public void a(boolean flag)
    {
        eev.e("Babel_telephony", (new StringBuilder(54)).append("TelePreferences.setWifiCallingEnabled, newValue: ").append(flag).toString());
        m().edit().putBoolean("wifi_calling_enabled", flag).apply();
        c("wifi_calling_enabled");
    }

    public int b()
    {
        aoa aoa1 = dcn.a(m().getString("account_name_v2", h()), null);
        if (aoa1 == null)
        {
            return -1;
        } else
        {
            return aoa1.h();
        }
    }

    public void b(int i1)
    {
        gdv.a();
        a("account_name_for_incoming_calls", dcn.a(a, i1));
    }

    public void b(int i1, String s)
    {
        ((gqz)hlp.a(a, gqz)).b(i1).c("dedupe_call_log", s).d();
    }

    public void b(long l1)
    {
        m().edit().putLong("last_emergency_call_over_lte_millis", l1).apply();
        c("last_emergency_call_over_lte_millis");
    }

    public void b(String s)
    {
        a("last_seen_network_country_iso", s);
    }

    public void b(boolean flag)
    {
        eev.e("Babel_telephony", (new StringBuilder(47)).append("TelePreferences.setAskEachCall, newValue: ").append(flag).toString());
        m().edit().putBoolean("ask_each_call", flag).apply();
        c("ask_each_call");
    }

    public String c(int i1)
    {
        return ((gqz)hlp.a(a, gqz)).a(i1).a("incoming_wifi_call_invites", null);
    }

    public void c(boolean flag)
    {
        m().edit().putBoolean("request_feedback", flag).apply();
        c("request_feedback");
    }

    public boolean c()
    {
        boolean flag = false;
        if (!TextUtils.isEmpty(h()))
        {
            flag = true;
        }
        return m().getBoolean("wifi_calling_enabled", flag);
    }

    public String d(int i1)
    {
        return ((gqz)hlp.a(a, gqz)).a(i1).a("dedupe_call_log", null);
    }

    public boolean d()
    {
        return m().getBoolean("ask_each_call", false);
    }

    public int e()
    {
        aoa aoa1 = dcn.a(h(), null);
        if (aoa1 == null)
        {
            return -1;
        } else
        {
            return aoa1.h();
        }
    }

    public long f()
    {
        int i1 = e();
        if (i1 == -1)
        {
            eev.e("Babel_telephony", "TelePreferences.setLastEmergencyDialedTimeFromDarkNumber, account not found");
            return 0L;
        } else
        {
            return ((gqz)hlp.a(a, gqz)).a(i1).a("last_emergency_dialed_time_from_dark_number_in_milliseconds", 0L);
        }
    }

    public int g()
    {
        gdv.a();
        aoa aoa1 = dcn.a(m().getString("account_name_for_incoming_calls", null), null);
        if (aoa1 == null)
        {
            return -1;
        } else
        {
            return aoa1.h();
        }
    }

    public String h()
    {
        return m().getString("tycho_account_name", null);
    }

    public boolean i()
    {
        return m().getBoolean("request_feedback", true);
    }

    public String j()
    {
        return m().getString("last_seen_network_country_iso", null);
    }

    public long k()
    {
        return m().getLong("last_emergency_call_over_lte_millis", 0L);
    }

}
