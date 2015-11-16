// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ehm
    implements android.view.View.OnClickListener
{

    final eho a;
    final ehl b;

    ehm(ehl ehl, eho eho1)
    {
        b = ehl;
        a = eho1;
        super();
    }

    public void onClick(View view)
    {
        a.a(b);
    }
}
