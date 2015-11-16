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

public final class dqn extends hmm
    implements hjp
{

    private gqu a;
    private dse b;
    private aoa c;
    private dqk d;

    public dqn()
    {
        new hjo(this, lifecycle);
    }

    static aoa a(dqn dqn1)
    {
        return dqn1.c;
    }

    static hlt b(dqn dqn1)
    {
        return dqn1.context;
    }

    static hlt c(dqn dqn1)
    {
        return dqn1.context;
    }

    static dqk d(dqn dqn1)
    {
        return dqn1.d;
    }

    public void a()
    {
        hjx hjx1 = new hjx(context);
        PreferenceCategory preferencecategory = hjx1.a(l.cd);
        if (g.a(c, aqc.e))
        {
            d = new dqk(context);
            d.g(l.W);
            d.a(new dqq(this));
            d.a(c.v(), c);
            preferencecategory.c(d);
            d.B().a(new dqs(this));
        }
        if (g.a(g.nU, "babel_richstatus", true) && !c.o())
        {
            Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/RichStatusSettingsActivity);
            intent.putExtra("account_id", a.a());
            String s = getString(l.ji);
            int i = a.a();
            Object obj;
            if (b.b(i) || b.c(i))
            {
                obj = getString(l.kn);
            } else
            {
                obj = getString(l.km);
            }
            preferencecategory.c(hjx1.a(s, ((String) (obj)), intent));
        }
        if (c.E() && c.D())
        {
            obj = new hjd(context, a.a(), "is_business_features_enabled");
            ((CheckBoxPreference) (obj)).g(l.I);
            ((CheckBoxPreference) (obj)).b(Boolean.valueOf(a.c().a("is_business_features_enabled", false)));
            ((CheckBoxPreference) (obj)).a(new dqr(this));
            preferencecategory.c(((hjr) (obj)));
            preferencecategory.c(hjx1.a(getString(l.H), null, g.a(getActivity())));
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
        Uri uri = g.f("https://support.google.com/hangouts/?p=profile_photo", "profile_photo");
        g.a(textview, context, context.getString(l.U, new Object[] {
            uri.toString()
        }));
        linearlayout.addView(textview, layoutparams);
        return (new android.app.AlertDialog.Builder(context)).setTitle(l.W).setView(linearlayout).setNegativeButton(l.T, new dqp(this)).setPositiveButton(l.V, new dqo(this)).create();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqu)binder.a(gqu);
        b = (dse)binder.a(dse);
        lifecycle.a(new dqs(this));
        c = dcn.e(a.a());
    }
}
