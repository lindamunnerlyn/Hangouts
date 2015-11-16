// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;
import horizontallistview.HorizontalListView;

public final class lfz extends DataSetObserver
{

    final HorizontalListView a;

    public lfz(HorizontalListView horizontallistview)
    {
        a = horizontallistview;
        super();
    }

    public void onChanged()
    {
        synchronized (a)
        {
            a.k = true;
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
        a.b();
        a.invalidate();
        a.requestLayout();
    }
}
