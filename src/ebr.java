// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;

final class ebr
    implements android.preference.Preference.OnPreferenceClickListener
{

    final ebp a;

    ebr(ebp ebp1)
    {
        a = ebp1;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ((ebw)hlp.a(a.getActivity(), ebw)).b(a.getActivity(), a);
        return true;
    }
}
