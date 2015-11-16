// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.callerid.impl.CallerIdPromoActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class akf
    implements ajk, hop, hoy
{

    String a;
    Context b;
    int c;
    ajo d;
    ajq e;
    BroadcastReceiver f;
    ProgressDialog g;
    NetworkInfo h;
    private akx i;

    akf()
    {
    }

    static void a(akf akf1, ajl ajl1)
    {
        if (ajl1 == null)
        {
            akf1.e.b(akf1.b.getString(g.iQ));
            akf1.e.a(new aki(akf1));
            return;
        } else
        {
            akf1.e.a_(true);
            akf1.e.b(akf1.b.getString(g.iR, new Object[] {
                eey.o(ajl1.c())
            }));
            Object obj = akf1.b;
            akx akx1 = akf1.i;
            String s = ajl1.c();
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            int j = Math.round(10F * ((float)((Context) (obj)).getResources().getDisplayMetrics().densityDpi / 160F));
            int k = Math.round(25F * ((float)((Context) (obj)).getResources().getDisplayMetrics().densityDpi / 160F));
            layoutparams.setMargins(k, j, k, 0);
            LinearLayout linearlayout = new LinearLayout(((Context) (obj)));
            TextView textview = new TextView(((Context) (obj)));
            g.a(textview, ((Context) (obj)), ((Context) (obj)).getResources().getString(g.iK, new Object[] {
                g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_caller_id").toString()
            }));
            linearlayout.addView(textview, layoutparams);
            obj = (new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle(g.iL).setView(linearlayout).setNegativeButton(g.iI, new ajw(akx1)).setPositiveButton(g.iJ, new ajv(akf1, s)).create();
            akf1.e.a(new akk(akf1, ajl1, ((android.app.AlertDialog) (obj))));
            return;
        }
    }

    static void a(akf akf1, String s)
    {
        Context context = akf1.b;
        Context context1 = akf1.b;
        int j = akf1.c;
        akf1 = new Intent(context1, com/google/android/apps/hangouts/callerid/impl/CallerIdPromoActivity);
        akf1.setAction("android.intent.action.VIEW");
        akf1.putExtra("account_id", j);
        akf1.putExtra("callerid_from_promo_flow", false);
        akf1.putExtra("callerid_current_sim_number", s);
        context.startActivity(akf1);
    }

    public void a(ai ai1, hof hof1, PreferenceCategory preferencecategory, int j)
    {
        if (!g.a(ai1, j))
        {
            return;
        } else
        {
            b = ai1;
            e = new ajq(b);
            e.c(b.getString(g.jd));
            preferencecategory.c(e);
            h = ((ConnectivityManager)ai1.getSystemService("connectivity")).getActiveNetworkInfo();
            i = new akx(b, j);
            a = eey.g();
            c = j;
            d = new akg(this, ai1);
            ai1.f().b(1, null, new akm(this)).u();
            hof1.a(this);
            return;
        }
    }

    void a(String s)
    {
        i.a(2246);
        g = ProgressDialog.show(b, "", b.getString(g.iP), true);
        f = new akl(this);
        eq.a(b).a(f, new IntentFilter("set_callerid_outcome"));
        ((aji)hlp.b(b, aji)).a(c, false, s);
    }

    public void f_()
    {
        ajn.a(c, d);
        if (f != null)
        {
            eq.a(b).a(f);
        }
    }
}
