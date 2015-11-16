// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class csh
    implements android.view.View.OnFocusChangeListener
{

    final cse a;

    csh(cse cse1)
    {
        a = cse1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getActivity().getSystemService("input_method");
        if (inputmethodmanager != null)
        {
            inputmethodmanager.showSoftInput(view, 1);
        }
    }
}
