// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class sa extends mf
{

    final rz a;

    sa(rz rz1)
    {
        a = rz1;
        super();
    }

    public void b(View view)
    {
        if (rz.a(a) && rz.b(a) != null)
        {
            kb.b(rz.b(a), 0.0F);
            kb.b(rz.c(a), 0.0F);
        }
        rz.c(a).setVisibility(8);
        rz.c(a).a(false);
        rz.d(a);
        a.k();
        if (rz.e(a) != null)
        {
            kb.r(rz.e(a));
        }
    }
}
