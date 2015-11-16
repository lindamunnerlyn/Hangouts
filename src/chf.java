// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class chf
    implements android.view.View.OnClickListener
{

    final cgw a;

    chf(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public void onClick(View view)
    {
        amf amf1;
        eep eep1;
        eej eej1;
        int i;
        if (cgw.f(a) != null)
        {
            cgw.f(a).a("click_contact_list");
        }
        eep1 = (eep)a.getBinder().b(eep);
        eej1 = (eej)view;
        amf1 = eej1.a();
        i = amf1.r();
        if (i == amg.a) goto _L2; else goto _L1
_L1:
        char c = '\u0A0C';
        if (i != amg.c) goto _L4; else goto _L3
_L3:
        c = '\u0A0B';
_L10:
        g.a(cgw.b(a), c);
_L2:
        if (eep1 == null) goto _L6; else goto _L5
_L5:
        eep1.a(eej1);
_L8:
        return;
_L4:
        if (i == amg.d)
        {
            c = '\u0A0A';
        }
        continue; /* Loop/switch isn't completed */
_L6:
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getContext().getSystemService("input_method");
        if (!inputmethodmanager.isActive())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!inputmethodmanager.hideSoftInputFromWindow(view.getWindowToken(), 0, new chg(this, new Handler(), amf1)))
        {
            cgw.a(a, amf1);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
        cgw.a(a, amf1);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }
}
