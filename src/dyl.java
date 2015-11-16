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

public final class dyl
    implements ckh, cow
{

    private dyd a;
    private final ber b = (new bes()).a("telephony").b("Provide WiFi calling capability to Android system.").a(true).a();
    private final dxn c = new dxn();

    public dyl()
    {
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
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 14)).append(s).append(flag1).append(" to ").append(flag).toString());
        if (!flag1 || flag) goto _L4; else goto _L3
_L3:
        i(context).clearAccounts();
        g.t(context);
_L6:
        return;
_L2:
        if ("tycho_users".equals(s))
        {
            if (TextUtils.isEmpty(eaj.a(context).h()))
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
            android.telecom.PhoneAccount.Builder builder = new android.telecom.PhoneAccount.Builder(g.l(context), context.getString(g.pt));
            ArrayList arraylist = new ArrayList();
            arraylist.add("tel");
            telecommanager.registerPhoneAccount(builder.setCapabilities(17).setShortDescription(context.getString(g.ps)).setSupportedUriSchemes(arraylist).build());
            g.t(context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = String.valueOf(context);
        }
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(context).length() + 69)).append("TeleModule.updateConnectionManagerRegistration, registration failed, ").append(context).toString());
        return;
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static void g(Context context)
    {
        aoa aoa1;
        eaj eaj1;
        aoa aoa2;
        eaj1 = eaj.a(context);
        aoa2 = dcn.e(eaj1.g());
        aoa1 = dcn.e(eaj.a(context).b());
        if (aoa1 != null) goto _L2; else goto _L1
_L1:
        aoa1 = null;
_L4:
        String s = String.valueOf("TeleModule.updateIncomingCallRegistration, preferred account for incoming calls changed from: ");
        String s1 = String.valueOf(g.b(aoa2));
        String s2 = String.valueOf(g.b(aoa1));
        eev.e("Babel_telephony", (new StringBuilder(String.valueOf(s).length() + 4 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(" to ").append(s2).toString());
        if (aoa2 != null && !aoa2.equals(aoa1))
        {
            dcn.c(aoa2);
        }
        if (aoa1 != null && !((dbt)hlp.a(context, dbt)).c(context, aoa1))
        {
            eev.e("Babel_telephony", "TeleModule.updateIncomingCallRegistration, registering new account");
            dcn.c(aoa1);
        }
        if (!Objects.equals(aoa2, aoa1))
        {
            int j;
            if (aoa1 == null)
            {
                j = -1;
            } else
            {
                j = aoa1.h();
            }
            eaj1.b(j);
        }
        return;
_L2:
        j = dyd.c(context, aoa1);
        switch (j)
        {
        default:
            gdv.a((new StringBuilder(39)).append("Unknown registration state: ").append(j).toString());
            aoa1 = null;
            break;

        case 1: // '\001'
            aoa1 = null;
            break;

        case 2: // '\002'
            aoa1 = null;
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
                a = new dyd(context);
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
        eev.e("Babel_telephony", "TeleModule.launchCompleted");
        f(context);
        g(context);
        Object obj = g.a(context);
        if (g.m(context))
        {
            String as[] = ((amo) (obj)).a("babel_tycho_only_short_codes", "+1611,+1711,+1911").split(",");
            for (l = as.length; j < l; j++)
            {
                eey.i(as[j]);
            }

        } else
        {
            String as1[] = ((amo) (obj)).a("gv_supported_service_codes", "+1611,+1711,+1911").split(",");
            int i1 = as1.length;
            for (int k = l; k < i1; k++)
            {
                eey.i(as1[k]);
            }

        }
        obj = ((amo) (obj)).a("babel_us_anonymous_call_prefix", "*67");
        eey.c(Locale.US.getCountry(), ((String) (obj)));
        g.a(context).a(new dyn(context));
        eaj.a(new eal(context));
    }

    public ber[] a()
    {
        return (new ber[] {
            b
        });
    }

    public dxn b()
    {
        return c;
    }

    public ckh[] b(Context context)
    {
        if (i(context) != null)
        {
            return (ckh[])b.a(context, ckh, this);
        } else
        {
            return new ckh[0];
        }
    }

    public bqd[] c(Context context)
    {
        h(context);
        if (a != null)
        {
            return (bqd[])b.a(context, bqd, a);
        } else
        {
            return new bqd[0];
        }
    }

    public dij[] c()
    {
        return (new dij[] {
            c
        });
    }

    public cow[] d(Context context)
    {
        return (cow[])b.a(context, cow, this);
    }

    public dyd e(Context context)
    {
        h(context);
        return a;
    }
}
