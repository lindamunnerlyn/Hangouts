// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.internal.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

final class rl extends mf
{

    final rk a;

    rl(rk rk1)
    {
        a = rk1;
        super();
    }

    public void b(View view)
    {
        a.a.p.setVisibility(8);
        if (a.a.q == null) goto _L2; else goto _L1
_L1:
        a.a.q.dismiss();
_L4:
        a.a.p.removeAllViews();
        a.a.s.a(null);
        a.a.s = null;
        return;
_L2:
        if (a.a.p.getParent() instanceof View)
        {
            kb.s((View)a.a.p.getParent());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
