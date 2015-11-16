// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
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

final class dwh
    implements TextWatcher
{

    final dwe a;

    dwh(dwe dwe1)
    {
        a = dwe1;
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
        obj = a.a.getResources();
        i = dwe.a(a.e.getText().toString());
        s = Integer.toString(i);
        charsequence = new SpannableString(a.a.getString(l.fD, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        }));
        if (i <= 140) goto _L2; else goto _L1
_L1:
        j = ((Resources) (obj)).getColor(g.dP);
        a.g.setBackgroundColor(j);
        charsequence.setSpan(new ForegroundColorSpan(j), 0, s.length(), 33);
        a.h.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.i);
        a.h.setEnabled(false);
        obj = a.a.getString(l.fF, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        });
        a.f.setContentDescription(((CharSequence) (obj)));
        if (dwe.b(a))
        {
            a.e.setError(((CharSequence) (obj)));
        }
_L4:
        a.f.setText(charsequence);
        return;
_L2:
        a.g.setBackgroundColor(((Resources) (obj)).getColor(g.dQ));
        a.h.setBackgroundResource(com.google.android.apps.hangouts.R.drawable.cy);
        a.h.setEnabled(true);
        a.f.setContentDescription(a.a.getString(l.fE, new Object[] {
            Integer.valueOf(i), Integer.valueOf(140)
        }));
        if (dwe.b(a))
        {
            a.e.setError(null);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
