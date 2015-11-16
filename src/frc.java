// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;

public abstract class frc
{

    public static fre a;
    public static frd b;
    private final char c = '\001';
    private final char d = '\002';
    private final String e;
    private final String f;
    private final Bundle g;

    frc(Bundle bundle)
    {
        g = bundle;
        e = Pattern.quote(String.valueOf(c));
        f = Pattern.quote(String.valueOf(d));
    }

    private static double a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return 0.0D;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g.a("PhoneEmailDecoder", "NumberFormatException", s);
            return 0.0D;
        }
        return d1;
    }

    private static int a(String s, char c1, int i, int j)
    {
        c1 = s.indexOf(c1, i);
        if (c1 >= 0 && c1 < j)
        {
            return c1;
        } else
        {
            return -1;
        }
    }

    private final void a(ArrayList arraylist, String s)
    {
        int k = s.length();
        int i = 0;
        while (i < k) 
        {
            int j = s.indexOf(d, i);
            int l;
            int i1;
            if (j < 0)
            {
                j = s.length();
            }
            l = a(s, c, i, j);
            i1 = a(s, c, l + 1, j);
            if (l >= 0 && i1 >= 0)
            {
                a(arraylist, s.substring(i, l), s.substring(l + 1, i1), s.substring(i1 + 1, j), 0.0D, 0.0D, 0.0D, 0.0D, 0.0D, null, null, null, null, null);
            }
            i = j + 1;
        }
    }

    private void a(ArrayList arraylist, String s, String s1, String s2, double d1, double d2, double d3, double d4, double d5, 
            String s3, String s4, String s5, String s6, String s7)
    {
        if (TextUtils.isEmpty(s2))
        {
            return;
        }
        String s8 = g.getString(s);
        s = s8;
        if (TextUtils.isEmpty(s8))
        {
            s = s1;
        }
        arraylist.add(a(s2, s, d1, d2, d3, d4, d5, s3, s4, s5, s6, s7));
    }

    private final void b(ArrayList arraylist, String s)
    {
        s = TextUtils.split(s, f);
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            String as[] = TextUtils.split(s[i], e);
            if (as.length < 13)
            {
                g.m(5);
            } else
            {
                a(arraylist, as[0], as[1], as[2], a(as[3]), a(as[4]), a(as[5]), a(as[6]), a(as[7]), fst.a(as[8]), fst.a(as[9]), fst.a(as[10]), fst.a(as[11]), fst.a(as[12]));
            }
            i++;
        }
    }

    protected abstract Object a(String s, String s1, double d1, double d2, double d3, double d4, double d5, String s2, String s3, 
            String s4, String s5, String s6);

    public final ArrayList a(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        if (TextUtils.isEmpty(s))
        {
            return arraylist;
        }
        if (flag)
        {
            b(arraylist, s);
            return arraylist;
        } else
        {
            a(arraylist, s);
            return arraylist;
        }
    }

    static 
    {
        a = new fre(Bundle.EMPTY);
        b = new frd(Bundle.EMPTY);
    }
}
