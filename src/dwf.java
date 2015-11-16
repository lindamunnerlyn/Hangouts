// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.EditText;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsFragment;

final class dwf
    implements android.view.View.OnClickListener
{

    final dwe a;

    dwf(dwe dwe1)
    {
        a = dwe1;
        super();
    }

    public void onClick(View view)
    {
        view = a.e.getText().toString();
        int i = dwe.a(view);
        if (i > 140)
        {
            String s = String.valueOf("The status message cannot exceed the maximum character count of 140. Was ");
            gdv.a((new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString());
        }
        view = view.replace('\n', ' ').replace('\r', ' ');
        if (view.isEmpty())
        {
            i = 1936;
        } else
        {
            i = 1935;
        }
        g.a(a.c, i);
        bgk.a(new dwi(a, a.a, view), new bgn(a.b.getFragmentManager())).a();
    }
}
