// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class bxq
    implements android.view.View.OnClickListener
{

    final String a;
    final bxp b;

    bxq(bxp bxp1, String s)
    {
        b = bxp1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        b.getContext().startActivity(g.s(a));
    }
}
