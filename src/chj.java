// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.inputmethod.InputMethodManager;

final class chj extends zh
{

    final cgw a;

    chj(cgw cgw)
    {
        a = cgw;
        super();
    }

    public void a(yr yr1)
    {
        ((InputMethodManager)yr1.getContext().getSystemService("input_method")).hideSoftInputFromWindow(yr1.getWindowToken(), 0);
    }
}
