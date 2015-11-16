// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class dul
{

    private static final dum a = new dum(1, 109);
    private static final Pattern b = Pattern.compile("([1-9]+\\d*)(w|m|y)");

    public static String a(dum dum1)
    {
        Resources resources = g.nU.getResources();
        switch (dum1.b)
        {
        default:
            int i = dum1.b;
            throw new IllegalArgumentException((new StringBuilder(48)).append("SmsAutoDelete: invalid duration unit ").append(i).toString());

        case 119: // 'w'
            return resources.getQuantityString(g.hR, dum1.a, new Object[] {
                Integer.valueOf(dum1.a)
            });

        case 109: // 'm'
            return resources.getQuantityString(g.hF, dum1.a, new Object[] {
                Integer.valueOf(dum1.a)
            });

        case 121: // 'y'
            return resources.getQuantityString(g.hS, dum1.a, new Object[] {
                Integer.valueOf(dum1.a)
            });
        }
    }

    public static void a(int i, long l)
    {
        switch (i)
        {
        default:
            eev.g("Babel_SMS", (new StringBuilder(51)).append("SmsStorageStatusManager: invalid action ").append(i).toString());
            return;

        case 0: // '\0'
            aoq.c();
            return;

        case 1: // '\001'
            aoq.a(l);
            return;

        case 2: // '\002'
            aoq.a(l);
            break;
        }
        ((dup)hlp.a(g.nU, dup)).n();
    }

    public static boolean a()
    {
        return ((dup)hlp.a(g.nU, dup)).m();
    }

    public static long b(dum dum1)
    {
        switch (dum1.b)
        {
        default:
            return -1L;

        case 119: // 'w'
            return (long)dum1.a * 0x240c8400L;

        case 109: // 'm'
            return (long)dum1.a * 0x9a7ec800L;

        case 121: // 'y'
            return (long)dum1.a * 0x757b12c00L;
        }
    }

    public static dum b()
    {
        String s;
        Object obj;
        s = g.a(g.nU, "babel_sms_storage_purging_message_retaining_duration", "1m");
        obj = b.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = new dum(Integer.parseInt(((Matcher) (obj)).group(1)), ((Matcher) (obj)).group(2).charAt(0));
        return ((dum) (obj));
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
        eev.g("Babel_SMS", s);
        return a;
    }

    public static void c()
    {
        aoq.a(b(b()));
    }

}
