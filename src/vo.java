// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.Toolbar;
import android.view.View;

final class vo
    implements android.view.View.OnClickListener
{

    final ss a;
    final vn b;

    vo(vn vn1)
    {
        b = vn1;
        super();
        a = new ss(b.a.getContext(), b.b);
    }

    public void onClick(View view)
    {
        if (b.c != null && b.d)
        {
            b.c.onMenuItemSelected(0, a);
        }
    }
}
