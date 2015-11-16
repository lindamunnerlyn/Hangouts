// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cgo
    implements android.view.View.OnLongClickListener
{

    final eej a;
    final cgh b;

    cgo(cgh cgh, eej eej1)
    {
        b = cgh;
        a = eej1;
        super();
    }

    public boolean onLongClick(View view)
    {
        return a.showContextMenu();
    }
}
