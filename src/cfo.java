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

public final class cfo
{

    public static final boolean a = false;

    public static Uri a(Context context, int i, cfq cfq1)
    {
        return eep.c(b(context, i, cfq1));
    }

    public static cfq a(int i)
    {
        switch (i)
        {
        default:
            return cfq.b;

        case 3: // '\003'
            return cfq.a;

        case 2: // '\002'
            return cfq.c;
        }
    }

    public static CharSequence a(Context context, String s, CharSequence charsequence)
    {
        return a(context, s, charsequence, null, 0, l.gW);
    }

    public static CharSequence a(Context context, String s, CharSequence charsequence, String s1, int i)
    {
        return a(context, s, charsequence, s1, i, l.gV);
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
                spannablestringbuilder.append(context.getString(l.gU));
            }
            spannablestringbuilder.append(g(context, i));
        }
        return spannablestringbuilder;
    }

    public static void a(Context context, int i)
    {
        a(context, i, true, EnumSet.of(cfr.a));
    }

    public static void a(Context context, int i, dgm dgm1)
    {
        a(context, i, dgm1, false, jmq.a());
    }

    public static void a(Context context, int i, dgm dgm1, boolean flag, jnv jnv)
    {
        switch (cfp.a[dgm1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            g.a(dcn.e(i), 2362);
            // fall through

        case 2: // '\002'
            a(context, i, true, EnumSet.allOf(cfr), flag, false, jnv);
            return;

        case 3: // '\003'
            a(context, i, false, EnumSet.allOf(cfr), flag, false, jnv);
            break;
        }
    }

    public static void a(Context context, int i, String s)
    {
        context.startService((new cfb()).a(context, i, s));
    }

    public static void a(Context context, int i, String s, String s1)
    {
        long l1 = SystemClock.elapsedRealtime();
        cab cab1 = new cab();
        char c1;
        if (f(context, i))
        {
            c1 = '\u01C6';
        } else
        {
            c1 = '\u01C7';
        }
        h.a(i, l1, 10, cab1.a(c1).c(s).a(s1));
        a(context, i, false, EnumSet.allOf(cfr), true, true, jmq.a());
    }

    public static void a(Context context, int i, boolean flag)
    {
        a(context, i, flag, EnumSet.allOf(cfr));
    }

    private static void a(Context context, int i, boolean flag, EnumSet enumset)
    {
        a(context, i, flag, enumset, false, false, jmq.a());
    }

    private static void a(Context context, int i, boolean flag, EnumSet enumset, boolean flag1, boolean flag2, jnv jnv)
    {
        if (a)
        {
            String s = String.valueOf(enumset);
            eev.b("Babel", (new StringBuilder(String.valueOf(s).length() + 57)).append("RealTimeChatNotifications.update silent: ").append(flag).append(" coverage: ").append(s).toString());
        }
        if (f(context, i)) goto _L2; else goto _L1
_L1:
        if (a)
        {
            eev.b("Babel", "notifications disabled");
        }
        cez.a(context, i);
        cep.a(context, i);
_L4:
        if (enumset.contains(cfr.c))
        {
            context.startService((new cek()).a(context, i));
        }
        return;
_L2:
        if (enumset.contains(cfr.a))
        {
            (new cfc()).a(context, i, flag, flag1, flag2, jnv);
        }
        if (enumset.contains(cfr.b))
        {
            (new cer()).a(context, i, flag, jnv);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String b(Context context, int i, cfq cfq1)
    {
        drj drj1 = (drj)hlp.a(context, drj);
        cfp.b[cfq1.ordinal()];
        JVM INSTR tableswitch 1 3: default 44
    //                   1 55
    //                   2 62
    //                   3 69;
           goto _L1 _L2 _L3 _L4
_L1:
        context = "chat_notification_sound_key";
_L6:
        return drj1.a(context, i);
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
        (new cea()).a(context, i);
    }

    public static void b(Context context, int i, String s)
    {
        context.startService((new ceq()).a(context, i, s));
    }

    public static void c(Context context, int i)
    {
        a(context, i, true, EnumSet.of(cfr.c));
    }

    public static void c(Context context, int i, String s)
    {
        context.startService((new cej()).a(context, i, s));
    }

    public static void d(Context context, int i)
    {
        a(context, i, ((String) (null)));
        b(context, i, ((String) (null)));
        c(context, i, null);
    }

    public static void e(Context context, int i)
    {
        cep.a(context, i);
        cez.a(context, i);
        ceh.a(context, i);
    }

    static boolean f(Context context, int i)
    {
        if (!((drj)hlp.a(context, drj)).a(i))
        {
            return false;
        }
        long l1 = ((drj)hlp.a(context, drj)).d(i) / 1000L;
        return System.currentTimeMillis() > l1;
    }

    static CharSequence g(Context context, int i)
    {
        TextAppearanceSpan textappearancespan;
        SpannableStringBuilder spannablestringbuilder;
        int j;
        textappearancespan = new TextAppearanceSpan(context, g.id);
        spannablestringbuilder = new SpannableStringBuilder();
        j = l.gM;
        if (i != 2) goto _L2; else goto _L1
_L1:
        j = l.gI;
_L4:
        spannablestringbuilder.append(context.getText(j));
        spannablestringbuilder.setSpan(textappearancespan, 0, spannablestringbuilder.length(), 0);
        return spannablestringbuilder;
_L2:
        if (i == 3)
        {
            j = l.gY;
        } else
        if (i == 4)
        {
            j = l.gK;
        } else
        if (i == 6)
        {
            j = l.gX;
        } else
        if (i == 7)
        {
            j = l.ko;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        hnc hnc = eev.n;
    }
}
