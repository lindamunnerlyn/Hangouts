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

final class bwa
    implements bvt
{

    private static final Uri a = Uri.parse("https://support.google.com/hangouts/topic/6049282");

    bwa()
    {
    }

    static void a(Activity activity)
    {
        Object obj = a;
        fzr fzr1 = ((fzs)hgx.a(activity, fzs)).a("hangouts").a(((Uri) (obj))).a(activity);
        alw alw1 = g.a(activity);
        fzr1.a(activity.getString(g.mE), new Intent("android.intent.action.VIEW", Uri.parse(alw1.a("babel_privacy_policy_url", "https://www.google.com/policies/privacy/"))));
        fzr1.a(activity.getString(g.mB), new Intent(activity.getApplicationContext(), com/google/android/apps/hangouts/help/impl/OpenSourceLicensesActivity));
        if ("KR".equals(g.v(activity.getApplicationContext())))
        {
            fzr1.a(activity.getString(g.mC), new Intent("android.intent.action.VIEW", Uri.parse(alw1.a("babel_location_tos_url", "https://www.google.co.kr/intl/ko/policies/terms/location"))));
        }
        String s = alw1.a("babel_maps_tos_url", "https://www.google.com/intl/en/help/terms_maps.html");
        obj = s;
        if (!TextUtils.isEmpty(Locale.getDefault().getLanguage()))
        {
            obj = String.valueOf(Locale.getDefault().getLanguage());
            obj = s.replace("/en/", (new StringBuilder(String.valueOf(obj).length() + 2)).append("/").append(((String) (obj))).append("/").toString());
        }
        fzr1.a(activity.getString(g.mD), new Intent("android.intent.action.VIEW", Uri.parse(((String) (obj)))));
        fzr1.a(activity.getString(g.mF), new Intent("android.intent.action.VIEW", Uri.parse(alw1.a("babel_tos_url", "https://www.google.com/accounts/tos"))));
        obj = new Bundle();
        for (Iterator iterator = hgx.c(activity, bvs).iterator(); iterator.hasNext(); ((bvs)iterator.next()).a(activity, ((Bundle) (obj)))) { }
        fzr1.a(((Bundle) (obj)));
        fzr1.a((new fzv()).a().a(activity.getResources().getColor(h.iw)));
        obj = (gmo)hgx.b(activity, gmo);
        if (obj != null && ((gmo) (obj)).b())
        {
            obj = ((gmo) (obj)).c().b("account_name");
            if (((String) (obj)).contains("@"))
            {
                fzr1.a(new Account(((String) (obj)), "com.google"));
            }
        }
        obj = fzr1.a(activity);
        ((fzu)hgx.a(activity, fzu)).a(activity).a(((Intent) (obj)));
    }

}
