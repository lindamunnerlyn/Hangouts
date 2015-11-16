// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.Locale;

public final class dxp
{

    private final String a;
    private final String b;

    public dxp(String s, String s1)
    {
        a = s;
        b = s1;
    }

    static dxp a(Context context, String s, boolean flag, eac eac1)
    {
        if (!eac1.a)
        {
            eev.e("Babel_telephony", "TeleExperiment.getWifiExperiment, no wifi connection.");
            return null;
        }
        String s1 = g.a(context, "babel_wifi_experiment_prerequisites", dxt.d);
        if (TextUtils.isEmpty(s1))
        {
            eev.e("Babel_telephony", "TeleExperiment.getWifiExperiment, no experiments defined.");
            return null;
        }
        String s2 = a(s1, "wifi_ssid=");
        if (!TextUtils.isEmpty(s2) && !s2.equals(g.i(context)))
        {
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s2).length() + 49)).append("TeleExperiment.getWifiExperiment, not on '").append(s2).append("' wifi.").toString());
            return null;
        }
        if (s1.contains("domestic") && (s == null || !Locale.US.getCountry().equals(eey.a(s))))
        {
            context = String.valueOf(g.u(s));
            if (context.length() != 0)
            {
                context = "TeleExperiment.getWifiExperiment, not a domestic number: ".concat(context);
            } else
            {
                context = new String("TeleExperiment.getWifiExperiment, not a domestic number: ");
            }
            eev.e("Babel_telephony", context);
            return null;
        }
        if (s1.contains("incoming") && !flag)
        {
            eev.e("Babel_telephony", "TeleExperiment.getWifiExperiment, not incoming call.");
            return null;
        }
        s = a(s1, "wifi_signal_percent_threshold=");
        if (!TextUtils.isEmpty(s))
        {
            int i;
            try
            {
                i = Integer.parseInt(s);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context = String.valueOf(s);
                if (context.length() != 0)
                {
                    context = "TeleExperiment.getWifiExperiment, invalid threshold value: ".concat(context);
                } else
                {
                    context = new String("TeleExperiment.getWifiExperiment, invalid threshold value: ");
                }
                eev.f("Babel_telephony", context);
                return null;
            }
            if (!eac1.a(i, 0))
            {
                context = String.valueOf(eac1);
                eev.e("Babel_telephony", (new StringBuilder(String.valueOf(context).length() + 68 + String.valueOf(s).length())).append("TeleExperiment.getWifiExperiment, (").append(context).append(") is not above signal threshold: ").append(s).toString());
                return null;
            }
        }
        if (g.a(context, "babel_wifi_experiment_percent_probability", 0) > (int)(Math.random() * 100D))
        {
            context = new dxp("nwc", g.a(context, "babel_wifi_experiment_flags", dxt.e));
            s = String.valueOf(context);
            eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 34)).append("TeleExperiment.getWifiExperiment, ").append(s).toString());
            return context;
        } else
        {
            eev.e("Babel_telephony", "TeleExperiment.getWifiExperiment, skipping wifi experiment");
            return null;
        }
    }

    private static String a(String s, String s1)
    {
        int i = s.indexOf(s1);
        if (i == -1)
        {
            return null;
        }
        i += s1.length();
        int j = s.indexOf(',', i);
        if (j == -1)
        {
            return s.substring(i);
        } else
        {
            return s.substring(i, j);
        }
    }

    String a()
    {
        return a;
    }

    public boolean a(String s)
    {
        return a != null && a.equals(s);
    }

    String b()
    {
        return b;
    }

    public boolean b(String s)
    {
        return b != null && b.contains(s);
    }

    public String toString()
    {
        String s = a;
        String s1 = b;
        return (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s1).length())).append(s).append("/").append(s1).toString();
    }
}
