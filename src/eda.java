// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.inputmethod.InputMethodManager;

public final class eda
    implements hor, hoy
{

    private final ad a;

    public eda(ad ad1, hof hof1)
    {
        a = ad1;
        hof1.a(this);
    }

    public void a()
    {
        ((InputMethodManager)a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(a.getView().getWindowToken(), 0);
    }
}
