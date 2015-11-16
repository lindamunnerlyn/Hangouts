// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.inputmethod.InputMethodManager;
import com.google.android.apps.hangouts.phone.BabelHomeActivity;
import com.google.android.apps.hangouts.views.MainViewPager;

public final class ckv extends lk
{

    final BabelHomeActivity a;

    public ckv(BabelHomeActivity babelhomeactivity)
    {
        a = babelhomeactivity;
        super();
    }

    public void a(int i)
    {
        BabelHomeActivity.c(a);
        a.q_();
        ((InputMethodManager)a.getSystemService("input_method")).hideSoftInputFromWindow(BabelHomeActivity.d(a).getWindowToken(), 0);
        ehu ehu1 = BabelHomeActivity.d(a).j();
        PreferenceManager.getDefaultSharedPreferences(a).edit().putString("last_selected_tab", ehu1.d).apply();
    }
}
