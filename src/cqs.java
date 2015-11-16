// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

final class cqs
    implements android.widget.AbsListView.MultiChoiceModeListener
{

    final cqr a;

    cqs(cqr cqr1)
    {
        a = cqr1;
        super();
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        return a.a.a(menuitem);
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        a.b = actionmode;
        return a.a.a(a, menu);
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        a.a.b();
        a.b = null;
    }

    public void onItemCheckedStateChanged(ActionMode actionmode, int i, long l, boolean flag)
    {
        a.a.a(a, i, flag);
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        return a.a.b(a, menu);
    }
}
