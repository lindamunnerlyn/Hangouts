// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.TextAppearanceSpan;
import java.util.EnumSet;

public final class cej
{

    public static final boolean a = false;

    public static Uri a(Context context, int i, cel cel1)
    {
        return ebr.c(b(context, i, cel1));
    }

    public static cel a(int i)
    {
        switch (i)
        {
        default:
            return cel.b;

        case 3: // '\003'
            return cel.a;

        case 2: // '\002'
            return cel.c;
        }
    }

    public static CharSequence a(Context context, String s, CharSequence charsequence)
    {
        return a(context, s, charsequence, null, 0, l.hn);
    }

    public static CharSequence a(Context context, String s, CharSequence charsequence, String s1, int i)
    {
        return a(context, s, charsequence, s1, i, l.hm);
    }

    private static CharSequence a(Context context, String s, CharSequence charsequence, String s1, int i, int j)
    {
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            spannablestringbuilder.append(s);
            spannablestringbuilder.setSpan(new StyleSpan(1), 0, s.length(), 33);
        }
        if (!TextUtils.isEmpty(charsequence))
        {
            if (spannablestringbuilder.length() > 0)
            {
                spannablestringbuilder.append(context.getString(j));
            }
            spannablestringbuilder.append(charsequence);
        }
        if (!TextUtils.isEmpty(s1))
        {
            if (spannablestringbuilder.length() > 0)
            {
                spannablestringbuilder.append(context.getString(l.hl));
            }
            spannablestringbuilder.append(g(context, i));
        }
        return spannablestringbuilder;
    }

    public static void a(Context context, int i)
    {
        a(context, i, true, EnumSet.of(cem.a));
    }

    public static void a(Context context, int i, dfd dfd1)
    {
        a(context, i, dfd1, false, jhb.d());
    }

    public static void a(Context context, int i, dfd dfd1, boolean flag, jhb jhb1)
    {
        switch (cek.a[dfd1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            g.a(dbf.e(i), 2362);
            // fall through

        case 2: // '\002'
            a(context, i, true, EnumSet.allOf(cem), flag, false, jhb1);
            return;

        case 3: // '\003'
            a(context, i, false, EnumSet.allOf(cem), flag, false, jhb1);
            break;
        }
    }

    public static void a(Context context, int i, String s)
    {
        context.startService((new cdw()).a(context, i, s));
    }

    public static void a(Context context, int i, String s, String s1)
    {
        long l1 = SystemClock.elapsedRealtime();
        byy byy1 = new byy();
        char c1;
        if (f(context, i))
        {
            c1 = '\u01C6';
        } else
        {
            c1 = '\u01C7';
        }
        h.a(i, l1, 10, byy1.a(c1).c(s).a(s1));
        a(context, i, false, EnumSet.allOf(cem), true, true, jhb.d());
    }

    public static void a(Context context, int i, boolean flag)
    {
        a(context, i, flag, EnumSet.allOf(cem));
    }

    private static void a(Context context, int i, boolean flag, EnumSet enumset)
    {
        a(context, i, flag, enumset, false, false, jhb.d());
    }

    private static void a(Context context, int i, boolean flag, EnumSet enumset, boolean flag1, boolean flag2, jhb jhb1)
    {
        if (a)
        {
            String s = String.valueOf(enumset);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s).length() + 57)).append("RealTimeChatNotifications.update silent: ").append(flag).append(" coverage: ").append(s).toString());
        }
        if (f(context, i)) goto _L2; else goto _L1
_L1:
        if (a)
        {
            ebw.b("Babel", "notifications disabled");
        }
        cdu.a(context, i);
        cdk.a(context, i);
_L4:
        if (enumset.contains(cem.c))
        {
            context.startService((new cdf()).a(context, i));
        }
        return;
_L2:
        if (enumset.contains(cem.a))
        {
            (new cdx()).a(context, i, flag, flag1, flag2, jhb1);
        }
        if (enumset.contains(cem.b))
        {
            (new cdm()).a(context, i, flag, jhb1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(Context context, int i, cel cel1)
    {
        doq doq1 = (doq)hgx.a(context, doq);
        cek.b[cel1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 55
    //                   2 62
    //                   3 69;
           goto _L1 _L2 _L3 _L4
_L1:
        context = "chat_notification_sound_key";
_L6:
        return doq1.a(context, i);
_L2:
        context = "sms_notification_sound_key";
        continue; /* Loop/switch isn't completed */
_L3:
        context = "gv_sms_sound_key";
        continue; /* Loop/switch isn't completed */
_L4:
        context = "gv_voicemail_sound_key";
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static void b(Context context, int i)
    {
        (new ccv()).a(context, i);
    }

    public static void b(Context context, int i, String s)
    {
        context.startService((new cdl()).a(context, i, s));
    }

    public static void c(Context context, int i)
    {
        a(context, i, true, EnumSet.of(cem.c));
    }

    public static void c(Context context, int i, String s)
    {
        context.startService((new cde()).a(context, i, s));
    }

    public static void d(Context context, int i)
    {
        a(context, i, ((String) (null)));
        b(context, i, ((String) (null)));
        c(context, i, null);
    }

    public static void e(Context context, int i)
    {
        cdk.a(context, i);
        cdu.a(context, i);
        cdc.a(context, i);
    }

    static boolean f(Context context, int i)
    {
        if (!((doq)hgx.a(context, doq)).a(i))
        {
            return false;
        }
        long l1 = ((doq)hgx.a(context, doq)).d(i) / 1000L;
        return System.currentTimeMillis() > l1;
    }

    static CharSequence g(Context context, int i)
    {
        TextAppearanceSpan textappearancespan;
        SpannableStringBuilder spannablestringbuilder;
        int j;
        textappearancespan = new TextAppearanceSpan(context, g.il);
        spannablestringbuilder = new SpannableStringBuilder();
        j = l.hd;
        if (i != 2) goto _L2; else goto _L1
_L1:
        j = l.gZ;
_L4:
        spannablestringbuilder.append(context.getText(j));
        spannablestringbuilder.setSpan(textappearancespan, 0, spannablestringbuilder.length(), 0);
        return spannablestringbuilder;
_L2:
        if (i == 3)
        {
            j = l.hp;
        } else
        if (i == 4)
        {
            j = l.hb;
        } else
        if (i == 6)
        {
            j = l.ho;
        } else
        if (i == 7)
        {
            j = l.kV;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        hik hik = ebw.n;
    }
}
