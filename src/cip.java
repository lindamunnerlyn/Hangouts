// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

final class cip extends zj
{

    final cic a;

    cip(cic cic)
    {
        a = cic;
        super();
    }

    public void a(yt yt1)
    {
        ((InputMethodManager)yt1.getContext().getSystemService("input_method")).hideSoftInputFromWindow(yt1.getWindowToken(), 0);
    }
}
