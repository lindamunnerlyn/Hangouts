// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.hangouts.settings.SmsSettingsActivity;
import com.google.android.libraries.social.settings.CheckBoxPreference;
import com.google.android.libraries.social.settings.PreferenceCategory;

public final class dsc extends hmm
    implements hjp
{

    private gqz a;
    private hjx b;
    private PreferenceCategory c;
    private gcz d;

    public dsc()
    {
        new hjo(this, lifecycle);
    }

    static gcz a(dsc dsc1)
    {
        return dsc1.d;
    }

    private boolean b()
    {
        if (((dup)binder.a(dup)).b())
        {
            return false;
        }
        return eey.d() || dcn.k() != null;
    }

    private void c()
    {
        if (eey.d() || b())
        {
            if (c == null)
            {
                c = b.a(l.cd);
            }
            c.d();
            int i = a.b("SMS");
            d = ((gdd)hlp.a(context, gdd)).a(i);
            if (b())
            {
                CheckBoxPreference checkboxpreference = new CheckBoxPreference(context);
                c.c(checkboxpreference);
                dup dup1 = (dup)binder.a(dup);
                checkboxpreference.g(l.bN);
                checkboxpreference.h(l.bM);
                checkboxpreference.a(dup1.c());
                checkboxpreference.a(new dsd(this, dup1));
            }
            if (eey.d())
            {
                Intent intent = new Intent(context, com/google/android/apps/hangouts/settings/SmsSettingsActivity);
                intent.putExtra("account_id", i);
                c.c(b.a(getString(l.kf), null, intent));
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
        b = new hjx(context);
        c();
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = (gqz)binder.a(gqz);
    }

    public void onResume()
    {
        super.onResume();
        c();
    }
}
