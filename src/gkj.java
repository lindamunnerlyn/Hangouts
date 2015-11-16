// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.TelephonyManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class gkj
{

    private static int a = -1;
    private static int b = -1;

    public static int a()
    {
        if (a == -1)
        {
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                a = Runtime.getRuntime().availableProcessors();
            } else
            {
                a = a("present");
            }
        }
        return a;
    }

    private static int a(String s)
    {
        boolean flag = true;
        s = String.valueOf(s);
        int i;
        if (s.length() != 0)
        {
            s = "/sys/devices/system/cpu/".concat(s);
        } else
        {
            s = new String("/sys/devices/system/cpu/");
        }
        s = c(s);
        i = ((flag) ? 1 : 0);
        if (s != null)
        {
            s = s.split("\\-");
            i = ((flag) ? 1 : 0);
            if (s.length == 2)
            {
                int j;
                try
                {
                    i = Integer.parseInt(s[0]);
                    j = Integer.parseInt(s[1]);
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    return 1;
                }
                j = (j - i) + 1;
                i = j;
                if (j <= 0)
                {
                    i = 1;
                }
            }
        }
        return i;
    }

    public static boolean a(TelephonyManager telephonymanager)
    {
        if (android.os.Build.VERSION.SDK_INT >= 22)
        {
            return b(telephonymanager);
        }
        return telephonymanager.getPhoneType() != 0;
    }

    public static int b()
    {
        return a("online");
    }

    private static int b(String s)
    {
        s = String.valueOf(s);
        int i;
        if (s.length() != 0)
        {
            s = "/sys/devices/system/cpu/cpu0/cpufreq/".concat(s);
        } else
        {
            s = new String("/sys/devices/system/cpu/cpu0/cpufreq/");
        }
        s = c(s);
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return -1;
        }
        return i;
    }

    private static boolean b(TelephonyManager telephonymanager)
    {
        try
        {
            telephonymanager = (Boolean)Class.forName(telephonymanager.getClass().getName()).getDeclaredMethod("isVoiceCapable", new Class[0]).invoke(telephonymanager, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            gbh.a(telephonymanager.toString());
            telephonymanager = null;
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            gbh.a(telephonymanager.toString());
            telephonymanager = null;
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            gbh.a(telephonymanager.toString());
            telephonymanager = null;
        }
        // Misplaced declaration of an exception variable
        catch (TelephonyManager telephonymanager)
        {
            gbh.a(telephonymanager.toString());
            telephonymanager = null;
        }
        return telephonymanager != null && telephonymanager.booleanValue();
    }

    public static int c()
    {
        if (b == -1)
        {
            b = b("cpuinfo_max_freq");
        }
        return b;
    }

    private static String c(String s)
    {
        String s2 = null;
        Object obj1 = null;
        Object obj = null;
        String s1 = obj1;
        BufferedReader bufferedreader;
        try
        {
            bufferedreader = new BufferedReader(new FileReader(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s2;
        }
        s1 = obj1;
        s = bufferedreader.readLine();
_L2:
        s2 = s;
        s1 = s;
        bufferedreader.close();
        return s;
        s;
        s = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static int d()
    {
        return b("scaling_cur_freq");
    }

    public static int e()
    {
        return b("cpu_utilization");
    }

}
