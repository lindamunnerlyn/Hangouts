// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;

final class bdl
    implements android.view.View.OnClickListener
{

    final ani a;
    final bdj b;

    bdl(bdj bdj1, ani ani)
    {
        b = bdj1;
        a = ani;
        super();
    }

    public void onClick(View view)
    {
        b.b.startActivity(g.b(a, b.e));
    }
}
