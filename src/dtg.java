// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

public final class dtg
    implements TextWatcher
{

    final StatusMessageSettingsFragment a;

    public dtg(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        a = statusmessagesettingsfragment;
        super();
    }

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        Object obj;
        String s;
        obj = a.getResources();
        i = StatusMessageSettingsFragment.a(StatusMessageSettingsFragment.a(a).getText().toString());
        s = Integer.toString(i);
        charsequence = new SpannableString(((Resources) (obj)).getString(l.fU, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        }));
        if (i <= 140) goto _L2; else goto _L1
_L1:
        j = a.getResources().getColor(g.dQ);
        StatusMessageSettingsFragment.d(a).setBackgroundColor(j);
        charsequence.setSpan(new ForegroundColorSpan(j), 0, s.length(), 33);
        StatusMessageSettingsFragment.e(a).setBackgroundResource(com.google.android.apps.hangouts.R.drawable.j);
        StatusMessageSettingsFragment.e(a).setEnabled(false);
        obj = ((Resources) (obj)).getString(l.fW, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        });
        StatusMessageSettingsFragment.f(a).setContentDescription(((CharSequence) (obj)));
        if (StatusMessageSettingsFragment.g(a))
        {
            StatusMessageSettingsFragment.a(a).setError(((CharSequence) (obj)));
        }
_L4:
        StatusMessageSettingsFragment.f(a).setText(charsequence);
        return;
_L2:
        StatusMessageSettingsFragment.d(a).setBackgroundColor(a.getResources().getColor(g.dR));
        StatusMessageSettingsFragment.e(a).setBackgroundResource(com.google.android.apps.hangouts.R.drawable.cG);
        StatusMessageSettingsFragment.e(a).setEnabled(true);
        StatusMessageSettingsFragment.f(a).setContentDescription(((Resources) (obj)).getString(l.fV, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        }));
        if (StatusMessageSettingsFragment.g(a))
        {
            StatusMessageSettingsFragment.a(a).setError(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
