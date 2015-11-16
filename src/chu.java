// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class chu
    implements android.view.View.OnLongClickListener
{

    final ehl a;
    final chn b;

    chu(chn chn, ehl ehl1)
    {
        b = chn;
        a = ehl1;
        super();
    }

    public boolean onLongClick(View view)
    {
        return a.showContextMenu();
    }
}
