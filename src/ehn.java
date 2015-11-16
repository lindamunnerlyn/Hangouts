// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ehn
    implements android.view.View.OnLongClickListener
{

    final eho a;
    final ehl b;

    ehn(ehl ehl, eho eho1)
    {
        b = ehl;
        a = eho1;
        super();
    }

    public boolean onLongClick(View view)
    {
        a.a(b);
        return true;
    }
}
