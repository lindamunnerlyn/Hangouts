// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;

public final class dyf extends PreferenceFragment
    implements dym
{

    public dyf()
    {
    }

    static void a(dyf dyf1)
    {
        dyf1.b();
    }

    private void b()
    {
        dwz dwz1 = dwz.a(getActivity());
        boolean flag = dwz1.c();
        ((SwitchPreference)findPreference("wifi_calling_enabled_key")).setChecked(flag);
        Object obj = findPreference("account_key");
        if (obj != null)
        {
            ((Preference) (obj)).setSummary(dbf.a(getActivity(), dwz1.b()));
            ((Preference) (obj)).setEnabled(flag);
        }
        obj = (SwitchPreference)findPreference("ask_each_call_key");
        if (obj != null)
        {
            ((SwitchPreference) (obj)).setChecked(dwz1.d());
            ((SwitchPreference) (obj)).setEnabled(flag);
        }
    }

    public void a()
    {
        if (getActivity() != null)
        {
            b();
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        super.onCreate(bundle);
        addPreferencesFromResource(g.qf);
        bundle = (SwitchPreference)findPreference("wifi_calling_enabled_key");
        bundle.setOnPreferenceClickListener(new dyg(this, bundle));
        bundle = findPreference("account_key");
        dwz.a(getActivity());
        boolean flag;
        if (dwz.a().length <= 1)
        {
            flag = false;
        } else
        if (!"hangouts_testing_users".equals(g.a(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users")))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            getPreferenceScreen().removePreference(bundle);
        } else
        {
            bundle.setOnPreferenceClickListener(new dyh(this));
        }
        bundle = (SwitchPreference)findPreference("ask_each_call_key");
        if (!dwz.a(getActivity()).d() && !"hangouts_testing_users".equals(g.a(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users")))
        {
            flag = flag1;
        } else
        {
            flag = true;
        }
        if (!flag)
        {
            getPreferenceScreen().removePreference(bundle);
        } else
        {
            bundle.setOnPreferenceClickListener(new dyi(this, bundle));
        }
        b();
    }
}
