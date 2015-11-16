// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class drs
{

    private static final drt a = new drt(1, 109);
    private static final Pattern b = Pattern.compile("([1-9]+\\d*)(w|m|y)");

    public static String a(drt drt1)
    {
        Resources resources = g.nS.getResources();
        switch (drt1.b)
        {
        default:
            int i = drt1.b;
            throw new IllegalArgumentException((new StringBuilder(48)).append("SmsAutoDelete: invalid duration unit ").append(i).toString());

        case 119: // 'w'
            return resources.getQuantityString(g.hZ, drt1.a, new Object[] {
                Integer.valueOf(drt1.a)
            });

        case 109: // 'm'
            return resources.getQuantityString(g.hN, drt1.a, new Object[] {
                Integer.valueOf(drt1.a)
            });

        case 121: // 'y'
            return resources.getQuantityString(g.ia, drt1.a, new Object[] {
                Integer.valueOf(drt1.a)
            });
        }
    }

    public static void a(int i, long l)
    {
        switch (i)
        {
        default:
            ebw.g("Babel_SMS", (new StringBuilder(51)).append("SmsStorageStatusManager: invalid action ").append(i).toString());
            return;

        case 0: // '\0'
            any.c();
            return;

        case 1: // '\001'
            any.a(l);
            return;

        case 2: // '\002'
            any.a(l);
            break;
        }
        ((drw)hgx.a(g.nS, drw)).m();
    }

    public static boolean a()
    {
        return ((drw)hgx.a(g.nS, drw)).l();
    }

    public static long b(drt drt1)
    {
        switch (drt1.b)
        {
        default:
            return -1L;

        case 119: // 'w'
            return (long)drt1.a * 0x240c8400L;

        case 109: // 'm'
            return (long)drt1.a * 0x9a7ec800L;

        case 121: // 'y'
            return (long)drt1.a * 0x757b12c00L;
        }
    }

    public static drt b()
    {
        String s;
        Object obj;
        s = g.a(g.nS, "babel_sms_storage_purging_message_retaining_duration", "1m");
        obj = b.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = new drt(Integer.parseInt(((Matcher) (obj)).group(1)), ((Matcher) (obj)).group(2).charAt(0));
        return ((drt) (obj));
        NumberFormatException numberformatexception;
        numberformatexception;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "SmsAutoDelete: invalid duration ".concat(s);
        } else
        {
            s = new String("SmsAutoDelete: invalid duration ");
        }
        ebw.g("Babel_SMS", s);
        return a;
    }

    public static void c()
    {
        any.a(b(b()));
    }

}
