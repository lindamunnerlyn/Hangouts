// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ContextMenu;
import android.view.View;

final class cha
    implements android.view.View.OnCreateContextMenuListener
{

    final cgw a;

    cha(cgw cgw1)
    {
        a = cgw1;
        super();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view instanceof eej)
        {
            contextmenu.add(0, 201, 0, l.fZ);
            view = ((eej)view).a();
            cgw.b(a, view);
            if (view.o())
            {
                contextmenu.add(0, 200, 0, l.fH);
                contextmenu.setHeaderTitle(l.fD);
            }
        }
    }
}
