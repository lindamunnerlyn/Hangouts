// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.hangouts.help.impl.OpenSourceLicensesActivity;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class bwt
    implements bwm
{

    private static final Uri a = Uri.parse("https://support.google.com/hangouts/topic/6049282");

    bwt()
    {
    }

    static void a(Activity activity)
    {
        Uri uri;
        Iterator iterator;
        int i;
        uri = a;
        g.v();
        i = ((gqu)hlp.a(activity, gqu)).a();
        iterator = hlp.c(activity, bwk).iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (!((bwk)iterator.next()).a(activity, i)) goto _L4; else goto _L3
_L3:
        boolean flag = true;
_L6:
        if (flag)
        {
            ((gvc)hlp.a(activity, gvc)).a(new bwu(activity, bwm.getName(), activity, i, "hangouts", uri));
            return;
        } else
        {
            b(activity, "hangouts", uri, null);
            return;
        }
_L2:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(Activity activity, String s, Uri uri, bwj abwj[])
    {
        b(activity, s, uri, abwj);
    }

    private static void b(Activity activity, String s, Uri uri, bwj abwj[])
    {
        gcf gcf1 = ((gcg)hlp.a(activity, gcg)).a(s).a(uri).a(activity);
        amo amo1 = g.a(activity);
        gcf1.a(activity.getString(g.ms), new Intent("android.intent.action.VIEW", Uri.parse(amo1.a("babel_privacy_policy_url", "https://www.google.com/policies/privacy/"))));
        gcf1.a(activity.getString(g.mp), new Intent(activity.getApplicationContext(), com/google/android/apps/hangouts/help/impl/OpenSourceLicensesActivity));
        if ("KR".equals(g.v(activity.getApplicationContext())))
        {
            gcf1.a(activity.getString(g.mq), new Intent("android.intent.action.VIEW", Uri.parse(amo1.a("babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location"))));
        }
        uri = amo1.a("babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
        s = uri;
        if (!TextUtils.isEmpty(Locale.getDefault().getLanguage()))
        {
            s = String.valueOf(Locale.getDefault().getLanguage());
            s = uri.replace("/en/", (new StringBuilder(String.valueOf(s).length() + 2)).append("/").append(s).append("/").toString());
        }
        gcf1.a(activity.getString(g.mr), new Intent("android.intent.action.VIEW", Uri.parse(s)));
        gcf1.a(activity.getString(g.mt), new Intent("android.intent.action.VIEW", Uri.parse(amo1.a("babel_tos_url", "https://www.google.com/accounts/tos"))));
        s = new Bundle();
        for (uri = hlp.c(activity, bwl).iterator(); uri.hasNext(); ((bwl)uri.next()).a(activity, s)) { }
        gcf1.a(s);
        s = ((gdd)hlp.a(activity, gdd)).a(((gqu)hlp.a(activity, gqu)).a());
        if (abwj != null)
        {
            int j = abwj.length;
            for (int i = 0; i < j; i++)
            {
                uri = abwj[i];
                gcf1.a(((bwj) (uri)).a, ((bwj) (uri)).b, ((bwj) (uri)).c);
                s.a(2838).d();
            }

        }
        gcf1.a((new gcj()).a().a(activity.getResources().getColor(h.ib)));
        uri = (gqu)hlp.b(activity, gqu);
        if (uri != null && uri.b())
        {
            uri = uri.c().b("account_name");
            if (uri.contains("@"))
            {
                gcf1.a(new Account(uri, "com.google"));
            }
        }
        uri = gcf1.a(activity);
        ((gci)hlp.a(activity, gci)).a(activity).a(uri);
        s.a(1082).d();
    }

}
