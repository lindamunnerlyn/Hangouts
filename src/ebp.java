// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;

public final class ebp extends PreferenceFragment
    implements ebx
{

    public ebp()
    {
    }

    public void a()
    {
        if (getActivity() != null)
        {
            b();
        }
    }

    void b()
    {
        eaj eaj1 = eaj.a(getActivity());
        boolean flag = eaj1.c();
        ((SwitchPreference)findPreference("wifi_calling_enabled_key")).setChecked(flag);
        Object obj = findPreference("account_key");
        if (obj != null)
        {
            ((Preference) (obj)).setSummary(dcn.a(getActivity(), eaj1.b()));
            ((Preference) (obj)).setEnabled(flag);
        }
        obj = (SwitchPreference)findPreference("ask_each_call_key");
        if (obj != null)
        {
            ((SwitchPreference) (obj)).setChecked(eaj1.d());
            ((SwitchPreference) (obj)).setEnabled(flag);
        }
        obj = (SwitchPreference)findPreference("request_feedback_key");
        if (obj != null)
        {
            ((SwitchPreference) (obj)).setChecked(eaj1.i());
            ((SwitchPreference) (obj)).setEnabled(flag);
        }
    }

    public void onCreate(Bundle bundle)
    {
        boolean flag1 = true;
        super.onCreate(bundle);
        addPreferencesFromResource(g.qh);
        bundle = (SwitchPreference)findPreference("wifi_calling_enabled_key");
        bundle.setOnPreferenceClickListener(new ebq(this, bundle));
        bundle = findPreference("account_key");
        eaj.a(getActivity());
        boolean flag;
        if (eaj.a().length <= 1)
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
            bundle.setOnPreferenceClickListener(new ebr(this));
        }
        bundle = (SwitchPreference)findPreference("ask_each_call_key");
        flag = flag1;
        if (!eaj.a(getActivity()).d())
        {
            flag = flag1;
            if (!"hangouts_testing_users".equals(g.a(getActivity(), "babel_user_to_allow_wifi_calling_for", "tycho_users")))
            {
                flag = false;
            }
        }
        if (!flag)
        {
            getPreferenceScreen().removePreference(bundle);
        } else
        {
            bundle.setOnPreferenceClickListener(new ebs(this, bundle));
        }
        bundle = (SwitchPreference)findPreference("request_feedback_key");
        if (!g.a(getActivity(), "babel_request_call_feedback", false))
        {
            getPreferenceScreen().removePreference(bundle);
        } else
        {
            bundle.setOnPreferenceClickListener(new ebt(this, bundle));
        }
        b();
    }
}
