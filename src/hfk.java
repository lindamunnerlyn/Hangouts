// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;

final class hfk
    implements android.view.View.OnKeyListener
{

    final hfh a;

    hfk(hfh hfh1)
    {
        a = hfh1;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (hfh.b(a).getSelectedItem() instanceof hfa)
        {
            hfh.b(a).getSelectedView();
        }
        return false;
    }
}
