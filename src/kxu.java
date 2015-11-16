// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import horizontallistview.HorizontalListView;

public final class kxu extends DataSetObserver
{

    final HorizontalListView a;

    public kxu(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public void onChanged()
    {
        synchronized (a)
        {
            HorizontalListView.a(a);
        }
        a.invalidate();
        a.requestLayout();
        return;
        exception;
        horizontallistview;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onInvalidated()
    {
        HorizontalListView.b(a);
        a.invalidate();
        a.requestLayout();
    }
}
