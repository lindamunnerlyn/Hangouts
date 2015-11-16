// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bmn
    implements android.view.View.OnClickListener
{

    final int a;
    final bmm b;

    bmn(bmm bmm1, int i)
    {
        b = bmm1;
        a = i;
        super();
    }

    public void onClick(View view)
    {
        b.a.a();
        bmk.a((bmk)b.a.getTargetFragment(), a);
    }
}
