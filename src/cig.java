// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ContextMenu;
import android.view.View;

final class cig
    implements android.view.View.OnCreateContextMenuListener
{

    final cic a;

    cig(cic cic1)
    {
        a = cic1;
        super();
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view instanceof ehl)
        {
            contextmenu.add(0, 201, 0, l.fI);
            view = ((ehl)view).a();
            cic.b(a, view);
            if (view.o())
            {
                contextmenu.add(0, 200, 0, l.fq);
                contextmenu.setHeaderTitle(l.fm);
            }
        }
    }
}
