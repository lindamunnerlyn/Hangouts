// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class das
    implements dan
{

    public das()
    {
    }

    static void a(gmw gmw1, boolean flag)
    {
        String s = String.valueOf(ebw.b(gmw1.b("account_name")));
        ebw.c("Babel", (new StringBuilder(String.valueOf(s).length() + 87)).append("PstnUtilImpl.setAccountIsRegisteredForIncomingPstnCalls, account: ").append(s).append(", isRegistered: ").append(flag).toString());
        gmw1.b("registered_for_incoming_pstn_calls", flag);
    }

    public boolean a(Context context)
    {
        return b(context);
    }

    public boolean a(Context context, ani ani1)
    {
        return ani1 != null && g.a(ani1, apk.b) && a(context) && b(ani1);
    }

    public boolean a(Context context, String s)
    {
        Intent intent = g.a(context, s);
        s = new ArrayList();
        Iterator iterator = context.getPackageManager().queryIntentActivities(intent, 0).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
            if (resolveinfo.activityInfo == null || "com.google.android.apps.hangoutsdialer".equals(resolveinfo.activityInfo.packageName))
            {
                continue;
            }
            s.add(((Intent)intent.clone()).setPackage(resolveinfo.activityInfo.packageName).setClassName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name));
            if (!resolveinfo.activityInfo.packageName.contains("com.android"))
            {
                continue;
            }
            s = h.a(new Intent[] {
                (Intent)s.get(s.size() - 1)
            });
            break;
        } while (true);
        switch (s.size())
        {
        default:
            context.startActivity(Intent.createChooser((Intent)s.remove(s.size() - 1), context.getString(g.oC)).putExtra("android.intent.extra.INITIAL_INTENTS", ((java.io.Serializable) (s.toArray()))));
            return true;

        case 0: // '\0'
            return false;

        case 1: // '\001'
            context.startActivity((Intent)s.get(0));
            break;
        }
        return true;
    }

    public boolean a(ani ani1)
    {
        return ani1 != null && g.a(ani1, apk.b) && !ani1.F() && !ani1.q() && ani1.X() != 3;
    }

    public boolean b(Context context)
    {
        return ebk.a(context, "com.google.android.apps.hangoutsdialer");
    }

    public boolean b(Context context, ani ani1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ani1.A())
        {
            flag = flag1;
            if (a(context, ani1))
            {
                String s = context.getResources().getString(l.cu);
                context = ((gms)hgx.a(context, gms)).a(ani1.h());
                if (!ebz.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                flag = context.a(s, flag);
            }
        }
        return flag;
    }

    public boolean b(ani ani1)
    {
        return ani1 != null && !ani1.F() && !ani1.q() && ani1.Y();
    }

    public boolean c(Context context, ani ani1)
    {
        return ((gms)hgx.a(context, gms)).a(ani1.h()).d("registered_for_incoming_pstn_calls");
    }
}
