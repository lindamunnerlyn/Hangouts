// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class cil
    implements android.view.View.OnClickListener
{

    final cic a;

    cil(cic cic1)
    {
        a = cic1;
        super();
    }

    public void onClick(View view)
    {
        amx amx1;
        ehr ehr1;
        ehl ehl1;
        int i;
        cic.f(a).a("click_contact_list");
        ehr1 = (ehr)a.getBinder().b(ehr);
        ehl1 = (ehl)view;
        amx1 = ehl1.a();
        i = amx1.r();
        if (i == amy.a) goto _L2; else goto _L1
_L1:
        char c = '\u0A0C';
        if (i != amy.c) goto _L4; else goto _L3
_L3:
        c = '\u0A0B';
_L10:
        g.a(cic.b(a), c);
_L2:
        if (ehr1 == null) goto _L6; else goto _L5
_L5:
        ehr1.a(ehl1);
_L8:
        return;
_L4:
        if (i == amy.d)
        {
            c = '\u0A0A';
        }
        continue; /* Loop/switch isn't completed */
_L6:
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
        boolean flag;
        if (inputmethodmanager.isActive())
        {
            flag = inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0, new cim(this, new Handler(), amx1));
        } else
        {
            flag = false;
        }
        if (flag) goto _L8; else goto _L7
_L7:
        cic.a(a, amx1);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
