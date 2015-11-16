// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.hangouts.settings.RichStatusSettingsActivity;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class dnu extends hhu
    implements hey
{

    private gmo a;
    private dpl b;
    private ani c;
    private dnr d;

    public dnu()
    {
        new hex(this, lifecycle);
    }

    static ani a(dnu dnu1)
    {
        return dnu1.c;
    }

    static hhb b(dnu dnu1)
    {
        return dnu1.context;
    }

    static hhb c(dnu dnu1)
    {
        return dnu1.context;
    }

    static dnr d(dnu dnu1)
    {
        return dnu1.d;
    }

    public void a()
    {
        hfg hfg1 = new hfg(context);
        PreferenceCategory preferencecategory = hfg1.a(l.cm);
        if (g.a(c, apk.e))
        {
            d = new dnr(context);
            d.g(l.cq);
            d.a(new dnx(this));
            d.a(c.x(), c);
            preferencecategory.c(d);
            d.B().a(new dnz(this));
        }
        if (g.a(g.nS, "babel_richstatus", true) && !c.q())
        {
            Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/RichStatusSettingsActivity);
            intent.putExtra("account_id", a.a());
            String s = getString(l.jP);
            int i = a.a();
            Object obj;
            if (b.b(i) || b.c(i))
            {
                obj = getString(l.kU);
            } else
            {
                obj = getString(l.kT);
            }
            preferencecategory.c(hfg1.a(s, ((String) (obj)), intent));
        }
        if (c.G() && c.F())
        {
            obj = new hem(context, a.a(), "is_business_features_enabled");
            ((CheckBoxPreference) (obj)).g(l.L);
            ((CheckBoxPreference) (obj)).b(Boolean.valueOf(a.c().a("is_business_features_enabled", false)));
            ((CheckBoxPreference) (obj)).a(new dny(this));
            preferencecategory.c(((hfa) (obj)));
            preferencecategory.c(hfg1.a(getString(l.K), null, g.a(getActivity())));
        }
    }

    AlertDialog b()
    {
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        int i = Math.round(10F * ((float)context.getResources().getDisplayMetrics().densityDpi / 160F));
        int j = Math.round(25F * ((float)context.getResources().getDisplayMetrics().densityDpi / 160F));
        layoutparams.setMargins(j, i, j, 0);
        LinearLayout linearlayout = new LinearLayout(context);
        TextView textview = new TextView(context);
        Uri uri = g.f("https://support.google.com/hangouts/answer/3123750?rd=1&hl=%locale%", "profile_photo");
        g.a(textview, context, context.getString(l.X, new Object[] {
            uri.toString()
        }));
        textview.setLinkTextColor(context.getResources().getColor(g.db));
        linearlayout.addView(textview, layoutparams);
        return (new android.app.AlertDialog.Builder(context)).setTitle(l.cq).setView(linearlayout).setNegativeButton(l.W, new dnw(this)).setPositiveButton(l.Y, new dnv(this)).create();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gmo)binder.a(gmo);
        b = (dpl)binder.a(dpl);
        lifecycle.a(new dnz(this));
        c = dbf.e(a.a());
    }
}
