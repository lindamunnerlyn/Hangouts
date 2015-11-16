// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageManager;
import android.telecom.TelecomManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public final class dvd
    implements cjc, cne
{

    private duv a;
    private final beb b = (new bec()).a("telephony").b("Provide WiFi calling capability to Android system.").a(true).a();
    private final duf c = new duf();

    public dvd()
    {
    }

    public static dyl b()
    {
        return new dwf();
    }

    public static void f(Context context)
    {
        String s;
        boolean flag;
        boolean flag1;
        flag = true;
        flag1 = g.m(context);
        s = g.a(context, "babel_user_to_allow_wifi_calling_for", "tycho_users");
        if (!"hangouts_testing_users".equals(s)) goto _L2; else goto _L1
_L1:
        s = String.valueOf("TeleModule.updateConnectionManagerRegistration, registration preference changed from ");
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 14)).append(s).append(flag1).append(" to ").append(flag).toString());
        if (!flag1 || flag) goto _L4; else goto _L3
_L3:
        i(context).clearAccounts();
        g.t(context);
_L6:
        return;
_L2:
        if ("tycho_users".equals(s))
        {
            if (TextUtils.isEmpty(dwz.a(context).h()))
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag1 || !flag) goto _L6; else goto _L5
_L5:
        try
        {
            TelecomManager telecommanager = i(context);
            android.telecom.PhoneAccount.Builder builder = new android.telecom.PhoneAccount.Builder(g.l(context), context.getString(g.pr));
            ArrayList arraylist = new ArrayList();
            arraylist.add("tel");
            telecommanager.registerPhoneAccount(builder.setCapabilities(17).setShortDescription(context.getString(g.pq)).setSupportedUriSchemes(arraylist).build());
            g.t(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
        }
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(context).length() + 69)).append("TeleModule.updateConnectionManagerRegistration, registration failed, ").append(context).toString());
        return;
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static void g(Context context)
    {
        ani ani1;
        dwz dwz1;
        ani ani2;
        dwz1 = dwz.a(context);
        ani2 = dbf.e(dwz1.g());
        ani1 = dbf.e(dwz.a(context).b());
        if (ani1 != null) goto _L2; else goto _L1
_L1:
        ani1 = null;
_L4:
        String s = String.valueOf("TeleModule.updateIncomingCallRegistration, preferred account for incoming calls changed from: ");
        String s1 = g.b(ani2);
        String s2 = g.b(ani1);
        ebw.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" to ").append(s2).toString());
        if (ani2 != null && !ani2.equals(ani1))
        {
            dbf.c(ani2);
        }
        if (ani1 != null && !((dan)hgx.a(context, dan)).c(context, ani1))
        {
            ebw.e("Babel_telephony", "TeleModule.updateIncomingCallRegistration, registering new account");
            dbf.c(ani1);
        }
        if (!Objects.equals(ani2, ani1))
        {
            int j;
            if (ani1 == null)
            {
                j = -1;
            } else
            {
                j = ani1.h();
            }
            dwz1.b(j);
        }
        return;
_L2:
        j = duv.c(context, ani1);
        switch (j)
        {
        default:
            gbh.a((new StringBuilder(39)).append("Unknown registration state: ").append(j).toString());
            ani1 = null;
            break;

        case 1: // '\001'
            ani1 = null;
            break;

        case 2: // '\002'
            ani1 = null;
            break;

        case 3: // '\003'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void h(Context context)
    {
        if (a == null)
        {
            context = i(context);
            if (context != null)
            {
                a = new duv(context);
            }
        }
    }

    private static TelecomManager i(Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < 22)
        {
            return null;
        }
        if (!context.getPackageManager().hasSystemFeature("android.software.connectionservice"))
        {
            return null;
        }
        context = ((Context) (context.getSystemService("telecom")));
        if (context == null)
        {
            return null;
        } else
        {
            return (TelecomManager)context;
        }
    }

    public void a(Context context)
    {
        int l = 0;
        int j = 0;
        ebw.e("Babel_telephony", "TeleModule.launchCompleted");
        f(context);
        g(context);
        Object obj = g.a(context);
        if (g.m(context))
        {
            String as[] = ((alw) (obj)).a("babel_tycho_only_short_codes", "+1611,+1711,+1911").split(",");
            for (l = as.length; j < l; j++)
            {
                ebz.i(as[j]);
            }

        } else
        {
            String as1[] = ((alw) (obj)).a("gv_supported_service_codes", "+1611,+1711,+1911").split(",");
            int i1 = as1.length;
            for (int k = l; k < i1; k++)
            {
                ebz.i(as1[k]);
            }

        }
        obj = ((alw) (obj)).a("babel_us_anonymous_call_prefix", "*67");
        ebz.c(Locale.US.getCountry(), ((String) (obj)));
        g.a(context).a(new dvf(context));
        dwz.a(new dxb(context));
    }

    public beb[] a()
    {
        return (new beb[] {
            b
        });
    }

    public cjc[] b(Context context)
    {
        if (i(context) != null)
        {
            return (cjc[])b.a(context, cjc, this);
        } else
        {
            return new cjc[0];
        }
    }

    public duf c()
    {
        return c;
    }

    public bpu[] c(Context context)
    {
        h(context);
        if (a != null)
        {
            return (bpu[])b.a(context, bpu, a);
        } else
        {
            return new bpu[0];
        }
    }

    public cne[] d(Context context)
    {
        return (cne[])b.a(context, cne, this);
    }

    public dha[] d()
    {
        return (new dha[] {
            c
        });
    }

    public duv e(Context context)
    {
        h(context);
        return a;
    }
}
