// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.View;

final class vn extends mf
{

    final vl a;
    private boolean b;

    vn(vl vl1)
    {
        a = vl1;
        super();
        b = false;
    }

    public void b(View view)
    {
        if (!b)
        {
            a.a.setVisibility(8);
        }
    }

    public void c(View view)
    {
        b = true;
    }
}
