// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.SwitchPreference;

final class dyi
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SwitchPreference a;
    final dyf b;

    dyi(dyf dyf1, SwitchPreference switchpreference)
    {
        b = dyf1;
        a = switchpreference;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        dwz.a(b.getActivity()).b(a.isChecked());
        dyf.a(b);
        return true;
    }
}
