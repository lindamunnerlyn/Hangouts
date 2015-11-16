// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class add
{

    public static final Pattern a = Pattern.compile("\\s*(\"[^\"]*\"|[^<>\"]+)\\s*<([^<>]+)>\\s*");
    private static String b;
    private static TelephonyManager c;
    private static a d;
    private static final char e[] = {
        '-', '.', ',', '(', ')', ' ', '/', '\\', '*', '#', 
        '+'
    };
    private static HashSet f;

    private add()
    {
    }

    public static String a(Context context)
    {
        if (b == null)
        {
            b = b(context).getLine1Number();
        }
        return b;
    }

    public static String a(String s)
    {
        if (d != null)
        {
            s = d.c();
        }
        return s;
    }

    private static TelephonyManager b(Context context)
    {
        add;
        JVM INSTR monitorenter ;
        if (c == null)
        {
            c = (TelephonyManager)context.getSystemService("phone");
        }
        add;
        JVM INSTR monitorexit ;
        return c;
        context;
        add;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static String b(String s)
    {
        Matcher matcher = a.matcher(s);
        if (matcher.matches())
        {
            s = matcher.group(2);
        }
        return s;
    }

    public static boolean c(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            s = b(s);
            return Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
    }

    public static boolean d(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return Patterns.PHONE.matcher(s).matches();
        }
    }

    static 
    {
        f = new HashSet(e.length);
        for (int i = 0; i < e.length; i++)
        {
            f.add(Character.valueOf(e[i]));
        }

    }
}
