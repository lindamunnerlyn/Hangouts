// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class daw
{

    public final boolean a;
    final boolean b;
    private final String c;
    private final dat d;

    private daw(boolean flag, dat dat1)
    {
        a = flag;
        b = false;
        c = dat1.c;
        d = dat1;
    }

    public daw(boolean flag, boolean flag1, String s)
    {
        a = flag;
        b = flag1;
        c = s;
        d = null;
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gbh.a("Must either be reachable or an emergency number", flag);
        if (flag1)
        {
            gbh.b("Phone number must be specified for emergency number", TextUtils.isEmpty(s));
        }
    }

    public static daw a(Context context, int i, atd atd1, int j, String s)
    {
        boolean flag2;
        boolean flag3;
        flag2 = true;
        flag3 = ebz.j(s);
        day.a[atd1.ordinal()];
        JVM INSTR tableswitch 1 4: default 48
    //                   1 90
    //                   2 310
    //                   3 323
    //                   4 323;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        context = String.valueOf(atd1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(context).length() + 27)).append("Unknown conversation type: ").append(context).toString());
_L2:
        if (g.e(j)) goto _L6; else goto _L5
_L5:
        boolean flag;
        boolean flag1;
        if (j == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L9:
        gbh.a("SMS_MESSAGE conversation type with non-SMS transport type", flag1);
        if (flag3)
        {
            return new daw(a(context, i), true, s);
        }
        break; /* Loop/switch isn't completed */
_L7:
        flag1 = false;
        if (true) goto _L9; else goto _L8
_L8:
        if (!g.g(j)) goto _L11; else goto _L10
_L10:
        if (TextUtils.isEmpty(s))
        {
            flag1 = false;
        } else
        {
            flag1 = Patterns.EMAIL_ADDRESS.matcher(s).matches();
        }
        if (!flag1) goto _L12; else goto _L11
_L11:
        context = new dat(context, i);
        context.c = s;
_L13:
        if (!context.a())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        return new daw(flag1, context);
_L12:
        atd1 = ebz.k(s);
        j = atd1.length();
        context = new dat(context, i);
        context.c = s;
        if (!ebz.b(atd1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context.b = flag1;
        if (j - 1 > 11)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        context.a = flag1;
          goto _L13
_L3:
        return new daw(true, flag3, s);
_L4:
        return new daw(true, false, null);
    }

    private static void a(Context context, android.content.DialogInterface.OnCancelListener oncancellistener, String s, String s1)
    {
        context = (new android.app.AlertDialog.Builder(context)).setTitle(s).setMessage(s1).setCancelable(false).setPositiveButton(0x104000a, new dax());
        if (oncancellistener != null)
        {
            context.setOnCancelListener(oncancellistener);
        }
        context.create().show();
    }

    public static void a(Context context, String s, android.content.DialogInterface.OnCancelListener oncancellistener)
    {
        ebw.c("Babel_Reachability", "Showing warning dialog for trying to SMS emergency number");
        a(context, oncancellistener, context.getString(g.oJ), context.getString(g.oI, new Object[] {
            ebz.p(s)
        }));
    }

    public static boolean a(Context context, int i)
    {
        return ((ahl)hgx.a(context, ahl)).a(i) && ebz.f();
    }

    public void a(Context context, boolean flag)
    {
label0:
        {
label1:
            {
                if (!a)
                {
                    if (!b)
                    {
                        break label0;
                    }
                    if (!flag)
                    {
                        break label1;
                    }
                    String s = c;
                    ebw.c("Babel_Reachability", "Showing warning dialog for trying to invite an emergency number to Hangouts");
                    a(context, null, context.getString(g.oM), context.getString(g.oL, new Object[] {
                        ebz.p(s)
                    }));
                }
                return;
            }
            a(context, c, null);
            return;
        }
        d.a(context, null);
    }
}
