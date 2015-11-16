// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public final class gfi
{

    private static int a = -1;
    private static int b = -1;
    private static final Set c = new HashSet();

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
                    gne.a(5, "vclib", "Could not parse cpu count.");
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

    public static int b()
    {
        return a("online");
    }

    private static int b(String s)
    {
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "/sys/devices/system/cpu/cpu0/cpufreq/".concat(s);
        } else
        {
            s = new String("/sys/devices/system/cpu/cpu0/cpufreq/");
        }
        if (c.contains(s))
        {
            return -1;
        }
        s = c(s);
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gne.a(5, "vclib", "Could not parse cpu frequency value.");
            i = -1;
        }
        return i;
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
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        BufferedReader bufferedreader = new BufferedReader(new FileReader(s));
        Object obj;
        obj = bufferedreader;
        s1 = s2;
        s2 = bufferedreader.readLine();
        obj = bufferedreader;
        s1 = s2;
        bufferedreader.close();
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gne.a(5, "vclib", "Could not close file reader.");
            return s2;
        }
_L3:
        return s2;
        obj;
        bufferedreader = null;
_L7:
        obj = bufferedreader;
        c.add(s);
        obj = bufferedreader;
        s = String.valueOf(s);
        obj = bufferedreader;
        if (s.length() == 0) goto _L2; else goto _L1
_L1:
        obj = bufferedreader;
        s = "Could not find or read from file: ".concat(s);
_L4:
        obj = bufferedreader;
        gne.a(5, "vclib", s);
        s2 = s1;
        if (bufferedreader != null)
        {
            try
            {
                bufferedreader.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                gne.a(5, "vclib", "Could not close file reader.");
                return s1;
            }
            return s1;
        }
          goto _L3
_L2:
        obj = bufferedreader;
        s = new String("Could not find or read from file: ");
          goto _L4
        s;
_L6:
        if (obj != null)
        {
            try
            {
                ((BufferedReader) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                gne.a(5, "vclib", "Could not close file reader.");
            }
        }
        throw s;
        s;
        obj = null;
        if (true) goto _L6; else goto _L5
_L5:
        IOException ioexception;
        ioexception;
          goto _L7
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
