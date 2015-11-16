// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.preference.Preference;

final class dyh
    implements android.preference.Preference.OnPreferenceClickListener
{

    final dyf a;

    dyh(dyf dyf1)
    {
        a = dyf1;
        super();
    }

    public boolean onPreferenceClick(Preference preference)
    {
        ((dyl)hgx.a(a.getActivity(), dyl)).b(a.getActivity(), a);
        return true;
    }
}
