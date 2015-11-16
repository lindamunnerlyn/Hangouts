// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Spinner;

final class crz
    implements android.view.View.OnClickListener
{

    final Spinner a;
    final crw b;

    crz(crw crw, Spinner spinner)
    {
        b = crw;
        a = spinner;
        super();
    }

    public void onClick(View view)
    {
        a.performClick();
    }
}
