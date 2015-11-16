// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.SmsSettingsActivity;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class dpj extends hhu
    implements hey
{

    private gms a;
    private hfg b;
    private PreferenceCategory c;

    public dpj()
    {
        new hex(this, lifecycle);
    }

    private boolean b()
    {
        if (((drw)binder.a(drw)).a())
        {
            return false;
        }
        return ebz.d() || dbf.k() != null;
    }

    private void c()
    {
        if (ebz.d() || b())
        {
            if (c == null)
            {
                c = b.a(l.cm);
            }
            c.d();
            if (b())
            {
                CheckBoxPreference checkboxpreference = new CheckBoxPreference(context);
                c.c(checkboxpreference);
                drw drw1 = (drw)binder.a(drw);
                checkboxpreference.g(l.bT);
                checkboxpreference.h(l.bS);
                checkboxpreference.a(drw1.b());
                checkboxpreference.a(new dpk(this, drw1));
            }
            if (ebz.d())
            {
                Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/SmsSettingsActivity);
                intent.putExtra("account_id", a.b("SMS"));
                c.c(b.a(getString(l.kM), null, intent));
            }
        } else
        if (c != null)
        {
            c.d();
            return;
        }
    }

    public void a()
    {
        b = new hfg(context);
        c();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gms)binder.a(gms);
    }

    public void onResume()
    {
        super.onResume();
        c();
    }
}
