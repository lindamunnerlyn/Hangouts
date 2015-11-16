// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class bdk
    implements android.view.View.OnClickListener
{

    final bdj a;

    bdk(bdj bdj1)
    {
        a = bdj1;
        super();
    }

    public void onClick(View view)
    {
        if (g.d(a.a.d().b))
        {
            a.b.startActivity(g.c(a.e, a.d));
        }
    }
}
