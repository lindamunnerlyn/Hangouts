// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bme
    implements android.view.View.OnClickListener
{

    final int a;
    final bmd b;

    bme(bmd bmd1, int i)
    {
        b = bmd1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        b.a.a();
        bmb.a((bmb)b.a.getTargetFragment(), a);
    }
}
