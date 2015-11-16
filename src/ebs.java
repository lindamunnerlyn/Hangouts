// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;
import android.preference.SwitchPreference;

final class ebs
    implements android.preference.Preference.OnPreferenceClickListener
{

    final SwitchPreference a;
    final ebp b;

    ebs(ebp ebp1, SwitchPreference switchpreference)
    {
        b = ebp1;
        a = switchpreference;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        eaj.a(b.getActivity()).b(a.isChecked());
        b.b();
        return true;
    }
}
