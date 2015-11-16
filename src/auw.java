// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class auw
    implements android.view.View.OnFocusChangeListener
{

    final aut a;

    auw(aut aut1)
    {
        a = aut1;
        super();
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag)
        {
            h.a(aut.b(a));
        }
    }
}
