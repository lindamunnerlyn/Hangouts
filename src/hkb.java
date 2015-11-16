// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;

final class hkb
    implements android.view.View.OnKeyListener
{

    final hjy a;

    hkb(hjy hjy1)
    {
        a = hjy1;
        super();
    }

    public boolean onKey(View view, int i, KeyEvent keyevent)
    {
        if (hjy.b(a).getSelectedItem() instanceof hjr)
        {
            hjy.b(a).getSelectedView();
        }
        return false;
    }
}
