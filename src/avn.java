// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class avn
    implements android.view.View.OnFocusChangeListener
{

    final avk a;

    avn(avk avk1)
    {
        a = avk1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            h.a(a.a);
        }
    }
}
