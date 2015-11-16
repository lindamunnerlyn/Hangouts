// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.SwitchPreference;

final class ebq
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SwitchPreference a;
    final ebp b;

    ebq(ebp ebp1, SwitchPreference switchpreference)
    {
        b = ebp1;
        a = switchpreference;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        boolean flag = a.isChecked();
        eaj.a(b.getActivity()).a(flag);
        if (flag)
        {
            ((ebw)hlp.a(b.getActivity(), ebw)).a(b.getActivity(), b);
        } else
        {
            b.b();
        }
        return true;
    }
}
