// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

public final class dte
    implements android.view.View.OnClickListener
{

    final StatusMessageSettingsFragment a;

    public dte(StatusMessageSettingsFragment statusmessagesettingsfragment)
    {
        a = statusmessagesettingsfragment;
        super();
    }

    public void onClick(View view)
    {
        view = StatusMessageSettingsFragment.a(a).getText().toString();
        int i = StatusMessageSettingsFragment.a(view);
        if (i > 140)
        {
            String s = String.valueOf("The status message cannot exceed the maximum character count of 140. Was ");
            gbh.a((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
        }
        view = view.replace('\n', ' ').replace('\r', ' ');
        if (view.isEmpty())
        {
            i = 1936;
        } else
        {
            i = 1935;
        }
        g.a(StatusMessageSettingsFragment.b(a), i);
        bfy.a(new dth(a, a.getActivity(), view), new bgb(a.getFragmentManager())).a();
    }
}
