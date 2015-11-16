// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

final class ciy
    implements android.view.View.OnFocusChangeListener
{

    final cix a;

    ciy(cix cix1)
    {
        a = cix1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            ((InputMethodManager)a.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
