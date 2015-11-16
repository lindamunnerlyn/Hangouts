// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContainer;
import android.view.View;

final class sc extends mf
{

    final sb a;

    sc(sb sb1)
    {
        a = sb1;
        super();
    }

    public void b(View view)
    {
        if (sb.a(a) && sb.b(a) != null)
        {
            kb.b(sb.b(a), 0.0F);
            kb.b(sb.c(a), 0.0F);
        }
        sb.c(a).setVisibility(8);
        sb.c(a).a(false);
        sb.d(a);
        a.k();
        if (sb.e(a) != null)
        {
            kb.s(sb.e(a));
        }
    }
}
