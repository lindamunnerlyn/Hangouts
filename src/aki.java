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
import android.widget.Toast;
import com.google.android.apps.hangouts.callerid.impl.CallerIdPromoActivity;
import com.google.android.libraries.social.settings.PreferenceCategory;
import java.util.ArrayList;
import java.util.Iterator;

public final class aki
    implements ajn, fsn, hjv
{

    private String a;
    private Context b;
    private int c;
    private ajr d;
    private ajt e;
    private BroadcastReceiver f;
    private ProgressDialog g;
    private NetworkInfo h;
    private ala i;

    aki()
    {
    }

    static Context a(aki aki1)
    {
        return aki1.b;
    }

    static void a(aki aki1, ajo ajo1)
    {
        if (ajo1 == null)
        {
            aki1.e.b(aki1.b.getString(g.iY));
            aki1.e.a(new akl(aki1));
            return;
        } else
        {
            aki1.e.a_(true);
            aki1.e.b(aki1.b.getString(g.iZ, new Object[] {
                ebz.o(ajo1.c())
            }));
            Object obj = aki1.b;
            ala ala1 = aki1.i;
            String s = ajo1.c();
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
            int j = Math.round(10F * ((float)((Context) (obj)).getResources().getDisplayMetrics().densityDpi / 160F));
            int k = Math.round(25F * ((float)((Context) (obj)).getResources().getDisplayMetrics().densityDpi / 160F));
            layoutparams.setMargins(k, j, k, 0);
            LinearLayout linearlayout = new LinearLayout(((Context) (obj)));
            TextView textview = new TextView(((Context) (obj)));
            g.a(textview, ((Context) (obj)), ((Context) (obj)).getResources().getString(g.iS, new Object[] {
                g.f("https://www.google.com/support/hangouts/?hl=%locale%", "android_caller_id").toString()
            }));
            linearlayout.addView(textview, layoutparams);
            obj = (new android.app.AlertDialog.Builder(((Context) (obj)))).setTitle(g.iT).setView(linearlayout).setNegativeButton(g.iQ, new ajz(ala1)).setPositiveButton(g.iR, new ajy(aki1, s)).create();
            aki1.e.a(new akn(aki1, ajo1, ((android.app.AlertDialog) (obj))));
            return;
        }
    }

    static void a(aki aki1, String s)
    {
        Context context = aki1.b;
        Context context1 = aki1.b;
        int j = aki1.c;
        aki1 = new Intent(context1, com/google/android/apps/hangouts/callerid/impl/CallerIdPromoActivity);
        aki1.setAction("android.intent.action.VIEW");
        aki1.putExtra("account_id", j);
        aki1.putExtra("callerid_from_promo_flow", false);
        aki1.putExtra("callerid_current_sim_number", s);
        context.startActivity(aki1);
    }

    static void a(aki aki1, jmi jmi1)
    {
        String as[] = new String[jmi1.size()];
        jmi1 = jmi1.a();
        for (int j = 0; jmi1.hasNext(); j++)
        {
            as[j] = ebz.p((String)jmi1.next());
        }

        (new android.app.AlertDialog.Builder(aki1.b)).setTitle(g.iY).setItems(as, new akm(aki1, as)).setNegativeButton(0x1040009, null).show();
    }

    static ajr b(aki aki1)
    {
        return aki1.d;
    }

    static jmi c(aki aki1)
    {
        String s = ebz.g(aki1.a);
        jmj jmj1 = jmi.h();
        Iterator iterator = dbf.e(aki1.c).z().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            String s2 = ebz.g(s1);
            if (s2 != null)
            {
                if (s2.equals(s))
                {
                    return jmi.b(aki1.a);
                }
                jmj1.c(s1);
            }
        } while (true);
        return jmj1.a();
    }

    static String d(aki aki1)
    {
        return aki1.a;
    }

    static boolean e(aki aki1)
    {
        boolean flag = true;
        if (aki1.h == null || !aki1.h.isConnected())
        {
            Toast.makeText(aki1.b, aki1.b.getString(g.iV), 1).show();
            flag = false;
        }
        return flag;
    }

    static ProgressDialog f(aki aki1)
    {
        return aki1.g;
    }

    static ajt g(aki aki1)
    {
        return aki1.e;
    }

    static BroadcastReceiver h(aki aki1)
    {
        return aki1.f;
    }

    public void a(ai ai1, hjm hjm1, PreferenceCategory preferencecategory, int j)
    {
        if (!g.a(ai1, j))
        {
            return;
        } else
        {
            b = ai1;
            e = new ajt(b);
            e.c(b.getString(g.jl));
            preferencecategory.c(e);
            h = ((ConnectivityManager)ai1.getSystemService("connectivity")).getActiveNetworkInfo();
            i = new ala(b, j);
            a = ebz.g();
            c = j;
            d = new akj(this, ai1);
            ai1.f().b(1, null, new akp(this)).u();
            hjm1.a(this);
            return;
        }
    }

    void a(String s)
    {
        i.a(2246);
        g = ProgressDialog.show(b, "", b.getString(g.iX), true);
        f = new ako(this);
        eq.a(b).a(f, new IntentFilter("set_callerid_outcome"));
        ((ajl)hgx.b(b, ajl)).a(c, false, s);
    }

    public void e_()
    {
        ajq.a(c, d);
        if (f != null)
        {
            eq.a(b).a(f);
        }
    }
}
